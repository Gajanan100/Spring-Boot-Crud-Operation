<%@page import="java.util.List"%>
<%@page import="com.example.demo.entities.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
	color: #FFFFFF;
}

th, td {
	padding: 10px;
}

table {
	width: 70%;
	background-color: #CCCCFF;
}

table, tr, td, a {
font-family: sans-serif;
font-style: oblique;;
}
a{
font-size: 16px;
background-color:#5D6D7E;
border: 1px black solid;
padding: 3px;
color: #FFFFFF;


}

</style>

</head>
<body>
	<%
	List<Employee> list = (List<Employee>) request.getAttribute("Data");
	%>
	<div
		style="color: green; text-align: center; margin: 10px auto; padding: 5px;">
		<a style="background: #678CA4; font-size: 20px; color: white;"
			href="/"><button style="padding: 3px; background-color: #d13e98">Go
				to Back</button></a>

	</div>


	<table style="margin-left: auto; margin-right: auto;">
		<caption style="color: blue; font-size: 20px;">Employee Data</caption>
		<tr style="color: #FFFFFF; font-family: sans-serif; font-size: 18px;">
			<th>Employee_Id</th>
			<th>Employee_Name</th>
			<th>Employee_Pos</th>
			<th>Employee_Sal</th>
			<th>Delete_Emp</th>
			<th>Edit_Emp</th>

		</tr>

		<%
		for (Employee emp : list) {
		%>


		<tr>
			<td><%=emp.getEmp_id()%></td>
			<td><%=emp.getEmp_name()%></td>
			<td><%=emp.getPosition()%></td>
			<td><%=emp.getSalary()%></td>
			<td><a href="deleteEmp/<%=emp.getEmp_id()%>">deleteEmp</a></td>
			<td><a href="EditEmp/<%=emp.getEmp_id()%>">EditEmp</a></td>

		</tr>

		<%
		}
		%>
	</table>


</body>
</html>