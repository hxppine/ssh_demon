<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div class='sidebar'>
	<div class='item'>
		<h2>文章标题</h2>
		<ul class='flink'>
			<c:forEach items="${rightArticles}" var="t">  			
	    		<li><a href="articleDetail.action?aid=${t.aid }">${t.title }</a></li> 	
    		</c:forEach>
		</ul>
	</div>	
</div>

