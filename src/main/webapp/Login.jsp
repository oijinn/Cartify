<%-- 
    Document   : Login
    Created on : May 11, 2023, 3:45:06 PM
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
  <title>Login</title>
</head>
<body>

  <div class="container">
    <div class="row justify-content-center">
      <div class="col-md-6">
        <div class="card">
          <div class="card-body">
            <h5 class="card-title text-center">Login</h5>
            
            <form>
              <div class="mb-3">
                <label for="email" class="form-label">Email address</label>
                <input type="email" class="form-control" id="email" name="Name" placeholder="Enter email">
              </div>
              
              <div class="mb-3">
                <label for="password" class="form-label">Password</label>
                <input type="password" class="form-control" id="password" name="Password" placeholder="Enter password">
              </div>
              
              <div class="d-grid">
                <button type="submit" class="btn btn-primary">Login</button>
              </div>
              
              <div class="text-center mt-3">
                <a href="#" class="text-decoration-none">Forgot Password?</a>
              </div>
              
              <div class="text-center mt-3">
                <p class="mb-0">Don't have an account? <a href="/app/Register.jsp" class="text-decoration-none">Register</a></p>
              </div>
            </form>
            
          </div>
        </div>
      </div>
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
      padding: 20px;
      width: 100%;
      max-width: 400px;
    }

    .card-title {
      color: #FFB280;
      text-align: center;
      margin-bottom: 20px;
    }

    .form-label {
      color: #FFB280;
      font-weight: bold;
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

    .text-decoration-none {
      color: #FFB280;
      text-decoration: none;
    }

    .text-decoration-none:hover {
      text-decoration: underline;
    }

    .mt-3 {
      margin-top: 15px;
    }

    .mb-0 {
      margin-bottom: 0;
    }
</style>
