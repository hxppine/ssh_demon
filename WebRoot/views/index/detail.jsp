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
	
	<link rel="stylesheet" type="text/css" href="<%=basePath %>views/style/index/css/details.css">
	

  </head>
  <jsp:include page="head.jsp"/>
  <body>
    <div id="main">
		<div class='details'>
			<h1>${article.title }</h1>
			<div class='info'>
				<div class='base'>
					<!-- <f:formatDate value="${article.time}" type="both"/> -->
					<em>发表于<f:formatDate value="${article.time}" pattern="yyyy-MM-dd HH:mm:ss"/></em>, 分类：<strong><s:property value="article.cate.cname" /></strong>
				</div>
				<div class='tag'>
					标签:
					<a href="">作者</a>,
					<a href="articleCategory.action?cid=${article.cate.cid}"> <s:property value="article.cate.cname" /></a>
					<a href="">${article.cate.cname }</a>
				</div>
			</div>
			<div class='content'>
				 ${article.content }
			</div>
		</div>
		<jsp:include page="right.jsp"/>
	</div>
	<jsp:include page="foot.jsp"/>
	<s:fielderror fieldName="fielderror.test" theme="simple"></s:fielderror>
  </body>
</html>
