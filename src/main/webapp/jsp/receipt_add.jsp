<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<html>
<body>
<div class="x-body">
    <form class="layui-form">
        <div class="layui-form-item">
            <label for="totalMoney" class="layui-form-label">
                总价
            </label>
            <div class="layui-input-inline">
                <input type="text" id="totalMoney" name="totalMoney" required lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="gainDate" class="layui-form-label">
                领取日期
            </label>
            <div class="layui-input-inline">
                <input type="text" id="gainDate" name="gainDate" required lay-verify="email"
                       autocomplete="off"  class="layui-input">
            </div>

        </div>
        <div class="layui-form-item">
            <label for="missDate" class="layui-form-label">
                丢失日期
            </label>
            <div class="layui-input-inline">
                <input type="text" id="missDate" name="missDate" autocomplete="off"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="gainMan" class="layui-form-label">
                领用人
            </label>
            <div class="layui-input-inline">
                <input type="text" id="gainMan" name="gainMan" autocomplete="off"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="missMan" class="layui-form-label">
                遗失人姓名
            </label>
            <div class="layui-input-inline">
                <input type="text" id="missMan" name="missMan" autocomplete="off"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="orderNumber" class="layui-form-label">
                订单号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="orderNumber" name="orderNumber" autocomplete="off"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="state" class="layui-form-label">
                发票状态
            </label>
            <div class="layui-input-inline">
                <input type="text" id="state" name="state" autocomplete="off"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">
            </label>
            <button class="layui-btn" onclick="add()">增加</button>
        </div>
    </form>
</div>
<script src="${basePath}/lib/layui/layui.js" charset="utf-8">
</script>
<script src="${basePath}/js/x-layui.js" charset="utf-8">
</script>
<script>

    function add() {
        $.ajax({
            type: "POST",
            url: "/addReceipt",
            data: {
                importNo: $('#importNo').val(),
                datetime: $('#datetime').val(),
                lmsSupplierId: $('#lmsSupplierId').val(),
            },
            error: function (request) {
                alert("Connection error");
            },
            success: function (data) {
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