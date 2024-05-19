package cl.webprediccion.prediccion.web.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {



  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http)throws Exception{
    http.authorizeRequests()
            .requestMatchers("/capacitacion/**").hasAuthority("CLIENTE")
            .requestMatchers("/contacto/**").hasAuthority("CLIENTE")
            .requestMatchers("/usuario/**").hasAuthority("ADMINISTRATIVO")
            .requestMatchers("/cliente/**").hasAuthority("ADMINISTRATIVO")
            .requestMatchers("/profesional/**").hasAuthority("ADMINISTRATIVO")
            .requestMatchers("/administrativo/**").hasAuthority("ADMINISTRATIVO")
            .requestMatchers("/pago/**").hasAuthority("ADMINISTRATIVO")
            .requestMatchers("/visita").hasAuthority("PROFESIONAL")
            .requestMatchers("/chequeo").hasAuthority("PROFESIONAL")
            .requestMatchers("/api/cliente").hasAuthority("ADMINISTRATIVO")
            .and().httpBasic(Customizer.withDefaults())
            .formLogin().and().logout().logoutUrl("/logout").logoutSuccessUrl("/").invalidateHttpSession(true)
            .deleteCookies("JSESSIONID");
    return http.build();
  }
  @Bean
  public PasswordEncoder encoder(){
    return new BCryptPasswordEncoder();
  }



}
