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
<table>
 <tr>
    <td>编号</td>
    <td>食品名称</td>
    <td>食品类别</td>
    <td>食品价格</td>
    <td>视频库存</td>
  </tr>
   
  <tr> 
    <c:forEach var="fList" items="${fList}">
    <td >${fList.fid}</td>
    <td>${fList.fname}</td>
     <td>${fList.ftype}</td>
    <td>${fList.fprice}</td>
    <td>${fList.fshock}</td>
  <td> <img alt="" src="photoshow.do?id=${fList.fid}" width="" height=""></td>
    
   
 </c:forEach>

    </tr>
	
</table>

<p>
    <p><a href="../coffeeserve/food/foodaction.jsp">返回</a></p>
    </p>


			
</body>
</html>