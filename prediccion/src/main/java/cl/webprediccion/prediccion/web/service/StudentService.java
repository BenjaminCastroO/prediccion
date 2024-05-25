package cl.webprediccion.prediccion.web.service;

import cl.webprediccion.prediccion.model.domain.dto.StudentDTO;

import java.util.List;
import java.util.Optional;

public interface StudentService {
  Optional<List<StudentDTO>> findAll();
  Optional<StudentDTO> create(StudentDTO studentDTO);
  Optional<StudentDTO> findById(int id);
}
