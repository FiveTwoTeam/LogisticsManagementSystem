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
                    <label for="totalPrice" class="layui-form-label">
                        总价
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="totalPrice" name="totalPrice" required="" lay-verify="required"
                               autocomplete="off"   disabled="" class="layui-input">
                    </div>
                </div>

                <div class="layui-form-item">
                    <label for="orderNumber" class="layui-form-label">
                        订单号码
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="orderNumber" name="orderNumber" required="" lay-verify="required"
                               autocomplete="off" class="layui-input">
                    </div>
                </div>

                <div class="layui-form-item">
                    <label for="description" class="layui-form-label">
                        <span class="x-red">*</span>订单描述
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="description" name="description" required="" lay-verify="required"
                               autocomplete="off" class="layui-input">
                    </div>
                </div>

                <div class="layui-form-item">
                    <label for="type" class="layui-form-label">
                        订单类型
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="type" name="type" required="" lay-verify="required"
                               autocomplete="off" class="layui-input">
                    </div>
                </div>

                <div class="layui-form-item">
                    <label for="address" class="layui-form-label">
                        地址
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="address" name="address" required="" lay-verify="required"
                               autocomplete="off" class="layui-input">
                    </div>
                </div>

                <div class="layui-form-item">
                    <label for="lmsCustomerId" class="layui-form-label">
                        客户ID
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="lmsCustomerId" name="lmsCustomerId" required="" lay-verify="required"
                               autocomplete="off"  value="客户ID" disabled="" class="layui-input">
                    </div>
                </div>

                <div class="layui-form-item">
                    <label for="payer" class="layui-form-label">
                        支付人姓名
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="payer" name="payer" required="" lay-verify="required"
                               autocomplete="off" class="layui-input">
                    </div>
                </div>

                <div class="layui-form-item">
                    <label for="payerAddress" class="layui-form-label">
                        地址
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="payerAddress" name="payerAddress" required="" lay-verify="required"
                               autocomplete="off" class="layui-input">
                    </div>
                </div>

                <div class="layui-form-item">
                    <label for="payerPhone" class="layui-form-label">
                        联系电话
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="payerPhone" name="payerPhone" required="" lay-verify="required"
                               autocomplete="off" class="layui-input">
                    </div>
                </div>

                <div class="layui-form-item">
                    <label for="payerPostCode" class="layui-form-label">
                        邮编
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="payerPostCode" name="payerPostCode" required="" lay-verify="required"
                               autocomplete="off" class="layui-input">
                    </div>
                </div>

                <div class="layui-form-item">
                    <label for="datetime" class="layui-form-label">
                        时间
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="datetime" name="datetime" required="" lay-verify="required"
                               autocomplete="off"  value="时间" disabled="" class="layui-input">
                    </div>
                </div>

                <div class="layui-form-item">
                    <label for="lmsAdminId" class="layui-form-label">
                        管理员ID
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="lmsAdminId" name="lmsAdminId" required="" lay-verify="required"
                               autocomplete="off"  value="管理员ID" disabled="" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">
                    </label>
                    <button  class="layui-btn" onclick="add()">
                        增加
                    </button>
                </div>
            </form>
        </div>

        <script src="${basePath}/lib/layui/layui.js" charset="utf-8">
        </script>
        <script src="${basePath}/js/x-layui.js" charset="utf-8">
        </script>
        <script>
            function add(){
                $.ajax({
                    type: "POST",
                    url:"/DispatchAdmin/addOrder",
                    data:{
                        totalPrice: $('#totalPrice').val(),
                        orderNumber: $('#orderNumber').val(),
                        description: $('#description').val(),
                        type: $('#type').val(),
                        address: $('#address').val(),
                        lmsCustomerId: $('#lmsCustomerId').val(),
                        payer: $('#payer').val(),
                        payerAddress: $('#payerAddress').val(),
                        payerPhone: $('#payerPhone').val(),
                        payerPostCode: $('#payerPostCode').val(),
                        datetime: $('#datetime').val(),
                        lmsAdminId: $('#lmsAdminId').val(),
                    },
                    error: function(request) {
                        alert("Connection error");
                    },
                    success: function(data) {
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