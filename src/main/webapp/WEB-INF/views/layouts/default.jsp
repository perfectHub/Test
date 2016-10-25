<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/25
  Time: 12:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@include file="/WEB-INF/views/include/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <title><sitemesh:title/></title>
    <%@ include file="/WEB-INF/views/layouts/header.jsp"%>
    <sitemesh:head/>
</head>
<body>
    <sitemesh:body/>
    <%@ include file="/WEB-INF/views/layouts/footer.jsp"%>
</body>
</html>
