<%--
  Created by IntelliJ IDEA.
  User: 60112
  Date: 14/5/2023
  Time: 10:51 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Cards</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</head>
<body>
<div class="card">
  <img src="product.jpg" class="card-img-top" alt="Product Image">
  <div class="card-body">
    <h5 class="card-title">Monkey Bape</h5>
    <p class="card-price">$10000.00</p>
    <a href="ProductDetails.jsp" class="btn btn-primary btn-details">View Details</a>
  </div>
</div>
</body>
</html>
<style>
  .card {
    width: 300px;
    border: 1px solid #e0e0e0;
    border-radius: 4px;
    overflow: hidden;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
  }

  .card-img-top {
    width: 100%;
    height: 200px;
    object-fit: cover;
  }

  .card-body {
    padding: 1.5rem;
  }

  .card-title {
    font-size: 1.2rem;
    font-weight: bold;
    margin-bottom: 0.5rem;
  }

  .card-price {
    font-size: 1rem;
    color: #888;
    margin-bottom: 0.5rem;
  }

  .btn-details {
    display: inline-block;
    padding: 0.5rem 1rem;
    background-color: #f5f5f5;
    border: none;
    text-decoration: none;
    color: #333;
    font-weight: bold;
    transition: background-color 0.3s;
  }

  .btn-details:hover {
    background-color: #e0e0e0;
  }
</style>
