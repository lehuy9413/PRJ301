<%-- 
    Document   : example03
    Created on : Feb 10, 2025, 8:17:48 AM
    Author     : lehuy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            for(int i =2; i<10; i++){
            
        %>
        <hr/>
        <h3> Bang Cuu Chuong <%=i%> </h3>
        <%
            for (int j =1; j <=10; j++){
            %>
            <b> <%=i%> * <%=j%> = <%=(i*j)%> </b> <br/>
            <%
            }
        }
    %>
    </body>
</html>
