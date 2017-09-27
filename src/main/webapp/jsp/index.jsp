<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<jsp:include page="header.jsp"/>
    <body>
        <div class="layui-layout layui-layout-admin">
            <jsp:include page="top.jsp"/>
            <jsp:include page="left.jsp"/>
            <div class="layui-tab layui-tab-card site-demo-title x-main" lay-filter="x-tab" lay-allowclose="true">
            <div class="x-slide_left"></div>
            <ul class="layui-tab-title">
                <li class="layui-this">
                    我的桌面
                    <i class="layui-icon layui-unselect layui-tab-close">ဆ</i>
                </li>
            </ul>
            <div class="layui-tab-content site-demo site-demo-body">
                <div class="layui-tab-item layui-show">
                    <iframe frameborder="0" src="${ basePath }/jsp/welcome.jsp" class="x-iframe"></iframe>
                </div>
            </div>
        </div>
            <div class="site-mobile-shade">
            </div>
        </div>
    </body>
</html>