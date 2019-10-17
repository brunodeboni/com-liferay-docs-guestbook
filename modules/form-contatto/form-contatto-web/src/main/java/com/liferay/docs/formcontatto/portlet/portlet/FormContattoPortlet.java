package com.liferay.docs.formcontatto.portlet.portlet;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.docs.formcontatto.constants.FormContattoPortletKeys;
import com.liferay.docs.formcontatto.model.Contatto;
import com.liferay.docs.formcontatto.model.FormContatto;
import com.liferay.docs.formcontatto.service.ContattoLocalService;
import com.liferay.docs.formcontatto.service.FormContattoLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

/**
 * @author bruno
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=false",
	    "com.liferay.portlet.scopeable=true",
		"javax.portlet.display-name=FormContatto",
	    "javax.portlet.expiration-cache=0",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/formcontattowebportlet/view.jsp",
		"javax.portlet.name=" + FormContattoPortletKeys.FORMCONTATTO,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
	    "javax.portlet.supports.mime-type=text/html"
	},
	service = Portlet.class
)
public class FormContattoPortlet extends MVCPortlet {
	public void addContatto(ActionRequest request, ActionResponse response) 
			throws PortalException {
		
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
	            Contatto.class.getName(), request);
		
		String contattoNome = ParamUtil.getString(request, "nome");
        String contattoCognome = ParamUtil.getString(request, "cognome");
        String contattoEmail = ParamUtil.getString(request, "email");
        long formContattoId = ParamUtil.getLong(request, "formContattoId");
        long contattoId = ParamUtil.getLong(request, "contattoId");
        
        if (contattoId > 0) {
        	try {
        		
	            _contattoLocalService.updateContatto(
	                serviceContext.getUserId(), formContattoId, contattoId, contattoNome, 
	                contattoCognome, contattoEmail, serviceContext);
	
	            response.getRenderParameters().setValue(
	                "formContattoId", Long.toString(formContattoId));
	            
	            SessionMessages.add(request, "contattoUpdated");
	        }
        	catch (Exception e) {
        		SessionErrors.add(request, e.getClass().getName());
	
	            PortalUtil.copyRequestParameters(request, response);
	
	            response.getRenderParameters().setValue(
	                "mvcPath", "/formcontattowebportlet/edit_contatto.jsp");
	        }
        }
        else {
        	
	        try {
	            _contattoLocalService.addContatto(
	                serviceContext.getUserId(), formContattoId, contattoNome, contattoCognome, 
	                contattoEmail, serviceContext);
	
	            response.getRenderParameters().setValue(
	                "formContattoId", Long.toString(formContattoId));
	            
	            SessionMessages.add(request, "contattoAdded");
	
	        }
	        catch (Exception e) {
	            SessionErrors.add(request, e.getClass().getName());
	
	            PortalUtil.copyRequestParameters(request, response);
	
	            response.getRenderParameters().setValue(
	                "mvcPath", "/formcontattowebportlet/edit_contatto.jsp");
	        }
	    }
	}
	
	public void deleteContatto(ActionRequest request, ActionResponse response) 
			throws PortalException {
		
        long contattoId = ParamUtil.getLong(request, "contattoId");
        long formContattoId = ParamUtil.getLong(request, "formContattoId");

        ServiceContext serviceContext = ServiceContextFactory.getInstance(
            Contatto.class.getName(), request);
        
        try {

            response.getRenderParameters().setValue(
                "formContattoId", Long.toString(formContattoId));

            _contattoLocalService.deleteContatto(contattoId, serviceContext);
            
            SessionMessages.add(request, "contattoDeleted");
        }

        catch (Exception e) {
            Logger.getLogger(FormContattoPortlet.class.getName()).log(
                Level.SEVERE, null, e);
            
            SessionErrors.add(request, e.getClass().getName());
        }
	}
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		try {
            ServiceContext serviceContext = ServiceContextFactory.getInstance(
                FormContatto.class.getName(), renderRequest);

            long groupId = serviceContext.getScopeGroupId();

            long formContattoId = ParamUtil.getLong(renderRequest, "formContattoId");
            
            List<FormContatto> formsContatto = _formContattoLocalService.getFormsContatto(
                groupId);
            
            if (formsContatto.isEmpty()) {
            	
            	FormContatto formContatto = _formContattoLocalService.addFormContatto(
                    serviceContext.getUserId(), "Main", serviceContext);

                formContattoId = formContatto.getFormContattoId();
            }

            if (formContattoId == 0) {
            	formContattoId = formsContatto.get(0).getFormContattoId();
            }

            renderRequest.setAttribute("formContattoId", formContattoId);
        }
        catch (Exception e) {
            throw new PortletException(e);
        }

        super.render(renderRequest, renderResponse);
	}
	
	@Reference(unbind = "-")
    protected void setContattoService(ContattoLocalService contattoLocalService) {
        _contattoLocalService = contattoLocalService;
    }

    @Reference(unbind = "-")
    protected void setFormContattoService(FormContattoLocalService formContattoLocalService) {
        _formContattoLocalService = formContattoLocalService;
    }

    private ContattoLocalService _contattoLocalService;
    private FormContattoLocalService _formContattoLocalService;
}