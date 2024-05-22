package cl.webprediccion.prediccion.web.service;

import cl.webprediccion.prediccion.model.domain.dto.Student;

import java.util.Optional;

public interface EstudianteService {
  Optional<Student> create(Student student);

}
