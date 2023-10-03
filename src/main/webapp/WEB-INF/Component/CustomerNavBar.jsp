<%--
  Created by IntelliJ IDEA.
  User: 60112
  Date: 14/5/2023
  Time: 10:52 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav id="user-topNavBar">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
  <link href="https://fonts.googleapis.com/css2?family=Poppins&display=swap" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
  <div class="topNavBar-content">
    <button>
      <a href="CustomerHomePage.jsp">
      <div class="topNavBar-logo-container">
        <svg xmlns="http://www.w3.org/2000/svg" width="44" height="44" viewBox="0 0 44 44">
          <path d="M12 20H0V24H12V20ZM16.34 13.51L12.1 9.27L9.27 12.1L13.51 16.34L16.34 13.51ZM24 0H20V12H24V0ZM34.73 12.1L31.9 9.27L27.66 13.51L30.49 16.34L34.73 12.1ZM32 20V24H44V20H32ZM22 16C18.69 16 16 18.69 16 22C16 25.31 18.69 28 22 28C25.31 28 28 25.31 28 22C28 18.69 25.31 16 22 16ZM27.66 30.49L31.9 34.73L34.73 31.9L30.49 27.66L27.66 30.49ZM9.27 31.9L12.1 34.73L16.34 30.49L13.51 27.66L9.27 31.9ZM20 44H24V32H20V44Z" fill="black"/>
        </svg>
        <h2>Cartify</h2>
      </div>
      </a>
    </button>
    <div class="topNav-search-container">
      <div>
        <i class="bi bi-search search-icon"></i>
        <input type="text">
      </div>
      <button class="topNav-search-button">
        <i class="bi bi-x"></i>
      </button>
    </div>
    <div class="topNav-button-container">
      <button class="topNav-profile-button">
        <i class="bi bi-person-circle"></i>
      </button>
    </div>
    <div class="topNav-menu-container">
      <button>
        <a href="Profile.jsp"><i class="bi bi-person-lines-fill"></i>
          <h5>My Profile</h5></a>
      </button>
      <button>
        <a href="OrderHistory.jsp"><i class="bi bi-archive-fill"></i>
          <h5>My Order</h5></a>
      </button>
      <button>
        <a href="Login.jsp"><i class="bi bi-door-closed-fill"></i>
          <h5>Logout</h5></a>
      </button>
    </div>
  </div>
  <script>
    var isMenuShown = false;

    $('.topNav-menu-container').on('animationend',function (){
      if ($(this).css("animation-name") == "fadeOut"){
        $('.topNav-menu-container').css('display','none')
      }
    })

    $('.topNav-profile-button').click(()=>{
      if (isMenuShown){
        isMenuShown = false
        $('.topNav-menu-container').css("animation-name",'fadeOut')
        $('.topNav-menu-container').css("animation-duration",'0.2s')
      } else {
        isMenuShown = true
        $('.topNav-menu-container').css("animation-name",'fadeIn')
        $('.topNav-menu-container').css("animation-duration",'0.2s')
        $('.topNav-menu-container').css('display','flex')
      }
    })

    $('.topNav-menu-container').css('display','none')
  </script>
  <style>
    @keyframes fadeOut {
      0% {
        opacity: 100%;
      }
      100% {
        opacity: 0%;
      }
    }


    @keyframes fadeIn {
      0% {
        opacity: 0%;
      }
      100% {
        opacity: 100%;
      }
    }

    .topNav-menu-container button h5{
      font-size: 17px;
      font-family: -apple-system,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif,"Apple Color Emoji","Segoe UI Emoji","Segoe UI Symbol";
      font-weight: 500;
    }

    .topNav-menu-container button i{
      font-size: 20px;
    }

    .topNav-menu-container button:hover{
      background-color: #dadada;
    }

    .topNav-menu-container button{
      width: 230px;
      display: flex;
      flex-direction: row;
      align-items: center;
      justify-content: space-between;
      outline: none;
      border: none;
      background-color: white;
      padding: 0px 20px;
      cursor: pointer;
      transition: all 0.2s ease-in;
    }

    .topNav-menu-container{
      background-color: white;
      box-shadow: 0 4px 6px -1px rgb(0 0 0 / 0.1), 0 2px 4px -2px rgb(0 0 0 / 0.1);
      position: absolute;
      margin-left: 1250px;
      margin-top:400px;
      display: flex;
      flex-direction: column;
      padding: 10px 0px;
      border-radius: 8px;
    }

    .topNavBar-logo-container h2{
      font-family: Poppins;
      color: #716969;
    }

    .topNavBar-logo-container svg path{
      fill: #716969;
    }

    .topNavBar-logo-container{
      display: flex;
      flex-direction: row;
      align-items: center;
      gap: 10px;
    }

    .topNav-button-container button:hover{
      background: #dadada;
    }

    .topNav-button-container button{
      padding: 10px;
      font-size: 23px;
      outline:none;
      border:none;
      border-radius: 8px;
      background: #E5E8EB;
      transition: all 0.2s ease-in;
      cursor: pointer;
    }

    .topNav-button-container{
      display: flex;
      flex-direction: row;
      align-items: center;
      margin-left: 200px;
      gap: 450px;
    }

    .topNav-search-button:hover{
      background: #dadada;
    }


    .topNav-search-button{
      padding: 5px 5px;
      font-size: 26px;
      background: #E5E8EB;
      border-radius: 8px;
      outline: none;
      border: none;
      cursor: pointer;
      transition: all 0.2s ease-in;
    }

    .topNav-search-container div{
      display: flex;
      flex-direction: row;
      align-items: center;
      width: 100%;
    }

    .topNav-search-container input{
      outline: none;
      border: none;
      font-size: 20px;
      margin-left: 10px;
      width: 100%;
    }

    .topNav-search-container .search-icon{
      font-size: 19.92px;
      opacity: 0.5;
    }

    .topNav-search-container{
      margin-left: 460px;
      display: flex;
      flex-direction: row;
      align-items: center;
      justify-content: space-between;
      padding: 6px 20px;
      width: 564.96px;
      height: 40px;
      border: 2px solid #E5E8EB;
      border-radius: 12px;
    }

    .topNavBar-content{
      display: flex;
      flex-direction: row;
      align-items: center;
    }

    #user-topNavBar img{
      width: 65px;
      object-fit: contain;
    }

    #user-topNavBar{
      padding: 10px 50px;
      position: fixed;
      top: 0px;
      left: 0px;
      box-shadow: 0 4px 6px -1px rgb(0 0 0 / 0.1), 0 2px 4px -2px rgb(0 0 0 / 0.1);
    }
  </style>
</nav>
