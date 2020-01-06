<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link     href="<%=request.getContextPath() %>/css/index3.css"   rel="stylesheet"  type="text/css">
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.3.min.js"></script>
</head>
<script type="text/javascript">
	$(function() {
		var id=${param.id};
		$.post("col.do",{id:id},function(obj){
			$("[name=id]").val(obj.id);
			$("[name=name]").val(obj.name);
			$("[name=keyword]").val(obj.keyword);
			$("[name=year]").val(obj.year);
			$("[name=status]").val(obj.status);
			$("[name=desc]").val(obj.desc);
			$("[name=address]").val(obj.address);
			$("[name=money]").val(obj.money);
			$("[name=birth]").val(obj.birth);
			$("[name=bz]").val(obj.bz);
			
		},"json")
	})
	
	function upd() {
		var data=$("form").serialize();
		$.post("upd.do",data,function(res){
			if(res){
				alert("修改成功");
				location="list.do";
			}else{
				alert("修改失败");
			}
		},"json")
	}
</script>
<body>
<form>
<table>
	<tr>
		<td>编号</td>
		<td><input type="text" name="id" value="${param.id }"></td>
	</tr>
	<tr>
		<td>名称</td>
		<td><input type="text" name="name"></td>
	</tr>
	<tr>
		<td>主营产品</td>
		<td><input type="text" name="keyword"></td>
	</tr>
	<tr>
		<td>年检日期</td>
		<td><input type="date" name="year"></td>
	</tr>
	<tr>
		<td>年检状态</td>
		<td><select>
			<option value="通过">通过</option>
			<option value="未通过">未通过</option>
			<option value="待定">待定</option>
		</select></td>
	</tr>
	<tr>
		<td>描述</td>
		<td><input type="text" name="desc"></td>
	</tr>
	<tr>
		<td>地址</td>
		<td><input type="text" name="address"></td>
	</tr>
	<tr>
		<td>注册资本</td>
		<td><input type="text" name="money"></td>
	</tr>
	<tr>
		<td>成立时间</td>
		<td><input type="date" name="birth"></td>
	</tr>
	<tr>
		<td>备注</td>
		<td><input type="text" name="bz"></td>
	</tr>
	<tr>
		<td>提交</td>
		<td><input type="button" value="提交" onclick="upd()"></td>
	</tr>
</table>
</form>
</body>
</html>