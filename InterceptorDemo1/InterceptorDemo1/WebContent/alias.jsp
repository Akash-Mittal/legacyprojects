<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html> 
	<head>
		<title><s:text name="app.title"/></title>
		</head>
	<body>
	<table align="center" width="70%" style="border: 2px solid red;">
	<tr>
	<td colspan="2"><s:actionerror/></td>
	</tr>
	<tr><td align="center" colspan="2">Enter Login ID and Password</td></tr>
	<tr><td align="left">
		<s:form action="aliasing" method="post">
		<s:textfield name="uname" key="app.loginid"/>
		<s:password name="pwd" key="app.password"/>
		<s:submit value="Enter"/>
		</s:form>
	</td>
	</tr>
	<tr><td align="center" colspan="2">
	<a href="index.jsp">B a c k</a></td>
	</tr>
	</table>		
	</body>
</html>

