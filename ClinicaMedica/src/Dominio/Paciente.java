package Dominio;
public class Paciente {
	
	private String nss,id ,nombre, apellido,fechaN, sexo, alergias,intervenciones, observaciones;
	
	public Paciente(String nss, String id, String nombre, String apellido, String sexo, String fechaN, String alergias,
			String intervenciones, String observaciones) {
		super();
		this.nss = nss;
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.fechaN = fechaN;
		this.alergias = alergias;
		this.intervenciones = intervenciones;
		this.observaciones = observaciones;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public String getNss() {
		return nss;
	}
	public void setNns(String nss) {
		this.nss = nss;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getFechaN() {
		return fechaN;
	}
	public void setFechaN(String fechaN) {
		this.fechaN = fechaN;
	}
	public String getAlergias() {
		return alergias;
	}
	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}
	public String getIntervenciones() {
		return intervenciones;
	}
	public void setIntervenciones(String intervenciones) {
		this.intervenciones = intervenciones;
	}
	
	
	

	
	
	
	
	
}
