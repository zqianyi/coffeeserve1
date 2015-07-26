<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="form" name="form" method="post" action="../waiterupdate.do">
 <p>请输入要更新员工的编号
    <input name="wid" type="text" />
</p>
 <p>请输入新员工的名字
    <input name="wname" type="text" />
</p>
 <p>请输入新员工的密码
    <input name="wpassword" type="text" />
</p>
 <p>请输入新员工的性别
    <input name="wsex" type="text" />
</p>
 <p>请输入新员工的电话
    <input name="wphone" type="text" />
</p>
  <p>
    <label>
    <input type="submit" name="Submit" value="确认更新" />
    </label>
  </p>
</form>
</body>
</html>