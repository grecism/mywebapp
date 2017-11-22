<%--
  Created by IntelliJ IDEA.
  User: LiuJianbo
  Date: 2017/8/23
  Time: 18:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <%
        String path = request.getContextPath();
    %>
    <meta charset="utf-8">
    <title>哈喽贷-后台管理系统</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="author" content="Bluth Company">
    <link rel="shortcut icon" href="<%=path%>/static/assets/ico/favicon.html">
    <link href="<%=path%>/static/assets/css/bootstrap.css" rel="stylesheet">
    <link href="<%=path%>/static/assets/css/theme.css" rel="stylesheet">
    <link href="<%=path%>/static/assets/css/font-awesome.min.css" rel="stylesheet">
    <link href="<%=path%>/static/assets/css/alertify.css" rel="stylesheet">
    <link rel="Favicon Icon" href="favicon.ico">
</head>
<body>
<div class="container-fluid">
    <!-- Side menu -->
    <div class="sidebar-nav nav-collapse collapse">
        <div class="user_side clearfix">
            <img src="<%=path%>/static/assets/img/odinn.jpg" alt="Odinn god of Thunder">
            <h5>Odinn</h5>
            <a href="#"><i class="icon-cog"></i> Settings</a>
        </div>
        <div class="accordion" id="accordion2">
        	<!-- 数据统计 -->
            <div class="accordion-group">
                <div class="accordion-heading">
                    <a class="accordion-toggle active b_F79999" href="#"
                       onclick="window.location.href='<%=request.getContextPath()%>/main'"><i
                            class="icon-dashboard"></i> <span>数据统计</span></a>
                </div>
            </div>
            <!-- 用户管理 -->
            <div class="accordion-group">
                <div class="accordion-heading">
                    <a class="accordion-toggle b_C3F7A7 "
                       href="#"
                       onclick="window.location.href='<%=request.getContextPath()%>/account/list'"><i
                            class="icon-magic"></i> <span>用户管理</span></a>
                </div>
                <!-- <div id="collapse1" class="accordion-body collapse">
                    <div class="accordion-inner">
                        <a class="accordion-toggle" href="user-details.html"><i class="icon-table"></i>详情</a>
                    </div>
                </div> -->
            </div>
            <!-- 订单管理 -->
            <div class="accordion-group">
                <div class="accordion-heading">
                    <a class="accordion-toggle b_9FDDF6 collapsed " data-toggle="collapse" data-parent="#accordion2"
                       href="#collapse11"><i class="icon-reorder"></i> <span>订单管理</span></a>
                </div>
                <div id="collapse11" class="accordion-body collapse">
                    <div class="accordion-inner">
                        <a class="accordion-toggle" href="#"
                           onclick="window.location.href='<%=request.getContextPath()%>/order/list'"><i
                                class="icon-rss"></i>订单列表</a>
                    </div>
                    <div class="accordion-inner">
                        <a class="accordion-toggle" href="#"><i class="icon-rss"></i>订单报表</a>
                    </div>
                </div>
            </div>
            <!--  日报查询 -->
            <div class="accordion-group">
                <div class="accordion-heading">
                    <a class="accordion-toggle"
                       href="#"
                       onclick="window.location.href='<%=request.getContextPath()%>/daily/list'"><i
                            class="icon-magic"></i> <span>日报查询</span></a>
                </div>
            </div>
             <!--  渠道管理 -->
            <%-- <div class="accordion-group">
                <div class="accordion-heading">
                    <a class="accordion-toggle b_9FDDF6 collapsed " data-toggle="collapse" data-parent="#accordion4"
                       href="#collapse_channel"><i class="icon-reorder"></i> <span>运营管理</span></a>
                </div>
                <div id="collapse_channel" class="accordion-body collapse">
                    <div class="accordion-inner">
                        <a class="accordion-toggle" href="#"
                           onclick="window.location.href='<%=request.getContextPath()%>/channel/list'"><i
                                class="icon-rss"></i>渠道管理</a>
                    </div>
                    <div class="accordion-inner">
                        <a class="accordion-toggle" href="#"
                           onclick="window.location.href='<%=request.getContextPath()%>/channelCompany/list'"><i
                                class="icon-rss"></i>渠道公司管理</a>
                    </div>
                    <div class="accordion-inner">
                        <a class="accordion-toggle" href="#"
                           onclick="window.location.href='<%=request.getContextPath()%>/flowactivity/list'"><i
                                class="icon-rss"></i>导流活动管理</a>
                    </div>
                </div>
            </div> --%>
        </div>
    </div>
</div>

<script type="text/javascript" src="<%=path%>/static/assets/js/jquery.min.js"></script>
<script type="text/javascript" src="<%=path%>/static/assets/js/bootstrap.js"></script>

</body>
</html>
