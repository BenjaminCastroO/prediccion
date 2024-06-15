//probar si es que funciona sin mapearlos uno por uno ya que los campos se
// llaman igual
package cl.webprediccion.prediccion.model.persistence.mapper;

import cl.webprediccion.prediccion.model.domain.dto.UserDTO;
import cl.webprediccion.prediccion.model.persistence.entity.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
  @Mappings({
          @Mapping(source = "id", target = "id"),
          @Mapping(source = "username", target = "username"),
          @Mapping(source = "password", target = "password"),
          @Mapping(source = "rol", target = "rol")})
  UserDTO toUserDTO(UserEntity userEntity);
  List<UserDTO> toUsersDTO(List<UserEntity> userEntity);
  @InheritInverseConfiguration
  UserEntity toUserEntity(UserDTO userDTO);
}
