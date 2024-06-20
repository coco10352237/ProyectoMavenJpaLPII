package Interfaces;

import java.util.List;

import model.TblCliente;

public interface ICliente {
	
	//declaramos los metodos
	public void RegistrarCliente(TblCliente cliente);
	public void ActualizarCliente(TblCliente cliente);
	public void EliminarCliente(TblCliente cliente);
	public TblCliente BuscarCliente(TblCliente cliente);
	public List<TblCliente> ListarCliente();

}   //fin de la interface icliente...
