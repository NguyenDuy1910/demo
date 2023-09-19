<%--
  Created by IntelliJ IDEA.
  User: Quoc Duy
  Date: 9/18/2023
  Time: 9:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>

<%--</body>--%>
<%--</html>--%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="style/main.css">
</head>
<body>
<h1>Thanks for joining our email list</h1>
<p>That is information that you entered</p>

<label>Email:</label>
<span>${user.email}</span><br>
<label>Last Name:</label>
<span>${user.lastName}</span><br>
<label>First Name:</label>
<span>${user.firstName}</span><br>

<p>To enter another email address, click on the back button in your browser or the Return button shown below.</p>
<form action="" method="get">
    <input type="hidden" name="action" value="join">
    <input type="submit" value="Return">
</form>
</body>
</html>
