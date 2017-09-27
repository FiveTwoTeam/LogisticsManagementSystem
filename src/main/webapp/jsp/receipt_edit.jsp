<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<html>
<body>
        <div class="x-body">
            <form class="layui-form" items="${receipts}">
                <div class="layui-form-item">
                    <div class="layui-input-inline">
                        <input type="text" id="id" name="id" value="${receipts.id}" style="display: none">
                    </div>
                    <label for="totalMoney" class="layui-form-label">
                        总价
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="totalMoney" name="totalMoney" required lay-verify="required"
                               autocomplete="off" value="${receipts.totalMoney}" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="gainDate" class="layui-form-label">
                        领取日期
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="gainDate" name="gainDate" required lay-verify="email"
                               autocomplete="off" value="${receipts.gainDate}" class="layui-input">
                    </div>

                </div>
                <div class="layui-form-item">
                    <label for="missDate" class="layui-form-label">
                        丢失日期
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="missDate" name="missDate" autocomplete="off" value="${receipts.missDate}"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="gainMan" class="layui-form-label">
                        领用人
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="gainMan" name="gainMan" autocomplete="off" value="${receipts.gainMan}"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="missMan" class="layui-form-label">
                        遗失人姓名
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="missMan" name="missMan" autocomplete="off" value="${receipts.missMan}"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="orderNumber" class="layui-form-label">
                        订单号
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="orderNumber" name="orderNumber" autocomplete="off" value="${receipts.orderNumber}"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">
                        发票状态
                    </label>
                    <div class="layui-input-inline">
                        <select name="right" title="right" id="right">
                            <option value="" >${receipts.state}</option>
                            <option value="0">分站已领用</option>
                            <option value="1">客户已领用</option>
                            <option value="2">已作废</option>
                        </select>
                    </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">
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

            function edit() {
                $.ajax({
                    type: "POST",
                    url: "/stationManage/updateReceiptSub",
                    data: {
                        id:$('#id').val(),
                        totalMoney:$('#totalMoney').val(),
                        gainMan:$('#gainMan').val(),
                        missMan:$('#missMan').val(),
                        orderNumber:$('#orderNumber').val(),
                        state:$('#state').val()

                    },
                    error: function () {
                        alert("Connection error");
                    },
                    success: function () {
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