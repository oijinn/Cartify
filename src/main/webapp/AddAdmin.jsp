<%-- 
    Document   : AddAdmin
    Created on : May 11, 2023, 9:51:04 PM
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
  <title>Add Admin</title>
</head>

<body>
  <div class="container">
    <div class="card p-4">
      <h5 class="card-title mb-4">Add Admin</h5>
      <form>
          <div class="mb-3">
          <label for="email" class="form-label">Email</label>
          <input type="email" class="form-control" id="email" placeholder="Enter email" required name="email">
        </div>
          <div class="mb-3">
        <label for="password" class="form-label">Password</label>
        <input type="password" class="form-control" id="password" placeholder="Enter password" name="Password" required name="password">
      </div>
        <div class="mb-3">
          <label for="name" class="form-label">Name</label>
          <input type="text" class="form-control" id="name" placeholder="Enter name" required name="name">
        </div>
        <div class="mb-3">
          <label for="phone" class="form-label">Phone</label>
          <input type="text" class="form-control" id="phone" placeholder="Enter phone number" required name="phone">
        </div>
        <input type="hidden" name="accountType" value="Admin">
        <div class="text-center">
                <div class="d-flex justify-content-between">
                <a href="AdminManage.jsp" class="btn btn-secondary">Back</a>
                <button type="submit" class="btn btn-primary" name="AddAdmin">Add Admin</button>
                </div>
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



