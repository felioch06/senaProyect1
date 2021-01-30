package dao;

import org.springframework.data.repository.CrudRepository;
import entities.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{

}
