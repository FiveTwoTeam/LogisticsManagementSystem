<%--
  Created by IntelliJ IDEA.
  User: biao
  Date: 2017/9/20
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="layui-header header header-demo">
    <div class="layui-main">
        <p class="logo" >
            物流管理系统
        </p>
        <ul class="layui-nav" lay-filter="">
            <li class="layui-nav-item"><img src="${ basePath }/images/logo.png" class="layui-circle" style="border: 2px solid #A9B7B7;" width="35px" alt=""></li>
            <li class="layui-nav-item">
                <a href="javascript:;">admin</a>
                <dl class="layui-nav-child"> <!-- 二级菜单 -->
                    <dd><a href="">个人信息</a></dd>
                    <dd><a href="">切换帐号</a></dd>
                    <dd><a href="${ basePath }/login.html">退出</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item x-index"><a href="/">前台首页</a></li>
        </ul>
    </div>
</div>

