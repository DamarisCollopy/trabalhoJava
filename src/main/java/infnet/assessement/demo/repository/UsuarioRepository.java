package infnet.assessement.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository  extends JpaRepository<Usuario,Long>  {
    Usuario findByEmailAndSenha(String email, String senha);
    Usuario findByEmail(String email);

}
