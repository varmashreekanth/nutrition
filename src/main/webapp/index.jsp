<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<html>
<body>
	<form id="nutritionForm" name="nutritionForm" action="nutrition-details.do">
		<table> 
			<tr>
				<td>Name of the dish</td>
				<td><input name="foodItem" id="foodItem"/></td>
				<td><input type="submit" name="submit" id="submit" value="Submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>
