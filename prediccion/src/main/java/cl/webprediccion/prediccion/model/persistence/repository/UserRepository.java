package cl.webprediccion.prediccion.model.persistence.repository;
import cl.webprediccion.prediccion.model.domain.dto.UserDTO;
import cl.webprediccion.prediccion.model.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
  boolean existsById(int id);
  Optional<UserEntity> findByUsername(String username);
}
