package cl.webprediccion.prediccion.model.domain.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserDTO {
  private int id;
  private String username;
  private String password;
  private String rol;
}
