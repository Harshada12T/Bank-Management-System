<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<center> <h1> Account Information </h1> </center>
<script type="text/javascript">
function depositMoney()
{
  document.fn.action="deposit.jsp";
  document.fn.submit();
}
function withdrawMoney()
{
  document.fn.action="withdraw.jsp";
  document.fn.submit();
}
</script>
</head>
<body>
<form name="fn">
         
         <table border="1" align="center">
         <tr>
         <th>Sr No</th>
         <th>Accountno</th>
         <th>Uname</th>
         <th>Pass</th>
         <th>Name</th>
         <th>Mobile</th>
         <th>Email</th>
         <th>Gender</th>
         <th>Age</th>
         <th>Balance</th>
         </tr>
                    <c:forEach items="${data}" var="acc"><br>
         
         <tr>
           <td><input type="radio" name="uid" value="${acc.accountno}"></td>
           <td>${acc.accountno}</td>
           <td>${acc.uname}</td>
           <td>${acc.pass}</td>
           <td>${acc.name}</td>
           <td>${acc.mobile}</td>
           <td>${acc.email}</td>
           <td>${acc.gender}</td>
           <td>${acc.age}</td>
           <td>${acc.balance}</td>
            </tr>
           </c:forEach>
           </table>
         <table border="2" align="center">
         
         <tr>
            
            <td><input type="button" value="DEPOSIT" onclick="depositMoney()"></td>
            
             <td><input type="button" value="WITHDRAW" onclick="withdrawMoney()"></td>
         
         </tr>
         
         
         </table>
         </form>
</body>
</html>
