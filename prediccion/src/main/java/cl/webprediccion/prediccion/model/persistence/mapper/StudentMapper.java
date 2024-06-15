//probar si es que funciona sin mapearlos uno por uno ya que los campos se
// llaman igual
package cl.webprediccion.prediccion.model.persistence.mapper;
import cl.webprediccion.prediccion.model.domain.dto.StudentDTO;
import cl.webprediccion.prediccion.model.persistence.entity.StudentEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {
  /*@Mappings({
          @Mapping(source = "id", target = "id"),
          @Mapping(source = "name", target = "name"),
          @Mapping(source = "mail", target = "mail"),
          @Mapping(source = "cellphone", target = "cellphone"),
          @Mapping(source = "age", target = "age"),
          @Mapping(source = "gender", target = "gender"),
          @Mapping(source = "year", target = "year"),
          @Mapping(source = "participation", target = "participation"),
          @Mapping(source = "average", target = "average"),
          @Mapping(source = "approved", target = "approved"),
          @Mapping(source = "failed", target = "failed"),
          @Mapping(source = "omitted", target = "omitted"),
          @Mapping(source = "continuity", target = "continuity"),
          @Mapping(source = "study_time", target = "study_time"),
          @Mapping(source = "friend_time", target = "friend_time"),
          @Mapping(source = "sport_time", target = "sport_time"),
          @Mapping(source = "hobby_time", target = "hobby_time"),
          @Mapping(source = "stress", target = "stress"),
          @Mapping(source = "satisfaction", target = "satisfaction"),
          @Mapping(source = "employment", target = "employment"),
          @Mapping(source = "travel_time", target = "travel_time")})

   */
  @Mappings({})
  StudentDTO toStudentDTO(StudentEntity studentEntity);
List<StudentDTO> toStudentsDTO(List<StudentEntity> studentEntity);
  @InheritInverseConfiguration
  StudentEntity toStudentEntity(StudentDTO studentDTO);
}
