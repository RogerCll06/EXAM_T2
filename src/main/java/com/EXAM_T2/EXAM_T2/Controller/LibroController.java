package com.EXAM_T2.EXAM_T2.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EXAM_T2.EXAM_T2.Model.Libro;
import com.EXAM_T2.EXAM_T2.Service.LibroService;

@Controller
@RequestMapping("/apiLibro")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping("/libro")
    public String getAllLibros(Model model) {
        List<Libro> libros = libroService.getAllLibros();
        model.addAttribute("libros", libros); 
        return "libro"; 
    }

    @GetMapping("/nuevoLibro")
    public String crearLibroForm(Model model) {
        model.addAttribute("libro", new Libro());
        return "formlibro"; 
    }

    @PostMapping("/GuardarLibro") 
    public String saveLibro(@ModelAttribute Libro libro) {
        libroService.saveLibro(libro);
        return "redirect:/apiLibro/libro"; 
    }

    @GetMapping("/editar/{id}")
    public String editarLibroForm(@PathVariable Long id, Model model) {
        Libro libro = libroService.getLibroById(id);
        model.addAttribute("libro", libro);
        return "formlibro"; 
    }

    @GetMapping("/eliminar/{id}")
    public String deleteLibro(@PathVariable Long id) {
        libroService.deleteLibro(id);
        return "redirect:/apiLibro/libro"; 
    }
	  
	   
}
