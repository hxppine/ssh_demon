<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>文章管理系统-登陆</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="<%=basePath %>views/style/index/css/index.css" />
	

  </head>
  
  <body>
  <h3> <s:if test="#tip != null"><s:property value="#tip" /></s:if> </h3>
  <jsp:include page="head.jsp"/>
    <div id="main">
    	<form action="checkLogin.action" method="post">
	    	username:<input type="text" name="user.name" value="">
	    	<br/>
	    	password:<input type="text" name="user.password" value="">
	    	<input type="submit" value="login-in"/>
    	</form>
	</div>
	<jsp:include page="foot.jsp"/>
  </body>
  <s:debug></s:debug>
</html>
