package cl.webprediccion.prediccion.web.controller;

import cl.webprediccion.prediccion.model.domain.dto.StudentDTO;
import cl.webprediccion.prediccion.web.service.StudentService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/encuesta")
public class EncuestaController {
  private final StudentService service;
  private final EncuestaRestController encuestaRestController;

  public EncuestaController(StudentService service, EncuestaRestController encuestaRestController){
    this.encuestaRestController = encuestaRestController;
    this.service = service;
  }

  @GetMapping
    public String getEncuesta(Model model){
    String option = "c";
    model.addAttribute("option",option);
    return "encuesta";
  }
  @PostMapping
  public String create(@ModelAttribute StudentDTO studentDTO,
                       HttpServletRequest request){
    System.out.println("create"+studentDTO);
    encuestaRestController.create(studentDTO);
    return "redirect:/api/encuesta";
  }
  @GetMapping ("/list")
  public String listEncuesta(Model model){
    List<StudentDTO> studentsDTO = encuestaRestController.findAll().getBody();
    System.out.println(studentsDTO);
    model.addAttribute("studentsDTO",studentsDTO);
    return "listStudents";
  }

}


