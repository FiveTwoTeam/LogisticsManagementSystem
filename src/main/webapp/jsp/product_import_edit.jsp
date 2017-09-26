<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<html>
<body>
        <div class="x-body">
            <form class="layui-form" items="${productImports}">
                <div class="layui-form-item">
                    <div class="layui-input-inline">
                        <input type="text" id="id" name="id" value="${productImports.id}" style="display: none">
                    </div>
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
                    url: "/updateProductImportSub",
                    data: {
                        id: $('#id').val(),
                        importNo: $('#importNo').val(),
                        datetimr: $('#datetimr').val(),
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