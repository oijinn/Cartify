<%-- 
    Document   : Register
    Created on : May 11, 2023, 5:51:43 PM
    Author     : 60112
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Register Page</title>
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

</head>

<body>
  <div class="container">
    <h1>Register</h1>
    <form action="Register" method="post">
      <div class="mb-3">
        <label for="email" class="form-label">Email</label>
        <input type="email" class="form-control" id="email" placeholder="Enter email" name="Email" required>
      </div>
      <div class="mb-3">
        <label for="password" class="form-label">Password</label>
        <input type="password" class="form-control" id="password" placeholder="Enter password" name="Password" required>
      </div>
      <div class="mb-3">
        <label for="name" class="form-label">Name</label>
        <input type="text" class="form-control" id="name" placeholder="Enter name" name="Name" required>
      </div>
      <div class="mb-3">
        <label for="phone" class="form-label">Phone</label>
        <input type="tel" class="form-control" id="phone" placeholder="Enter phone number" name="Phone" required>
      </div>
      <div class="mb-3">
        <label for="country" class="form-label">Country</label>
        <input type="text" class="form-control" id="country" placeholder="Enter country" name="Country" required>
      </div>
      <div class="mb-3">
        <label for="accountType" class="form-label">Account Type</label>
        <select name="accountType" class="form-select" id="accountType" required>
          <option value="">Select account type</option>
          <option value="Customer">Customer</option>
          <option value="Seller">Seller</option>
        </select>
      </div>
      <button type="submit" class="btn btn-primary">Register</button>
    </form>
    <p class="mt-3">
    Already sign up? <a href="Login.jsp">Login</a>
    </p>
  </div>
</body>

</html>
<style>
    body {
      background-color: #F9E4C6;
    }

    .container {
      background-color: #FDF6F0;
      border-radius: 8px;
      padding: 20px;
      max-width: 400px;
      margin: 0 auto;
      margin-top: 50px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    h1 {
      text-align: center;
      color: #FFB280;
      margin-bottom: 20px;
    }

    label {
      color: #FFB280;
      font-weight: bold;
    }

    input[type="email"],
    input[type="password"],
    input[type="text"],
    input[type="tel"],
    select {
      background-color: #FDF6F0;
      border: 1px solid #FFB280;
      border-radius: 4px;
      padding: 8px;
      width: 100%;
    }

    .btn-primary {
      background-color: #FFB280;
      border: none;
    }
    
    .btn-primary:hover {
      background-color: #FF9E60;
    }

    p {
      text-align: center;
      margin-top: 20px;
      color: #FFB280;
    }

    a {
      color: #FFB280;
      text-decoration: none;
      font-weight: bold;
    }
  </style>

