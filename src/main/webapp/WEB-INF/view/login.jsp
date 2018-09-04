<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<html>
<head>
<title>Login Page</title>
</head>
<body>
    <h2 style="color: orange" align="center">Login to Rishtha Finance</h2>
   
    <form action="${pageContext.request.contextPath}/loginSuccess" method="post">
        <table frame="box" align="center" cellpadding="0" cellspacing="6">
            <tr>
                <td>Username:</td>
                <td><input type='text' name='username' /></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type='password' name='password'></td>
            </tr>
            <tr>
                <td colspan='2'><input name="submit" type="submit" value="Submit"></td>
            </tr>
        </table>
    </form>
</body>
</html>