//检索
function tosearch(){
	//top.jzts();
	$("#Form").submit();
}

function toreset(){
	$("#Form")[0].reset();
	
	$("#user_id").val("");
	$("#user_real_name").val("");
	$("#user_mobile").val("");
	$("#is_invitation").val("");
	$("#is_overdue").val("2");
	$("#is_advancerepay").val("2");
	$("#lastStart").val("");
	$("#lastEnd").val("");		
	
}

$(function() {
	//日期框
	$('.date-picker').datepicker({
		autoclose: true,
		todayHighlight: true
	});

});
		
			
//导出excel
function toExcel(){
	var user_id=$("#user_id").val();
	var user_real_name=$("#user_real_name").val();
	var user_mobile=$("#user_mobile").val();
	var is_invitation=$("#is_invitation").val();
	var is_overdue=$("#is_overdue").val();
	var is_advancerepay=$("#is_advancerepay").val();
	var lastStart=$("#lastStart").val();
	var lastEnd=$("#lastEnd").val();
	
	window.location.href=getUri()+"/repayReprt/exportReport?user_id="+user_id
			+'&user_real_name='+user_real_name+'&user_mobile='+user_mobile
			+'&is_invitation='+is_invitation+'&is_overdue='+is_overdue+'&is_advancerepay='+is_advancerepay
			+'&lastStart='+lastStart+'&lastEnd='+lastEnd;
}