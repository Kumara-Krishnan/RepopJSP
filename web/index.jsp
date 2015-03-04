<%-- 
    Document   : index
    Created on : Mar 22, 2014, 5:07:41 PM
    Author     : NIITSTUDENT
--%>
<%@page import="java.util.ArrayList" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Details</title>
    </head>
    <body>
        <%
        ArrayList<String> errors = (ArrayList<String>) request.getAttribute("err");
        String sname=request.getParameter("sname");
        String sno=request.getParameter("sno");
        String sage=request.getParameter("sage");
        sname=(sname==null)?"":sname;
        sno=(sno==null)?"":sno;
        sage=(sage==null)?"":sage;
         if (errors != null) {
                for (String e : errors) {%>
                    <%=e%><br/>
               <% }}%>
        <h1>Enter the user details</h1>
        <form action="Check.do" method="get">
            <%--Student name:<input type="text" id="sname" value="<%=sname%>"/><br/>
            Student phone no:<input type="text" id="sno" value="<%=sno%>"/><br/>
            Student age:<input type="text" id="sage" value="<%=sage%>"/><br/>
--%>
Student name:<input type="text" name="sname" value="<%=sname%>"/><br/>
            Student phone no:<input type="text" name="sno" value="<%=sno %>" /><br/>
            Student age:<input type="text" name="sage" value="<%= sage%>"/><br/>
<input type="submit" value="Register"/><br/>
        </form>
    </body>
</html>
