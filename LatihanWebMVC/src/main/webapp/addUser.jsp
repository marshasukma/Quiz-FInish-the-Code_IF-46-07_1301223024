<%-- 
    Document   : addUser
    Created on : Dec 11, 2024, 5:14:19 PM
    Author     : ASUS
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add User</title>
    </head>
    <body>
        <h1>Tambah Pengguna</h1>
        
        <form action="addUser" method="post">
            <input type="hidden" name="id" value="${user.id}">
            <label for="username">Username:</label>
            <input type="text" name="username" value="${user.username}" required><br><br>

            <label for="password">Password:</label>
            <input type="password" name="password" value="${user.password}" required><br><br>

            <label for="fullName">Full Name:</label>
            <input type="text" name="fullName" value="${user.fullName}" required><br><br>


            <button type="submit">add</button>
        </form>
    </body>
</html>
