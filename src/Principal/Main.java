package Principal;

import Vistas.*;
import Modelo.*;

        
public class Main {

    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        conexion.getConnection();
        //DatosModelDB datos = new DatosModelDB();
        //datos.getPuestosTrabajo(1);
        //datos.getSucursales();
        Login iniciosesion = new Login();
        iniciosesion.setVisible(true);
        
 
    }
    
}
