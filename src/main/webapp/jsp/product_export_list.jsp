<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<jsp:include page="header.jsp"/>

<body ng-app="productExportApp">
	<div class="layui-layout layui-layout-productExport" ng-controller="productExportController">
 			<span class="layui-breadcrumb">
              <a><cite>首页</cite></a>
              <a><cite>分站库房</cite></a>
              <a><cite>出库单</cite></a>
 			</span>
			<a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"
			   href="javascript:location.replace(location.href);" title="刷新"><i class="layui-icon" style="line-height:30px">ဂ</i></a>

		<div class="x-body">
			<form class="layui-form x-center" action="#" style="width:80%">
				<div class="layui-form-pane" style="margin-top: 15px;">
					<div class="layui-form-item">
						<label class="layui-form-label">日期范围</label>
						<div class="layui-input-inline">
							<input class="layui-input" placeholder="开始日" id="LAY_demorange_s">
						</div>
						<div class="layui-input-inline">
							<input class="layui-input" placeholder="截止日" id="LAY_demorange_e">
						</div>
						<div class="layui-input-inline">
							<input type="text" name="transport" placeholder="请输入运输公司名" autocomplete="off" class="layui-input"
								   ng-model="transport">
						</div>
						<<div class="layui-input-inline" style="width:80px">
							<button class="layui-btn" lay-submit="" lay-filter="sreach"><i class="layui-icon"
							>&#xe615;</i>
							</button>
						</div>
					</div>
				</div>
			</form>
			<button class="layui-btn" ng-click="productExport_add('添加用户','${basePath}/jsp/product_export_add.jsp','600','500')"><i class="layui-icon">&#xe608;</i>添加
			</button>
			<table class="layui-table">
				<thead>
				<tr>
					<%--<th><input type="checkbox" name="" value="">--%>
					<th>运输公司</th>
					<th>描述</th>
					<th>总数量</th>
					<th>总价格</th>
					<th>时间</th>
					<th>操作</th>
				</tr>
				</thead>
				<tbody>
				<tr ng-repeat="productExport in productExports| filter:{'transport':transport}">
						<td>{{productExport.transport}}</td>
						<td>{{productExport.description}}</td>
						<td>{{productExport.totalCount}}</td>
						<td>{{productExport.totalPrice}}</td>
						<td>{{productExport.datetime}}</td>
					<td>
						<a title="编辑" href="javascript:;" ng-click="productExport_edit('编辑用户',productExport.id,'600','500')"
						   class="ml-5" style="text-decoration:none">
							<i class="layui-icon">&#xe642;</i>
						</a>
						<a title="删除" href="javascript:;" ng-click="productExport_del(productExport.id);"
						   style="text-decoration:none">
							<i class="layui-icon">&#xe640;</i>
						</a>
					</td>
				</tr>
			</tbody>
			</table>
		</div>
</div>

	<script src="${ basePath }/js/angular.min.js"></script>
	<script type="text/javascript">
        var app = angular.module('productExportApp', []);
        app.controller('productExportController', function ($scope) {
            $scope.productExports = ${ productExports };

            //编辑
            $scope.productExport_edit = function(title,id,w,h) {
                x_admin_show(title,'/StationRepetoryAdmin/updateProductExport/'+id,w,h);
            }

            $scope.productExport_add = function(title,url,w,h){
                x_admin_show(title,url,w,h);
            }

            $scope.productExport_del=function (id) {
                var productExportid = id;
                layer.confirm('确认要删除吗？',function(){
                    window.location ="/StationRepetoryAdmin/deleteProductExport/"+productExportid;
                });
            }
        });
	</script>

	<script src="${basePath}/lib/layui/layui.js" charset="utf-8"></script>
	<script src="${basePath}/js/x-layui.js" charset="utf-8"></script>
	<script>
        layui.use(['laydate','element','laypage','layer'], function(){
            $ = layui.jquery;//jquery
            laydate = layui.laydate;//日期插件
            lement = layui.element();//面包导航
            laypage = layui.laypage;//分页
            layer = layui.layer;//弹出层

            //以上模块根据需要引入

            laypage({
                cont: 'page'
                ,pages: 100
                ,first: 1
                ,last: 100
                ,prev: '<em><</em>'
                ,next: '<em>></em>'
            });

            var start = {
                min: laydate.now()
                ,max: '2099-06-16 23:59:59'
                ,istoday: false
                ,choose: function(datas){
                    end.min = datas; //开始日选好后，重置结束日的最小日期
                    end.start = datas //将结束日的初始值设定为开始日
                }
            };

            var end = {
                min: laydate.now()
                ,max: '2099-06-16 23:59:59'
                ,istoday: false
                ,choose: function(datas){
                    start.max = datas; //结束日选好后，重置开始日的最大日期
                }
            };

            document.getElementById('LAY_demorange_s').onclick = function(){
                start.elem = this;
                laydate(start);
            }
            document.getElementById('LAY_demorange_e').onclick = function(){
                end.elem = this
                laydate(end);
            }

        });
	</script>
</body>
</html>