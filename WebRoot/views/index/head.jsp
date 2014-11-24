<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<link rel="stylesheet" type="text/css" href="<%=basePath %>views/style/index/css/common.css" />
    <div id="top">
	</div>
	<div id="header">
		<div class='logo'>
			<a href=""><img src="<%=basePath %>views/style/index/images/logo.jpg" alt=""></a>
		</div>
		<div class='navigation'>
			<a href="articleIndex.action">首页</a>
			<c:forEach items="${cates}" var="cate">  			
	    		<a href="articleCategory.action?cid=${cate.cid }">${cate.cname }</a> 	
    		</c:forEach>
		</div>
		<div>
			<a href="logout.action">logout</a>
		</div>
	</div>


