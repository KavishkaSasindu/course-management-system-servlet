<%--
  Created by IntelliJ IDEA.
  User: sasin
  Date: 3/29/2024
  Time: 9:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="./css/addForm.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
    <div class="inner-form">
        <div class="outer-form">
            <div class="in-form">
                <div class="add-course">Add Course</div>
                <div class="in-form">
                    <form class="row g-3" method="post" action="add">
                        <div class="col-md-6">
                            <label for="course" class="form-label">Course</label>
                            <input type="text" class="form-control" id="course" name="course">
                        </div>
                        <div class="col-md-6">
                            <label for="owner" class="form-label">Owner</label>
                            <input type="text" class="form-control" id="owner" name="owner">
                        </div>
                        <div class="col-12">
                            <label for="institute" class="form-label">Institute</label>
                            <input type="text" class="form-control" id="institute" name="institute">
                        </div>
                        <div class="col-12">
                            <label for="category" class="form-label">Course Category</label>
                            <input type="text" class="form-control" id="category" name="category">
                        </div>
                        <div class="col-md-12">
                            <label for="duration" class="form-label">Duration</label>
                            <input type="text" class="form-control" id="duration" name="duration">
                        </div>


                        <div class="col-12">
                            <button type="submit" class="btn btn-primary">Sign in</button>
                        </div>
                    </form>
                </div>
            </div>

        </div>
    </div>
</body>
</html>
