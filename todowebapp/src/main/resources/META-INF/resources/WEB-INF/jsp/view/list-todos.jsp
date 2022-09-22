<!-- to import jstl -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>List Todos - RH WEBAPP</title>
    <!-- bootstrap 4 -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <!-- font awesome 4-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/all.css" integrity="sha384-SlE991lGASHoBfWbJdE27b1bGJvOkbGjF6kC4IYzjimGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous">

    <!-- custom css -->
    <link rel="stylesheet" href="css/login.css">

    <!-- favicion with extern url -->
    <link rel="shortcut icon" href="https://www.google.com/favicon.ico" type="image/x-icon">

    
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
        <a class="navbar-brand" href="localhost:8080">RH WEBAPP</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="/welcome">Home</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuItem" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Todos</a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="/add-todos">AddTodo</a>
                        <a class="dropdown-item" href="/list-todos">ListTodos</a>
                    </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/about">About</a>
                </li>
            </ul>

            <!--display username if user is logged in-->
            <!-- display unsername in nav item, and logout button inside dropdown -->
            <ul class="navbar-nav ml-auto">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        ${username}
                    </a>
                    <div class="dropdown-menu dropdown-menu-right">
                        <a class="dropdown-item" href="/welcome">Dashboard</a>
                        <a class="dropdown-item" href="/profile">Profile</a>
                        <a class="dropdown-item" href="/settings">Settings</a>
                        <a class="dropdown-item" href="/logout">Logout</a>
                    </div>
                </li>
            </ul>
        </div>
    </nav>

    <!-- add main component of profile page -->
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <!--add welcome title with bootstrap -->
                <h1 class="display-4 text-center">Welcome to your todos ${username}</h1>
                <hr>
                <div class="row">
                    <div class="col-md-2">
                        <h3>Add Todo</h3>
                        <form action="/add-todo" method="post">
                            <div class="form-group">
                                <input type="text" class="form-control" name="todo" placeholder="Add Todo">
                            </div>
                            <button type="submit" value="add-todo" class="btn btn-primary">Add</button>
                        </form>
                    </div>
                    <div class="col-md-10">
                        <h3>Todos</h3>
                        
                   
                        <table class="table table-striped">
                            <thead class="thead-dark">
                                <tr>
                                    <th scope="col">ID</th>
                                    <th scope="col">Description</th>
                                    <th scope="col">Target Date</th>
                                    <th scope="col">Is Done</th>
                                    <th scope="col">Update</th>
                                    <th scope="col">Delete</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${todos}" var="todo">
                                    <tr>
                                        <th scope="row">${todo.id}</th>
                                        <td scope="row">${todo.description}</td>
                                        <td scope="row">${todo.targetDate}</td>
                                        <td scope="row">${todo.done}</td>
                                        <td scope="row"><a href="/update-todo?id=${todo.id}">Update</a></td>
                                        <td scope="row"><a href="/delete-todo?id=${todo.id}">Delete</a></td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
            </div>
        </div>
    </div>



    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>