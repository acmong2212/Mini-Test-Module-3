<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Delete Student</title>
</head>
<body>
<form action="/delete" method="post">
    <input value="${idDelete}" name="id" hidden/>
    <h1>Ban chac chua ?</h1>
    <button type="submit">Yes</button>
    <button type="button"><a href="/">No</a></button>
</form>
</body>
</html>
