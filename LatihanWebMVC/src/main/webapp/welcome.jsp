<%-- 
    Document   : welcome
    Created on : 26 Nov 2024, 11.03.33
    Author     : helmy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Welcome Page</title>
</head>
<body>
    <h2>Selamat datang, ${user.username}! anda berhasil Login!</h2>  <!-- Menampilkan nama pengguna yang login -->
    
    <h4> Lihat daftar pengguna</h4>
    <form action="userList" method="get">
        <button type="submit"> Lihat </button>
    </form>
    
    <!-- Tombol untuk logout -->
    <form action="logout" method="get">
        <button type="submit">Logout</button>
    </form>
</body>
</html>

