<%-- 
    Document   : Rating
    Created on : May 12, 2023, 5:30:34 PM
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
  <title>Write a Review</title>
</head>

<body>

  <div class="container">
    <h2>Write a Review</h2>

    <div class="mb-3">
      <label for="rating" class="form-label">Rating:</label>
      <div class="rating">
        <input type="radio" id="star5" name="rating" value="5">
        <label for="star5"></label>
        <input type="radio" id="star4" name="rating" value="4">
        <label for="star4"></label>
        <input type="radio" id="star3" name="rating" value="3">
        <label for="star3"></label>
        <input type="radio" id="star2" name="rating" value="2">
        <label for="star2"></label>
        <input type="radio" id="star1" name="rating" value="1">
        <label for="star1"></label>
      </div>
    </div>

    <div class="mb-3">
      <label for="comment" class="form-label">Comment:</label>
      <textarea class="form-control" id="comment" rows="4"></textarea>
    </div>

    <div class="d-grid gap-2">
      <a href="OrderHistoryDetails.jsp" class="btn btn-secondary">Back</a>
      <button class="btn btn-primary" type="button">Post</button>
    </div>

  </div>
</body>

</html>


  <style>
    body {
      background-color: #F9E4C6;
      color: #333;
    }

    .container {
      max-width: 400px;
      margin: 0 auto;
      padding: 20px;
    }

    h2 {
      text-align: center;
      margin-bottom: 20px;
    }

    .form-label {
      font-weight: bold;
    }

    .rating {
      display: flex;
      justify-content: center;
      margin-bottom: 20px;
    }

    .rating input[type="radio"] {
      display: none;
    }

    .rating label {
      cursor: pointer;
      width: 30px;
      height: 30px;
      background-image: url('star.png');
      background-size: cover;
    }

    .rating label:hover,
    .rating input[type="radio"]:checked ~ label {
      background-image: url('star-filled.png');
    }

    #comment {
      width: 100%;
      resize: none;
    }

    .btn-secondary {
      background-color: #D3D3D3;
      border-color: #D3D3D3;
      color: #333;
    }

    .btn-primary {
      background-color: #FFB280;
      border-color: #FFB280;
    }
  </style>


