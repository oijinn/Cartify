<%-- 
    Document   : CustomerHomePage
    Created on : May 12, 2023, 10:20:45 PM
    Author     : 60112
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Homepage</title>
          <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
        <jsp:include page="/WEB-INF/Component/CustomerNavBar.jsp" ></jsp:include>
    </head>
    <body>
        <div class="content-container"> <jsp:include page="/WEB-INF/Component/Cards.jsp" ></jsp:include> </div>
    </body>
</html>
<style>
    .content-container {
      margin-top: 100px;
      margin-left: 50px;
    }
  </style>

