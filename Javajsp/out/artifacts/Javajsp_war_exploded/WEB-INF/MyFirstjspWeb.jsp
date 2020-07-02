<%--
  Created by IntelliJ IDEA.
  User: 磊哥哥
  Date: 2020/5/22
  Time: 17:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    int count = 0;
    synchronized void count() {count++; }%>
<% count();
    out.println("这是第" + count + "个访问者!"); %>
</body>
</html>
