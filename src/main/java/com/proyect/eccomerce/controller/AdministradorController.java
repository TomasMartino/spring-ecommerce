package com.proyect.eccomerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/administrador")
public class AdministradorController {
    @GetMapping("")/*url*/
    public String home(){
        return  "administrador/home";/*pones direccion de la home del administrador en los archivos del proyect*/
    }/*5*/

}
