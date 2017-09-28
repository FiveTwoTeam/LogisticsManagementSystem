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
            <form class="layui-form">
                <div class="layui-form-item">
                    <label for="name" class="layui-form-label">
                        昵称
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="name" name="name"  class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="identityId" class="layui-form-label">
                        身份证
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="identityId" name="identityId"  class="layui-input">
                    </div>

                </div>
                <div class="layui-form-item">
                    <label for="workUnit" class="layui-form-label">
                        工作单位
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="workUnit" name="workUnit"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="phoneExt" class="layui-form-label">
                        座机号码
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="phoneExt" name="phoneExt"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="mobilePhone" class="layui-form-label">
                        手机号码
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="mobilePhone" name="mobilePhone"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="address" class="layui-form-label">
                        地址
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="address" name="address"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="postCode" class="layui-form-label">
                        邮编
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="postCode" name="postCode"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="mail" class="layui-form-label">
                        邮箱
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="mail" name="mail"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="status" class="layui-form-label">
                        权限
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="status" name="status"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <a  class="layui-btn" onclick="add()">
                        增加
                    </a>
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
                    url:"/service/addCustom",
                    data:{
                        name:$('#name').val(),
                        identityId:$('#identityId').val(),
                        workUnit:$('#workUnit').val(),
                        phoneExt:$('#phoneExt').val(),
                        mobilePhone:$('#mobilePhone').val(),
                        address:$('#address').val(),
                        postCode:$('#postCode').val(),
                        mail:$('#mail').val(),
                        status:$('#status').val(),
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