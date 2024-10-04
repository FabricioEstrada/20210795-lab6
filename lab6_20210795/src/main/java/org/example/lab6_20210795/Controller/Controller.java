package org.example.lab6_20210795.Controller;

import org.example.lab6_20210795.Entity.Peliculas;
import org.example.lab6_20210795.Repository.DirectoresRepository;
import org.example.lab6_20210795.Repository.PeliculasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@org.springframework.stereotype.Controller
@RequestMapping({"peliculazzz", "peliculazzz/"})
public class Controller {
    @Autowired
    PeliculasRepository peliculasRepository;
    @Autowired
    DirectoresRepository directoresRepository;

    @GetMapping("")
    public String PaginaPrincipal() {
        return "paginaprincipal";
    }

    @GetMapping("/listaPelicula")
    public String ListaPeliculas(Model model) {
        model.addAttribute("listaPeliculas", peliculasRepository.findAll());
        return "listaPeliculas";
    }

    @GetMapping("/listaDirectores")
    public String ListaDirectores(Model model) {
        model.addAttribute("listaDirectores", directoresRepository.findAll());
        return "listaDirectores";
    }
    @GetMapping("/deletePelicula")
    public String borrarPelicula(@RequestParam("id") int id,
                                      RedirectAttributes attr) {

        Optional<Peliculas> optionalPeliculas = peliculasRepository.findById(id);

        if (optionalPeliculas.isPresent()) {
            peliculasRepository.deleteById(id);
            attr.addFlashAttribute("msg", "Producto borrado exitosamente");
        }
        return "redirect:/peliculazzz/listaPeliculas";

    }
}
