<%@ include file="/init.jsp" %>

<%= renderRequest.getAttribute("ACTION_MESSAGE") %>

<liferay-ui:message key="dmc-mvc-portlet.detail.caption" />



<portlet:renderURL var="showHomeURL">
    <portlet:param name="mvcRenderCommandName" value="showHome" />
</portlet:renderURL>

<a href="<%=showHomeURL%>"><liferay-ui:message key="dmc-mvc-portlet.go.home.link" /></a>