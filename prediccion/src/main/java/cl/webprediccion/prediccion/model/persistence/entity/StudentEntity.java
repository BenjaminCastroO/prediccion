//probar si funciona sin mapear uno por uno ya que los campos se llaman igual
package cl.webprediccion.prediccion.model.persistence.entity;
import jakarta.persistence.*;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="estudiantes")
public class StudentEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name ="id")
  private int id;
  @Column(name="name")
  private String name;
  @Column(name="mail")
  private String mail;
  @Column(name="cellphone")
  private String cellphone;
  @Column(name="age")
  private int age;
  @Column(name="gender")
  private String gender;
  @Column(name="year")
  private int year;
  @Column(name="participation")
  private String participation;
  @Column(name="average")
  private double average;
  @Column(name="approved")
  private int approved;
  @Column(name="failed")
  private int failed;
  @Column(name="omitted")
  private int omitted;
  @Column(name="continuity")
  private int continuity;
  @Column(name="study_time")
  private int study_time;
  @Column(name="friend_time")
  private int friend_time;
  @Column(name="sport_time")
  private int sport_time;
  @Column(name="hobby_time")
  private int hobby_time;
  @Column(name="stress")
  private int stress;
  @Column(name="satisfaction")
  private int satisfaction;
  @Column(name="employment")
  private String employment;
  @Column(name="travel_time")
  private int travel_time;
}
