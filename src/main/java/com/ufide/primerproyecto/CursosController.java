package com.ufide.primerproyecto;

import org.apache.tomcat.util.buf.StringCache;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class CursosController {

    @GetMapping ("cursos")
    public String ListarCursos(Model modelo) {
        modelo.addAttribute("cursos", new String[]{"Java", "Phyton","JavaScript"});
        return "cursos";  
    }

    @GetMapping("cursos/{cursoId}")
    public String getMethodName(Model modelo, @PathVariable String cursoId) {  
        modelo.addAttribute("cursoId", cursoId);
        return "curso";
    }
    
    
}
