<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<jsp:include page="header.jsp"/>
<body ng-app="adminApp">
	<div class="layui-layout layui-layout-admin" ng-controller="adminController">
 			<span class="layui-breadcrumb">
              <a><cite>首页</cite></a>
              <a><cite>管理员管理</cite></a>
              <a><cite>管理员列表</cite></a>
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
							<input type="text" name="username" placeholder="请输入登录名" autocomplete="off" class="layui-input"
								   ng-model="username">
						</div>
						<<div class="layui-input-inline" style="width:80px">
							<button class="layui-btn" lay-submit="" lay-filter="sreach"><i class="layui-icon"
							>&#xe615;</i>
							</button>
						</div>
					</div>
				</div>
			</form>
			<table class="layui-table">
				<thead>
				<tr>
					<th><input type="checkbox" name="" value="">
					<th>数量</th>
					<th>最大值</th>
					<th>预警值</th>
					<th>商品状态</th>
					<th>商品ID</th>
				</tr>
				</thead>
				<tbody>
			<tr ng-repeat="admin in admins| filter:{'username':username}">
				<td>${item.count}</td>
				<td>${item.max}</td>
				<td>${item.guard}</td>
				<td>${item.status}</td>
				<td>${item.lmsProductId}</td>

				<td>
					<a style="text-decoration:none" onclick="admin_stop(this,'10001')" href="javascript:;" title="停用">
						<i class="layui-icon">&#xe601;</i>
					</a>
					<a title="编辑" href="${pageContext.request.contextPath}/updateAdmin"
					   class="ml-5" style="text-decoration:none">
						<i class="layui-icon">&#xe642;</i>
					</a>
					<a title="删除" href="javascript:;" onclick="admin_del(this,'1')"
					   style="text-decoration:none">
						<i class="layui-icon">&#xe640;</i>
					</a>
				</td>
			</tr>

			</table>


	</div>

</div>
</body>
</html>