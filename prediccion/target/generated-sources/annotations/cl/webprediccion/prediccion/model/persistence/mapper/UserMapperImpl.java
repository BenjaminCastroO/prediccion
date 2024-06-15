package cl.webprediccion.prediccion.model.persistence.mapper;

import cl.webprediccion.prediccion.model.domain.dto.UserDTO;
import cl.webprediccion.prediccion.model.persistence.entity.UserEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-14T14:50:10-0400",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO toUserDTO(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( userEntity.getId() );
        userDTO.setUsername( userEntity.getUsername() );
        userDTO.setPassword( userEntity.getPassword() );
        userDTO.setRol( userEntity.getRol() );

        return userDTO;
    }

    @Override
    public List<UserDTO> toUsersDTO(List<UserEntity> userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        List<UserDTO> list = new ArrayList<UserDTO>( userEntity.size() );
        for ( UserEntity userEntity1 : userEntity ) {
            list.add( toUserDTO( userEntity1 ) );
        }

        return list;
    }

    @Override
    public UserEntity toUserEntity(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setId( userDTO.getId() );
        userEntity.setUsername( userDTO.getUsername() );
        userEntity.setPassword( userDTO.getPassword() );
        userEntity.setRol( userDTO.getRol() );

        return userEntity;
    }
}
