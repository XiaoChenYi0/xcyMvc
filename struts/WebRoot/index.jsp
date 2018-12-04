<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>index</title>
  </head>
  
  <body>
    <form action="<%=request.getContextPath()%>/user.do" method="post">
      name:<input type="text" name="name"/>
      pass:<input type="text" name="pass"/>
      <input type="submit"/>
    </form>
  </body>
</html>