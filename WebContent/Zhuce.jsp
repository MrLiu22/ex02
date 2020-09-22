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
			<div class="panel-heading">注册界面</div>
			<div class="panel-body">
				<form class="form-horizontal" action="bbb" method="post">
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-2 control-label">用户名：</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="ming"  placeholder="用户名">
						</div>
					</div>
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">密码：</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="ma" id="inputPassword3" placeholder="密码">
						</div>
					</div>
					
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">重复密码：</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="cma" id="inputPassword3" placeholder="密码">
						</div>
					</div>
					
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">专业</label>
						<div class="col-sm-10">
							<select class="form-control" name="major">
                                   <option name="电子商务">电子商务</option>
                                   <option name="计算机1">计算机1</option>
                                   <option name="计算机2">计算机2</option>
                                    <option name="软工">软工</option>
                                     <option name="信息">信息</option>
                                 </select>
						</div>
					</div>
					
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">兴趣爱好</label>
						<div class="col-sm-10">
							<label class="checkbox-inline">
                          <input type="checkbox" id="inlineCheckbox1" value="算法" name="ig"> 算法
                             </label>
                           <label class="checkbox-inline">
                          <input type="checkbox" id="inlineCheckbox2" value=" WEB开发" name="ig"> WEB开发
                             </label>
                           <label class="checkbox-inline">
                             <input type="checkbox" id="inlineCheckbox3" value="概率论" name="ig"> 概率论
                             </label>
						</div>
					</div>
					
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">性别</label>
						<div class="col-sm-10">
							<label class="radio-inline">
                              <input type="radio" name="sex" id="inlineRadio1" value="男"> 男
                               </label>
                           <label class="radio-inline">
                               <input type="radio" name="sex" id="inlineRadio2" value="女"> 女
                            </label>
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
							<button type="submit" class="btn btn-default">注册</button>
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
