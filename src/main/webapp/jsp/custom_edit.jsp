<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<html>
<body>
        <div class="x-body">
            <form class="layui-form" action="${pageContext.request.contextPath}/updateAdminSub">
                <div class="layui-form-item">
                    <label for="L_username" class="layui-form-label">
                        昵称
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="name" name="name" required lay-verify="required"
                               autocomplete="off" value="${customer.name}" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="identityId" class="layui-form-label">
                        身份证
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="identityId" name="identityId" required lay-verify="email"
                               autocomplete="off" value="${customer.identityId}" class="layui-input">
                    </div>

                </div>
                <div class="layui-form-item">
                    <label for="workUnit" class="layui-form-label">
                        工作单位
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="workUnit" name="workUnit" autocomplete="off" value="${customer.workUnit}"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="phnieExt" class="layui-form-label">
                        座机号码
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="phnieExt" name="phnieExt" autocomplete="off" value="${customer.phnieExt}"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="mobilePhone" class="layui-form-label">
                        手机号码
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="mobilePhone" name="mobilePhone" autocomplete="off" value="${customer.mobilePhone}"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="address" class="layui-form-label">
                        地址
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="address" name="address" autocomplete="off" value="${customer.address}"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="postCode" class="layui-form-label">
                        邮编
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="postCode" name="postCode" autocomplete="off" value="${customer.postCode}"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="mail" class="layui-form-label">
                        邮箱
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="mail" name="mail" autocomplete="off" value="${customer.mail}"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="status" class="layui-form-label">
                        权限
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="status" name="status" autocomplete="off" value="${customer.status}"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="L_repass" class="layui-form-label">
                    </label>
                    <button class="layui-btn">修改</button>
                </div>
            </form>
        </div>
        <script src="${basePath}/lib/layui/layui.js" charset="utf-8">
        </script>
        <script src="${basePath}/js/x-layui.js" charset="utf-8">
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
              <%--form.on('submit(save)', function(data){--%>
<%--//                console.log(data);--%>
                <%--//发异步，把数据提交给php--%>
                <%--layer.alert("保存成功", {icon: 6},function () {--%>
                    <%--// 获得frame索引--%>
                    <%--var index = parent.layer.getFrameIndex(window.name);--%>
                    <%--//关闭当前frame--%>
                    <%--parent.layer.close(index);--%>
                <%--});--%>
                  <%--window.location = "${pageContext.request.contextPath}/updateAdminSub";--%>
                <%--return false;--%>
              <%--});--%>
              
              
            });
        </script>



    </body>

</html>