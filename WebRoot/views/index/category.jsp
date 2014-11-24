<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>文章管理系统-首页</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="<%=basePath %>views/style/index/css/category.css">
	

  </head>
  <jsp:include page="head.jsp"/>
  <body>
    <div id="main">
		<div class='news'>
			<c:forEach items="${list}" var="v">
			<div class='newsList'>
				<div class='newsImage'>
					<a href="articleDetail.action?aid=${v.aid }"><img src="${v.thumb }"/></a>
				</div>
				<div class='newsContent'>
					<h3><a href="articleDetail.action?aid=${v.aid }">${v.title }</a></h3>
					${v.summary }
					<a href="articleDetail.action?aid=${v.aid }" class='more'>更多>></a>
				</div>
			</div>
			</c:forEach>
		</div>
		<jsp:include page="right.jsp"/>
	</div>
	<jsp:include page="foot.jsp"/>
  </body>
</html>
