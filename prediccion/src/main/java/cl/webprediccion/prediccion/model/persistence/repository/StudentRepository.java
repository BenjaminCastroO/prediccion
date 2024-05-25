package cl.webprediccion.prediccion.model.persistence.repository;
import cl.webprediccion.prediccion.model.persistence.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
  boolean existsById(int id);
}
