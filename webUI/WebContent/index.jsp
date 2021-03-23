<!DOCTYPE html>
<html lang="en" >

<head>
  <meta charset="UTF-8">
  
  <title>Hackathon Login Form</title>
  
   
      <link rel="stylesheet" href="css/style.css">

  
</head>

<body>
<div class="wrapper1">

<h1>Hackathon Login Form</h1>
<form action="LoginController" method="post">
 </div>
  <div class="wrapper fadeInDown">
  <div id="formContent">
    <!-- Tabs Titles -->
    <h2 class="active"> SSO Login </h2>
    <h2 class="inactive underlineHover">Sign Up </h2>

    <!-- Login Form -->
   <input type="text" id="login" class="fadeIn second" name="username" placeholder="login">
      <input type="password" id="password" class="fadeIn third" name="password" placeholder="password">
      <!-- <input type="submit" class="fadeIn fourth" value="Login"> -->
<input type="submit" value="Login">

    <!-- Remind Passowrd -->
    <div id="formFooter">
      <a class="underlineHover" href="#">Forgot Password?</a>
    </div>

  </div>
</div>
  
  

</body>

</html>
