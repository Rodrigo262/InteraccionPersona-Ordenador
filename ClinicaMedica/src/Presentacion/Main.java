package Presentacion;
import Dominio.*;
public class Main {
	public static void main(String[] args) {
		initialize();
		Login.main(null);
	}
	private static void initialize(){
		GestorMedicos.inicializarUsuarios();
		GestorPacientes.inicializarPacientes();
		GestorEspecialistas.inicializarEspecialistas();
	}
}
