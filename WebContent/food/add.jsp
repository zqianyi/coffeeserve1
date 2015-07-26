<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="form" name="form" method="post" enctype ="multipart/form-data" action="../addfood.do">
 <p>编号
    <input name="id" type="text" />
</p>
  <p>食品名称
    <label>
    <input type="text" name="name" />
    </label>
</p>
   <p>食品类型
    <label>
    <input type="text" name="type" />
    </label>
</p>
 <p>食品价格
    <label>
    <input type="text" name="price" />
    </label>
</p>
 <p>食品库存数量
    <label>
    <input type="text" name="shock" />
    </label>
</p>
 <p>食品照片
    <label>
   <input type="file" name="photo">
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