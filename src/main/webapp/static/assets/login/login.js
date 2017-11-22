$(function () {
    $(document).on("click", "#login_id", function () {
        var flag = true;
        var usernameval = $("#username_id").val();
        var passwordval = $("#password_id").val();
        if ($.trim(usernameval) == "") {
            $("#prompt_id").text("用户名不能为空").css("color", "red");
            flag = false;
            return flag;
        } else {
            $("#prompt_id").text("")
        }

        if ($.trim(passwordval) == "") {
            $("#prompt_id").text("密码不能为空").css("color", "red");
            flag = false;
            return flag;
        } else {
            $("#prompt_id").text("")
        }

        var url = $("#loginurl_id").val();
        $.ajax({
            type: "POST",
            //url : "<%=request.getContextPath()%>/login",
            url: url,
            dataType: "json",
            data: {
                username: usernameval,
                password: passwordval
            },
            success: function (json) {
                if ("success" != json.status) {
                    $("#prompt_id").text(json.message).css("color", "red");
                } else {
                    $("#prompt_id").text("")
                    $("#main_form").submit();
                }

            },
            error: function (error) {
                $("#prompt_id").text("当前操作失败，请与管理员联系!").css("color", "red");
                return false;
            }
        });
    });

});

function getUri() {
    return location.protocol + "//" + location.host + "/";
}