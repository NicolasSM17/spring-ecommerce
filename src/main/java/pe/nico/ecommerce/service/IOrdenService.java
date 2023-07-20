package pe.nico.ecommerce.service;

import java.util.List;
import java.util.Optional;

import pe.nico.ecommerce.model.Orden;
import pe.nico.ecommerce.model.Usuario;

public interface IOrdenService {
	List<Orden> findAll();
	Optional<Orden> findById(Integer id);
	Orden save(Orden orden);
	String generarNumeroOrden();
	List<Orden> findByUsuario(Usuario usuario);
}
