<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html>
<head>
<title>管理首页</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="pragma" content="no-cache" />
<meta http-equiv="cache-control" content="no-cache" />
<meta http-equiv="expires" content="0" />
</head>
	<frameset frameborder="0" rows="78,*" cols="*"> 
		<frame name="top" src="../admin/menu_top" scrolling="no" cols="20" />
		<!-- 菜单栏的宽带 -->
		<frameset cols="230,*" frameborder="1">
			<frame name="left" src="../admin/menu_left" scrolling="no" target="main"/>
			<frame name="main" src="../home/initPage" />
		</frameset>
		<noframes>
			<body>
				<p>此网页使用了框架，但您的浏览器不支持框架。</p>
			</body>
		</noframes>
	</frameset>
</html>
