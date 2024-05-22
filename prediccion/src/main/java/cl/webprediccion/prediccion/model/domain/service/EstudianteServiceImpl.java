package cl.webprediccion.prediccion.model.domain.service;

import cl.webprediccion.prediccion.model.domain.dto.Student;
import cl.webprediccion.prediccion.model.persistence.mapper.StudentMapper;
import cl.webprediccion.prediccion.model.persistence.repository.EstudianteRepository;
import cl.webprediccion.prediccion.web.service.EstudianteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
@AllArgsConstructor
@Service
public class EstudianteServiceImpl implements EstudianteService {
  private final EstudianteRepository repository;
  private final StudentMapper mapper;

  @Override
  public Optional<Student> create(Student student) {
    return Optional.of(mapper.toStudent(repository.save(mapper.toEstudiante(student))));
  }
}
