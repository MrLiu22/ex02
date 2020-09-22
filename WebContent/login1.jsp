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
				<form class="form-horizontal" action="aaa" method="post">
				<p style="color:red">${msg}</p>
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-2 control-label">用户名：</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="un"  placeholder="用户名" required="required">
						</div>
					</div>
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">密码：</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="ps" id="inputPassword3" placeholder="密码">
						</div>
					</div>
					
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">校验码</label>
						<div class="col-sm-10">
							<img src="Jiao">
						</div>
					</div>
					
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<div class="checkbox">
								<label>
									<input type="checkbox"> 记住密码
								</label>
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-default">登录</button>
						</div>
					</div>
				</form>

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
