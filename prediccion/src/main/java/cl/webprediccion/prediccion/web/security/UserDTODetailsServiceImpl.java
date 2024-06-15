package cl.webprediccion.prediccion.web.security;

import cl.webprediccion.prediccion.model.domain.dto.UserDTO;
import cl.webprediccion.prediccion.model.persistence.entity.UserEntity;
import cl.webprediccion.prediccion.model.persistence.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class UserDTODetailsServiceImpl implements UserDetailsService {

  private final UserRepository repository;
  public UserDTODetailsServiceImpl(UserRepository repository) {
    this.repository = repository;
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Optional<UserEntity> userEntity = repository.findByUsername(username);
    if (userEntity.isPresent()){
      return new MyUserDTODetails(userEntity.get(),repository);
    }
    throw new UsernameNotFoundException("El usuario no existe!");
  }
}
