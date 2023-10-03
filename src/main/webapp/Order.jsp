<%-- 
    Document   : Order
    Created on : May 12, 2023, 1:03:55 PM
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
  <title>Checkout</title>
</head>
<body>
  <div class="container">
    <h1 class="checkout-title">Checkout</h1>
    <p class="checkout-item">Customer ID: 123456</p>
    <p class="checkout-item">Product ID: 789012</p>
    <p class="checkout-item">Product Name: Product Name</p>
    <p class="checkout-item">Date: January 1, 2023</p>
    <p class="checkout-item">Price: $99.99</p>
    <div class="checkout-buttons">
      <a href="OrderHistory.jsp" class="btn btn-secondary">Back</a>
      <button class="btn btn-primary">Pay</button>
    </div>
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

    .checkout-title {
      font-size: 24px;
      font-weight: bold;
      margin-bottom: 20px;
    }

    .checkout-item {
      margin-bottom: 10px;
    }

    .checkout-buttons {
      display: flex;
      justify-content: space-between;
      margin-top: 20px;
    }

    .btn-primary {
      background-color: #FFB280;
      border: none;
    }

    .btn-primary:hover {
      background-color: #FF9E60;
    }
  </style>
