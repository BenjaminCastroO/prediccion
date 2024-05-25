package cl.webprediccion.prediccion.model.domain.service;

import cl.webprediccion.prediccion.model.domain.dto.StudentDTO;
import cl.webprediccion.prediccion.model.persistence.mapper.StudentMapper;
import cl.webprediccion.prediccion.model.persistence.repository.StudentRepository;
import cl.webprediccion.prediccion.web.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@AllArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {
  private final StudentRepository repository;
  private final StudentMapper mapper;

  @Override
  public Optional<List<StudentDTO>> findAll() {
    return Optional.of(mapper.toStudentsDTO(repository.findAll()));
  }

  @Override
  public Optional<StudentDTO> create(StudentDTO studentDTO) {
    return Optional.of(mapper.toStudentDTO(repository.save(mapper.toStudentEntity(studentDTO))));
  }

  @Override
  public Optional<StudentDTO> findById(int id) {
    return repository.findById(id).map(mapper::toStudentDTO);
  }
}
