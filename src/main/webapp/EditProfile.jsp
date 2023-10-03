<%-- 
    Document   : Profile
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
  <title>Edit Profile</title>
</head>

<body>
  <div class="container">
    <div class="card p-4">
      <h5 class="card-title mb-4">Customer Profile</h5>
      <form>
        <div class="mb-3">
          <label for="name" class="form-label">Name</label>
          <input type="text" class="form-control" id="name" placeholder="Enter your name" name="name">
        </div>
        <div class="mb-3">
          <label for="phone" class="form-label">Phone</label>
          <input type="text" class="form-control" id="phone" placeholder="Enter your phone number" name="phone">
        </div>
        <div class="mb-3">
          <label for="profilePicture" class="form-label">Profile Picture</label>
          <input type="file" class="form-control" id="profilePicture" name="picture">
        </div>
        <div class="mb-3">
        <label for="country" class="form-label">Country</label>
        <input type="text" class="form-control" id="country" placeholder="Enter country" name="country">
      </div>
        <div class="text-center">
          <div class="d-flex justify-content-between">
            <a href="Profile.jsp" class="btn btn-secondary">Back</a>
            <button type="submit" class="btn btn-primary">Save Changes</button>
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

  .form-select {
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
</style>
