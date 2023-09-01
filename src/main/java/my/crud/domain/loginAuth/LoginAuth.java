package my.crud.domain.loginAuth;

import my.crud.entity.login.Usuario;
import my.crud.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoginAuth {

    UsuarioRepository usuarioRepository;

    public List<Usuario> findAllUsuario(){
        return usuarioRepository.findAll();
    }

    public Usuario saveUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public void deleteUserByID(Long id){
        usuarioRepository.deleteById(id);
    }
}
