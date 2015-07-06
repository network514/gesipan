<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Only Content Frame</title>
	<style>
		@import url("${context}/css/common.css");
	</style>
</head>
<body>
	<div id="wrap" class="clear" align=>
		<jsp:include page="header.jsp"/>
			<section class="content">
			<div align="center">
				<br />
				<table class="tab">
					<tr class="tab" style="height: 50px">
						<td class="tab"><a href="#">방명록</a></td>
						<td class="tab"><a href="#">답글게시판</a></td>
						<td class="tab"><a href="#">자료실</a></td>
					</tr>
					<tr class="tab">
						<td colspan="3"></td>
					</tr>
				</table>
				<br /><br /><br /><br />
			</div>
			</section>
	</div>
</body>
</html>