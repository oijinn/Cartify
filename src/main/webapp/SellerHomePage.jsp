<%-- 
    Document   : SellerHomePage
    Created on : May 12, 2023, 10:38:14 PM
    Author     : 60112
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Seller Homepage</title>
          <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
        <jsp:include page="/WEB-INF/Component/SellerNavBar.jsp" ></jsp:include>
    </head>
    <body>
       <div class="container">
  <div class="row justify-content-center">
    <div class="col-md-6">
      <div class="card">
        <div class="card-body">
          <h5 class="card-title">Monthly Sales</h5>
          <p class="card-text">Total Sales: $10,000</p>
          <p class="card-text">Units Sold: 1</p>
        </div>
      </div>
    </div>
  </div>
</div>
       <div class="container">
  <div class="row justify-content-center">
    <div class="col-md-6">
      <div class="card">
        <div class="card-body">
          <h5 class="card-title">Rating</h5>
          <div class="rating">
            <span class="star">&#9733; 4.5</span>
          </div>
        </div>
      </div>
    </div>
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
    max-width: 600px;
    margin-top:75px;
  }

  .card {
    background-color: #FFFFFF;
    border: none;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    margin-bottom: 20px;
  }

  .card-title {
    font-size: 20px;
    font-weight: bold;
    color: #333333;
    margin-bottom: 10px;
  }

  .card-text {
    font-size: 16px;
    color: #666666;
    margin-bottom: 5px;
  }
  
  .rating {
    font-size: 24px;
    color: #FFB280;
  }

  .star {
    margin-right: 5px;
  }
</style>
