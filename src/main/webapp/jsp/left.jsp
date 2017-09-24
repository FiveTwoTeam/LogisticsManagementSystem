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
                        <a href="javascript:;" _href="${ basePath }/queryCustom">
                            <cite>客户管理</cite>
                        </a>
                    </dd>
                </dl>
                <dl class="layui-nav-child">
                    </dd>
                    <dd class="">
                        <a href="javascript:;" _href="${ basePath }/queryOrder">
                            <cite>订单管理</cite>
                        </a>
                    </dd>
                </dl>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="javascript:;" _href="${ basePath }/queryOrderBack">
                            <cite>退订查询</cite>
                        </a>
                    </dd>
                </dl>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="javascript:;" _href="${ basePath }/queryProductExchange">
                            <cite>换货查询</cite>
                        </a>
                    </dd>
                </dl>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="javascript:;" _href="${ basePath }/queryOrderProductBack">
                            <cite>退货查询</cite>
                        </a>
                    </dd>
                </dl>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="javascript:;" _href="${ basePath }/queryRepertory">
                            <cite>中心库房查询</cite>
                        </a>
                    </dd>
                </dl>
            </li>

            <li class="layui-nav-item">
                <a class="javascript:;" href="javascript:;">
                    <i class="layui-icon" style="top: 3px;">&#xe612;</i><cite>管理员管理</cite>
                </a>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="javascript:;" _href="${ basePath }/queryAdmin">
                            <cite>管理员列表</cite>
                        </a>
                    </dd>

                </dl>
            </li>
            <li class="layui-nav-item">
                <a class="javascript:;" href="javascript:;">
                    <i class="layui-icon" style="top: 3px;">&#xe613;</i><cite>调度管理</cite>
                </a>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="javascript:;" _href="${ basePath }/queryOrder">
                            <cite>订单调度</cite>
                        </a>
                    </dd>

                </dl>
            </li>

            <li class="layui-nav-item">
                <a class="javascript:;" href="javascript:;">
                    <i class="layui-icon" style="top: 3px;">&#xe612;</i><cite>分站库房</cite>
                </a>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="javascript:;" _href="${ basePath }/queryProductExportList">
                            <cite>出库单</cite>
                        </a>
                    </dd>
                </dl>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="javascript:;" _href="#">
                            <cite>库存信息</cite>
                        </a>
                    </dd>
                </dl>
            </li>
            <li class="layui-nav-item">
                <a class="javascript:;" href="javascript:;">
                    <i class="layui-icon" style="top: 3px;">&#xe612;</i><cite>配送中心</cite>
                </a>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="javascript:;" _href="#">
                            <cite>分类管理</cite>
                        </a>
                    </dd>
                </dl>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="javascript:;" _href="#">
                            <cite>商品管理</cite>
                        </a>
                    </dd>
                </dl>
            </li>
            <li class="layui-nav-item">
                <a class="javascript:;" href="javascript:;">
                    <i class="layui-icon" style="top: 3px;">&#xe612;</i><cite>中心库房</cite>
                </a>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="javascript:;" _href="${ basePath }/queryProductExportList">
                            <cite>商品查询</cite>
                        </a>
                    </dd>
                </dl>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="javascript:;" _href="${ basePath }/queryStation">
                            <cite>分站库房修改</cite>
                        </a>
                    </dd>
                </dl>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="javascript:;" _href="${ basePath }/queryProductExport">
                            <cite>出库单查询</cite>
                        </a>
                    </dd>
                </dl>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="javascript:;" _href="${ basePath }/queryProductImport">
                            <cite>入库单查询</cite>
                        </a>
                    </dd>
                </dl>
            </li>
            <li class="layui-nav-item">
                <a class="javascript:;" href="javascript:;">
                    <i class="layui-icon" style="top: 3px;">&#xe612;</i><cite>分站管理</cite>
                </a>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="javascript:;" _href="${ basePath }/queryTask">
                            <cite>配送任务单</cite>
                        </a>
                    </dd>
                </dl>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="javascript:;" _href="${ basePath }/queryReceipt">
                            <cite>发票</cite>
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

