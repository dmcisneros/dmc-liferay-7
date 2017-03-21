<%@ include file="/init.jsp" %>

<liferay-ui:message key="dmc-mvc-portlet.caption" />

<liferay-portlet:actionURL name="actionExample" var="actionExampleURL" />

<aui:form action="<%= actionExampleURL %>" method="post" name="fm">
	<aui:input name="name" type="text" />
	<aui:button-row>
		<aui:button type="submit"></aui:button>
	</aui:button-row>
</aui:form>


<portlet:renderURL var="showServeResourceURL">
    <portlet:param name="mvcRenderCommandName" value="showServeResource" />
</portlet:renderURL>
<a href="<%=showServeResourceURL%>"><liferay-ui:message key="dmc-mvc-portlet.go.serve.resource.link" /></a>