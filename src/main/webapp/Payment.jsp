<%-- 
    Document   : Payment
    Created on : May 11, 2023, 9:38:30 PM
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
  <title>Credit Card Checkout</title>
  <jsp:include page="/WEB-INF/Component/CustomerNavBar.jsp" ></jsp:include>
</head>

<body>

  <div class="container">
    <div class="card p-4">
      <h5 class="card-title mb-4">Card Details</h5>
      <form>
        <div class="mb-3">
          <label for="cardNumber" class="form-label">Card Number</label>
          <input type="text" class="form-control" id="cardNumber" placeholder="Enter card number" required name="cardNumber">
        </div>
        <div class="row">
          <div class="col-md-6 mb-3">
            <label for="expirationDate" class="form-label">Expiration Date</label>
            <input type="text" class="form-control" id="expirationDate" placeholder="MM/YY" required name="expirationDate">
          </div>
          <div class="col-md-6 mb-3">
            <label for="cvv" class="form-label">CVV</label>
            <input type="text" class="form-control" id="cvv" placeholder="CVV" required name="cvv">
          </div>
        </div>
        <div class="mb-3">
          <label for="cardHolder" class="form-label">Cardholder Name</label>
          <input type="text" class="form-control" id="cardHolder" placeholder="Enter cardholder name" required name="cardholderName">
        </div>
        <div class="text-center">
            <a href="Order.jsp" class="btn btn-secondary">Back</a>
          <button type="submit" class="btn btn-primary">Submit</button>
        </div>
      </form>
    </div>
  </div>
</body>

</html>

<style>
  body {
    background-color: #F9E4C6;
    margin: 0;
    padding: 0;
    display: flex;
    justify-content: center;
    align-items: center;
    min-height: 100vh;
  }

  .card {
    background-color: #FDF6F0;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    max-width: 400px;
    margin: 0 auto;
  }

  .card-title {
    color: #FFB280;
    text-align: center;
    margin-bottom: 20px;
  }

  .form-control {
    background-color: #FDF6F0;
    border: 1px solid #FFB280;
    border-radius: 4px;
    padding: 8px;
  }

  .btn-primary {
    background-color: #FFB280;
    border: none;
  }

  .btn-primary:hover {
    background-color: #FF9E60;
  }
</style>

