<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="form" name="form" method="post" action="../foodupdate.do">
 <p>请输入要更新食品的编号
    <input name="fid" type="text" />
</p>
 <p>请输入新食品的名字
    <input name="fname" type="text" />
</p>
 <p>请输入新食品的类别
    <input name="ftype" type="text" />
</p>
 <p>请输入新食品的价格
    <input name="fprice" type="text" />
</p>
 <p>请输入新食品的库存
    <input name="fshock" type="text" />
</p>
  <p>
    <label>
    <input type="submit" name="Submit" value="确认更新" />
    </label>
  </p>
</form>
</body>
</html>