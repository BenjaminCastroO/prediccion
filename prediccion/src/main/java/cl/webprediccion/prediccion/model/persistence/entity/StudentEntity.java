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
@Table(name="estudiante")
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
  @Column(name="average")
  private double average;
}
