<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<script></script>
		<style type="text/css">
			table {
				margin: 20px auto;
				border-collapse: collapse;
				border: 1px solid black;
			}
			
			td {
				text-align: center;
				width: 500px;
				height: 50px;
			}
			
			.ss {
				text-align: center;
			}
			
			#88 {
				width: 400px;
			}
		</style>
	</head>

	<body>
		<form action="insert" method="post">
			<table>
				<tr>
					<th>
						<h1>新增产品</h1></th>
				</tr>
				<tr>
					<td>
						产品名称：<input type="text" name="productname" required="required" />
					</td>
				</tr>

				<tr>
					<td>
						描&nbsp;&nbsp;述：<input type="text" name="descs" required="required" />
					</td>
				</tr>

				<tr>
					<td>
						商品类别：
						<select style="width: 150px;" name="cid">
							<option value="1">数码产品</option>
							<option value="2">衣服鞋帽</option>
							<option value="3">书籍图书</option>
							<option value="4">家庭用品</option>
						</select>
					</td>
				</tr>
				<tr>
					<td class="ss">
						<input type="submit" value="提交" required="required" />
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
