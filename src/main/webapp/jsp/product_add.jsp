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
                    <label for="name" class="layui-form-label">
                         商品名称
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="name" name="name" required="" lay-verify="phone"
                               autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="price" class="layui-form-label">
                        单价
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="price" name="price" required="" lay-verify="email" value="113664000@qq.com"
                               autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="unit" class="layui-form-label">
                        计量单位
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="unit" name="unit" required="" lay-verify="email" value="113664000@qq.com"
                               autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="lmsSecondCategoryId" class="layui-form-label">
                        二级分类ID
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="lmsSecondCategoryId" name="lmsSecondCategoryId" required="" lay-verify="email"
                               autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="discount" class="layui-form-label">
                        折扣
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="discount" name="discount" required="" lay-verify="email" value="113664000@qq.com"
                               autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="cost" class="layui-form-label">
                        成本
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="cost" name="cost" required="" lay-verify="email" value="113664000@qq.com"
                               autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="size" class="layui-form-label">
                        型号
                    </label>
                    <div class="layui-input-inline">
                        <input type="size" id="size" name="unit" required="" lay-verify="email" value="113664000@qq.com"
                               autocomplete="off" class="layui-input">
                    </div>
                </div> <div class="layui-form-item">
                <label for="lmsSupplierId" class="layui-form-label">
                    供应商ID
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="lmsSupplierId" name="lmsSupplierId" required="" lay-verify="email" value="113664000@qq.com"
                           autocomplete="off" class="layui-input">
                </div>
            </div>
                <div class="layui-form-item">
                    <label for="qualityPeriod" class="layui-form-label">
                        质量
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="qualityPeriod" name="qualityPeriod" required="" lay-verify="email" value="113664000@qq.com"
                               autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="idBack" class="layui-form-label">
                        是否退货
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="idBack" name="idBack" required="" lay-verify="email" value="113664000@qq.com"
                               autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="ifExchange" class="layui-form-label">
                        是否换货
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="ifExchange" name="ifExchange" required="" lay-verify="email" value="113664000@qq.com"
                               autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="description" class="layui-form-label">
                        描述
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="description" name="description" required="" lay-verify="email" value="113664000@qq.com"
                               autocomplete="off" class="layui-input">
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