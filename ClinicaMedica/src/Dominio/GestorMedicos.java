package Dominio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;


public class GestorMedicos {
	static ArrayList<Medico> medicos = new ArrayList<Medico>();
	public static void inicializarUsuarios(){
		Medico user1, user2;
		user1 = new Medico("00000000-A", "root", "Harold", "09/12/2016", "13:13:59",1,"/Imagenes/cara1.jpg");
		user2 = new Medico("11111111-B", "alumno", "Rodrigo", "15/12/2016", "16:22:14",2,"/Imagenes/cara2.jpg");
		medicos.add(user1);
		medicos.add(user2);
	}

	public static Medico autenticar(String medico, String password){
		Medico user = buscarMedico(medico);
		if(user == null)
			JOptionPane.showMessageDialog(null,"El usuario proporcionado no existe", "Error. Usuario no encontrado",JOptionPane.ERROR_MESSAGE);
		else{
			if(!user.getPassword().equals(password)){
				user = null;
				JOptionPane.showMessageDialog(null,"La contraseña proporcionada no es correcta", "Contraseña incorrecta",JOptionPane.ERROR_MESSAGE);
			}
		}
		return user;
	}

	public static Medico buscarMedico(String medico){
		Medico user = null;
		for (int i = 0; i < medicos.size(); i++){
			if(medicos.get(i).getUsuario().equals(medico))
				user = medicos.get(i);
		}	
		return user;
	}
	
	public static void actualizarInicioSesion(String medico){
		Medico u = buscarMedico(medico);
		Date fechaActual = new Date();
        DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaUltimoAcceso, horaUltimoAcceso;
        fechaUltimoAcceso = formatoFecha.format(fechaActual);
        horaUltimoAcceso = formatoHora.format(fechaActual);
        u.setFechaUltimoAcceso(fechaUltimoAcceso);
        u.setHoraUltimoAcceso(horaUltimoAcceso);
	}
}
