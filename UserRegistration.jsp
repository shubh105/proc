<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>

<html>
<head>

 <style>
  
            body{


             background: grey;
             margin: 0 auto;
             font-family: arial;
            }

            h1{

             color: black;
             text-align: center;
            }
      label{

       color: #777;
       width: 10%;
       display: inline-block;

      }

      #container{


       padding: 20px;
       width: 60%;
       margin: 0 auto;
       margin-top: 1%;
       margin-bottom: 1%;
       background-color: white;
      }

   .userinput{

    padding-top: 7px;
    padding-bottom: 7px;
    padding-left: 5px;
    padding-right: 5px;
    margin-bottom: 30px;

   }
   label{

    color: brown;
    font-size: 14px;
   }
   textarea{
 color: brown;
    font-size: 14px;


   }

   select{

    color: brown;
   }
 

   .sampleBtn{
     
       background-color: #f1f1f1;
       width: 20%;
       height: 35px;
       font-size: 16px;

   }
   .sampleBtn:hover{

           background-color: #4CAF50; 
        color: white; 
        padding: 14px 20px; 
        margin: 8px 0; 
        border: none; 
        cursor: pointer; 
        width: 100%; 
          opacity: 0.8; 
   }
 </style>

</head>

<body>
<div id="container">
 <h1>Registration Form </h1>
 
 <form action="register">
 
  <div class="userinput">
   <label> First Name  </label>
   <input type="text" name="firstName" value="" />
  </div>
  
  <div class="userinput">
   <label> Last Name  </label>
   <input type="text" name="lastName" value="" />
  </div>
  
  <div class="userinput">
   <label> Password </label>   
   <input type="password" name="pass" value="" />
  </div>
  
  <div class="userinput">
   <label> Confirm Password </label>   
   <input type="password" name="cpass" value="" />
  </div>
  
  <div class="userinput">
   <label> Email </label>   
   <input type="text" name="email" value="" />
  </div>
  
  <div class="userinput">
   <label> Gender </label>
   <input type="radio" name="gender" value="m"/> Male
   <input type="radio" name="gender" value="f" /> Female    
  </div>
  
   <div class="userinput">
   <label>Role</label>
   <select name="role">
    <option value="1">Faculty</option>
    <option value="2">Candidate</option>
   </select>
  </div>
  
  <div class="userinput">
   <label> Institute Name </label>
   <input type="text" name="Iname" value="" />
  </div>
  
 
  
  <div style="text-align:center">
   <input type="reset" class="sampleBtn"/>
   <input type="submit" class="sampleBtn"/>   
  </div>
  
 </form>
 
 </div>
 
</body>

</html>
