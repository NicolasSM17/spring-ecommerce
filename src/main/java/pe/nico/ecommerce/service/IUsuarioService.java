package pe.nico.ecommerce.service;

import java.util.Optional;

import pe.nico.ecommerce.model.Usuario;

public interface IUsuarioService {
	Optional<Usuario> findById(Integer id);
}