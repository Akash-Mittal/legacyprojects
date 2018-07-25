<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head><title><s:text name="app.title"/></title>
</head>
 <body>
 <h1><s:text name="app.heading"/><br>
 
  <s:url id="url1" action="action1"/>
  <s:a href="${url1}">Result - dispatcher</s:a>

  <br><br>
  <s:url id="url2" action="action2"/>
  <s:a href="${url2}">Result - chain</s:a>
  
  <br><br>
  <s:url id="url3" action="action3"/>
  <s:a href="${url3}">Result - redirect</s:a>
  
  <br><br>
  <s:url id="url4" action="action4"/>
  <s:a href="${url4}">Result -  redirect-action</s:a>
   
  <br><br>
  <s:url id="url5" action="action5"/>
  <s:a href="${url5}">Result - freemarker</s:a>
    
  <br><br>
  <s:url id="url6" action="action6"/>
  <s:a href="${url6}">Result - (User Defined)myresult</s:a>
  
    <br><br>
 <a href=XSLTDemo.jsp>XSLT Demo</a>
  
</h1> 
 </body> 
</html>
