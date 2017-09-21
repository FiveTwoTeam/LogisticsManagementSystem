<%--
  Created by IntelliJ IDEA.
  User: biao
  Date: 2017/9/20
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="layui-side layui-bg-black x-side">
    <div class="layui-side-scroll">
        <ul class="layui-nav layui-nav-tree site-demo-nav" lay-filter="side">
            <li class="layui-nav-item">
                <a class="javascript:;" href="javascript:;">
                    <i class="layui-icon" style="top: 3px;">&#xe62d;</i><cite>客服</cite>
                </a>
                <dl class="layui-nav-child">
                    <dd class="">
                    <dd class="">
                        <a href="javascript:;" _href="${ basePath }/query">
                            <cite>客户管理</cite>
                        </a>
                    </dd>
                    </dd>
                    <dd class="">
                    <dd class="">
                        <a href="javascript:;" _href="./category.html">
                            <cite>订单管理</cite>
                        </a>
                    </dd>
                    </dd>
                </dl>
            </li>

            <li class="layui-nav-item">
                <a class="javascript:;" href="javascript:;">
                    <i class="layui-icon" style="top: 3px;">&#xe612;</i><cite>客户管理</cite>
                </a>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="javascript:;" _href="custom_list.html">
                            <cite>客户列表</cite>
                        </a>
                    </dd>
                    <dd class="">
                        <a href="javascript:;" _href="./custom_del.html">
                            <cite>已删除客户</cite>
                        </a>
                    </dd>
                </dl>
            </li>
            <li class="layui-nav-item">
                <a class="javascript:;" href="javascript:;">
                    <i class="layui-icon" style="top: 3px;">&#xe613;</i><cite>管理员管理</cite>
                </a>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="javascript:;" _href="./admin_list.html">
                            <cite>管理员列表</cite>
                        </a>
                    </dd>

                </dl>
            </li>
            <li class="layui-nav-item">
                <a class="javascript:;" href="javascript:;">
                    <i class="layui-icon" style="top: 3px;">&#xe612;</i><cite>供应商管理</cite>
                </a>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="javascript:;" _href="supplier_list.html">
                            <cite>供应商列表</cite>
                        </a>
                    </dd>
                </dl>
            </li>
            <li class="layui-nav-item">
                <a class="javascript:;" href="javascript:;">
                    <i class="layui-icon" style="top: 3px;">&#xe613;</i><cite>管理员管理</cite>
                </a>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="javascript:;" _href="./admin_list.html">
                            <cite>管理员列表</cite>
                        </a>
                    </dd>

                </dl>
            </li>
            <li class="layui-nav-item">
                <a class="javascript:;" href="javascript:;">
                    <i class="layui-icon" style="top: 3px;">&#xe612;</i><cite>配送员管理</cite>
                </a>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="javascript:;" _href="staff_list.html">
                            <cite>配送员列表</cite>
                        </a>
                    </dd>
                </dl>
            </li>
            <li class="layui-nav-item">
                <a class="javascript:;" href="javascript:;">
                    <i class="layui-icon" style="top: 3px;">&#xe612;</i><cite>未分类</cite>
                </a>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="javascript:;" _href="product_import_list.html">
                            <cite>商品入库</cite>
                        </a>
                    </dd>
                </dl>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="javascript:;" _href="product_export_list.html">
                            <cite>商品出库</cite>
                        </a>
                    </dd>
                </dl>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="javascript:;" _href="repertory_list.html">
                            <cite>中心库房</cite>
                        </a>
                    </dd>
                </dl>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="javascript:;" _href="repertory_info_list.html">
                            <cite>库房信息</cite>
                        </a>
                    </dd>
                </dl>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="javascript:;" _href="centerProduct_export_list.html">
                            <cite>中心库房退货表</cite>
                        </a>
                    </dd>
                </dl>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="javascript:;" _href="station_list.html">
                            <cite>分站表</cite>
                        </a>
                    </dd>
                </dl>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="javascript:;" _href="station_repetory_list.html">
                            <cite>分站库房表</cite>
                        </a>
                    </dd>
                </dl>
            </li>
        </ul>
    </div>
    <script src="./lib/layui/layui.js" charset="utf-8"></script>
    <script src="./js/x-admin.js"></script>
    <script>
        var _hmt = _hmt || [];
        (function() {
            var hm = document.createElement("script");
            hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
            var s = document.getElementsByTagName("script")[0];
            s.parentNode.insertBefore(hm, s);
        })();
    </script>
</div>

