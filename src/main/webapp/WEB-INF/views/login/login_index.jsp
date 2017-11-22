<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/title.jsp"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>登录</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="author" content="Bluth Company">
    <link rel="shortcut icon" href="${ctx}/assets/ico/favicon.html">
    <link href="${ctx}/static/assets/css/bootstrap.css" rel="stylesheet">
    <link href="${ctx}/static/assets/css/theme.css" rel="stylesheet">
    <link href="${ctx}/static/assets/css/font-awesome.min.css" rel="stylesheet">
    <link href="${ctx}/static/assets/css/alertify.css" rel="stylesheet">
    <link rel="Favicon Icon" href="favicon.ico">
    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
  </head>
  <body>
    <div id="wrap">
    <div class="container-fluid">
      <div class="row-fluid">
        <div class="span12">
          	<div class="row-fluid">
				<div class="widget container-narrow">
					<div class="widget-header">
						<i class="icon-user"></i>
						<h5>Log in to your account</h5>
					</div>  
					<input type="hidden" value="${ctx}/login" id="loginurl_id">
					<div class="widget-body clearfix" style="padding:25px;">
		      			<form method="post" action="${ctx}/main" id="main_form">
		      				<!-- <div style="padding:10px 0">
		      					<a style="" href="#" class="btn btn-large btn-block btn-primary"><i class="icon-facebook-sign"></i> Login with Facebook</a>
		      				</div>
		      				<div class="divider">
		      					<hr class="pull-left"><span>or</span><hr class="pull-right">
		      				</div> -->
							<div class="control-group">
								<div class="controls">
									<input class="btn-block" type="text" id="username_id" placeholder="username" name="username">
								</div>
							</div>
							<div class="control-group">
								<div class="controls">
									<input class="btn-block" type="password" id="password_id" placeholder="password" name="password">
								</div>
							</div>
							<div class="control-group">
								<div class="controls" id="prompt_id">
								</div>
							</div>
							 <div class="control-group">
								<div class="controls clearfix">
									<label style="width:auto" class="checkbox pull-left">
										<input type="checkbox"> Remember me
									</label>
									<a style="padding: 5px 0px 0px 5px;" href="#" class="pull-right">Forgot Password?</a>
								</div>
							</div>					
							<input type="button" class="btn pull-right" value="Sign in" id="login_id"/>
		      			</form>
					</div>  
				</div>  
      			<div style="text-align:center">
      				<p>Neen an account? <a href="new_account.html">Create Account</a></p>
      			</div>
        	</div><!--/row-fluid-->
        </div><!--/span10-->
      </div><!--/row-fluid-->
    </div><!--/.fluid-container-->
    </div><!-- wrap ends-->

 	<script type="text/javascript" src="${ctx}/static/assets/js/jquery.min.js"></script>
    <script type="text/javascript" src="${ctx}/static/assets/login/login.js"></script>
  </body>
</html>
