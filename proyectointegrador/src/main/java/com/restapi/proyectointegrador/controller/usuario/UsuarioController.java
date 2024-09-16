package com.restapi.proyectointegrador.controller.usuario;
import com.restapi.proyectointegrador.model.Usuario;
import com.restapi.proyectointegrador.service.ReservaServiceHash;
import com.restapi.proyectointegrador.service.UsuarioServiceHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioServiceHash usuarioService;

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return usuarioService.createUsuario(usuario);
    }

    @GetMapping("/{id}")
    public Optional<Usuario> getUsuario(@PathVariable String id) {
        return usuarioService.getUsuarioById(id);
    }

    @GetMapping
    public List<Usuario> getAllUsuarios() {
        return usuarioService.getAllUsuarios();
    }

    @PutMapping("/{id}")
    public Usuario updateUsuario(@PathVariable String id, @RequestBody Usuario usuario) {
        return usuarioService.updateUsuario(id, usuario);
    }

    @DeleteMapping("/{id}")
    public boolean deleteUsuario(@PathVariable String id) {
        return usuarioService.deleteUsuario(id);
    }
}
