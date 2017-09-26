<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<html>
<body>
        <div class="x-body">
            <form class="layui-form"  items="${tasks}">
                <div class="layui-form-item">
                    <div class="layui-input-inline">
                        <input type="text" id="id" name="id" value="${tasks.id}" style="display: none">
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">
                            任务状态
                        </label>
                        <div class="layui-input-inline">
                            <select name="status" title="status" id="status">
                                <option value="" >${tasks.status}</option>
                                <option value="0">完成</option>
                                <option value="1">部分完成</option>
                                <option value="2">已完成</option>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="datetime" class="layui-form-label">
                        时间
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="datetime" name="datetime" required lay-verify="required"
                               autocomplete="off" value="${tasks.datetime}" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">
                        任务类型
                    </label>
                    <div class="layui-input-inline">
                        <select name="type" title="type" id="type">
                            <option value="" >${tasks.type}</option>
                            <option value="0">已收款</option>
                            <option value="1">货到付款</option>
                            <option value="2">送货</option>
                            <option value="3">退货</option>
                            <option value="4">换货</option>
                        </select>
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="lmsOrderId" class="layui-form-label">
                        订单ID
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="lmsOrderId" name="lmsOrderId" autocomplete="off" value="${tasks.lmsOrderId}"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="lmsCustomerId" class="layui-form-label">
                        客户ID
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="lmsCustomerId" name="lmsCustomerId" autocomplete="off" value="${tasks.lmsCustomerId}"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="lmsStetionId" class="layui-form-label">
                        分站ID
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="lmsStetionId" name="lmsCustomerId" required lay-verify="required"
                               autocomplete="off" value="${tasks.lmsStetionId}" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="lmsStationRepetoryId" class="layui-form-label">
                        分站Repetory
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="lmsStationRepetoryId" name="lmsStationRepetoryId" required lay-verify="required"
                               autocomplete="off" value="${tasks.lmsStationRepetoryId}" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="lmsDeliveryStaffId" class="layui-form-label">
                        配送员ID
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="lmsDeliveryStaffId" name="lmsDeliveryStaffId" required lay-verify="required"
                               autocomplete="off" value="${tasks.lmsDeliveryStaffId}" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="satisfy" class="layui-form-label">
                        满意度
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="satisfy" name="satisfy" required lay-verify="required"
                               autocomplete="off" value="${tasks.satisfy}" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label for="description" class="layui-form-label">
                        描述
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="description" name="description" required lay-verify="required"
                               autocomplete="off" value="${tasks.description}" class="layui-input">
                    </div>
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
                    url: "/updateTaskSub",
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