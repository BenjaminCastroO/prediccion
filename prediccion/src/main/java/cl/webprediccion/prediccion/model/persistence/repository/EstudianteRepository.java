package cl.webprediccion.prediccion.model.persistence.repository;

import cl.webprediccion.prediccion.model.persistence.entity.Estudiante;
import org.hibernate.boot.archive.internal.JarProtocolArchiveDescriptor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
  boolean existsByestudianteid1(int id);
}
