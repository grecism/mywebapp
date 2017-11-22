<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../common/header_content.jsp"%>
<%@ page language="java" import="java.util.Date"%>
<%@ page language="java" import="java.text.SimpleDateFormat"%>
<%@ page language="java" import="com.hello.config.Constants"%>
<%
	request.setAttribute("webPath", request.getContextPath());
	//request.setAttribute("environment", Constants.ENVIRONMENT);
%>
<header>
	<section id="global-nav">
		<nav>
			<div class="constrain">
			</div>
		</nav>
	</section>
</header>

<div class="navbar navbar-fixed-top">
	<div class="navbar-inner">
		<div class="container-fluid">
			<div class="nav-collapse collapse"
				style="margin-top: 15px; height: 120px">
				<ul class="nav" style="margin-left: 20px">
					<c:forEach var="item" items="${menuMap}">
						<li class=""><a href="${webPath}/${item.key.url}?menuId=${item.key.id}" target="_top">${item.key.name}</a></li>
					</c:forEach>
				</ul>
			</div>
			<div style="float: right; height: 60px">
				<div style="margin-top: 10px; margin-right: 3px">
					${admin.realName}，欢迎您!&nbsp;&nbsp;&nbsp;
					<br/>
					<a href="${webPath}/admin/logout" target="_top">退出登录</a> <br>
<%-- 					登录时间：${loginTime} --%>
				</div>
			</div>
		</div>
	</div>
</div>
