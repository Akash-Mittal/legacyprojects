<%@taglib uri="/struts-tags" prefix="s"%><%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h2>User Registration</h2>
        <s:form action="register">
            <s:textfield name="email" label="Enter email address : "/>
            <s:password name="pwd" label="Enter your password : " />
            <s:submit value="Register" />
        </s:form>

</body>
</html>