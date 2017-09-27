<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<html>
<body>
        <div class="x-body">
            <form class="layui-form" items="${customs}">
                <div class="layui-form-item">
                    <div class="layui-input-inline">
                        <input type="text" id="id" name="id" value="${customs.id}" style="display: none">
                    </div>
                    <label for="name" class="layui-form-label">
                        昵称
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="name" name="name" required lay-verify="required"
                               autocomplete="off" value="${customs.name}" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="identityId" class="layui-form-label">
                        身份证
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="identityId" name="identityId" required lay-verify="email"
                               autocomplete="off" value="${customs.identityId}" class="layui-input">
                    </div>

                </div>
                <div class="layui-form-item">
                    <label for="workUnit" class="layui-form-label">
                        工作单位
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="workUnit" name="workUnit" autocomplete="off" value="${customs.workUnit}"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="phoneExt" class="layui-form-label">
                        座机号码
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="phoneExt" name="phoneExt" autocomplete="off" value="${customs.phoneExt}"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="mobilePhone" class="layui-form-label">
                        手机号码
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="mobilePhone" name="mobilePhone" autocomplete="off" value="${customs.mobilePhone}"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="address" class="layui-form-label">
                        地址
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="address" name="address" autocomplete="off" value="${customs.address}"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="postCode" class="layui-form-label">
                        邮编
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="postCode" name="postCode" autocomplete="off" value="${customs.postCode}"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="mail" class="layui-form-label">
                        邮箱
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="mail" name="mail" autocomplete="off" value="${customs.mail}"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="status" class="layui-form-label">
                        权限
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="status" name="status" autocomplete="off" value="${customs.status}"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">
                    </label>
                    <a class="layui-btn" onclick="update()">修改</a>
                </div>
            </form>
        </div>
        <script src="${basePath}/lib/layui/layui.js" charset="utf-8">
        </script>
        <script src="${basePath}/js/x-layui.js" charset="utf-8">
        </script>
        <script>

            function update() {
                $.ajax({
                    type: "POST",
                    url: "/service/updateCustomSub",
                    data: {
                        id:$('#id').val(),
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
                    error: function (request) {
                        window.parent.location.reload();
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