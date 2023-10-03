<%-- 
    Document   : SellerAddProduct
    Created on : May 12, 2023, 11:02:10 PM
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
  <title>Add Product</title>
</head>
<body>
  <div class="container">
    <h1>Add Product</h1>
    <form>
      <div class="form-group">
        <label for="productName">Product Name</label>
        <input type="text" class="form-control" id="productName">
      </div>
      <div class="form-group">
        <label for="productDescription">Product Description</label>
        <textarea class="form-control" id="productDescription"></textarea>
      </div>
      <div class="form-group">
        <label for="productPrice">Price</label>
        <input type="number" class="form-control" id="productPrice">
      </div>
      <div class="form-group">
        <label for="productImage">Product Image</label>
        <input type="file" class="form-control" id="productImage">
      </div>
      <button class="btn btn-primary">Add Product</button>
      <a href="SellerProductPage.jsp" class="btn btn-secondary">Back</a>
    </form>
  </div>
</body>
</html>
 <style>
    body {
      background-color: #F9F9F9;
    }

    .container {
      max-width: 500px;
      margin: 0 auto;
      padding: 40px;
    }

    h1 {
      text-align: center;
      margin-bottom: 30px;
    }

    .form-group {
      margin-bottom: 20px;
    }

    .btn-primary,
    .btn-secondary {
      display: block;
      width: 100%;
      margin-bottom: 10px;
    }
  </style>
