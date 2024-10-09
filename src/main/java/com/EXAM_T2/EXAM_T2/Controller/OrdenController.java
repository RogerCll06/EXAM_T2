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

import com.EXAM_T2.EXAM_T2.Model.Orden;
import com.EXAM_T2.EXAM_T2.Service.OrdenService;

@Controller
@RequestMapping("/apiOrdenes")
public class OrdenController {

	  @Autowired
	    private OrdenService ordenService;

	  @GetMapping("/orden")
	    public String getAllOrdenes(Model model) {
	        List<Orden> ordenes = ordenService.getAllOrden();
	        model.addAttribute("ordenes", ordenes); 
	        return "orden"; 
	    }

	    @GetMapping("/nuevoOrden")
	    public String crearOrdenForm(Model model) {
	        model.addAttribute("orden", new Orden());
	        return "formorden"; 
	    }

	    @PostMapping("/GuardarOrden") 
	    public String saveOrden(@ModelAttribute Orden orden) {
	        ordenService.saveOrden(orden);
	        return "redirect:/apiOrdenes/orden"; 
	        
	    }

	    @GetMapping("/editar/{id}")
	    public String editarOrdenForm(@PathVariable Long id, Model model) {
	        Orden orden = ordenService.getOrdenById(id);
	        model.addAttribute("orden", orden);
	        return "formorden"; 
	    }

	    @GetMapping("/eliminar/{id}")
	    public String deleteOrden(@PathVariable Long id) {
	        ordenService.deleteOrden(id);
	        return "redirect:/apiOrdenes/orden"; 
	    }

}
