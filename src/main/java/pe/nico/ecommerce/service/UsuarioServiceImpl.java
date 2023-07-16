package pe.nico.ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.nico.ecommerce.model.Usuario;
import pe.nico.ecommerce.repository.IUsuarioRepository;

@Service
public class UsuarioServiceImpl implements IUsuarioService{
	
	@Autowired
	private IUsuarioRepository usuarioRepository;
	
	
	
	@Override
	public Optional<Usuario> findById(Integer id) {
		
		return usuarioRepository.findById(id);
	}

	@Override
	public Usuario save(Usuario usuario) {
		
		return usuarioRepository.save(usuario);
	}

	@Override
	public Optional<Usuario> findByEmail(String email) {
		
		return usuarioRepository.findByEmail(email);
	}
	
}
