package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.TblClienteImp;
import model.TblCliente;

/**
 * Servlet implementation class ControladorCliente
 */
public class ControladorCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorCliente() {
       // super();
        // TODO Auto-generated constructor stub
    }  //fin del constructor...

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		TblCliente 	cliente=new TblCliente();
		TblClienteImp crud=new TblClienteImp();
		List<TblCliente> listadocliente=crud.ListarCliente();
	
		//aplicamos un bucle
			/*	for(TblCliente lis:listadocliente){
					
					//imprimimos por pantalla
					System.out.println("codigo "+lis.getIdcliente()+
							" nombre "+lis.getNombre()+" apellido "+lis.getApellido()+" dni "+lis.getDni());
					
				}    //fin del bucle for...
				*/
		
		//asignamo el listado de clientes recuperados de la BD.
		request.setAttribute("listadoclientes",listadocliente);	
		//response.getWriter().append("Controlador Cliente ").append(request.getContextPath());
	   //redireccionamos
		request.getRequestDispatcher("/ListadoClientes.jsp").forward(request, response);
	
	}  //fin del metodo doget..

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//recuperamos los datos del formulario
		String nombre=request.getParameter("nombre");
		String apellido=request.getParameter("apellido");
		String dni=request.getParameter("dni");
		String email=request.getParameter("email");
		String telef=request.getParameter("telefono");
		String sexo=request.getParameter("sexo");
		String nacion=request.getParameter("nacionalidad");
		//instanciamos las respectivas clases...
		TblCliente cliente=new TblCliente();
		TblClienteImp crud=new TblClienteImp();
		//asignamos valores
		cliente.setNombre(nombre);
		cliente.setApellido(apellido);
		cliente.setDni(dni);
		cliente.setEmail(email);
		cliente.setTelf(telef);
		cliente.setSexo(sexo);
		cliente.setNacionalidad(nacion);
		//invocamos el metodo a registrar cliente en la bd
		crud.RegistrarCliente(cliente);
		//actualizar el listado
		List<TblCliente> listadocliente=crud.ListarCliente();
		//asignamo el listado de clientes recuperados de la BD.
	     request.setAttribute("listadoclientes",listadocliente);
		//redireccionamos hacia el listado de clientes...
		request.getRequestDispatcher("/ListadoClientes.jsp").forward(request, response);
	}  //fin del metodo dopost...

}
