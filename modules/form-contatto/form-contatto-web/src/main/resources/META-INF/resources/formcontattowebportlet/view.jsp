<%@ include file="../init.jsp" %>

<% long formContattoId = Long.valueOf((Long) renderRequest.getAttribute("formContattoId")); %>

<liferay-ui:success key="contattoAdded" message="contatto-added" />
<liferay-ui:success key="contattoUpdated" message="contatto-updated" />
<liferay-ui:success key="contattoDeleted" message="contatto-deleted" />

<aui:button-row>

		<portlet:renderURL var="addContattoURL">
	    	<portlet:param name="mvcPath" value="/formcontattowebportlet/edit_contatto.jsp"></portlet:param>
	    	<portlet:param name="formContattoId" value="<%=String.valueOf(formContattoId)%>" />
		</portlet:renderURL>
		<aui:button onClick="<%=addContattoURL.toString()%>" value="Aggiungi contatto"></aui:button>

</aui:button-row>

<liferay-ui:search-container total="<%=ContattoLocalServiceUtil.getContattosCount()%>">
    <liferay-ui:search-container-results 
    	results="<%=ContattoLocalServiceUtil.getContatti(scopeGroupId.longValue(),
    			formContattoId, searchContainer.getStart(), searchContainer.getEnd())%>" />

    <liferay-ui:search-container-row
        className="com.liferay.docs.formcontatto.model.Contatto" modelVar="contatto" >
        
    	<liferay-ui:search-container-column-text name="Nome" property="nome" />
    	<liferay-ui:search-container-column-text name="Cognome" property="cognome" />
    	<liferay-ui:search-container-column-text name="Email" property="email" />	
    	
	
				<liferay-ui:search-container-column-jsp name="Modifica contatti"
		            path="/formcontattowebportlet/contatto_actions.jsp" />
	
		
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>

<aui:button-row>
    
</aui:button-row>