package my.crud.ws.loginAuth;

import my.crud.domain.loginAuth.LoginAuth;
import my.crud.entity.login.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/login")
public class LoginRest {

    @Autowired
    LoginAuth loginAuth;

    @GetMapping("/all")
    public ResponseEntity<String> getAllPessoas() {
        List<Usuario> lstUsuario = loginAuth.findAllUsuario();
        return ResponseEntity.ok().body(lstUsuario.toString());
    }

    @PostMapping("/save")
    public Usuario saveUsuario(@RequestBody Usuario usuario){
        return loginAuth.saveUsuario(usuario);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUserById(@PathVariable(value = "id") Long id){
        loginAuth.deleteUserByID(id);
        return ResponseEntity.ok().body("Usuário excluido com sucesso");
    }
}
