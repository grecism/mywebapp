var channelUrl_idval ="";
$(function(){
	//参数设置，若用默认值可以省略以下面代
    toastr.options = {
	        "closeButton": false, //是否显示关闭按钮
	        "debug": false, //是否使用debug模式
	        "positionClass": "toast-top-full-width",//弹出窗的位置
	        //"positionClass": "toast-bottom-right",//弹出窗的位置
	        "showDuration": "300",//显示的动画时间
	        "hideDuration": "1000",//消失的动画时间
	        "timeOut": "5000", //展现时间
	        "extendedTimeOut": "1000",//加长展示时间
	        "showEasing": "swing",//显示时的动画缓冲方式
	        "hideEasing": "linear",//消失时的动画缓冲方式
	        "showMethod": "fadeIn",//显示时的动画方式
	        "hideMethod": "fadeOut" //消失时的动画方式
	        };
    
    $(document).on("click","#addchannel_id",function(){
		if($("#addorupdateModal").attr("aria-hidden")){
			$("#addorupdateModalLabel").text("添加渠道");
			$("#channelname_id").val("");
			$("#channelcompany_id").children().eq(0).attr("selected",true);
			$("#channeltemplate_id").children().eq(0).attr("selected",true);
		}
	});
    
	$(document).on("click","#updatechannel_id",function(){
		if($("#addorupdateModal").attr("aria-hidden")){
			$("#addorupdateModalLabel").text("修改渠道");
			var channel_id = $(this).parent().parent().children().first().text();
			var channel_name = $(this).parent().parent().children().eq(1).text();
			var company_id = $(this).parent().children().first().val();
			var template = $(this).parent().children().eq(1).val();
			
			$("#channelupdate_hid").val(channel_id);
			$("#channelname_id").val(channel_name);
			if(company_id != "" || company_id != 0 || company_id != undefined){
				 $("#channelcompany_id").find("option[value='"+company_id+"']").attr("selected",true);  
			}
			if(template != "" || template != null || template != undefined){
				 $("#channeltemplate_id").find("option[value='"+template+"']").attr("selected",true);  
			}

		}
	});
	
	$(document).on("click","#closechannel_id",function(){
		var channel_id = $(this).parent().parent().children().first().text();
		$("#channelclose_hid").val(channel_id);
	});
	
	
	$(document).on("click","#addorupdatebtn",function(){//添加/修改渠道
		var flag = true;
		var channelname_val = $("#channelname_id").val();
		if(channelname_val == ""){
			toastr.warning('请选择渠道名称');
			flag = false;
			return flag;
		}
		var channelcompany_val = $("#channelcompany_id").val();
		var channeltemplate_val = $("#channeltemplate_id").val();
		var channelupdate_hidval = $("#channelupdate_hid").val();
		if($("#addorupdateModalLabel").text() == "添加渠道"){
			channel_hidval ="";
		}
		 $.ajax({
             url: getUri()+"/channel/input",
             type: "POST",
             async: false,
             data:{
            	 "channelName":channelname_val,
            	 "companyId":channelcompany_val, 
            	 "template":channeltemplate_val,
            	 "channelId":channelupdate_hidval
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
		
		//toastr.success('提交数据成功');
		//toastr.error('Error');
		//toastr.warning('只能选择一行进行编辑');
		//toastr.info('info');
	});
	
	$(document).on("click","#closebtn",function(){
		var channelclose_hidval = $("#channelclose_hid").val();
		$.ajax({
            url: getUri()+"/channel/input",
            type: "POST",
            async: false,
            data:{
            	"channelId":channelclose_hidval,
            	"status":2
           	 },
            dataType:"JSON",
            success: function (data) {
                if(data.code == "success"){
               	 toastr.success("关闭渠道成功");
                }else{
                    toastr.error("关闭渠道失败");
                }
                setInterval(function(){
               	 window.location.reload();
				 },1000) 
            }
        });
	});
	 
	channelUrl_idval = $("#channelUrl_id").val();
});

function copyLink(channelId){
	//alert(channelUrl_idval);
	var clipboard = new Clipboard('#btn'+channelId, {
        text: function() {
        	var channelLink = channelUrl_idval+"channel/channelManage/channelRegister/" + channelId;
            return channelLink;
        }
    });
}
