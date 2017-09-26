<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<html>
<body>
        <div class="x-body">
            <form class="layui-form"  items="${repertoryInfos}">
                <div class="layui-form-item">
                    <div class="layui-input-inline">
                        <input type="text" id="id" name="id" value="${repertoryInfos.id}" style="display: none">
                    </div>
                    <label for="max" class="layui-form-label">
                        最高值
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="max" name="max" required lay-verify="required"
                               autocomplete="off" value="${repertoryInfos.max}" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="guard" class="layui-form-label">
                        预警值
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="guard" name="guard" required lay-verify="email"
                               autocomplete="off" value="${repertoryInfos.guard}" class="layui-input">
                    </div>

                </div>
                <div class="layui-form-item">
                    <label for="lmsRepertoryId" class="layui-form-label">
                        库房ID
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="lmsRepertoryId" name="lmsRepertoryId" autocomplete="off" value="${repertoryInfos.lmsRepertoryId}"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="lmsProductId" class="layui-form-label">
                        商品ID
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="lmsProductId" name="lmsProductId" autocomplete="off" value="${repertoryInfos.lmsProductId}"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label  class="layui-form-label">
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
                    url: "/updateRepertoryInfoSub",
                    data: {
                        id: $('#id').val(),
                        max: $('#max').val(),
                        guard: $('#guard').val(),
                        lmsRepertoryId: $('#lmsRepertoryId').val(),
                        lmsProductId: $('#lmsProductId').val(),
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