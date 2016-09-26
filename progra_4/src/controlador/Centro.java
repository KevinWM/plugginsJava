package controlador;


import java.util.ArrayList;
import vista.reserva;


public class Centro {

    private String nombre;
    private ArrayList<Socios> listaSocios = new ArrayList<Socios>();
    private ArrayList<Reserva> listaReserva = new ArrayList<Reserva>();
    private ArrayList<Instalaciones> listaInstalaciones = new ArrayList<Instalaciones>();
    private ArrayList<Articulo> listaArticulos = new ArrayList<Articulo>();

    public Centro (String nombre) {
        this.nombre=nombre;
    }

    public String getNombre () {
        return nombre;
    }

    
    public void setNombre (String val) {
        this.nombre = val;
    }

    public ArrayList<Socios> getListaSocios() {
        return listaSocios;
    }

    public void setListaSocios(ArrayList<Socios> listaSocios) {
        this.listaSocios = listaSocios;
    }

    public ArrayList<Reserva> getListaReserva() {
        return listaReserva;
    }

    public void setListaReserva(ArrayList<Reserva> listaReserva) {
        this.listaReserva = listaReserva;
    }

    public ArrayList<Instalaciones> getListaInstalaciones() {
        return listaInstalaciones;
    }

    public void setListaInstalaciones(ArrayList<Instalaciones> listaInstalaciones) {
        this.listaInstalaciones = listaInstalaciones;
    }

    public ArrayList<Articulo> getListaArticulos() {
        return listaArticulos;
    }

    public void setListaArticulos(ArrayList<Articulo> listaArticulos) {
        this.listaArticulos = listaArticulos;
    }
    
}

