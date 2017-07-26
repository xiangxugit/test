<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆页面</title>
<script type="text/javascript" src="http://apps.bdimg.com/libs/jquery/1.6.4/jquery.js"></script>
</head>
<body sttyle="display:none;">
	<form action="index" method="post">
		<input type="text" name="name">
		 <input type="password"
			name="password">
		 <input type="submit" value="确认">
	</form>
</body>

 <script type="text/javascript">
$.ajax({
	async: false, //表示同步，如果要得到ajax处理完后台数据后的返回值，最好这样设置
    type: "get",
    url: "http://localhost:8080/SSMDemo/getAllUser/",
    dataType: "json",
    success: function (result) {
    	alert("aaa"+result);
    } 
});
</script>
</html>