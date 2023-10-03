<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Seller Wallet</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
  <jsp:include page="/WEB-INF/Component/SellerNavBar.jsp" ></jsp:include>
</head>
<body>
<div class="container">
  <h1 class="text-center mt-5">Seller Wallet</h1>
  <div class="card p-4 mt-4">
    <h5 class="card-title mb-4">Balance: $500</h5>
    <form>
      <div class="mb-3">
        <label for="amount" class="form-label">Withdraw Amount</label>
        <input type="number" class="form-control" id="amount" placeholder="Enter amount" name="amount">
      </div>
      <div class="text-center">
        <button type="submit" class="btn btn-primary">Withdraw</button>
      </div>
    </form>
  </div>
</div>
</body>
</html>
<style>
  body {
    background-color: #F9F9F9;
    padding: 20px;
    font-family: Arial, sans-serif;
  }

  .container {
    max-width: 960px;
    margin: 0 auto;
    margin-top: 75px;
  }

  .card {
    background-color: #FDFDFD;
    border-radius: 8px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
  }

  .card-title {
    color: #333333;
    text-align: center;
    margin-bottom: 20px;
  }

  .form-control {
    background-color: #F9F9F9;
    border: 1px solid #CCCCCC;
    border-radius: 4px;
    padding: 8px;
  }

  .btn-primary {
    background-color: #007BFF;
    border: none;
  }

  .btn-primary:hover {
    background-color: #0056b3;
  }
</style>



