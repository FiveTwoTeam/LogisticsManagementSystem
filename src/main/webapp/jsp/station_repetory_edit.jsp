<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<html>
<body>
        <div class="x-body">
            <form class="layui-form"  items="${stationRepetorys}">
                <div class="layui-input-inline">
                    <input type="text" id="id" name="id" value="${stationRepetorys.id}" style="display: none">
                </div>
                <div>
                    <label for="name" class="layui-form-label">
                        分站库房名
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="name" name="name" required lay-verify="required"
                               autocomplete="off" value="${stationRepetorys.name}" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="address" class="layui-form-label">
                        地址
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="address" name="address" required lay-verify="email"
                               autocomplete="off" value="${stationRepetorys.address}" class="layui-input">
                    </div>

                </div>
                <div class="layui-form-item">
                    <label for="phone" class="layui-form-label">
                        联系电话
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="phone" name="phone" autocomplete="off" value="${stationRepetorys.phone}"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="lmsstationRepetoryId" class="layui-form-label">
                        管理员ID
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="lmsstationRepetoryId" name="lmsstationRepetoryId" autocomplete="off" value="${stationRepetorys.lmsstationRepetoryId}"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="lmsStationId" class="layui-form-label">
                        分站库ID
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="lmsStationId" name="lmsStationId" autocomplete="off" value="${stationRepetorys.lmsStationId}"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">
                    </label>
                    <button class="layui-btn" onclick="edit()">修改</button>
                </div>
            </form>
        </div>
        <script src="${basePath}/lib/layui/layui.js" charset="utf-8">
        </script>
        <script src="${basePath}/js/x-layui.js" charset="utf-8">
        </script>
        <script>

            function edit() {
                $.ajax({
                    type: "POST",
                    url: "/updateStationRepetorySub",
                    data: {
                        id: $('#id').val(),
                        name: $('#name').val(),
                        address: $('#address').val(),
                        phone: $('#phone').val(),
                        lmsStationRepetoryId: $('#lmsStationRepetoryId').val(),
                        lmsStationId: $('#lmsStationId').val(),
                    },
                    error: function (request) {
                        alert("Connection error");
                    },
                    success: function (data) {
                        window.parent.location.reload();
                    }
                });
            }

            layui.use(['form','layer'], function(){
                $ = layui.jquery;
                var form = layui.form()
                    ,layer = layui.layer;
            });
        </script>

</body>

</html>