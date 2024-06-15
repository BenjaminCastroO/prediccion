package cl.webprediccion.prediccion.model.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="usuario")
public class UserEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name ="id")
  private int id;

  @Column(name="username")
  private String username;
  @Column(name="password")
  private String password;
  @Column(name="rol")
  private String rol;
}
