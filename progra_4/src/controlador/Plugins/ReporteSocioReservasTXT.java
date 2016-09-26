/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.Plugins;

import controlador.*;
import static controlador.Progra4.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.reserva;


/**
 *
 * @author Jona_RV
 */
public class ReporteSocioReservasTXT implements Interface{

    @Override
    public void cargar(Object o) {
        FileWriter filewriter = null;
        PrintWriter printw = null;
        String nombre = "";
        String cedula = (String)o;
        
        int tam = cenDep.getListaSocios().size();
        for(int y = 0; y < tam; y++){
            if(cenDep.getListaSocios().get(y).getIdSocio().equals(cedula)){
                nombre = cenDep.getListaSocios().get(y).getNombre();
            }
        }
        
        try{
            filewriter = new FileWriter("reporte.txt");//declarar el archivo
            printw = new PrintWriter(filewriter);//declarar un impresor
            
            
            printw.println("                               Informe del Socio "+nombre+"");
            printw.println("");
            printw.println("");
            printw.println("");
            printw.println("");
            
            for(int i = 0; i < cenDep.getListaReserva().size(); i++){
                if(cenDep.getListaReserva().get(i).getCedulaSocio().equals(cedula)){
                    String nombreIns = cenDep.getListaReserva().get(i).getNomInstalacion();
                    String horaIni = cenDep.getListaReserva().get(i).getHoraInicio();
                    String horaFin = cenDep.getListaReserva().get(i).getHoraFin();
                    String fecha = cenDep.getListaReserva().get(i).getFecha();
                    
                    printw.println("Nombre de Instalacion:           "+nombreIns);
                    printw.println("Fecha:                           "+fecha);
                    printw.println("Hora Inicio:                     "+horaIni);
                    printw.println("Hora Final:                      "+horaFin);
                    printw.println();
                    printw.println();
                    
                    int tamRA = cenDep.getListaReserva().get(i).getListaReservaArticulos().size();
                    printw.println("  Articulos de la Reservacion");
                    for(int z = 0; z < tamRA; z++){
                        String nomArt = cenDep.getListaReserva().get(i).getListaReservaArticulos().get(z).getNombreArt();
                        String tipoArt = cenDep.getListaReserva().get(i).getListaReservaArticulos().get(z).getTipoArt();
                        int cantidad = cenDep.getListaReserva().get(i).getListaReservaArticulos().get(z).getCantidad();
                        int costo = cenDep.getListaReserva().get(i).getListaReservaArticulos().get(z).getCosto();
                        
                        
                        printw.println();
                        printw.println("Articulo:              "+nomArt);
                        printw.println("Categoria:             "+tipoArt);
                        printw.println("Cantidad:              "+cantidad);
                        printw.println("Costo:                 "+costo);
                    }
                }
            }
            printw.close();
            System.out.println("Generado exitosamente");
           }   
        catch (IOException ex) {
            Logger.getLogger(reserva.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
