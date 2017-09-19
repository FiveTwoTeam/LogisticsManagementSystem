<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  
  <body>
  	<form 
  		action="${pageContext.request.contextPath}/query"
  		method="post">
  		查询条件:<br>
  		商品名称：<input type="text" name="lmsAdmin.username"/>
  		<input type="submit" value="查询">
  	</form>
  
    <table  border="1px" cellspacing="0">
    	<!-- items指定的是集合， var指定的是迭代集合时的某一个对象的变量名 -->
    	<tr>
    		<td>序号</td>
    		<td>用户名</td>
    		<td>密码</td>
    		<td>邮箱</td>
    		<td>手机</td>
    		<td>权限</td>
    	</tr>
    	
		<c:forEach var="item" items="${itemList}">
	    	<tr>
	    		<td>${item.id}</td>
	    		<td>${item.username}</td>
	    		<td>${item.password}</td>
	    		<td>${item.mail}</td>
	    		<td>${item.phone}</td>
	    		<td>${item.right}</td>
	    	</tr>
    	</c:forEach>
    </table>
	${itemList}
  </body>
</html>
