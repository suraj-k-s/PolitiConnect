<%-- 
    Document   : partyfund.jsp
    Created on : 9 Mar, 2024, 10:41:05 AM
    Author     : aksha
--%>
<%@page import="java.sql.ResultSet"%>
<jsp:useBean class="DB.ConnectionClass" id="con"></jsp:useBean>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add payment</title>
        <%@include file="SessionValidator.jsp" %>
        <%@include file="Header.jsp" %>
    </head><%
   if (request.getParameter("save") != null)
   {
       
       
       
        String insQry = "insert into party_fund (fund_title,fund_details,fund_amount)values('" + request.getParameter("title") + "','" + request.getParameter("details") + "','" + request.getParameter("amount") + "')";
                con.executeCommand(insQry);
   }
       %>
    <body>
        
        <h1><b>Add payment</b></h1>
   
        <form action="" method="POST">
            <center>
            <table border="2">
                <tr>
                    <td>Title</td>
                <td>
                    <input type="text" name="title">
                </td>
                </tr>
                <tr>
                <td>Details</td>
                <td><input type="text" name="details"> </td>
                </tr>
                <tr>
                    <td>Amount</td>
                <td><input type="int" name="amount"> </td>
                    
                </tr>
                <tr>
                    <td align="center" colspan="2">
                <input type="submit" name="save" value="submit">
                    </td>
                </tr>
                
                
                
                
                
            </table>
    </center>
            
            
            
            
            
            
            
            
        </form>
        
    </body>
</html>
