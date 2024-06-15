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
  private int year;
  private String participation;
  private double average;
  private int approved;
  private int failed;
  private int omitted;
  private int continuity;
  private int study_time;
  private int friend_time;
  private int sport_time;
  private int hobby_time;
  private int stress;
  private int satisfaction;
  private String employment;
  private int travel_time;
}
