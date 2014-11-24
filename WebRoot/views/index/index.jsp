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
    
    <title>文章管理系统-首页</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="<%=basePath %>views/style/index/css/index.css" />
	

  </head>
  
  <body>
  <jsp:include page="head.jsp"/>
    <div id="main">
		<div class='content'>
			<div  class='list'>
				<div class='title'>
					<h2>最新文章..</h2>
				</div>
				<ul>
					<c:forEach items="${newArticles}" var="v">
					<li>
						<div class='post-image'>
							<span>
								<a href="articleDetail.action?aid=${v.aid }"><img width="" src="${v.thumb }" /></a>
							</span>	
						</div>	
						<div class='post-content'>
							<h3><a href="articleDetail.action?aid=${v.aid }">${v.title }</a></h3>
							${v.summary }
						</div>
					</li>
					</c:forEach>
				</ul>
			</div>
			<div  class='list'>
				<div class='title'>
					<h2>热门文章..</h2>
				</div>
				<ul>
					<c:forEach items="${hotArticles}" var="v">
					<li>
						<div class='post-image'>
							<span>
								<a href="articleDetail.action?aid=${v.aid }"><img width="" src="${v.thumb }" /></a>
							</span>	
						</div>	
						<div class='post-content'>
							<h3><a href="articleDetail.action?aid=${v.aid }">${v.title }</a></h3>
							${v.summary }
						</div>
					</li>
					</c:forEach>
				</ul>
			</div>
		</div>
		<jsp:include page="right.jsp"/>
	</div>
	<jsp:include page="foot.jsp"/>
  </body>
  <s:debug></s:debug>
</html>
