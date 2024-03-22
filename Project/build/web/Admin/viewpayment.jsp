<%-- 
    Document   : viewpayment
    Created on : 9 Mar, 2024, 3:18:53 PM
    Author     : aksha
--%>
<%@page import="java.sql.ResultSet"%>
<jsp:useBean class="DB.ConnectionClass" id="con"></jsp:useBean>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>view paymentdetails</title>
        <%@include file="SessionValidator.jsp" %>
        <%@include file="Header.jsp" %>
        <%@include file="Footer.jsp" %>
    </head>
    <body>
        <h1>payments</h1>
        <body>
        
        
        <form action="" method="POST">
            <center>
            
            <table border="2">
                <tr>
                    <td>S1.No</td>
                    <td>username</td>
                    <td>Title</td>
                    <td>Details</td>
                    <td>Amount payed</td>
                    <td>Date payed</td>
                    
                    
                    </tr>
                
                
                
                
                
                 <%                          
                                     int i = 0;
                                     String selQry = "select * from tbl_payment c inner join tbl_user b on  c.user_id=b.user_id inner join party_fund a on a.fund_id=c.fund_id where payment_status='1'";
                                     ResultSet rs = con.selectCommand(selQry);
                                        while (rs.next()) {

                                                    i++;

                                            
                    %>
                <tr>
                    <td><%=i%></td>
                <td><%=rs.getString("user_name")%></td>
                
                
                
                <td><%=rs.getString("fund_title")%></td>
                
                
                    
                <td><%=rs.getString("fund_details")%></td>
                
                <td><%=rs.getString("fund_amount")%></td>
                
                <td><%=rs.getString("payment_date")%></td>
                <tr>
                
                 <%     }
                                                    %>
            
            
               </table>
            </center>
            
            
            
        </form>
                 
    </body>
</html>
