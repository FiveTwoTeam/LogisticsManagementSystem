<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<html>
<body>
        <div class="x-body">
            <form class="layui-form" items="${productExports}">
                <div class="layui-form-item">
                    <div class="layui-input-inline">
                        <input type="text" id="id" name="id" value="${productExports.id}" style="display: none">
                    </div>
                    <label for="transport" class="layui-form-label">
                        运输公司
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="transport" name="transport" required lay-verify="required"
                               autocomplete="off"  class="layui-input" value="${productExports.transport}">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="description" class="layui-form-label">
                        描述
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="description" name="description" required lay-verify="email"
                               autocomplete="off"  class="layui-input" value="${productExports.description}">
                    </div>

                </div>
                <div class="layui-form-item">
                    <label for="totalCount" class="layui-form-label">
                        总数量
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="totalCount" name="totalCount" autocomplete="off"
                               class="layui-input" value="${productExports.totalCount}">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="totalPrice" class="layui-form-label">
                        总价格
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="totalPrice" name="totalPrice" autocomplete="off"
                               class="layui-input" value="${productExports.totalPrice}">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="datetime" class="layui-form-label">
                        时间
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="datetime" name="datetime" autocomplete="off"
                               class="layui-input" value="${productExports.datetime}">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">
                    </label>
                    <button class="layui-btn" onclick="update()">修改</button>
                </div>
            </form>
        </div>
        <script src="${basePath}/lib/layui/layui.js" charset="utf-8">
        </script>
        <script src="${basePath}/js/x-layui.js" charset="utf-8">
        </script>
        <script>

            function update() {
                $.ajax({
                    type: "POST",
                    url: "/StationRepetoryAdmin/updateProductExportSub",
                    data: {
                        id: $('#id').val(),
                        transport: $('#transport').val(),
                        description: $('#description').val(),
                        totalCount: $('#totalCount').val(),
                        totalPrice: $('#totalPrice').val()
                     /*   datetime: $('#datetime').val(),*/
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