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
                    <label for="L_username" class="layui-form-label">
                        昵称
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="L_username" name="username" required lay-verify="required"
                               autocomplete="off" value="zhibinm" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="L_email" class="layui-form-label">
                        身份证
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="L_email" name="email" required lay-verify="email"
                               autocomplete="off" value="113664000@qq.com" class="layui-input">
                    </div>

                </div>
                <div class="layui-form-item">
                    <label for="L_city" class="layui-form-label">
                        工作单位
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="L_city" name="city" autocomplete="off" value="广州"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="L_city" class="layui-form-label">
                        座机号码
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="L_city" name="city" autocomplete="off" value="广州"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="L_city" class="layui-form-label">
                        手机号码
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="L_city" name="city" autocomplete="off" value="广州"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="L_city" class="layui-form-label">
                        地址
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="L_city" name="city" autocomplete="off" value="广州"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="L_city" class="layui-form-label">
                        邮编
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="L_city" name="city" autocomplete="off" value="广州"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="L_city" class="layui-form-label">
                        邮箱
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="L_city" name="city" autocomplete="off" value="广州"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="L_city" class="layui-form-label">
                        权限
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="L_city" name="city" autocomplete="off" value="广州"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="L_repass" class="layui-form-label">
                    </label>
                    <button  class="layui-btn" >
                        增加
                    </button>
                </div>
            </form>
        </div>
        <script src="${ basePath }/lib/layui/layui.js" charset="utf-8">
        </script>
        <script src="${ basePath }/js/x-layui.js" charset="utf-8">
        </script>
        <script>
            layui.use(['form','layer'], function(){
                $ = layui.jquery;
              var form = layui.form()
              ,layer = layui.layer;
            
              //自定义验证规则
              form.verify({
                nikename: function(value){
                  if(value.length < 5){
                    return '昵称至少得5个字符啊';
                  }
                }
                ,pass: [/(.+){6,12}$/, '密码必须6到12位']
                ,repass: function(value){
                    if($('#L_pass').val()!=$('#L_repass').val()){
                        return '两次密码不一致';
                    }
                }
              });

              //监听提交
                form.on('submit(add)', function(data){
                    console.log(data);
                    //发异步，把数据提交给php
                    layer.alert("增加成功", {icon: 6},function () {
                        // 获得frame索引
                        var index = parent.layer.getFrameIndex(window.name);
                        //关闭当前frame
                        parent.layer.close(index);
                    });
                    return false;
                });
              
              
            });
        </script>
        <script>
        var _hmt = _hmt || [];
        (function() {
          var hm = document.createElement("script");
          hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
          var s = document.getElementsByTagName("script")[0]; 
          s.parentNode.insertBefore(hm, s);
            <%--window.location = "${pageContext.request.contextPath}/addAdmin";--%>
        })();
        </script>
    </body>

</html>