<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"   import="java.sql.*"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
你的总消费是 
 <c:forEach var="fList" items="${fList}">
   
      <td width="" height="5">${fList.fid}</td>
    <td width="" height="5">${fList.fname}</td>
     <td width="" height="5">${fList.ftype}</td>
    <td width="" height="5">${fList.fprice}</td>
    <td width="" height="5">${fList.fshock}</td>
  
  
 </c:forEach>
 
</body>
</html>