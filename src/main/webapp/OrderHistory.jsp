<%-- 
    Document   : OrderHistory
    Created on : May 12, 2023, 1:20:39 PM
    Author     : 60112
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
  <title>Order History</title>
  <jsp:include page="/WEB-INF/Component/CustomerNavBar.jsp" ></jsp:include>
</head>
<body>
  <div class="container">
    <h1 class="order-history-title">Order History</h1>
    <ul class="list-group">
      <li class="list-group-item">
        <p class="order-item">Product Name: Product 1</p>
        <p class="order-item">Price: $99.99</p>
        <p class="order-item">Date: January 1, 2023</p>
        <button class="btn view-details-button">View Details</button>
      </li>
      <li class="list-group-item">
        <p class="order-item">Product Name: Product 2</p>
        <p class="order-item">Price: $49.99</p>
        <p class="order-item">Date: February 1, 2023</p>
        <button class="btn view-details-button">View Details</button>
      </li>
      <li class="list-group-item">
        <p class="order-item">Product Name: Product 3</p>
        <p class="order-item">Price: $79.99</p>
        <p class="order-item">Date: March 1, 2023</p>
        <button class="btn view-details-button">View Details</button>
      </li>
    </ul>
  </div>
</body>
</html>
 <style>
    body {
      background-color: #F9E4C6;
      padding-top: 50px;
      padding-bottom: 50px;
    }

    .container {
      background-color: #FDF6F0;
      border-radius: 8px;
      padding: 20px;
      max-width: 600px;
      margin: 0 auto;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    .order-history-title {
      font-size: 24px;
      font-weight: bold;
      margin-bottom: 20px;
    }

    .order-item {
      margin-bottom: 10px;
    }

    .view-details-button {
      background-color: #FFB280;
      border: none;
      color: #FFF;
    }

    .view-details-button:hover {
      background-color: #FF9E60;
    }
  </style>

