package cl.webprediccion.prediccion.model.domain.dto;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Student {
  private String mail;
  private String name;
  private String celphone;
  private int age;
  private String gender;

  private int continuity;
  private int studyTime;
  private int friendTime;
  private int sportTime;
  private int hobbyTime;

  private int stress;
  private int satisfaction;

  private String employment;
  private String travelTime;

  private int year;
  private int approbed;
  private int repprobed;
  private int ommited;
  private float average;
}
