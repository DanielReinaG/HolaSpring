/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.HolaSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author danie
 */
@RestController
public class Controlador {
    @GetMapping("/")
    public String Mensaje(){
    return "Hola este es el mensaje ok";
    }
}
