<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head><title><s:text name="app.title"/></title>
</head>
<body> 
	<s:include value="header.jsp"/>	
	<br><br><b>Running Action and its result</b><br><br>
	<s:action name="personAction" executeResult="true"/>	
	
	<br><br><b>Using bean tag</b><br><br>
	<s:bean name="pkg1.actions.PersonAction">
	<hr>
	<s:property value="name"/><br>
	<s:property value="address"/><br>
	<s:property value="city"/><br>
		<s:param name="name">Col. Surendra Patnaik</s:param>
		<s:param name="address">A-65, Greater Noida</s:param>
		<s:param name="city">Greater Noida</s:param>
		User's Name: <s:property value="name"/><br><br>
		Address: <s:property value="address"/><br></br>
		City: <s:property value="city"/>
	</s:bean>
	<br>
	<a href="index.jsp">Home</a>
	<s:include value="footer.jsp"/>			
	</body>	
</html>



