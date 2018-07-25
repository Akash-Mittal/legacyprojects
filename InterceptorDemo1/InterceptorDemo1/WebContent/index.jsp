<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Interceptor Demo Index</h1>
	<table align="center" width="900%" border="2" bordercolor="green">
		<tr>
			<td>
			<h2>Sruts 2 Interceptors</h2>
			</td>
		</tr>

		<tr>
			<td>
			<h2>alias -<s:a href="alias.jsp">Interceptor Example 1</s:a></h2>
			</td>
		</tr>
		<tr>
			<td><h2>exception, prepare, debugging, model-driven,<br>
			params,	conversionError, workflow -<s:a href="model.jsp">Interceptor Example 2</s:a>
			</h2>
			</td>
		</tr>
		<tr>
			<td>
			<h2>servlet-config, scoped-model-driven -
				<s:a href="servletAction.action">Interceptor Example 3</s:a>
				</h2>
			</td>
		</tr>
		<tr>
			<td>
			<h2>completeStack, execAndWait -
			<s:a href="longAction.action">Interceptor Example 4</s:a>
			</h2>
			</td>
		</tr>
		<tr>
			<td>
			<h2> basicStack, validation, workflow, scope - 
			<s:a href="login.jsp">Interceptor Example 5</s:a></h2>
			</td>
		</tr>
		<tr>
			<td><s:a href="UserInterceptorAction">Uder Defined Interceptor</s:a>
			</td>
		</tr>
		<tr>
			<td></td>
		</tr>
	</table>
</body>
</html>