<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
      <fmt:setBundle basename="com.city.coffeeserve.info.Message" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="login">
<form id="form1" name="form1" method="post" action="login.do">
  <p><fmt:message key="name"/>
    <input name="username" type="text" />
</p>
  <p><fmt:message key="pass"/>
    <label>
    <input type="text" name="password" />
    </label>
</p>
  
  <p>
    <label>
    <input type="submit" name="Submit" value="<fmt:message key="sub"/>" />
    </label>
  </p>
</form>
</div>
</body>
</html>