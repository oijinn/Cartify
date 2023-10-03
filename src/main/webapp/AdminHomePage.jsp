<%-- 
    Document   : AdminHomePage
    Created on : May 13, 2023, 10:51:23 AM
    Author     : 60112
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Admin Homepage</title>
       <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
  <jsp:include page="/WEB-INF/Component/AdminNavBar.jsp" ></jsp:include>
</head>
<body>

  <div class="container">
    <div class="card">
      <h5 class="card-title">Total Monthly Sales</h5>
      <p class="metric-value">$10,000</p>
    </div>
    <div class="card">
      <h5 class="card-title">Average Rating of Sellers</h5>
      <p class="metric-value">4.5</p>
    </div>
  </div>
</body>
</html>
<style>
    body {
      background-color: #F9F9F9;
      margin: 0;
      padding: 20px;
      font-family: Arial, sans-serif;
    }
  
    .container {
      max-width: 960px;
      margin-top:75px;
    }
  
    .card {
      background-color: #FDFDFD;
      border: 1px solid #E0E0E0;
      border-radius: 4px;
      padding: 20px;
      margin-bottom: 20px;
    }
  
    .card-title {
      font-size: 1.2rem;
      font-weight: bold;
      margin-bottom: 0.5rem;
    }
  
    .card-text {
      color: #888;
    }
  
    .metric-value {
      font-size: 2rem;
      font-weight: bold;
    }
  </style>
