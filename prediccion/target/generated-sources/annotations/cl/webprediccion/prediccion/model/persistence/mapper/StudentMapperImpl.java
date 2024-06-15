package cl.webprediccion.prediccion.model.persistence.mapper;

import cl.webprediccion.prediccion.model.domain.dto.StudentDTO;
import cl.webprediccion.prediccion.model.persistence.entity.StudentEntity;
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
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentDTO toStudentDTO(StudentEntity studentEntity) {
        if ( studentEntity == null ) {
            return null;
        }

        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setId( studentEntity.getId() );
        studentDTO.setName( studentEntity.getName() );
        studentDTO.setMail( studentEntity.getMail() );
        studentDTO.setCellphone( studentEntity.getCellphone() );
        studentDTO.setAge( studentEntity.getAge() );
        studentDTO.setGender( studentEntity.getGender() );
        studentDTO.setYear( studentEntity.getYear() );
        studentDTO.setParticipation( studentEntity.getParticipation() );
        studentDTO.setAverage( studentEntity.getAverage() );
        studentDTO.setApproved( studentEntity.getApproved() );
        studentDTO.setFailed( studentEntity.getFailed() );
        studentDTO.setOmitted( studentEntity.getOmitted() );
        studentDTO.setContinuity( studentEntity.getContinuity() );
        studentDTO.setStudy_time( studentEntity.getStudy_time() );
        studentDTO.setFriend_time( studentEntity.getFriend_time() );
        studentDTO.setSport_time( studentEntity.getSport_time() );
        studentDTO.setHobby_time( studentEntity.getHobby_time() );
        studentDTO.setStress( studentEntity.getStress() );
        studentDTO.setSatisfaction( studentEntity.getSatisfaction() );
        studentDTO.setEmployment( studentEntity.getEmployment() );
        studentDTO.setTravel_time( studentEntity.getTravel_time() );

        return studentDTO;
    }

    @Override
    public List<StudentDTO> toStudentsDTO(List<StudentEntity> studentEntity) {
        if ( studentEntity == null ) {
            return null;
        }

        List<StudentDTO> list = new ArrayList<StudentDTO>( studentEntity.size() );
        for ( StudentEntity studentEntity1 : studentEntity ) {
            list.add( toStudentDTO( studentEntity1 ) );
        }

        return list;
    }

    @Override
    public StudentEntity toStudentEntity(StudentDTO studentDTO) {
        if ( studentDTO == null ) {
            return null;
        }

        StudentEntity studentEntity = new StudentEntity();

        studentEntity.setId( studentDTO.getId() );
        studentEntity.setName( studentDTO.getName() );
        studentEntity.setMail( studentDTO.getMail() );
        studentEntity.setCellphone( studentDTO.getCellphone() );
        studentEntity.setAge( studentDTO.getAge() );
        studentEntity.setGender( studentDTO.getGender() );
        studentEntity.setYear( studentDTO.getYear() );
        studentEntity.setParticipation( studentDTO.getParticipation() );
        studentEntity.setAverage( studentDTO.getAverage() );
        studentEntity.setApproved( studentDTO.getApproved() );
        studentEntity.setFailed( studentDTO.getFailed() );
        studentEntity.setOmitted( studentDTO.getOmitted() );
        studentEntity.setContinuity( studentDTO.getContinuity() );
        studentEntity.setStudy_time( studentDTO.getStudy_time() );
        studentEntity.setFriend_time( studentDTO.getFriend_time() );
        studentEntity.setSport_time( studentDTO.getSport_time() );
        studentEntity.setHobby_time( studentDTO.getHobby_time() );
        studentEntity.setStress( studentDTO.getStress() );
        studentEntity.setSatisfaction( studentDTO.getSatisfaction() );
        studentEntity.setEmployment( studentDTO.getEmployment() );
        studentEntity.setTravel_time( studentDTO.getTravel_time() );

        return studentEntity;
    }
}
