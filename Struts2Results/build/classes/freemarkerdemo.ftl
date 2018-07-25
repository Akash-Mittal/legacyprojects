<html>
<head>
<title>Freemarker Page</title>
</head>
<body>
<h2>Freemarker Example</h2>
  <#if Request.name?exists>
      <p>Request attribute "name" set : <b>${Request.name}</b>
  <#else>
      <p>There is no request attribute "name".
  </#if>
  <br>
   <a href="index.jsp">Home</a><br>  
</body>
</html>

