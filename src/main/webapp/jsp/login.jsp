<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>用户登录</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
    <link href="css/common.css" rel="stylesheet" type="text/css" />
    <link href="css/style.css" rel="stylesheet" type="text/css" />

    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <script type="text/javascript" src="js/login.js"></script>

    <script type="text/javascript">
        <%
            String msg = request.getParameter("msg");
            if("registerSuccess".equals(msg)){
                out.print("alert('注册成功，系统将自动跳转登录页');");
            }
            if("loginError".equals(msg)){
                out.print("alert('用户名密码错误，请重新登录');");
            }
            if("validateCodeError".equals(msg)){
                out.print("alert('验证码错误，请重新输入');");
            }
        %>
    </script>

</head>

<body>
<div class="wrap">
    <!-- main begin-->
    <div class="main">
        <div class="sidebarg">
            <form action="${pageContext.request.contextPath}/login" method="post">
                <div class="login">
                    <dl>
                        <dt class="blues">用户登陆</dt>
                        <dd><label for="name">用户名：</label>
                            <input type="text" name="username" class="inputh" value="${username}" id="name"/></dd>
                        <dd><label for="password">密 码：</label>
                            <input type="password" name="userpassword" class="inputh" value="${password}" id="password"/></dd>
                        <dd>
                            <%--<label class="lf" for="passwords">验证码：</label>--%>
                            <%--<input type="text" name="inputCode" class="inputh inputs lf" value="" id="passwords"/>--%>
                            <%--<span class="wordp lf"></span>--%>
                            <span >${msg}</span>
                        </dd>
                        <dd class="buttom">
                            <input name="" type="submit" value="登 录" />
                            <input id="register" name="" type="button" value="注 册"  onclick="javascrtpt:window.location.href='${pageContext.request.contextPath}/register.jsp'" />
                            <span class="blues  lf"><a href="" title="">忘记密码?</a></span>
                            <div class="cl"></div>
                        </dd>
                    </dl>
                </div>
            </form>
        </div>
        <div class="cl"></div>
    </div>
    <!-- main end-->

    <!-- footer begin-->
</div>
<!--footer end-->
</body>
</html>
