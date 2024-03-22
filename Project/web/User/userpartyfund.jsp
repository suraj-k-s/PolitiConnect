<%-- 
    Document   : userpartyfund
    Created on : 9 Mar, 2024, 12:16:42 PM
    Author     : aksha
--%>
<%@page import="java.sql.ResultSet"%>
<jsp:useBean class="DB.ConnectionClass" id="con"></jsp:useBean>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Payment Schemes</title>
        <%@include file="SessionValidator.jsp" %>
        <%@include file="Header.jsp" %>

    </head><%        if (request.getParameter("pay") != null) {

            String insQry = "insert into tbl_payment(payment_date,payment_time,user_id,fund_id)values(curdate(),curtime(),'" + session.getAttribute("uid") + "','" + request.getParameter("pay") + "')";
            con.executeCommand(insQry);
            String sel = "select max(payment_id) as id from tbl_payment";
            ResultSet rsP = con.selectCommand(sel);
            if(rsP.next())
            {
                %>
                <script>
                    window.location="Payment.jsp?pay=<%=rsP.getString("id")%>";
                </script>
                <%
            }
            

        }


    %>

    <body >
        <div id="tab" align="center">
            <h1>payment schemes</h1>
            <form action="" method="POST">
                <table border="2" align="center">
                    <tr>
                        <td>S1.No</td>
                        <td>Title</td>
                        <td>Details</td>
                        <td>Amount</td>
                        <td>Action</td>
                    </tr>
                    <%                     int i = 0;
                        String selQry = "select * from party_fund";
                        ResultSet rs = con.selectCommand(selQry);
                        while (rs.next()) {
                            i++;
                    %>
                    <tr>
                        <td><%=i%></td>
                        <td><%=rs.getString("fund_title")%></td>
                        <td><%=rs.getString("fund_details")%></td>
                        <td><%=rs.getString("fund_amount")%></td>
                        <td><a href="userpartyfund.jsp?pay=<%=rs.getString("fund_id")%>" class="status_btn">Pay Now</a></td>
                    </tr>
                    <%     }
                    %>
                </table>
            </form>
        </div>
    </body>
    <%@include file="Footer.jsp" %>
</html>
