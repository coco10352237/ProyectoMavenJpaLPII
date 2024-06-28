package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.ICliente;
import model.TblCliente;

public class TblClienteImp implements ICliente{

	@Override
	public void RegistrarCliente(TblCliente cliente) {
		//establecemo conexion con la unidad de persistencia...
		EntityManagerFactory fabri=Persistence.createEntityManagerFactory("ProyectoMavenJpaLPII");
		//permite gestionar entidades..
		EntityManager eman=fabri.createEntityManager();
		//iniciar transaccion...
		eman.getTransaction().begin();
		//registramos
		eman.persist(cliente);
		//emitimos mensaje por pantalla
		System.out.println("cliente registrado en la base de datos");
		//confirmamos
		eman.getTransaction().commit();
		//cerramos la transaccion...
		eman.close();
		
	}

	@Override
	public void ActualizarCliente(TblCliente cliente) {
		//establecemos la conexion con la unidad de persistencia...
		EntityManagerFactory fab=Persistence.createEntityManagerFactory("ProyectoMavenJpaLPII");
		//permite gestionar entidades..
				EntityManager eman=fab.createEntityManager();
				//iniciar transaccion...
				eman.getTransaction().begin();
				//actualizamos
				eman.merge(cliente);
				//emitimos un mensaje por consola
				System.out.println("Data actualizado correctamente");
				//confirmamos
				eman.getTransaction().commit();
				//cerramos
				eman.close();
				
		
	}

	@Override
	public void EliminarCliente(TblCliente cliente) {
		//establecer conexion con la unidad de persistencia
		//establecemo conexion con la unidad de persistencia...
		EntityManagerFactory fabri=Persistence.createEntityManagerFactory("ProyectoMavenJpaLPII");
		//permite gestionar entidades..
	     EntityManager eman=fabri.createEntityManager();
		//iniciar transaccion...
	     eman.getTransaction().begin();
	     //recuperamos  el codigo a eliminar
	     TblCliente elim=eman.merge(cliente);
	     //procedemos a eliminar el cliente
	     eman.remove(elim);
	     //emitimos mensaje por consola
	     System.out.println("registro eliminado");
	     //confirmamos
	     eman.getTransaction().commit();
	     //cerramos
	     eman.close();
	
		
	}

	@Override
	public TblCliente BuscarCliente(TblCliente cliente) {
		//establecemos la conexion con la unidad de persistencia...
				EntityManagerFactory fab=Persistence.createEntityManagerFactory("ProyectoMavenJpaLPII");
				//permite gestionar entidades..
						EntityManager eman=fab.createEntityManager();
						//iniciar transaccion...
						eman.getTransaction().begin();
						//recuperamos el codigo a buscar...
						TblCliente buscliente=eman.find(TblCliente.class,cliente.getIdcliente());
						//confirmamos la transaccion
						eman.getTransaction().commit();
						//cerramos
						eman.close();
						//retornamos el cliente buscado
		               return buscliente;
	}

	@Override
	public List<TblCliente> ListarCliente() {
		//establecemos la conexion con la unidad de persistencia..
		EntityManagerFactory fab=Persistence.createEntityManagerFactory("ProyectoMavenJpaLPII");
		//gestionamos las entidades
		EntityManager  em=fab.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		//recuperamos la data de la base de datos
		List<TblCliente> listado=em.createQuery("select c from TblCliente c",TblCliente.class).getResultList();
		//confirmamos la transaccion
		em.getTransaction().commit();
		//cerramos
		em.close();
		//retornamos el listado
		return listado;
	}

	
}  //fin de la clase....
