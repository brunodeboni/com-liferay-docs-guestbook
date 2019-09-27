<%@ include file="../init.jsp" %>

<% 

long contattoId = ParamUtil.getLong(renderRequest, "contattoId");

Contatto contatto = null;
if (contattoId > 0) {
	contatto = ContattoLocalServiceUtil.getContatto(contattoId);
}

long formContattoId = ParamUtil.getLong(renderRequest, "formContattoId");

%>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/formcontattowebportlet/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addContatto" var="addContattoURL"></portlet:actionURL>

<aui:form action="<%= addContattoURL %>" name="<portlet:namespace />fm">
	<aui:fieldset>
	
	    <aui:input label="Nome" name="nome" required="true">
	    	<aui:validator name="required" 
			errorMessage="Inserisci il nome." ></aui:validator>
	    </aui:input>
	    
	    <aui:input label="Cognome" name="cognome" required="true">
	    	<aui:validator name="required" 
			errorMessage="Inserisci il cognome." ></aui:validator>
	    </aui:input>
	    
	    <aui:input label="Email" name="email" required="true">
	    	<aui:validator name="required" 
			errorMessage="Inserisci una email." ></aui:validator>
	    	<aui:validator name="email" 
			errorMessage="Inserisci un indirizzo email valido." ></aui:validator>
		</aui:input>
		
	   <aui:input label="Accetto le Condizioni d'uso e Privacy" name="accettazionePrivacy" 
	    	type="checkbox" required="true">
	    	<aui:validator name="required" 
			errorMessage="È necessario il consenso all'informativa Privacy." ></aui:validator>
	    </aui:input>
	    
	    <aui:input name="contattoId" type="hidden" />
        <aui:input name="formContattoId" type="hidden" 
        	value='<%= contatto == null ? formContattoId : contatto.getFormContattoId() %>'/>
	</aui:fieldset>
	
	<aui:button-row>
	    <aui:button type="submit"></aui:button>
	    <aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>
	</aui:button-row>
</aui:form>