<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
	<jsp:include page="../common/head.jsp"/>
<body>

<h2>Order Register</h2>

<form action="<%= application.getContextPath() %>/orders/register" method="post">
 <div class="container">
    <label for="orderId"><b>orderId</b></label>
    <input type="text" placeholder="Enter Id" name="orderId" required>
    <label for="custId"><b>custId</b></label>
    <input type="text" placeholder="Enter custId" name="custId" required>
    <label for="bookId"><b>bookId</b></label>
    <input type="text" placeholder="Enter bookId" name="bookId" required>
    <label for="orderPrice"><b>orderPrice</b></label>
    <input type="text" placeholder="Enter orderPrice" name="orderPrice" required>
    <label for="orderDate"><b>orderDate</b></label>
    <input type="text" placeholder="Enter orderDate" name="orderDate" required>     
    <button type="submit">Register</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>
</form>
</body>
</html>