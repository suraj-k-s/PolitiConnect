<%-- 
    Document   : Login
    Created on : May 5, 2021, 2:13:16 PM
    Author     : Pro-TECH
--%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <!-- Required meta tags -->
        <jsp:useBean class="DB.ConnectionClass" id="con"></jsp:useBean>

            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
            <meta http-equiv="x-ua-compatible" content="ie=edge">

            <title>Login</title>

            <!-- Core CSS -->
            <link rel="stylesheet" href="Assets/friendskit/assets/css/bulma.css">
            <link rel="stylesheet" href="Assets/friendskit/assets/css/app.css">
            <link rel="stylesheet" href="Assets/friendskit/assets/css/core.css">

        </head>
    <%

        if (request.getParameter("btn_login") != null) {

            String email = request.getParameter("txt_email");
            String password = request.getParameter("txt_password");
            String admin = "select * from tbl_admin where admin_email ='" + email + "' and admin_password='" + password + "' ";
            ResultSet rsA = con.selectCommand(admin);

            String user = "select * from tbl_user where user_email ='" + email + "' and user_password='" + password + "'";
            ResultSet rsC = con.selectCommand(user);

           

            if (rsA.next()) {
                session.setAttribute("aid", rsA.getString("admin_id"));
                session.setAttribute("aname", rsA.getString("admin_name"));
                response.sendRedirect("Admin/HomePage.jsp");
            } else if (rsC.next()) {
                if (rsC.getString("user_status").equals("1")) {

                    session.setAttribute("uid", rsC.getString("user_id"));
                    session.setAttribute("uname", rsC.getString("user_name"));
                    session.setAttribute("uphoto", rsC.getString("user_photo"));
                    session.setAttribute("uemail", rsC.getString("user_email"));
                    response.sendRedirect("User/HomePage.jsp");

                } else if (rsC.getString("user_status").equals("0")) {

    %> 
    <script type="text/javascript">
        alert("Wait for response......");
        setTimeout(function() {
            window.location.href = 'index.jsp'
        }, 100);
    </script>
    <%        } else if (rsC.getString("user_status").equals("2")) {

    %> 
    <script type="text/javascript">
        alert("Rejected.....!!!!");
        setTimeout(function() {
            window.location.href = 'index.jsp'
        }, 100);
    </script>
    <%        }
    } else {

    %> 
    <script type="text/javascript">
        alert("Invalid Login Credentials");
        setTimeout(function() {
            window.location.href = 'index.jsp'
        }, 100);
    </script>
    <%            }
        }
    %>
    <body>

        <!-- Pageloader -->
        <div class="pageloader"></div>
        <div class="infraloader is-active"></div>
        <div class="signup-wrapper">

            <!--        Fake navigation
                    <div class="fake-nav">
                        <a href="/" class="logo" style="font-weight:bolder;font-size: xx-large;color: dimgray;" >
                         User-Connect
                            
                        </a>
                    </div>-->

            <div class="container">
                <!--Container-->
                <div class="login-container">
                    <div class="columns is-vcentered">
                        <div class="column is-6 image-column">
                            <!--Illustration-->
                            <img class="light-image login-image" src="Assets/friendskit/assets/img/illustrations/login.svg" alt="">
                            <img class="dark-image login-image" src="Assets/friendskit/assets/img/illustrations/login-dark.svg" alt="">
                        </div>
                        <div class="column is-6">

                            <h2 class="form-title">Welcome </h2>
                            <h3 class="form-subtitle">Enter your credentials to sign in.</h3>

                            <!--Form-->

                            <form method="post">
                                <div class="login-form">
                                    <div class="form-panel">
                                        <div class="field">
                                            <label>Email</label>
                                            <div class="control">
                                                <input type="email" id="input" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"
                                                       class="input" autocomplete="off"  name="txt_email" placeholder="Enter your Email" required="required"/>
                                            </div>
                                        </div>
                                        <div class="field">
                                            <label>Password</label>
                                            <div class="control">
                                                <input type="password" class="input" name="txt_password" placeholder="Enter your password" required="required"/>
<!--                                                       pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
                                                       title="Must contain at least one  number and one uppercase and lowercase letter, and at least 8 or more characters" -->
                                                       
                                            </div>
                                        </div>
                                        <br><br>
                                    </div>
                                    <div class="buttons">
                                        <button class="button is-solid primary-button is-fullwidth raised" type="submit"  name="btn_login"><span>Login</span></button>                    
                                    </div>
                                    <div align="right" >
                                        <a href="SignUp.jsp"><span>sign up -></span></a>                    
                                    </div>

                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Concatenated js plugins and jQuery -->
        <script src="Assets/friendskit/assets/js/app.js"></script>

        <!-- Core js -->
        <script src="Assets/friendskit/assets/data/tipuedrop_content.js"></script>
        <script src="Assets/friendskit/assets/js/global.js"></script>
        <script src="Assets/friendskit/assets/js/main.js"></script>

        <!-- Page and UI related js -->
        <script src="Assets/friendskit/assets/js/signup.js"></script>
    </body>

</html>