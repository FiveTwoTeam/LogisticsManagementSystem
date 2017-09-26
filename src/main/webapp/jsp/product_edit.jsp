<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<html>
<body>
        <div class="x-body">
            <form class="layui-form" items="${products}">
                <div class="layui-form-item">
                    <div class="layui-input-inline">
                        <input type="text" id="id" name="id" value="${products.id}" style="display: none">
                    </div>
                    <label for="name" class="layui-form-label">
                        商品名称
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="name" name="name" required="" lay-verify="phone"
                               autocomplete="off" class="layui-input" value="${product.name}">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="price" class="layui-form-label">
                        单价
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="price" name="price" required="" lay-verify="email" value="113664000@qq.com"
                               autocomplete="off" class="layui-input" value="${product.price}">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="unit" class="layui-form-label">
                        计量单位
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="unit" name="unit" required="" lay-verify="email" value="113664000@qq.com"
                               autocomplete="off" class="layui-input" value="${product.unit}">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="lmsSecondCategoryId" class="layui-form-label">
                        二级分类ID
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="lmsSecondCategoryId" name="lmsSecondCategoryId" required="" lay-verify="email"
                               autocomplete="off" class="layui-input" value="${product.lmsSecondCategoryId}">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="discount" class="layui-form-label">
                        折扣
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="discount" name="discount" required="" lay-verify="email" value="113664000@qq.com"
                               autocomplete="off" class="layui-input" value="${product.discount}">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="cost" class="layui-form-label">
                        成本
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="cost" name="cost" required="" lay-verify="email" value="113664000@qq.com"
                               autocomplete="off" class="layui-input" value="${product.cost}">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="size" class="layui-form-label">
                        型号
                    </label>
                    <div class="layui-input-inline">
                        <input type="size" id="size" name="unit" required="" lay-verify="email" value="113664000@qq.com"
                               autocomplete="off" class="layui-input" value="${product.size}">
                    </div>
                </div> <div class="layui-form-item">
                <label for="lmsSupplierId" class="layui-form-label">
                    供应商ID
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="lmsSupplierId" name="lmsSupplierId" required="" lay-verify="email" value="113664000@qq.com"
                           autocomplete="off" class="layui-input" value="${product.lmsSupplierId}">
                </div>
            </div>
                <div class="layui-form-item">
                    <label for="qualityPeriod" class="layui-form-label">
                        质量
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="qualityPeriod" name="qualityPeriod" required="" lay-verify="email" value="113664000@qq.com"
                               autocomplete="off" class="layui-input" value="${product.qualityPeriod}">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="idBack" class="layui-form-label">
                        是否退货
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="idBack" name="idBack" required="" lay-verify="email" value="113664000@qq.com"
                               autocomplete="off" class="layui-input" value="${product.idBack}">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="ifExchange" class="layui-form-label">
                        是否换货
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="ifExchange" name="ifExchange" required="" lay-verify="email" value="113664000@qq.com"
                               autocomplete="off" class="layui-input" value="${product.ifExchange}">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="description" class="layui-form-label">
                        描述
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="description" name="description" required="" lay-verify="email" value="113664000@qq.com"
                               autocomplete="off" class="layui-input" value="${product.description}">
                    </div>
                </div>

                <div class="layui-form-item">
                    <label  class="layui-form-label">
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
                    url: "/updateproductSub",
                    data: {
                        id: $('#id').val(),
                        name: $('#name').val(),
                        price: $('#price').val(),
                        unit: $('#unit').val(),
                        lmsSecondCategoryId: $('#lmsSecondCategoryId').val(),
                        discount: $('#discount').val(),
                        cost: $('#cost').val(),
                        size: $('#size').val(),
                        lmsSupplierId: $('#lmsSupplierId').val(),
                        qualityPeriod: $('#qualityPeriod').val(),
                        ifBack: $('#ifBack').val(),
                        ifExchange: $('#ifExchange').val(),
                        description: $('#description').val(),
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