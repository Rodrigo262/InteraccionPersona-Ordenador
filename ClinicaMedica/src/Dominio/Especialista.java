package Dominio;

public class Especialista {
  
  private String nombreEspecialista, apellidosEspecialista, email, disponibilidad, especialidad;
  private int telefono, IDEspecialista;
  
  public Especialista(String nombre, String apellidos, String email, String disponibilidad, String especialidad, int telefono, int IDEspecialista) {
    this.nombreEspecialista = nombre;
    this.apellidosEspecialista = apellidos;
    this.email = email;
    this.disponibilidad = disponibilidad;
    this.especialidad = especialidad;
    this.telefono = telefono;
    this.IDEspecialista= IDEspecialista;
  }
  public String getNombreEspecialista() {
    return nombreEspecialista;
  }
  public String getApellidosEspecialista() {
    return apellidosEspecialista;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getDisponibilidad() {
    return disponibilidad;
  }
  public void setDisponibilidad(String disponibilidad) {
    this.disponibilidad = disponibilidad;
  }
  public String getEspecialidad() {
    return especialidad;
  }
  public void setEspecialidad(String especialidad) {
    this.especialidad = especialidad;
  }
  public int getTelefono() {
    return telefono;
  }
  public void setTelefono(int telefono) {
    this.telefono = telefono;
  }
  public int getIDEspecialista() {
    return IDEspecialista;
  }
  public void setIDEspecialista(int iDEspecialista) {
    IDEspecialista = iDEspecialista;
  }
  public void setNombreEspecialista(String nombreEspecialista) {
    this.nombreEspecialista = nombreEspecialista;
  }
  public void setApellidosEspecialista(String apellidosEspecialista) {
    this.apellidosEspecialista = apellidosEspecialista;
  }
  
  

}