<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="vendor" value="/resources/vendor" />
<spring:url var="images" value="/resources/images" />
<spring:url var="fonts" value="/resources/fonts" />


<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Shop Homepage - ${title}</title>

<!-- Bootstrap core CSS -->
<link href="${vendor}/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/shop-homepage.css" rel="stylesheet">
<script>
	window.menu = '${title}';
</script>
</head>

<body>
	<div class="wrapper">
		<div class="content">
			<!-- Navigation -->
			<%@ include file="./shared/navbar.jsp"%>

			<c:if test="${userclickhome==true}">
				<!-- Page Content -->
				<%@ include file="home.jsp"%>
			</c:if>

			<c:if test="${userclick_about==true}">
				<!-- Page Content -->
				<%@ include file="about.jsp"%>
			</c:if>

			<c:if test="${userclickAllProducts==true or userclickCategoryProducts==true}">
				<!-- Page Content -->
				<%@ include file="listProducts.jsp"%>
			</c:if>


			<c:if test="${userclick_contact==true}">
				<!-- Page Content -->
				<%@ include file="contact.jsp"%>
			</c:if>
		</div>
		
	<!-- Footer -->
	<%@include file="./shared/footer.jsp"%>		
		
	</div>


	<!-- Bootstrap core JavaScript -->
	<script src="${vendor}/jquery/jquery.min.js"></script>
	<script src="${vendor}/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="${js}/myapp.js"></script>

</body>

</html>
