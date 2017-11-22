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
<div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container-fluid">
            <div class="logo">
                <img src="<%=path%>/static/assets/img/logo.png" alt="Realm Admin Template">
            </div>
            <a class="btn btn-navbar visible-phone" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>
            <a class="btn btn-navbar slide_menu_left visible-tablet">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>

            <div class="top-menu visible-desktop">
                <ul class="pull-left">
                </ul>
                <ul class="pull-right">
                    <li><a href="<%=path%>/logout"><i class="icon-off"></i> Logout</a></li>
                </ul>
            </div>

            <div class="top-menu visible-phone visible-tablet">
                <ul class="pull-right">
                    <li><a title="link to View all Messages page, no popover in phone view or tablet" href="#"><i
                            class="icon-envelope"></i></a></li>
                    <li><a title="link to View all Notifications page, no popover in phone view or tablet" href="#"><i
                            class="icon-globe"></i></a></li>
                    <li><a href="login.html"><i class="icon-off"></i></a></li>
                </ul>
            </div>

        </div>
    </div>
</div>

<script type="text/javascript" src="<%=path%>/static/assets/js/jquery.min.js"></script>

</body>
</html>
