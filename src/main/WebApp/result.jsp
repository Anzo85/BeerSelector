<%@ page import="java.util.*" %>
<html>
<body style="background-color:powderblue;">
<h1 align="center">Beer Recommendations </h1>
<h2>
  <%
     List styles = (List) request.getAttribute("styles");
     Iterator it = styles.iterator();
     while(it.hasNext()){
     out.print("<br> Try : " + it.next() );
   }

  %>




</body>
</html>