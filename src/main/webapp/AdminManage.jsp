<%-- 
    Document   : AdminManage
    Created on : May 13, 2023, 11:15:19 AM
    Author     : 60112
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Manage Users</title>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
  <jsp:include page="/WEB-INF/Component/AdminNavBar.jsp" ></jsp:include>
</head>
<body>

  <div class="container">
      <div class="row mt-4">
      <div class="col-md-12">
        <div class="card">
          <div class="card-body">
            <form class="search-form">
              <div class="input-group">
                <input type="text" class="form-control search-input" placeholder="Search users">
                <button class="btn btn-primary" type="submit">Search</button>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-md-4">
        <div class="card">
          <h5 class="card-title">Admins</h5>
          <ul class="user-list">
            <li class="user-item">
              <div class="user-details">
                <p class="user-name">Jack Chew</p>
              </div>
              <div class="user-actions">
                <button class="btn btn-primary user-action-btn">Edit</button>
                <button class="btn btn-danger">Delete</button>
              </div>
            </li>
            <li class="user-item">
              <div class="user-details">
                <p class="user-name">Lennon Leong</p>
              </div>
              <div class="user-actions">
                  <button class="btn btn-primary user-action-btn">Edit</button>
                <button class="btn btn-danger">Delete</button>
              </div>
            </li>
          </ul>
        </div>
      </div>
      <div class="col-md-4">
        <div class="card">
          <h5 class="card-title">Sellers</h5>
          <ul class="user-list">
            <li class="user-item">
              <div class="user-details">
                <p class="user-name">Derrick Chung</p>
              </div>
              <div class="user-actions">
                <button class="btn btn-primary user-action-btn">Edit</button>
                <button class="btn btn-danger">Delete</button>
              </div>
            </li>
            <li class="user-item">
              <div class="user-details">
                <p class="user-name">Jimmy Lim</p>
              </div>
              <div class="user-actions">
                <button class="btn btn-primary user-action-btn">Edit</button>
                <button class="btn btn-danger">Delete</button>
              </div>
            </li>
          </ul>
        </div>
      </div>
      <div class="col-md-4">
        <div class="card">
          <h5 class="card-title">Customers</h5>
          <ul class="user-list">
            <li class="user-item">
              <div class="user-details">
                <p class="user-name">Danish</p>
              </div>
              <div class="user-actions">
                <button class="btn btn-primary user-action-btn">Edit</button>
                <button class="btn btn-danger">Delete</button>
              </div>
            </li>
            <li class="user-item">
              <div class="user-details">
                <p class="user-name">Johari</p>
              </div>
              <div class="user-actions">
                <button class="btn btn-primary user-action-btn">Edit</button>
                <button class="btn btn-danger">Delete</button>
              </div>
            </li>
          </ul>
        </div>
      </div>
    </div>
    <div class="row mt-4">
      <div class="col-md-12 text-center">
        <a href="#" class="btn btn-primary">Add Admin</a>
        <a href="#" class="btn btn-primary">Add Seller</a>
        <a href="#" class="btn btn-primary">Add Customer</a>
      </div>
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
    .container{
        margin-top:75px;
    }

    .card {
      margin-bottom: 20px;
      border: 1px solid #E0E0E0;
      border-radius: 4px;
      box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    }

    .card-title {
      padding: 10px;
      background-color: #F5F5F5;
      border-bottom: 1px solid #E0E0E0;
      font-size: 1.2rem;
      font-weight: bold;
    }

    .user-list {
      list-style: none;
      padding: 0;
      margin: 0;
    }

    .user-item {
      display: flex;
      justify-content: space-between;
      align-items: center;
      padding: 10px;
      border-bottom: 1px solid #E0E0E0;
    }

    .user-details {
      flex-grow: 1;
    }

    .user-name {
      margin: 0;
      font-size: 1rem;
    }

    .user-actions {
      display: flex;
      gap: 10px;
    }

    .user-action-btn {
      padding: 5px 10px;
    }

    .card .form-control {
      margin-bottom: 10px;
    }

    .search-form {
      padding: 10px;
    }

    .search-input {
      width: 100%;
    }
  </style>

