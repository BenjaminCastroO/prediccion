package cl.webprediccion.prediccion.model.persistence.entity;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="estudiante1")
public class Estudiante {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "idestudiante1")
  private int idestudiante1;

  @Column(name="nombre")
  private String nombre;

  @Column(name="correo")
  private String correo;

  @Column(name="celular")
  private String celular;

  @Column(name="edad")
  private int edad;

  @Column(name="genero")
  private String genero;

  @Column(name="anioIngreso")
  private int anioIngreso;

  @Column(name="participacion")
  private String participacion;

  @Column(name="promedio")
  private double promedio;

  @Column(name="aprobadas")
  private int aprobadas;

  @Column(name="reprobadas")
  private String reprobadas;

  @Column(name="omitidas")
  private String omitidas;

  @Column(name="motivacion")
  private String motivacion;

  @Column(name="tiempoEstudio")
  private String tiempoEstudio;

  @Column(name="tiempoDeporte")
  private String tiempoDeporte;

  @Column(name="tiempoAmigos")
  private String tiempoAmigos;

  @Column(name="tiempoHobby")
  private String tiempoHobby;

  @Column(name="estres")
  private String estres;

  @Column(name="satisfaccion")
  private String satisfaccion;

  @Column(name="laboral")
  private String laboral;

  @Column(name="distancia")
  private String distancia;
}
