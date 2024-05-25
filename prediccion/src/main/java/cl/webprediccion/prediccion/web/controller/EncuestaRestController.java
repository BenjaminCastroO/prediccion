package cl.webprediccion.prediccion.web.controller;

import cl.webprediccion.prediccion.model.domain.dto.StudentDTO;
import cl.webprediccion.prediccion.web.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/encuesta")
public class EncuestaRestController {
  private final StudentService service;
  public EncuestaRestController(StudentService service){
    this.service=service;
  }
  @GetMapping
  public ResponseEntity<List<StudentDTO>> findAll(){
    return service.findAll().map(StudentDTO -> new ResponseEntity<>(StudentDTO, HttpStatus.OK))
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }
  @PostMapping("/create")
  public ResponseEntity<StudentDTO> create(@RequestBody StudentDTO studentDTO){
    System.out.println(studentDTO);
    return service.create(studentDTO)
            .map(t-> new ResponseEntity<>(t, HttpStatus.CREATED))
            .orElse(new ResponseEntity<>(HttpStatus.CONFLICT));
  }

}
