<%-- 
    Document   : Profile
    Created on : May 11, 2023, 10:04:58 PM
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
  <title>Customer Profile</title>
  <jsp:include page="/WEB-INF/Component/CustomerNavBar.jsp" ></jsp:include>
</head>

<body>
  <div class="container">
    <div class="card p-4">
      <div class="text-center mb-4">
        <img src="profile.jpg" alt="Profile Picture" class="profile-picture">
        <h5 class="card-title mt-3">John Doe</h5>
      </div>
      <div class="mb-3">
        <label for="phone" class="form-label">Phone</label>
        <input type="text" class="form-control" id="phone" value="123-456-7890" disabled>
      </div>
      <div class="mb-3">
        <label for="country" class="form-label">Country</label>
        <input type="text" class="form-control" id="country" value="USA" disabled>
      </div>
      <div class="text-center">
        <button class="btn btn-primary">Edit Profile</button>
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
    max-width: 400px;
    margin: 0 auto;
  }

  .profile-picture {
    width: 150px;
    height: 150px;
    border-radius: 50%;
    object-fit: cover;
    margin: 0 auto;
  }

  .card-title {
    color: #FFB280;
    margin-bottom: 0;
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

