<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<html>
<body>
        <div class="x-body">
            <form class="layui-form"  items="${admins}">
                <div class="layui-form-item">
                    <div class="layui-input-inline">
                        <input type="text" id="id" name="id" value="${admins.id}" style="display: none" title="id">
                    </div>
                    <label for="username" class="layui-form-label">
                        登录名
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="username" name="username" required=""  value="${admins.username}"
                        autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="password" class="layui-form-label">
                        密码
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="password" name="pass" required=""
                        autocomplete="off" class="layui-input" value="${admins.password}">
                    </div>
                </div>

                <div class="layui-form-item">
                    <label for="mail" class="layui-form-label">
                        邮箱
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="mail" name="mail" required=""   value="${admins.mail}"
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
                        <input type="text" id="phone" value="${admins.phone}" name="phone" required=""
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
                      <select name="right" title="right" id="right">
                        <option value="" >${admins.right}</option>
                        <option value="0">超级管理员</option>
                        <option value="1">客服</option>
                        <option value="2">调度中心管理员</option>
                        <option value="3">分站管理员</option>
                        <option value="4">中心库房管理员</option>
                        <option value="5">分站库房管理员</option>
                        <option value="6">配送中心管理员</option>
                        <option value="7">财务中心管理员</option>
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

        <script src="${ basePath }/lib/layui/layui.js" charset="utf-8">
        </script>
        <script src="${ basePath }/js/x-layui.js" charset="utf-8">
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
                    right: $('#right').val()
                },
                error: function () {
                    alert("Connection error");
                },
                success: function () {
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