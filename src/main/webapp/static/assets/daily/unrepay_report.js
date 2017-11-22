$(function(){
	 $("#unRepayTimeStart").datepicker();
	 $("#unRepayTimeEnd").datepicker();
	 var st=$("#unRepayTimeStart").val();
	 var et=$("#unRepayTimeEnd").val();
	 
	 $(document).on("click","#unRepayReport_id",function(){
			location.href= getUri()+"unRepayReport/exporUnRepayExcel?unRepayTimeStart="+st+"&unRepayTimeEnd="+et;
		});
	 
});


