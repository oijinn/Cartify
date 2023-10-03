<%-- 
    Document   : SellerProductPage
    Created on : May 12, 2023, 10:46:45 PM
    Author     : 60112
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Product List</title>
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</head>
<body>
    <div><jsp:include page="/WEB-INF/Component/SellerNavBar.jsp"></jsp:include></div>

  <div class="container">
    <h2 class="text-center">Products</h2>
    
    <jsp:include page="/WEB-INF/Component/SellerCards.jsp"></jsp:include>
    
    <div class="text-center mt-4">
      <a href="SellerAddProduct.jsp" class="btn btn-primary">Add Product</a>
    </div>
  </div>
</body>
</html>

<style>
  body {
    background-color: #f9f9f9;
    padding: 20px;
    font-family: Arial, sans-serif;
  }

  .container {
    max-width: 1250px;
    margin-top: 75px;
  }

  .btn-primary {
    display: inline-block;
    padding: 0.5rem 1rem;
    font-weight: bold;
    background-color: #007bff;
    border: none;
    text-decoration: none;
    color: #fff;
    transition: background-color 0.3s;
  }

  .btn-primary:hover {
    background-color: #0056b3;
  }
</style>
