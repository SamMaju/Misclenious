<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"><html lang='en'>
  <head>
    <meta charset='UTF-8'/>
    <title>Hackathon Submission Form</title>
    <link rel="stylesheet" href="css/stylesSuccess.css">
    <link rel="stylesheet" href="css/style.css">
  </head>
  <body>
    <!-- <header class='hackathon-form-header'> -->
    
    <div class="wrapper fadeInDown">
  	<div id="formContent">
      <h1>Hackathon Pattern Search</h1>
      
     </header>
     <form action='SearchController' method='post' class='hackathon-form'>


<label for='bu' class="dropbtn">Business Unit</label>
  <select id='bu' class="drp" name='t-shirt'>
    <option value='xs'>REG</option>
    <option value='s'>REG1</option>
    <option value='m'>REG2</option>
    <option value='l'>REG3</option>
  </select>
  <br>

<label for='bu' class="dropbtn1">RuleSet </label>

  <select id='bu' class="drp1" name='t-shirt'>
    <option value='tr1'>Test Rule1</option>
    <option value='tr2'>Test Rule2</option>
    <option value='tr3'>Test Rule3</option>
    <option value='tr4'>Test Rule4</option>
  </select>
 <div>
  
  

<br>
  
  <textarea id='abstract' name='abstract'></textarea>
  <div class='instructions'></div>
  
  <input type="submit" value="Login">
  
  <div style="color: #FF0000;">${errorMessage}</div>
</div>
</div>
</form>
  </body>
</html>