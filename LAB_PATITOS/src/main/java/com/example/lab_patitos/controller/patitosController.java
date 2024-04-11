package com.example.lab_patitos.controller;

import com.example.lab_patitos.entity.Juego;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("/patito_hule")
public class patitosController {

    @GetMapping("")
    public String mostrarJuego(){
        return "inicioJuego";
    }

    @PostMapping("/guardar")
    public String guardarDetallesCuadricula(Juego juego){
        return "jugandoJuego";
    }


    @GetMapping("/iniciarJuego")
    public String crearCuadricula(Model model){
        Juego juego = new Juego();
        model.addAttribute("juego", juego);
        return "jugandoJuego";
    }
}
