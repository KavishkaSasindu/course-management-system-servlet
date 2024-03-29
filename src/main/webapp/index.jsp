<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="./css/navbar.css">
</head>
<body>
    <div class="outer-nav">
        <div class="inner-nav">
            <div class="list-items">
                <div class="logo">Course</div>
                <div class="nav-list">
                    <ul>
                        <li><a href="">Home</a></li>
                        <li><a href="">Add</a></li>
                        <li><a href="">About</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
<jsp:include page="add.jsp"/>
</body>
</html>