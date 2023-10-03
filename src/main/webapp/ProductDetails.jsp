<%-- 
    Document   : ProductDetailsMock
    Created on : May 13, 2023, 2:07:10 AM
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
  <title>Product Details</title>
</head>

<body>
  <div class="card">
    <img src="product.jpg" alt="Product Image" class="card-img">
    <h3 class="card-title">Monkey Bape</h3>
    <p class="card-description">The MUTANT APE YACHT CLUB is a collection of up to 20,000 Mutant Apes that can only be created by exposing an existing Bored Ape to a vial of MUTANT SERUM or by minting a Mutant Ape in the public sale.</p>
    <p class="card-price">Price: $10000.00</p>
    <div class="card-button-container">
  <a href="CustomerHomePage.jsp" class="card-button">Back</a>
  <a href="Order.jsp" class="card-button">Proceed to Checkout</a>
</div>
    <div class="card-feedback">
      <h4 class="customer-name">Customer Feedback</h4>
      <div class="rating">
        <span class="rating-number">4</span>
        <span class="star">&#9733;</span>
      </div>
      <p class="comment">Cool Product.</p>
    </div>
  </div>
</body>

</html>
<style>
    .card {
      background-color: #F9E4C6;
      max-width: 600px;
      margin: 0 auto;
      padding: 20px;
      border-radius: 8px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    .card-img {
      width: 100%;
      border-radius: 8px;
      margin-bottom: 20px;
    }

    .card-title {
      font-size: 24px;
      font-weight: bold;
      margin-bottom: 10px;
    }

    .card-description {
      margin-bottom: 20px;
    }

    .card-price {
      font-size: 18px;
      font-weight: bold;
      margin-bottom: 10px;
    }

    .card-button-container {
    display: flex;
    justify-content: space-between;
    align-items: center;
    margin-top: 20px;
  }

  .card-button {
    padding: 10px 20px;
    border: none;
    border-radius: 4px;
    background-color: #FFB280;
    color: #FFFFFF;
    text-decoration: none;
    text-align: center;
    transition: background-color 0.3s ease;
  }

  .card-button:hover {
    background-color: #FF9E60;
  }

    .card-button {
      padding: 10px 20px;
      border: none;
      border-radius: 4px;
      font-weight: bold;
      cursor: pointer;
    }

    .card-button.back-button {
      background-color: #FFB280;
      color: #FFF;
    }

    .card-button.checkout-button {
      background-color: #FF9E60;
      color: #FFF;
    }

    .card-feedback {
      margin-top: 40px;
      padding-top: 20px;
      border-top: 1px solid #DDD;
    }

    .card-feedback .customer-name {
      font-size: 16px;
      font-weight: bold;
      margin-bottom: 10px;
    }

    .card-feedback .rating {
      display: flex;
      align-items: center;
      margin-bottom: 10px;
    }

    .card-feedback .rating .star {
      color: #FFB280;
      margin-right: 5px;
    }

    .card-feedback .comment {
      margin-bottom: 10px;
    }
  </style>

