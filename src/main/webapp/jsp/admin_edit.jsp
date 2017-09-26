<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<html>
<body>
        <div class="x-body">
            <form class="layui-form">
                <div class="layui-form-item">
                    <label for="username" class="layui-form-label">
                        登录名
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="username" name="username" required="" lay-verify="required" value="${admin.username}"
                        autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux">
                        将会成为您唯一的登入名
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="password" class="layui-form-label">
                        密码
                    </label>
                    <div class="layui-input-inline">
                        <input type="password" id="L_pass" name="pass" required="" lay-verify="pass"
                        autocomplete="off" class="layui-input" value="${admin.password}">
                    </div>
                    <div class="layui-form-mid layui-word-aux">
                        6到16个字符
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="L_repass" class="layui-form-label">
                        确认密码
                    </label>
                    <div class="layui-input-inline">
                        <input type="password" id="L_repass" name="repass" required="" lay-verify="repass" value="123456" 
                        autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="email" class="layui-form-label">
                        邮箱
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="email" name="email" required="" lay-verify="email" value="${admin.mail}"
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
                        <input type="text" id="phone" value="${admin.phone}" name="phone" required="" lay-verify="phone"
                        autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux">
                        <span class="x-red">*</span>将会成为您唯一的登入名
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="role" class="layui-form-label">
                        角色
                    </label>
                    <div class="layui-input-inline">
                      <select name="role" value="${admin.right}">
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
                    <label for="L_repass" class="layui-form-label">
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

            function edit(){
                $.ajax({
                    type: "POST",
                    url:"/addAdmin",
                    data:{
                        username:$('#username').val(),
                        password:$('#password').val(),
                        mail:$('#mail').val(),
                        phone:$('#phone').val(),
                        right:$('#right').val(),
                    },
                    error: function(request) {
                        alert("Connection error");
                    },
                    success: function(data) {
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