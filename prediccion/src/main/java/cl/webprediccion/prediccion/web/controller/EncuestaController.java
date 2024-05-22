package cl.webprediccion.prediccion.web.controller;

import cl.webprediccion.prediccion.model.domain.dto.Student;
import cl.webprediccion.prediccion.model.persistence.repository.EstudianteRepository;
import cl.webprediccion.prediccion.web.service.EstudianteService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/encuesta")
public class EncuestaController {
  private final EstudianteService service;

  public EncuestaController(EstudianteService service){
    this.service = service;
  }

  @GetMapping
    public String getEncuesta(){
      return "encuesta";
  }

  @PostMapping
    public String create(@ModelAttribute Student student,
                         HttpServletRequest request){

  }


}


