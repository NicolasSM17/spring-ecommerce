package pe.nico.ecommerce.service;

import java.util.List;

import pe.nico.ecommerce.model.Orden;
import pe.nico.ecommerce.model.Usuario;

public interface IOrdenService {
	List<Orden> findAll();
	Orden save(Orden orden);
	String generarNumeroOrden();
	List<Orden> findByUsuario(Usuario usuario);
}
