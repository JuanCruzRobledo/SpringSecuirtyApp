package org.juanrobledo.springsecurityapp.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@PreAuthorize("denyAll()") //Trabajando con anotaciones, se tiene que poner en la @Configuracion de spring un @EnableMethodSecurity
public class TestAuthController {

    @GetMapping("/hello")
    @PreAuthorize("permitAll()")
    public String hello(){
        return "Hello World Not Secured";
    }

    @GetMapping("/helloSecured")
    @PreAuthorize("hasAuthority('WRITE')")
    public String helloSecured(){
        return "Hello World Secured";
    }
}
