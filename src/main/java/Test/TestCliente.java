package Test;

import java.util.List;

import Dao.TblClienteImp;
import model.TblCliente;

public class TestCliente {

	public static void main(String[] args) {
		//realizamos las respectiva instancias..
		TblCliente cliente=new TblCliente();
		TblClienteImp crud=new TblClienteImp();
		//insertamos datos
		/*cliente.setNombre("alex");
		cliente.setApellido("rivera rivera");
		cliente.setDni("104534589");
		cliente.setEmail("alex@gmail.com");
		cliente.setTelf("387459");
		cliente.setSexo("M");
		cliente.setNacionalidad("colombia");
		//invocamos el metodo registrar...
		crud.RegistrarCliente(cliente);*/
		//****************testeamos el listado
		List<TblCliente> listado=crud.ListarCliente();
		//aplicamos un bucle
		for(TblCliente lis:listado){
			
			//imprimimos por pantalla
			System.out.println("codigo "+lis.getIdcliente()+
					" nombre "+lis.getNombre()+" apellido "+lis.getApellido()+" dni "+lis.getDni());
			
		}    //fin del bucle for...
		

	}//fin del metodo principal...

}   //fin de la clase...
