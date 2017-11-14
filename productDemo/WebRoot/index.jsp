<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
  </head>
  
  <body>
    <table border="1px">
    	<tr>
    		<td>产品名称</td>
    		<td>产品描述</td>
    		<td>类别</td>
    		<td>操作</td>
    	</tr>
    	<c:forEach items="${list }" var="l">
    	<tr>
    		<td>${l.productname }</td>
    		<td>${l.descs }</td>
    		<td>${l.getC().getName() }</td>
    		<td><a href="delete?id=${l.id }">删除</a></td>
    	</tr>
    	</c:forEach>
    </table>
    <a href="getAll?begin=1">首页</a>
    <a href="getAll?begin=${begin-1 }">上一页</a>
    <a href="getAll?begin=${begin+1 }">下一页</a>
    <a href="getAll?begin=${nums }">尾页</a>
    <a href="add.jsp">新增</a>
  </body>
</html>
