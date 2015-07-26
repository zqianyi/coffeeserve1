<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
    <td>编号</td>
    <td>姓名</td>
    <td>密码</td>
    <td>性别</td>
    <td>电话</td>
  </tr>
  <c:forEach var="wList" items="${wList}">
 
   
  <tr> 
  
    <td >${wList.wid}</td>
    <td>${wList.wname}</td>
     <td>${wList.wpassword}</td>
    <td>${wList.wsex}</td>
    <td>${wList.wphone}</td>
  
    </tr> 
   
 </c:forEach>

   
	
</table>

<p>
    <p><a href="../coffeeserve/waiter/waiteraction.jsp">返回</a></p>
    </p>
</body>
</html>