package com.aluralatam.forohub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsiuarioController {
    @Autowired
    private IUsuarioRepository usuarioRepository;

    @PostMapping
    public void registrarUsuario(@RequestBody DatosUsuario datosUsuario){
        System.out.println("Registro llego");
        usuarioRepository.save(new Usuario(datosUsuario));

    }
}
