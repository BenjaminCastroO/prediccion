package cl.webprediccion.prediccion.model.domain.service;

import cl.webprediccion.prediccion.model.domain.dto.UserDTO;
import cl.webprediccion.prediccion.model.persistence.mapper.UserMapper;
import cl.webprediccion.prediccion.model.persistence.repository.UserRepository;
import cl.webprediccion.prediccion.web.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {
  private final UserRepository repository;
  private final UserMapper mapper;

  @Override
  public Optional<List<UserDTO>> findAll() {
    return Optional.of(mapper.toUsersDTO(repository.findAll()));
  }

  @Override
  public Optional<UserDTO> create(UserDTO userDTO) {
    return Optional.of(mapper.toUserDTO(repository.save(mapper.toUserEntity(userDTO))));
  }

  @Override
  public Optional<UserDTO> findById(int id) {
    return repository.findById(id).map(mapper::toUserDTO);
  }
}
