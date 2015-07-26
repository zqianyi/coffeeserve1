<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="form" name="form" method="post" action="../addwaiter.do">
 <p>编号
    <input name="id" type="text" />
</p>
  <p>姓名
    <label>
    <input type="text" name="name" />
    </label>
</p>
   <p>密码
    <label>
    <input type="text" name="pass" />
    </label>
</p>
 <p>性别
    <label>
    <input type="text" name="sex" />
    </label>
</p>
 <p>电话
    <label>
    <input type="text" name="phone" />
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