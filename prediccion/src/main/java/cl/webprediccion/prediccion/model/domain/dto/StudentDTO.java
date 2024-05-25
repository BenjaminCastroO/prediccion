package cl.webprediccion.prediccion.model.domain.dto;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class StudentDTO {
  private int id;
  private String name;
  private String mail;
  private String cellphone;
  private int age;
  private String gender;
  private double average;
}
