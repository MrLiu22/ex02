<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>登录</title>
<link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.css">
<script type="text/javascript" src="bootstrap-3.3.7-dist/js/bootstrap.js"></script>
</head>

<body>
<div class="container">
	<!--导航条-->
	<%@ include file="Hd.jsp" %>
	<!--左边-->
	<%@ include file="left.jsp" %>
		<!--中间-->
		<div class="col-md-6">
		<div class="panel panel-primary">
			<div class="panel-heading">登录界面</div>
			<div class="panel-body">
				<p style="color:green">${msg},欢迎回家！！！</p>

			</div>
		</div>

		<div class="panel panel-primary">
			<div class="panel-heading">
				<h3 class="panel-title">信息框4</h3>
			</div>
			<div class="panel-body">
				Panel content
			</div>
		</div></div>
		<!--右边-->
		<%@ include file="right.jsp" %>
	
</div>

</body>
</html>
