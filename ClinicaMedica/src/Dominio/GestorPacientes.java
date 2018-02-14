package Dominio;
import Presentacion.General.*;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class GestorPacientes {
	static ArrayList<Paciente> pacientes =  new ArrayList<Paciente>();
	static SimpleDateFormat formatDate = null;
	
	
	public static void inicializarPacientes(){
		Paciente p1 ,p2;
		p1 = new Paciente("12345", "1", "Agustín", "Alcalde","Hombre","11-dic-1990", "Alérgia al olivo", "Cataratas", "Reposo absoluto");
		p2 = new Paciente("54321", "2","Pepa","Domínguez", "Mujer", "26-ene-1965","Alérgia polen", "Apendicitis", "Comidas sin Sal");
		pacientes.add(p1);
		pacientes.add(p2);

	}
	public static void anadirPaciente(Paciente paciente){
		if(pacientes.add(paciente))
			JOptionPane.showMessageDialog(null,"El Paciente con ID: " + paciente.getId() + " ha sido añadido correctamente", "El proceso de añadido ha terminado correctamente",JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null,"No se ha podido añadir el Paciente " + paciente.getId(), "Error al añadir",JOptionPane.ERROR_MESSAGE);
	}

	public static ArrayList<Paciente> getPaciente() {
		return pacientes;
	}

	public static Paciente buscarPaciente(String Nss){
		Paciente p = null;
		for(int i = 0; i < pacientes.size(); i++){
			if((pacientes.get(i).getNss()).equals(Nss))
				p = pacientes.get(i);
		}
		return p;
	}

	public static void eliminarPaciente(String ID){
		Paciente p = null;
		p = buscarPaciente(ID);
		if(p != null){
			if(pacientes.remove(p))
				JOptionPane.showMessageDialog(null,"El Paciente con ID: " + p.getId() + " ha sido eliminado correctamente", "El proceso de eliminación ha terminado correctamente",JOptionPane.INFORMATION_MESSAGE);
			else
				JOptionPane.showMessageDialog(null,"No se ha podido eliminar el paciente " + p.getId(), "Error al eliminar",JOptionPane.ERROR_MESSAGE);
		}else
			JOptionPane.showMessageDialog(null,"No existe el paciente con ID: " + p.getId(), "Error al encontrar Paciente",JOptionPane.ERROR_MESSAGE);
	}

	public static void modificarPaciente(Paciente p){
		for(int i = 0; i < pacientes.size(); i++){
			if(pacientes.get(i).getId().equals(p.getId()))
				if(pacientes.set(i, p) != null)
					JOptionPane.showMessageDialog(null,"El Paciente con ID: " + p.getId() + " ha sido modificado correctamente", "El proceso de modificacion ha terminado correctamente",JOptionPane.INFORMATION_MESSAGE);
				else
					JOptionPane.showMessageDialog(null,"No se ha podido modificar el paciente " + p.getId(), "Error al modificar",JOptionPane.ERROR_MESSAGE);

		}

	}
}