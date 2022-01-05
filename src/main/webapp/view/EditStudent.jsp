<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Student</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<form action="/edit" method="post">
    <label><input name="id" value="${indexEdit}" hidden/></label>
    <table>
        <tr>
            <th><label><input type="text" placeholder="Enter a name" name="editName" value="${editStudent.name}"/></label></th>
            <th><label><input type="text" placeholder="Enter a birthday" name="editBirthday" value="${editStudent.birthday}"/></label></th>
            <th><label><input type="text" placeholder="Enter a address" name="editAddress" value="${editStudent.address}"/></label></th>
            <th><label><input type="text" placeholder="Enter a phoneNumber" name="editPhoneNumber" value="${editStudent.phoneNumber}"/></label></th>
            <th><label><input type="text" placeholder="Enter a email" name="editEmail" value="${editStudent.email}"/></label></th>
            <th><label><input type="text" placeholder="Enter a idClass" name="editIdClass" value="${editStudent.idClass}"/></label></th>
        </tr>
    </table>
    <button type="submit" class="btn btn-success">Submit</button>
</form>
</body>
</html>
