<%@taglib uri="/struts-tags" prefix="s"%><%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>XLT Demo</title>
</head>
<body>
<s:form action="action7" method="Post"><br>
<s:textfield key="name" label="Enter your name"/><br>
<s:textfield key="address" label="Enter your address"/><br>
<s:submit value="Submit"/><br>
</s:form>
</body>
</html>