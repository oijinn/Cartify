<%-- 
    Document   : SellerViewProduct
    Created on : May 13, 2023, 2:37:44 AM
    Author     : 60112
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>View Product - Seller</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</head>

<body>
  <div class="container">
    <div class="card">
      <img src="product.jpg" class="card-img-top" alt="Product Image">
      <div class="card-body">
        <h5 class="card-title">Monkey Bape</h5>
        <p class="card-text">Product ID: 12345</p>
        <p class="card-text">Description: The MUTANT APE YACHT CLUB is a collection of up to 20,000 Mutant Apes that can only be created by exposing an existing Bored Ape to a vial of MUTANT SERUM or by minting a Mutant Ape in the public sale.</p>
        <p class="card-text">Price: $10000.00</p>
        <div class="card-rating">
          <p class="card-text">Rating: 4.5 <span class="star">&#9733;</span></p>
        </div>
      </div>
    </div>

    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Feedback</h5>
        <div class="comment">
          <p class="card-text">Figotee - Cool product.</p>
        </div>
      </div>
    </div>

    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Add a Comment</h5>
        <form>
          <div class="mb-3">
<textarea class="form-control" placeholder="Write your comment"></textarea>
</div>
<button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>
</div>
      <div class="text-center"> 
          <a href="SellerProductPage.jsp" class="btn btn-back">Back</a>
          
</div>
  </div>
</body>
</html>
<style>
    body {
      background-color: #F9E4C6;
      margin: 0;
      padding: 0;
    }

    .container {
      max-width: 600px;
      margin: 0 auto;
      padding: 20px;
    }

    .card {
      background-color: #FDF6F0;
      border-radius: 8px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
      padding: 20px;
      margin-bottom: 20px;
    }

    .card-title {
      font-size: 1.5rem;
      font-weight: bold;
      margin-bottom: 20px;
    }

    .card-text {
      margin-bottom: 10px;
    }

    .card-img-top {
      width: 100%;
      max-height: 300px;
      object-fit: cover;
      border-radius: 8px;
    }

    .card-rating {
      margin-bottom: 20px;
    }

    .comment {
      margin-bottom: 10px;
    }

    .btn-back {
      background-color: #FFB280;
      color: #FFF;
      border: none;
      font-weight: bold;
      transition: background-color 0.3s;
    }

    .btn-back:hover {
      background-color: #FF9E60;
    }
  </style>



