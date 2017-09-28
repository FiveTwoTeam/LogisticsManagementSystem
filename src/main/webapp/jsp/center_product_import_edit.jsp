<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="header.jsp"%>
<html>
<body>
        <div class="x-body">
            <form class="layui-form" items="${productImport}">
                <div class="layui-form-item">
                    <div class="layui-input-inline">
                        <input type="text" id="id" name="id" value="${productImport.id}" style="display: none">
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
                               autocomplete="off"  class="layui-input" value="<fmt:formatDate type="both"
                                        dateStyle="long" timeStyle="long"
                                        value="${productImport.datetime}" />">
                    </div>

                </div>
                <div class="layui-form-item">
                    <label for="lmsSupplierId" class="layui-form-label">
                        供应商ID
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="lmsSupplierId" name="lmsSupplierId" autocomplete="off"
                               class="layui-input" value="${productImport.lmsSupplierId}">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">
                    </label>
                    <a class="layui-btn" onclick="update()">修改</a>
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
                    url: "/centerProduct/updateProductImportSub",
                    data: {
                        id: $('#id').val(),
                        importNo: $('#importNo').val(),
                        lmsSupplierId: $('#lmsSupplierId').val()
                    },
                    error: function (XMLHttpRequest, textStatus) {
                        console.log(XMLHttpRequest.status);
                        console.log(XMLHttpRequest.readyState);
                        console.log(textStatus);
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