<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link     href="<%=request.getContextPath() %>/css/index3.css"   rel="stylesheet"  type="text/css">
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.3.min.js"></script>
</head>
<script type="text/javascript">
	function fenye(currentPage) {
		$("[name=currentPage]").val(currentPage);
		$("form").submit();
	}
	
	function upd(id) {
		location="update.jsp?id="+id;
	}
</script>
<body>
<form action="list.do" method="post">
	<input type="hidden" name="currentPage" value="${currentPage }">
	编号：<input type="text" name="con.id" value="${con.id }">
	描述：<input type="text" name="con.desc" value="${con.desc }">
	名称：<input type="text" name="con.name" value="${con.name }">
	主营商品：<input type="text" name="con.keyword" value="${con.keyword }">
	上市金额：<input type="text" name="con.minMen" value="${con.minMen }">
	<input type="text" name="con.maxMen" value="${con.maxMen }">
	年检日期：<input type="date" name="con.ymin" value="${con.ymin }">
	<input type="date" name="con.ymax" value="${con.ymax }">
	上市日期：<input type="date" name="con.bmin" value="${con.bmin }">
	<input type="date" name="con.bmax" value="${con.bmax }">
	<button>查询</button>
</form>
<table>
	<tr>
		<td>编号</td>
		<td>描述</td>
		<td>名称</td>
		<td>主营产品</td>
		<td>地址</td>
		<td>上市金额</td>
		<td>年检日期</td>
		<td>状态</td>
		<td>备注</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${list }" var="l">
		<tr>
			<td>${l.id }</td>
			<td>${l.desc }</td>
			<td>${l.name }</td>
			<td>${l.keyword }</td>
			<td>${l.address }</td>
			<td>${l.birth }</td>
			<td>${l.year }</td>
			<td>${l.status }</td>
			<td>${l.bz }</td>
			<td><input type="button" value="修改" onclick="upd(${l.id})"> </td>
		</tr>
	</c:forEach>
	<tr>
		<td colspan="10">
			<button onclick="fenye(1)">首页</button>
			<button onclick="fenye(${pageInfo.prePage==0?1:pageInfo.prePage})">上一页</button>
			<button onclick="fenye(${pageInfo.nextPage==0?pageInfo.pages:pageInfo.nextPage})">下一页</button>
			<button onclick="fenye(${pageInfo.pages})">尾页</button>
			第${pageInfo.pageNum }/${pageInfo.pages }页，共${pageInfo.total }条
		</td>
	</tr>
</table>
</body>
</html>