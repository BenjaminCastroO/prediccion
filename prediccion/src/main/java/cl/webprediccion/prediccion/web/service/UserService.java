package cl.webprediccion.prediccion.web.service;

import cl.webprediccion.prediccion.model.domain.dto.UserDTO;

import java.util.List;
import java.util.Optional;

public interface UserService {
  Optional<List<UserDTO>> findAll();
  Optional<UserDTO> create(UserDTO userDTO);
  Optional<UserDTO> findById(int id);
}
