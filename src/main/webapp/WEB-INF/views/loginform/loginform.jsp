<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
	<head>
	<base href="<%=basePath%>">
    <meta charset="utf-8">
    <title>注册报表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="author" content="Bluth Company">
    <!-- 下拉框 -->
	<link rel="stylesheet" href="static/ace/css/chosen.css" />
    <!-- 日期框 -->
	<link rel="stylesheet" href="static/ace/css/datepicker.css" />
	<!-- jsp文件头和头部 -->
	<%@include file="../system/index/top.jsp"%>
	</head>
		<body class="no-skin">
		<div class="main_container" id="tables_page">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" aria-expanded="false">
						<i class="bigger-110 ace-icon fa fa-angle-right" data-icon-hide="ace-icon fa fa-angle-down" data-icon-show="ace-icon fa fa-angle-right"></i>
							&nbsp;查询条件
					</a>
				</h4>
			</div>
				<div class="panel-collapse collapse in" id ="collapseTwo" aria-expanded="true">
	<form method="post" class="form-inline" action="<%=request.getContextPath()%>/loginForm/list" id="formList">
					<div class="inquiry-items">
					<div style="float: left;">
					<table>
					<tr>
						<td>用户ID：</td>
						<td><input type="text" name="userId" id="userId" placeholder="用户ID查询" value="${userInfo.userId }"/></td>
						<td>用户姓名：</td>
						<td><input type="text" name="userRealName" id="userRealName" placeholder="用户真实姓名查询"  value="${userInfo.userRealName}"/></td>
						<td>手机号码：</td>
						<td><input type="text" name="userMobile" id="userMobile" placeholder="用户手机号码查询"  value="${userInfo.userMobile}"/></td>
					</tr>
						
					<tr>
							<td>注册时间：</td>
							<td style="padding-left:2px;"><input class="span10 date-picker" name="startTime" id="startTime"  value="${userInfo.startTime}" type="text" data-date-format="yyyy-mm-dd" readonly="readonly" style="width:162.5px;" placeholder="查询起始时间" title="开始日期"/></td>
							<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;至：</td>
							<td style="padding-left:2px;"><input class="span10 date-picker" name="endTime" id="endTime"  value="${userInfo.endTime}" type="text" data-date-format="yyyy-mm-dd" readonly="readonly" style="width:162.5px;" placeholder="查询结束时间" title="结束日期"/></td>
							<td>用户来源：</td>
							<td>
								<select name="channelStatus" id="channelStatus" data-placeholder="请选择被邀请人状态"  style="vertical-align:top;width: 100%;">
		                        <option value="">全部</option>
                           	 	<option value="1" <c:if test="${userInfo.channelStatus == 1}">selected</c:if>>北京云蜂科技有限公司</option>
                            	<option value="2" <c:if test="${userInfo.channelStatus == 2}">selected</c:if>>三文钱</option>
                            	<option value="9999" <c:if test="${userInfo.refereeStatus == 9999}">selected</c:if>>好友邀请</option>
		                        </select>
							</td>
					</tr>
		                    </table>
					</div>
						
						
					
					</div>
					<div class="inquiry-items">
				        <a class="btn btn-success btn-sm" onclick="tosearch();">查询</a>
						<a class="btn btn-success btn-sm" onclick="toExcel();">导出</a>
				        <a class="btn btn-success btn-sm" id = "flush" onclick="toChongzhi()">重置</a>
					</div>
				</form>
				</div>
		      <div class="widget widget-padding content-table">
		        <div class="widget-body">
		          <table id="users" class="table table-striped table-bordered dataTable">
		            <thead>
		              <tr>
		                <th>用户ID</th>
		                <th>真实姓名</th>
		                <th>手机号码</th>
		                <th>注册时间</th>
		                <th>渠道来源</th>
		                <th>认证时间</th>
		                <th>首次申请借款时间</th>
		                <th>首次借款放款时间</th>
		                <th>首次借款额度（元）</th>
		              </tr>
		            </thead>
		            <tbody>
		            <c:choose>
		            <c:when test="${(not empty page) && (not empty page.list)}">
		             <c:if test="${QX.cha == 1 }">
	                  <c:forEach var="obj" items="${page.list}" varStatus="s">
		              <tr>
		                <td>${obj.userId}</td>
		                <td>${obj.userRealName}</td>
		                <td>${obj.userMobile}</td>
		                <td>${obj.loginTimeStr}</td>
		                <td>
		                	<c:if test="${obj.channelStatus != null}">
	                            <c:choose>
	                                 <c:when test="${obj.channelStatus == 1}">北京云蜂科技有限公司</c:when>
	                                 <c:when test="${obj.channelStatus == 2}">三文钱</c:when>
	                            </c:choose>
	                         </c:if>
	                         <c:if test="${obj.channelStatus == null && obj.refereeStatus != null }">
	                             <c:choose>
	                                <c:when test="${obj.refereeStatus == 9999}">好友邀请</c:when>
	                             </c:choose>
	                          </c:if>
		                </td>
		                <td>${obj.approveTimeStr}</td>
		                <td>${obj.applyTimeStr}</td>
		                <td>${obj.loanTimeStr}</td>
		                <td>${obj.firstMoney}</td>
		              </tr>
		              	 </c:forEach>
	                        </c:if>
	                       <c:if test="${QX.cha == 0 }">
							<tr>
								<td colspan="14" class="tb tr td center">您无权查看</td>
							</tr>
							</c:if>
		               </c:when>
		              			<c:otherwise>
									<tr class="main_info">
										<td colspan="14" class="tb tr td center">没有相关数据</td>
									</tr>
							   </c:otherwise>
		              </c:choose>
		            </tbody>
		          </table>
		              <jsp:include page="../common/page.jsp"></jsp:include>
		        </div> <!-- /widget-body -->
		      </div> <!-- /widget -->

		</div>
	</body>
			<!-- 页面底部js¨ -->
	<%@ include file="../system/index/foot.jsp"%>
	<!-- 删除时确认窗口 -->
	<script src="static/ace/js/bootbox.js"></script>
	<!-- ace scripts -->
	<script src="static/ace/js/ace/ace.js"></script>
	<!-- 下拉框 -->
	<script src="static/ace/js/chosen.jquery.js"></script>
	<!-- 日期框 -->
	<script src="static/ace/js/date-time/bootstrap-datepicker.js"></script>
	<!--提示框-->
	<script type="text/javascript" src="static/js/jquery.tips.js"></script>
	
	<script type="text/javascript">
		$(top.hangge());//关闭加载状态
		//检索
		function tosearch(){
			top.jzts();
			$("#formList").submit();
		};
		//导出excel
		function toExcel(){
			var userId=$("#userId").val();
			var userMobile=$("#userMobile").val();
			var userRealName=$("#userRealName").val();
			var startTime=$("#startTime").val();
			var endTime=$("#endTime").val();
			var channelStatus=$("#channelStatus").val();
			window.location.href='<%=basePath%>loginForm/exportExcel.do?userId='+userId
					+'&userMobile='+userMobile+'&userRealName='+userRealName
					+'&startTime='+startTime+'&endTime='+endTime+'&channelStatus='+channelStatus;
		}
		function toChongzhi(){
			$("#formList")[0].reset();
			
			$("#userId").val("");
			$("#userRealName").val("");
			$("#userMobile").val("");
			$("#startTime").val("");
			$("#endTime").val("");
			$("#channelStatus").val("");
			
			$("#userId").attr("value",'');
			$("#userRealName").attr("value",'');
			$("#userMobile").attr("value",'');
			$("#startTime").attr("value",'');
			$("#endTime").attr("value",'');
			$("#channelStatus").attr("value","");
			
		};
		$(function() {
      	  /* //重置按钮事件 
            $("#flush").off().on("click",function(){
    			$("#userId").val("");
    			$("#userRealName").val("");
    			$("#userMobile").val("");
    			$("#startTime").val("");
    			$("#endTime").val("");
    			$("#channelStatus").val("");
            	});  */
			//日期框
			$('.date-picker').datepicker({
				autoclose: true,
				todayHighlight: true
			});
			
			//下拉框
			if(!ace.vars['touch']) {
				$('.chosen-select').chosen({allow_single_deselect:true}); 
				$(window)
				.off('resize.chosen')
				.on('resize.chosen', function() {
					$('.chosen-select').each(function() {
						 var $this = $(this);
						 $this.next().css({'width': $this.parent().width()});
					});
				}).trigger('resize.chosen');
				$(document).on('settings.ace.chosen', function(e, event_name, event_val) {
					if(event_name != 'sidebar_collapsed') return;
					$('.chosen-select').each(function() {
						 var $this = $(this);
						 $this.next().css({'width': $this.parent().width()});
					});
				});
				$('#chosen-multiple-style .btn').on('click', function(e){
					var target = $(this).find('input[type=radio]');
					var which = parseInt(target.val());
					if(which == 2) $('#form-field-select-4').addClass('tag-input-style');
					 else $('#form-field-select-4').removeClass('tag-input-style');
				});
			}
		});
	</script>
</html>
