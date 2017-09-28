<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<html>

<body style="height:100% ; width:100%; position:absolute;">
<div style="height: 100%;width: 100%;position:absolute;"><img src="${basePath}/images/welcome.png;" style="width: 100%;height: 100%;"/></div>
</body>
</html>

<%--<body style="background:  url(${basePath}/images/welcome.png) no-repeat fixed top;"></body>--%>

