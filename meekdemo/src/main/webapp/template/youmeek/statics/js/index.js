$(document).ready(function () {

    $("#btnSubmit").click(function () {
		var userIdValue = $('#userId').val();
		alert("userIdValue=" + userIdValue);
	    if (userIdValue == '') {
		    return;
	    }
        $.ajax({
            type:"GET",
            url: "http://127.0.0.1:8080/front/userController/"+userIdValue+"/getUser.do",
            data: { },
	        dataType: "json",
            success: function (data) {
                alert("成功");
            },
            error: function (XMLHttpRequest, textStatus) {
                alert("报错");
            }
        })
    });
})
