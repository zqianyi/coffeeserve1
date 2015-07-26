<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="form" name="form" method="post"  action="../order.do">
 <p>食品编号
    <input name="food" type="text" />
</p>
  <p>宾座编号
    <label>
    <input type="text" name="seat" />
    </label>
</p>
 
  <p>
    <label>
    <input type="submit" name="Submit" value="提交" />
    </label>
  </p>
</form>
</body>
</html>