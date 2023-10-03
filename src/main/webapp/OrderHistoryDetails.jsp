<%-- 
    Document   : OrderHistoryDetails
    Created on : May 12, 2023, 1:58:50 PM
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
  <title>Order History Details</title>
</head>
<body>
  <div class="container">
    <h1 class="header">Order History</h1>

    <div class="order-details">
      <h2>Order Details</h2>
      <div class="product-details">
        <img src="product.jpg" alt="Product Image">
        <div>
      <p><strong>Customer ID:</strong> 12345</p>
      <p><strong>Product ID:</strong> 98765</p>
      <p><strong>Product Name:</strong> Example Product</p>
      <p><strong>Date:</strong> May 12, 2023</p>
      <p><strong>Price:</strong> $99.99</p>
    </div>

    <div class="payment-details">
      <h2>Payment Details</h2>
      <p><strong>Card Number:</strong> 1234 5678 9012 3456</p>
      <p><strong>Expiration Date:</strong> 12/24</p>
      <p><strong>CVV:</strong> 123</p>
      <p><strong>Cardholder Name:</strong> John Doe</p>
    </div>

    <div class="button-section">
        <a href="OrderHistory.jsp" class="btn btn-secondary">Back</a>
      <button class="btn btn-primary">Write a Review</button>
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

    .header {
      text-align: center;
      margin-bottom: 20px;
      color: #989898;
      font-size: 45px;
      font-weight: bold;
    }

    .order-details {
      margin-bottom: 20px;
      color: #989898;
      border-bottom: 1px solid #FFB280;
      padding-bottom: 20px;
    }

    .payment-details {
      margin-top: 20px;
      color: #989898;
    }

    .button-section {
      margin-top: 40px;
      text-align: center;
    }

    .back-button {
      margin-top: 20px;
    }

    .btn-primary {
      background-color: #FFB280;
      color: #FFFFFF;
      border: none;
      padding: 10px 20px;
      margin-right: 10px;
    }

    .btn-secondary {
      background-color: #FF9E60;
      color: #FFFFFF;
      border: none;
      padding: 10px 20px;
    }
    
    .product-details img{
        width: 100%;
        height:100%;
        object-fit: cover;
    }
  </style>



