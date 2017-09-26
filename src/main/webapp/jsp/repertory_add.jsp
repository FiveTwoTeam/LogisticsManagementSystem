<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<html>
<body>
<div class="x-body">
    <form class="layui-form">
        <div class="layui-form-item">
            <label for="name" class="layui-form-label">
                中心库房名
            </label>
            <div class="layui-input-inline">
                <input type="text" id="name" name="name" required lay-verify="required"
                       autocomplete="off"   class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="address" class="layui-form-label">
                地址
            </label>
            <div class="layui-input-inline">
                <input type="text" id="address" name="address" required lay-verify="email"
                       autocomplete="off"   class="layui-input">
            </div>

        </div>
        <div class="layui-form-item">
            <label for="lmsrepertoryId" class="layui-form-label">
                管理员ID
            </label>
            <div class="layui-input-inline">
                <input type="text" id="lmsrepertoryId" name="lmsrepertoryId" autocomplete="off"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label  class="layui-form-label">
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
            url: "/addRepertory",
            data: {
                id: $('#id').val(),
                name: $('#name').val(),
                address: $('#address').val(),
                lmsRepertoryId: $('#lmsRepertoryId').val(),
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