<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript"
	src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#click').click(function() {
			$.ajax({
				url : '/ajax',
				data : {
					age : 1
				},
				success : function(data) {
					alert(data.result);
				},
				error : function() {
					$('<p>').css({
						color : 'red'
					}).appendTo('#result');
				}
			})
			alert("1");
		})
	})
</script>
<style type="text/css">
#alert {
	color: red;
}
</style>
</head>
<body>
	<form action="/add" method="post">
		<input type="text" name="user.userName" id="blur" /><br /> <input
			type="submit" value="submit" />
	</form>
	<button id="click">ajax</button>
</body>


</html>