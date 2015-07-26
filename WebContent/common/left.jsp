<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
      <fmt:setBundle basename="com.city.coffeeserve.info.Message" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <link href="css.css" rel="stylesheet" type="text/css" />
<div class="side">
<ul>
<li><a href="../coffeeserve/customer/meet.jsp"><fmt:message key="meet"/></a></li>
<li><a href="../coffeeserve/waiter/waiteraction.jsp"><fmt:message key="waiteraction"/></a></li>
<li><a href="../coffeeserve/customer/order.jsp"><fmt:message key="order"/></a></li>
<li><a href="../coffeeserve/food/foodaction.jsp"><fmt:message key="fooaction"/></a></li>
<li><fmt:message key="peoplenumber"/>：    ${num}  </li>
<li> <fmt:message key="click"/> : ${clickNum} </li>
</ul>
</div>