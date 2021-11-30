<%--
  Created by IntelliJ IDEA.
  User: HOME
  Date: 11/14/2021
  Time: 7:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String error = (String) request.getAttribute("error");
%>
<%
    String dupli =(String)request.getAttribute("duplicate");
%>
<html>
<head>
    <link rel="stylesheet" href="./assets/css/signup.css">
    <link rel="stylesheet" href="./assets/font/fontawesome-free-5.15.4-web/css/all.min.css">
    <title>Title</title>
</head>
<body>
<div class="main">
    <div class="container">
        <form id="form" class="form" action="/lab5/doSignUp">
            <%
                if (error != null) {
            %>
            <div style="color: red ;font-weight: bold" class="fail">
                <%=error%>
            </div>
            <%
                }
            %>
            <%
                if (dupli != null) {
            %>
            <div style="color: red ;font-weight: bold" class="fail">
                <%=dupli%>
            </div>
            <%
                }
            %>


            <div class="header">
                <h3>Sign Up</h3>
            </div>
            <div class="user">
                <i class="fas fa-user"></i>
                <input type="text" placeholder="UserName" name="username"
                    <%
                    if(request.getParameter("username")!=null){
                        %>
                       value="<%=request.getParameter("username")%>"
                    <%}
                %>
                >

            </div>
            <div class="email">
                <i class="fas fa-pen"></i>
                <input type="text" placeholder="Email Address" name="email">

            </div>
            <div class="pass">

                <i class="fas fa-key"></i>
                <input id="ip-pass" type="password" placeholder="Password" name="password">
                <i class="icon-eyes fas fa-eye"></i>
            </div>
            <div class="pass">

                <i class="fas fa-key"></i>
                <input id="ip-pass1" type="password" placeholder="Confirm Password" name="confirm">
                <!-- <i class="icon-eyes fas fa-eye"></i> -->
            </div>
            <div class="rules">
                <input type="checkbox" name="rules" required>
                <p>I Agree To The Term & Conditions</p>
            </div>
            <div class="button">
                <input type="submit" value="Sign Up" readonly>
            </div>
            <!-- <div class="social">
                <p>Or Login with</p>
                <div class="icon-social">
                    <i class="fab fa-facebook-f"></i>
                    <i class="fab fa-google"></i>
                </div>
            </div> -->
            <div class="sign-up">
                <p>Dont have an Account ?</p>
                <a href="/lab5/signin.jsp">Sign In</a>
            </div>

        </form>
    </div>
</div>
<script src="./assets/js/signin.js"></script>
</body>
</html>
