package Principal;

import Vistas.*;
import Modelo.*;

        
public class Main {

    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        conexion.getConnection();
        
        Login iniciosesion = new Login();
        iniciosesion.setVisible(true);
        System.out.println("hola mundo");
 
    }
    
}
