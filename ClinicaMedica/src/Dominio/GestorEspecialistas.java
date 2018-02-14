package Dominio;

import java.util.ArrayList;

public class GestorEspecialistas {
  static ArrayList<Especialista> ListaEspecialistas =  new ArrayList <Especialista>();
  
  public static void inicializarEspecialistas(){
    Especialista e1 = new Especialista("Javier", "Ruiz Mora", "javierruiz@gmail.com", "Lunes: De 9.00h a 11.30h","Traumotalogo", 660069627, 9876);
    Especialista e2 = new Especialista("Manuel", "Garcia Romero", "manoloGR@gmail.com", "Lunes: De 9.00h a 11.30h\nMartes: De 10.00h a 13.30h","Pediatría",
                      660067119, 9999);
    ListaEspecialistas.add(e1);
    ListaEspecialistas.add(e2);

  }
  public static ArrayList<Especialista> getEspecialista() {
    return ListaEspecialistas;
  }
  public static Especialista buscarEspecialista(int IDEspecialista){
    Especialista e = null;
    for(int i = 0; i < ListaEspecialistas.size(); i++){
      if((ListaEspecialistas.get(i).getIDEspecialista())==IDEspecialista)
        e = ListaEspecialistas.get(i);
    }
    return e;
  }

}