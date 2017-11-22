<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.hello.config.Constants"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<% 
	request.setAttribute("webPath", request.getContextPath());
	//request.setAttribute("environment", Constants.ENVIRONMENT);
%>
<link href="${webPath}/static/bootstrap/bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="${webPath}/static/bootstrap/assets/styles.css" rel="stylesheet" media="screen">
<script src="${webPath}/static/bootstrap/vendors/jquery-1.9.1.min.js"></script>
<script src="${webPath}/static/bootstrap/bootstrap/js/bootstrap.min.js"></script>
<div class="container-fluid">
<div class="row-fluid">
<div class="span12" id="sidebar">
	<ul class="nav nav-list bs-docs-sidenav nav-collapse collapse">
		<<%-- c:forEach var="item" items="${menuMap}">
			<c:if test="${not empty item.value}">
				<li>
		        	<a href="#menu-${item.key.id}" data-toggle="collapse" class="btn-primary"><i class="icon-chevron-down icon-white"></i>${item.key.name}</a>
		            <ul id="menu-${item.key.id}" class="nav nav-list ${in} collapse">
		            	<c:forEach var="childItem" items="${item.value}">
		            		<li>
				              <a href="${webPath}/${childItem.url}" target="main"><i class="icon-user"></i>${childItem.name}</a>
				            </li>
		            	</c:forEach>
		            </ul>
        		</li>
			</c:if>
		</c:forEach> --%>
	</ul>
</div>
</div>
</div>