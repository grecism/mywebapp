<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<% 
	request.setAttribute("webPath", request.getContextPath());
%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${webPath}/static/bootstrap/bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="${webPath}/static/bootstrap/bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet" media="screen">
<link href="${webPath}/static/bootstrap/vendors/easypiechart/jquery.easy-pie-chart.css" rel="stylesheet" media="screen">
<link href="${webPath}/static/bootstrap/assets/styles.css" rel="stylesheet" media="screen">
<link href="${webPath}/static/bootstrap/assets/DT_bootstrap.css" rel="stylesheet" media="screen">
<link href="${webPath}/static/bootstrap/toast/toastr.css" rel="stylesheet" media="screen">

<script src="${webPath}/static/bootstrap/vendors/modernizr-2.6.2-respond-1.1.0.min.js"></script>
<script src="${webPath}/static/bootstrap/vendors/jquery-1.9.1.min.js"></script>
<script src="${webPath}/static/bootstrap/bootstrap/js/bootstrap.min.js"></script>
<script src="${webPath}/static/bootstrap/vendors/easypiechart/jquery.easy-pie-chart.js"></script>
<script src="${webPath}/static/bootstrap/assets/side-bar-toggle.js"></script>
<script src="${webPath}/static/bootstrap/toast/toastr.js"></script>
<script src="${webPath}/static/bootstrap/toast/toastr.setting.js"></script>
<script src="${webPath}/static/js/swq.js"></script>
<script>
	var webPath = "${webPath}";
</script>
<title>sanwenqian</title>
</head>
<body style='padding-top:0px'>

