package controlador.Plugins;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.reserva;
import controlador.*;
import java.sql.Array;

public class ReporteReservaHTML implements Interface{

    @Override
    public void cargar(Object o) {
        FileWriter filewriter = null;
        PrintWriter printw = null;
        
        ArrayList<Reserva> listaReserva = new ArrayList<Reserva>();
        listaReserva.addAll((ArrayList<Reserva>)o);
       
        try{
            filewriter = new FileWriter("reporte.html");//declarar el archivo
            printw = new PrintWriter(filewriter);//declarar un impresor

            printw.println("<html>");
            printw.println("<head><title>Lista de Reservas</title></head>");
            printw.println("<center><h1><font color=\"navy\">Lista de Reservas</font></h1></center>");

            printw.println("<table border=\"1\" style=\"width:100%\">");
            printw.println("<tr>\n" +
               "  <td><strong>Nombre de la Instalacion</strong></td>\n" +
               "  <td><strong>Fecha de la Reservacacion</strong></td>\n" +
               "  <td><strong>Hora Inicio</strong></td>\n" +
               "  <td><strong>Hora Fin</strong></td>\n" +
               "</tr>");
            for(int i = 0; i < listaReserva.size(); i++){
                String nombre = listaReserva.get(i).getNomInstalacion();
                String horaIni = listaReserva.get(i).getHoraInicio();
                String horaFin = listaReserva.get(i).getHoraFin();
                String fecha = listaReserva.get(i).getFecha();
                printw.println("  <tr>\n");
                printw.println("    <td>"+nombre+"</td>\n");
                printw.println("    <td>"+fecha+"</td>\n");
                printw.println("    <td>"+horaIni+"</td>\n");
                printw.println("    <td>"+horaFin+"</td>\n");
                printw.println("  </tr>\n");
            }
            printw.println("</table>");
            printw.println("</body>");
            printw.println("</html>");
            printw.close();
            System.out.println("Generado exitosamente");
           }   
        catch (IOException ex) {
                   Logger.getLogger(reserva.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
