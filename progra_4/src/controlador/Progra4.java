
package controlador;
import vista.*;
import modelo.*;
import controlador.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Progra4 {
    
    public static Centro cenDep = new Centro("Veteranos 83");;
    
    public static void main(String[] args) {
        
        metodosBase met = new metodosBase();
        met.cargarListaSocio();
        
        met.cargarListaInstalacionesPiscina();
        met.cargarListaInstalacionesPista();
        met.cargarListaInstalacionesGym();
        met.cargarListaInstalacionesCancha();
        
        met.cargarListaArticulosBase();
        
        met.cargarListaReservaInstalacionesBase();
        met.cargarListaReservaArticuloInstalacionesBase();
        
        interfaz a = new interfaz();
        a.show();
    }
}
