<!-- I used W3School to help me with the HTML for this assignment.
     https://www.w3schools.com/bootstrap/tryit.asp?filename=trybs_navbar_inverse&stacked=h
     https://www.w3schools.com/bootstrap/tryit.asp?filename=trybs_table_striped&stacked=h
     Also used this youtube video to help me link the api controller list with the HTML.
     https://www.youtube.com/watch?v=MTw8lW3x7Ck&list=PLdJYl6XU45uLIHaPBQEj-cEMynAl0oeiz&index=10 -->
<!DOCTYPE html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html lang="en">
<STYLE type="text/css">
    table {
        table-layout: auto;
        border-collapse: collapse;
        width: 100%;
    }
    table td {
        border: 0px solid #ccc;
    }
</Style>
<head>
  <title>Top 5 Most Deathly Viruses</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Virus Research Group</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
    </ul>
  </div>
</nav>

<div class="container">

  <h2 align="center">Top 5 </h2>
  <h1 align="center"> Most Deathly Viruses</h1>
  <table class="table table-striped">
    <thead>
      <tr>
        <th>Name</th>
        <th>Description</th>
        <th>Symptoms</th>
        <th>Duration (Days)</th>
        <th>Mortality Rate (Decimal)</th>
        <th>Image</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach var = "item" items = "${viruses}">
      <tr>
        <td>${item.name}</td>
        <td>${item.description}</td>
        <td>${item.symptoms}</td>
        <td>${item.duration}</td>
        <td>${item.mortalityrate}</td>
        <td>
        <!-- While I was thinking on how to do this I remembered that items passes just text to the HTML page.
         Then it hit me I can just use the img syntax of HTML but with the items being inside the src and it WORKED :) -->
        <img ismap src = "${item.imageaddress}" alt = "MISSING LINK" border = "0" height="100" width="150"/>
        </td>
      </tr>
      </c:forEach>
    </tbody>
  </table>
  <p align="right">This information is being gathered from the mySQL server that was set-up using AWS.</p>
  <p align="right">By: Rogelio Rios</p>

</div>


</body>
</html>
