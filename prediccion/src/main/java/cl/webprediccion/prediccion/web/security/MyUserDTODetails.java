package cl.webprediccion.prediccion.web.security;


import cl.webprediccion.prediccion.model.domain.dto.UserDTO;
import cl.webprediccion.prediccion.model.persistence.entity.UserEntity;
import cl.webprediccion.prediccion.model.persistence.repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class MyUserDTODetails implements UserDetails {

  private final UserEntity userEntity;
  private final UserRepository repository;
  public MyUserDTODetails(UserEntity userEntity, UserRepository repository) {
    this.userEntity = userEntity;
    this.repository = repository;
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    String rol="";
    if (repository.existsById(userEntity.getId()))
    {
      rol = "EQUIPO";
      System.out.println(rol);
    }
    else {
      rol = "ESTUDIANTE";
      System.out.println(rol);
    }
    SimpleGrantedAuthority authority = new SimpleGrantedAuthority(rol);
    return List.of(authority);
  }

  @Override
  public String getPassword() {
    return userEntity.getPassword();
  }

  @Override
  public String getUsername() {
    return userEntity.getUsername();
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }
}