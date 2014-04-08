<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>youmeekssh测试首页</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="" />
    <meta name="description" content="" />
    <script type="text/javascript" src="statics/js/jquery-1.6.1.min.js"></script>

    <style type="text/css">

    </style>

    <script type="text/javascript">
        $(document).ready(function () {
            /*查询用户 start*/
            $("#btnSubmit").click(function () {
                var userIdValue = $('#userId').val();
                if (userIdValue == '') {
                    alert("用户ID不能为空");
                    return;
                }
                window.open("/front/userController/getUser.do?id=" + userIdValue, "_blank");
            });
            /*查询用户 end*/

        })

    </script>

</head>

<body>
<%--页头开始--%>
<%--页头结束--%>

<%--页面主体内容 start--%>
<p>
    <span style="font-size:medium; font-family:'微软雅黑';">
    you know this is Hello World -- Judas.n 2014-04-06（<a href="http://YouMeek.com" target="_blank">http://YouMeek.com</a>）
    </span>
</p>
<hr>
<p>
<form id="form1" name="form1" action="/front/userController/saveUser.do" method="post">
    新增用户：
    <input type="text" id="name" name="name" value="" />
    <input type="submit" value="提交" />
</form>
</p>
<hr>
<p>

<form id="form1" name="form1">
    查询的用户ID：
    <input type="text" id="userId" name="userId" value="" />
    <input id="btnSubmit" name="btnSubmit" type="button" value="查询" />
</form>
</p>
<%--页面主体内容 end--%>

<%--页脚开始--%>
<%--页脚结束--%>
</body>
</html>
