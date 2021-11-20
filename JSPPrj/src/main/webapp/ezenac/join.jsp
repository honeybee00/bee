<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="../join" method="post">
	아이디 : <input type="text" name="id"/><br/>
	이름 : <input type="text" name="name"/><br/>
	주소 : <input type="text" name="addr"/><br/>
	핸드폰 : <input type="text" name="phone"/><br/>
	이메일 : <input type="text" name="email"/><br/>
	입사일 : <input type="text" name="hire_date"/><br/>
	사원번호 : <input type="text" name="emp_no"/><br/>
	<button type="submit">가입하기</button><br/>
</form>
<a href="addtion04.jsp">부서원조회</a>

</body>
</html>