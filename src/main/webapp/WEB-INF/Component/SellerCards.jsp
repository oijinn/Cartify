<%--
    Document   : SellerCards
    Created on : May 13, 2023, 2:00:15 AM
    Author     : 60112
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Cards</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</head>
<body>
<div class="card">
    <img src="product.jpg" class="card-img-top" alt="Product Image">
    <div class="card-body">
        <h5 class="card-title">Monkey Bape</h5>
        <p class="card-price">$10000.00</p>
        <div class="button-container">
            <a href="SellerViewProduct.jsp" class="btn btn-primary btn-details">View Details</a>
            <a href="SellerUpdateProduct.jsp" class="btn btn-secondary">Edit Details</a>
            <button class="btn btn-danger">Delete</button>
        </div>
    </div>
</div>
</body>
</html>
<style>
    .card {
        width: 300px;
        border: 1px solid #F9E4C6;
        border-radius: 8px;
        overflow: hidden;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    }

    .card-img-top {
        width: 100%;
        height: 200px;
        object-fit: cover;
    }

    .card-body {
        padding: 1.5rem;
    }

    .card-title {
        font-size: 1.2rem;
        font-weight: bold;
        margin-bottom: 0.5rem;
    }

    .card-price {
        font-size: 1rem;
        margin-bottom: 0.5rem;
    }

    .button-container {
        display: flex;
        justify-content: space-between;
        align-items: center;
        margin-top: 1rem;
    }

    .btn-details {
        padding: 0.5rem 1rem;
        background-color: #FFB280;
        border: none;
        text-decoration: none;
        color: #FFFFFF;
        font-weight: bold;
        transition: background-color 0.3s;
    }

    .btn-details:hover {
        background-color: #FF9E60;
    }

    .btn-secondary {
        padding: 0.5rem 1rem;
        background-color: #F9E4C6;
        border: none;
        text-decoration: none;
        color: #FFB280;
        font-weight: bold;
        transition: background-color 0.3s;
    }

    .btn-secondary:hover {
        background-color: #FFD9AD;
    }
    .button-container {
        display: flex;
        justify-content: space-between;
        align-items: center;
        margin-top: 1rem;
    }

    .btn-danger {
        padding: 0.5rem 1rem;
        background-color: #dc3545;
        border: none;
        text-decoration: none;
        color: #fff;
        font-weight: bold;
        transition: background-color 0.3s;
    }

    .btn-danger:hover {
        background-color: #c82333;
    }

</style>
