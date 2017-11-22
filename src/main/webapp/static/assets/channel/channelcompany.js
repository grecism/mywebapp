$(function(){
	
    $(document).on("click","#addorupdatebtn",function(){
    	var cccompanyname_idval = $("#cccompanyname_id").val();
    	var flag = true;
    	if(cccompanyname_idval == ""){
    		toastr.warning('请输入渠道公司名称');
    		flag = false;
    		return flag;
    	}
    	$.ajax({
            url: getUri()+"/channelCompany/input",
            type: "POST",
            async: false,
            data:{
           	 "companyName":cccompanyname_idval
           	 },
            dataType:"JSON",
            success: function (data) {
                if(data.code == "success"){
               	 toastr.success(data.message);
                }else{
                    toastr.error($("#addorupdateModalLabel").text()+"失败");
                }
                setInterval(function(){
               	 window.location.reload();
				 },3000)
            }
        });
    });
	 
});


