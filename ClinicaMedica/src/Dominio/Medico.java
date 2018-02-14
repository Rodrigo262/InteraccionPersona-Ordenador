package Dominio;
public class Medico{
	private String usuario, password, nombre, fechaUltimoAcceso, horaUltimoAcceso, imagen;
	

	private int ID;

	public Medico(String usuario, String password, String nombre, String fechaUltimoAcceso, String horaUltimoAcceso, int ID,String imagen){
		this.usuario = usuario;
		this.password = password;
		this.nombre = nombre;
		this.fechaUltimoAcceso = fechaUltimoAcceso;
		this.horaUltimoAcceso = horaUltimoAcceso;
		this.ID= ID;
		this.imagen=imagen;
	}
	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaUltimoAcceso() {
		return fechaUltimoAcceso;
	}

	public void setFechaUltimoAcceso(String fechaUltimoAcceso) {
		this.fechaUltimoAcceso = fechaUltimoAcceso;
	}

	public String getHoraUltimoAcceso() {
		return horaUltimoAcceso;
	}

	public void setHoraUltimoAcceso(String horaUltimoAcceso) {
		this.horaUltimoAcceso = horaUltimoAcceso;
	}

	public String getUltimoAcceso(){
		String ultimoAcceso = fechaUltimoAcceso + " a las " + horaUltimoAcceso;
		return ultimoAcceso;
	}
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
}