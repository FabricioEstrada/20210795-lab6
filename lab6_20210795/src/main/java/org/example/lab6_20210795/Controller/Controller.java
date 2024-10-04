package org.example.lab6_20210795.Controller;

import org.example.lab6_20210795.Repository.PeliculasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping({"peliculazzz", "peliculazzz/"})
public class Controller {
    @Autowired
    PeliculasRepository peliculasRepository;
    @GetMapping("/inicio")
    public String PaginaPrincipal() {
        return "paginaprincipal";
    }
    @GetMapping("/listaPelicula")
    public String ListaPeliculas(Model model) {
        model.addAttribute("listaPeliculas", peliculasRepository.findAll());
        return "listaPeliculas";
    }

}
