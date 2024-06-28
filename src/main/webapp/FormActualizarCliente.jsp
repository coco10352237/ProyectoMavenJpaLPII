<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>actualizar cliente</title>
</head>
<body bgcolor="#c5dec9">
<h1 align="center">Actualizar Cliente</h1>

<form action="ControladorCliente" method="post">
<table align="center" border="2">
<!-- recuperamos los datos de la base de datos... -->
<%
String codigo=request.getAttribute("codigo").toString();
String nombre=(request.getAttribute("nombre") != null)?request.getAttribute("nombre").toString():"";
String apellido=(request.getAttribute("apellido") != null)?request.getAttribute("apellido").toString():"";
String dni=(request.getAttribute("dni") != null)?request.getAttribute("dni").toString():"";
String email=(request.getAttribute("email") != null)?request.getAttribute("email").toString():"";
String telf=(request.getAttribute("telf") != null)?request.getAttribute("telef").toString():"";
String sexo=(request.getAttribute("sexo") != null)?request.getAttribute("sexo").toString():"";
String nacio=(request.getAttribute("nacio") != null)?request.getAttribute("nacionalidad").toString():"";
%>

<tr>
<td><input type="hidden" name="codigo" value="<%=codigo%>">
</td>
</tr>
<tr>
<td>Nombre</td>
<td><input type="text" name="nombre" value="<%=nombre%>"></td>
</tr>
<tr>
<td>Apellido</td>
<td><input type="text" name="apellido" value="<%=apellido%>"></td>
</tr>
<tr>
<td>Dni</td>
<td><input type="text" name="dni" value="<%=dni%>"></td>
</tr>
<tr>
<td>Email</td>
<td><input type="text" name="email" value="<%=email%>"></td>
</tr>
<tr>
<td>Telefono</td>
<td><input type="text" name="telefono" value="<%=telf%>"></td>
</tr>
<tr>
<td>Sexo</td>
<td><input type="text" name="sexo"  value="<%=sexo%>"></td>
</tr>
<tr>
<td>Nacionalidad</td>
<td><input type="text" name="nacionalidad" value="<%=nacio%>"></td>
</tr>
<tr>
<td align="center" colspan="2">
<input type="submit" value="Actualizar Cliente">
</td>
</tr>
</table>
</form>
</body>
</html>