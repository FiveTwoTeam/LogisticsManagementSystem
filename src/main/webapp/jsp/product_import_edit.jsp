<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<html>
<body>
        <div class="x-body">
            <form class="layui-form" action="${pageContext.request.contextPath}/updateAdminSub">
                <div class="layui-form-item">
                    <label for="importNo" class="layui-form-label">
                        入库单号
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="importNo" name="importNo" required lay-verify="required"
                               autocomplete="off" class="layui-input" value="${productImport.importNo}">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="datetime" class="layui-form-label">
                        时间
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="datetime" name="datetime" required lay-verify="email"
                               autocomplete="off"  class="layui-input" value="${productImport.datetime}">
                    </div>

                </div>
                <div class="layui-form-item">
                    <label for="lmsSupplierId" class="layui-form-label">
                        供应商ID
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="lmsSupplierId" name="lmsSupplierId" autocomplete="off" value="广州"
                               class="layui-input" value="${productImport.lmsSupplierId}">
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