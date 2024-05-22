package cl.webprediccion.prediccion.model.persistence.mapper;
import cl.webprediccion.prediccion.model.domain.dto.Student;
import cl.webprediccion.prediccion.model.persistence.entity.Estudiante;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {
  @Mappings({
    @Mapping(source = "idestudiante1", target = "idestudiante1"),
    @Mapping(source = "nombre", target = "name"),
    @Mapping(source = "correo", target = "mail"),
    @Mapping(source = "celular", target = "celphone"),
    @Mapping(source = "edad", target = "age"),
    @Mapping(source = "genero", target = "gender"),
    @Mapping(source = "anioIngreso", target = "year"),
    @Mapping(source = "participacion", target = "participation"),
    @Mapping(source = "promedio", target = "average"),
    @Mapping(source = "aprobadas", target = "approbed"),
    @Mapping(source = "reprobadas", target = "repprobed"),
    @Mapping(source = "omitidas", target = "ommited"),
    @Mapping(source = "motivacion", target = "continuity"),
    @Mapping(source = "tiempoEstudio", target = "studyTime"),
    @Mapping(source = "tiempoDeporte", target = "sportTime"),
    @Mapping(source = "tiempoAmigos", target = "friendTime"),
    @Mapping(source = "tiempoHobby", target = "hobbyTime"),
    @Mapping(source = "estres", target = "stress"),
    @Mapping(source = "satisfaccion", target = "satisfaction"),
    @Mapping(source = "laboral", target = "employment"),
    @Mapping(source = "distancia", target = "travelTime")})
  Student toStudent(Estudiante estudiante);
  List<Student> toStudents(List<Estudiante> estudiante);
  @InheritInverseConfiguration
  Estudiante toEstudiante(Student student);
}
