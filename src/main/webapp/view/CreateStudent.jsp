<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Create Student</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
    <style>
        body {
            margin-left: 45%;
        }
        .margin {
            margin-top: 10px;
        }
    </style>
</head>
<body>
<form action="/create" method="post">
<h1>Add new Student</h1>
    <div class="margin">
        <div>Name</div>
        <div><input name="addName" type="text" placeholder="Enter name"/></div>
    </div>
    <div class="margin">
        <div>Email address</div>
        <div><input name="addEmail" type="text" placeholder="Enter email"/></div>
    </div>
    <div class="margin">
        <div>Date of Birth</div>
        <div><input name="addBirthday" type="date" placeholder="Enter date of birth as YYYY-MM-DD"/></div>
    </div>
    <div class="margin">
        <div>Address</div>
        <div><input name="addAddress" type="text" placeholder="Enter address"/></div>
    </div>
    <div class="margin">
        <div>Phone Number</div>
        <div><input name="addPhoneNumber" type="text" placeholder="Enter phone number"/></div>
    </div>
    <div class="margin">Class
        <div><select name="addClass">
            <c:forEach var="t" items="${listClass}">
            <option value="${t.idClass}">${t.nameClass}</option>
            </c:forEach>
        </select>
        </div>
    </div>
    <button type="submit" class="btn btn-primary margin">Submit</button>
</form>
</body>
</html>
