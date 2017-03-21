<%@ include file="/init.jsp" %>

<liferay-ui:message key="dmc-mvc-portlet.serve.resource.caption" />

<portlet:renderURL var="showHomeURL">
    <portlet:param name="mvcRenderCommandName" value="showHome" />
</portlet:renderURL>

<portlet:resourceURL id="/resources/sample" var="callToServeResourceURL" />
<p>
<a href="<%=callToServeResourceURL%>"><liferay-ui:message key="dmc-mvc-portlet.serve.resource.link" /></a>
</p>
<p>
<a href="<%=showHomeURL%>"><liferay-ui:message key="dmc-mvc-portlet.go.home.link" /></a>
</p>