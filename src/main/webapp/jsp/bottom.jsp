<%--
  Created by IntelliJ IDEA.
  User: biao
  Date: 2017/9/20
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<script src="${ basePath }/lib/layui/layui.js" charset="utf-8"></script>
<script src="${ basePath }/js/x-admin.js"></script>