/** 用户详情**/
function toAccountInfo(obj,idval){
//	location.href=getUri()+"account/info?userId="+idval;
	location.href = basePath + "account/info?userId="+idval;
}
$(function(){
	$("#createTime_id").datepicker();
	$(document).on("click","#account_search_id",function(){//点击查询
		//alert(getUri()+"account/list");
		//$("#account_form").attr("action",getUri()+"account/list");
		$("#formList").submit();
	});
/*	 $(document).on("click",".lable",function(){
		 if($(this).val() == ""){
			 $(this).val(2);
		 }else if($(this).val() == 2){
			 $(this).val("");
		 }
	 });*/
});

function getUri() {
	return location.protocol + "//" + location.host + "/";
}