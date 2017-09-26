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
                    <label for="importNo" class="layui-form-label">
                        入库单号
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="importNo" name="importNo" required lay-verify="required"
                               autocomplete="off" value="zhibinm" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="datetime" class="layui-form-label">
                        时间
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="datetime" name="datetime" required lay-verify="email"
                               autocomplete="off" value="113664000@qq.com" class="layui-input">
                    </div>

                </div>
                <div class="layui-form-item">
                    <label for="lmsSupplierId" class="layui-form-label">
                        供应商ID
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="lmsSupplierId" name="lmsSupplierId" autocomplete="off" value="广州"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">
                    </label>
                    <button  class="layui-btn" onclick="add()">
                        增加
                    </button>
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
                        importNo: $('#importNo').val(),
                        datetimr: $('#datetimr').val(),
                        lmsSupplierId: $('#lmsSupplierId').val(),
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