<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<html>
<body>
        <div class="x-body">
            <form class="layui-form"  items="${admins}">
                <div class="layui-form-item">
                    <div class="layui-input-inline">
                        <input type="text" id="id" name="id" value="${admins.id}" style="display: none">
                    </div>
                    <label for="username" class="layui-form-label">
                        登录名
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="username" name="username" required="" lay-verify="required" value="${admins.username}"
                        autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="password" class="layui-form-label">
                        密码
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="password" name="pass" required="" lay-verify="pass"
                        autocomplete="off" class="layui-input" value="${admins.password}">
                    </div>
                </div>

                <div class="layui-form-item">
                    <label for="mail" class="layui-form-label">
                        邮箱
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="mail" name="mail" required="" lay-verify="email" value="${admins.mail}"
                        autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux">
                        <span class="x-red">*</span>
                    </div>
                </div>
                 <div class="layui-form-item">
                    <label for="phone" class="layui-form-label">
                        <span class="x-red">*</span>手机
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="phone" value="${admins.phone}" name="phone" required="" lay-verify="phone"
                        autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux">
                        <span class="x-red">*</span>将会成为您唯一的登入名
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">
                        角色
                    </label>
                    <div class="layui-input-inline">
                      <select name="role" value="${admins.right}">
                        <option value="">请选择角色</option>
                        <option value="超级管理员">超级管理员</option>
                        <option value="编辑人员">客服</option>
                        <option value="问题维护">调度中心管理员</option>
                        <option value="问题维护">分站管理员</option>
                        <option value="问题维护">中心库房管理员</option>
                        <option value="问题维护">分站库房管理员</option>
                        <option value="问题维护">配送中心管理员</option>
                        <option value="问题维护">财务中心管理员</option>
                      </select>
                    </div>
                </div>
                <div class="layui-form-item">
                    <label  class="layui-form-label">
                    </label>
                    <button class="layui-btn" onclick="update()">修改</button>
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
                url: "/updateAdminSub",
                data: {
                    id: $('#id').val(),
                    username: $('#username').val(),
                    password: $('#password').val(),
                    mail: $('#mail').val(),
                    phone: $('#phone').val(),
                    right: $('#right').val(),
                },
                error: function (request) {
                    alert("Connection error");
                },
                success: function (data) {
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