<%-- 
    Document   : index
    Created on : Dec 4, 2019, 7:53:09 PM
    Author     : apple
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${name}</h1>
        <ul>
            <c:forEach var="color" items="${colors}">
                <li style="color:${color}">${color}</li>
            </c:forEach>
        </ul>
    </body>
</html>
