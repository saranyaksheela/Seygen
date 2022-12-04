<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>View TimeSheets</title>
        <link href="/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
     <h1>TimeSheets</h1>
        <table>
            <thead>
                <tr>
                    <th>User</th>
                    <th>Hours</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${timesheets}" var="timesheet">
                    <tr>
                        <td>${timesheet.emailId}</td>
                        <td>${timesheet.hours}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>