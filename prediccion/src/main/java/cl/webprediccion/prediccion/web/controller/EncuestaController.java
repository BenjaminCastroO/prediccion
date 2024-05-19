package cl.webprediccion.prediccion.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/encuesta")
public class EncuestaController {
  @GetMapping
    public String getEncuesta(){
      return "encuesta";
  }
}


