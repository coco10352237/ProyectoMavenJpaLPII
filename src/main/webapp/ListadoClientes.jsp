<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="java.util.*" %>
   <%@page import="model.TblCliente" %>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core"   prefix="c" %> 
   <%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de Clientes</title>
</head>
<body bgcolor="#c5dec9">
<h1 align="center">Listado de Clientes</h1>
<h2 align="center">
<a  href="RegistrarCliente.jsp" style="text-decoration:none">Registrar Cliente</a>
</h2>
<table align="center" border="2">
<tr>
<td>Codigo</td>
<td>Nombre</td>
<td>Apellido</td>
<td>Dni</td>
<td>Email</td>
<td>Telef</td>
<td>Sexo</td>
<td>Nacionalidad</td>
</tr>
<%
List<TblCliente> listadocliente=(List<TblCliente>)request.getAttribute("listadoclientes");
if(listadocliente!=null){
	
for(TblCliente lis:listadocliente){
%>
<tr>
<td>
<%=lis.getIdcliente()%>
</td>
<td>
<%=lis.getNombre()%>
</td>
<td>
<%=lis.getApellido() %>
</td>
<td>
<%=lis.getDni() %>
</td>
<td>
<%=lis.getEmail() %>
</td>
<td>
<%=lis.getTelf() %>
</td>
<td>
<%=lis.getSexo() %>
</td>
<td>
<%=lis.getNacionalidad() %>
</td>
</tr>
<%
      }//cerramos la condicion...
}   //cerramos el bucle
%>
</table>

</body>
</html>