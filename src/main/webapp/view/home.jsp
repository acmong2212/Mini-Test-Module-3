<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Students</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container">
    <button class="btn btn-success"><a href="/?action=create">Create</a></button>
    <form action="" method="get">
    <div class="input-group">
        <input name="search" type="search" class="form-control rounded" placeholder="Search" aria-label="Search"
               aria-describedby="search-addon" />
        <input name="action" value="search" hidden/>
        <button type="submit" class="btn btn-outline-primary">search</button>
    </div>
    </form>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>#</th>
            <th>Name</th>
            <th>Date of Birth</th>
            <th>Address</th>
            <th>Phone Number</th>
            <th>Email</th>
            <th>Class</th>
            <th>Action</th>
        </tr>
        </thead>
        <c:forEach var="t" items="${students}" varStatus="loop">
        <tbody>
        <tr>
            <td>${loop.count}</td>
            <td>${t.name}</td>
            <td>${t.birthday}</td>
            <td>${t.address}</td>
            <td>${t.phoneNumber}</td>
            <td>${t.email}</td>
            <td>${t.className}</td>
            <td><a href="/?action=edit&id=${t.id}" class="btn btn-warning">Edit</a></td>
            <td><a href="/?action=delete&id=${t.id}" class="btn btn-danger">Delete</a></td>
        </tr>
        </tbody>
        </c:forEach>
    </table>
</div>

</body>
</html>

