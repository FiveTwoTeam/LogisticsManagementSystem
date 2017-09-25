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
            <form class="layui-form" >
                <div class="layui-form-item">
                    <label for="username" class="layui-form-label">
                        登录名
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="username" name="username" class="layui-input">
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
                        <input type="text" id="password" name="password"
                      class="layui-input">
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
                        <input type="password" id="L_repass" name="repass"
                        autocomplete="off" class="layui-input">
                    </div>
                </div>
                 <div class="layui-form-item">
                    <label for="mail" class="layui-form-label">
                        邮箱
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="mail" name="mail"
                        autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux">
                        <span class="x-red">*</span>
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="phone" class="layui-form-label">
                       手机
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="phone" name="phone"
                        autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-form-mid layui-word-aux">
                        将会成为您唯一的登入名
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="role" class="layui-form-label">
                        角色
                    </label>
                    <div class="layui-input-inline">
                      <select name="right">
                        <option value="">请选择角色</option>
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
                    <a  class="layui-btn" onclick="add()">
                        保存
                    </a>
                </div>
            </form>
        </div>
        <script src="${ basePath }/lib/layui/layui.js" charset="utf-8">
        </script>
        <script src="${ basePath }/js/x-layui.js" charset="utf-8">
        </script>
        <script>
            function add(){
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
                    }
                });
            }
            layui.use(['form','layer'], function(){
                $ = layui.jquery;
                var form = layui.form()
                    ,layer = layui.layer;



                //监听提交
              /*  form.on('submit(save)', function(data){
                    console.log(data);
                    //发异步，把数据提交给php
                    layer.alert("保存成功", {icon: 6},function () {
                        // 获得frame索引
                        var index = parent.layer.getFrameIndex(window.name);
                        
                        $.ajax({
                            type: "POST",
                            url:"",
                            data:{
                              is:1
                            },
                            async: false,
                            error: function(request) {
                                alert("Connection error");
                            },
                            success: function(data) {
                                $("#commonLayout_appcreshi").parent().html(data);
                            }
                        });
                        
                        //关闭当前frame
                        parent.layer.close(index);
                    });
                    window.parent.location.reload();

                    return false;
                });*/
            });
        </script>
    </body>

</html>