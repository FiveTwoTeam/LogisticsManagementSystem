<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<jsp:include page="header.jsp"/>
    <body>
    <div class="x-body">
        <form class="layui-form" action="${pageContext.request.contextPath}/updateAdminSub">
            <div class="layui-form-item">
                <label for="transport" class="layui-form-label">
                    运输公司
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="transport" name="transport" required lay-verify="required"
                           autocomplete="off"  class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label for="description" class="layui-form-label">
                    描述
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="description" name="description" required lay-verify="email"
                           autocomplete="off"  class="layui-input">
                </div>

            </div>
            <div class="layui-form-item">
                <label for="totalCount" class="layui-form-label">
                    总数量
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="totalCount" name="totalCount" autocomplete="off"
                           class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label for="totalPrice" class="layui-form-label">
                    总价格
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="totalPrice" name="totalPrice" autocomplete="off"
                           class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label for="datetime" class="layui-form-label">
                    时间
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="datetime" name="datetime" autocomplete="off"
                           class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label for="L_repass" class="layui-form-label">
                </label>
                <button class="layui-btn" onclick="add()">添加</button>
            </div>
            </form>
        </div>
    <script src="${basePath}/lib/layui/layui.js" charset="utf-8">
    </script>
    <script src="${basePath}/js/x-layui.js" charset="utf-8">
    </script>
        <script>
            function add(){
                $.ajax({
                    type: "POST",
                    url:"/addAdmin",
                    data:{
                        transport: $('#transport').val(),
                        description: $('#description').val(),
                        totalCount: $('#totalCount').val(),
                        totalPrice: $('#totalPrice').val(),
                        datetime: $('#datetime').val(),
                    },
                    error: function(request) {
                        alert("Connection error");
                    },
                    success: function(data) {
                        window.parent.location.reload();
                    }
                });
            }

            layui.use(['form','layer'], function() {
                $ = layui.jquery;
                var form = layui.form()
                    , layer = layui.layer;

            });
        </script>

    </body>

</html>