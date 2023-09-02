package my.crud.loginExamplo.loginAuth;

import my.crud.loginExamplo.login.Usuario;
import my.crud.loginExamplo.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
