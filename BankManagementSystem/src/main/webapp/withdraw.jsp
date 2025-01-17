<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="withdraw">
  <center> <h1>Withdraw Money</h1> </center>
  
    
            <center>
            <label for="accountno">Account Number:</label><br>
            <input type="number" id="accountno" name="accountno" required><br><br>

            
            <label for="amount">Withdraw Amount:</label><br>
            <input type="number" id="amount" name="amount" step="0.01" required><br><br>

            
            <input type="submit" value="Withdraw">
            </center>
    </form>
</body>
</html>