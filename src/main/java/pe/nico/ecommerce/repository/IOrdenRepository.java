package pe.nico.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.nico.ecommerce.model.Orden;
import pe.nico.ecommerce.model.Usuario;

@Repository
public interface IOrdenRepository extends JpaRepository<Orden, Integer>{
	List<Orden> findByUsuario(Usuario usuario);
}
