<%@ page contentType = "text/html; charset=euc-kr" %>
<%@ page errorPage = "/error/error_view.jsp" %>

<%@ page import = "bean.ThemeBean" %>
<%@ page import = "dao.ThemeDaoImpl" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head><title>�ۻ���</title></head>
<body>
<%
    String themeId = request.getParameter("id");
    ThemeDaoImpl manager = null;
//     ThemeBean oldTheme = manager.getElementById(id);
%>
<c:set var="oldTheme" value="" />
<c:choose>
    <c:when test="${empty oldTheme}">
    <script>
    alert("���� �������� �ʽ��ϴ�.");
    location.href="list.jsp";
    </script>
    </c:when>

    <c:when test="${oldTheme.password != param.password}">
    <script>
    alert("��ȣ�� �ٸ��ϴ�.");
    history.go(-1);
    </script>
    </c:when>

    <c:when test="${oldTheme.password == param.password}">
    <%
//         ThemeDaoImpl.delete(oldTheme.getId());
    %>
    <script>
    alert("���� �����Ͽ����ϴ�.");
    location.href="list.jsp";
    </script>
    </c:when>
</c:choose>
</body>
</html>