package controlador;


import java.util.ArrayList;


public class Reserva {
    
    
    
    private String fecha;
    private String horaInicio;
    private String horaFin;
    private String nomInstalacion;
    private String cedulaSocio;
    private int costo;
    
    public ArrayList<ReservaArticulos> listaReservaArticulos = new ArrayList<ReservaArticulos>();

    public Reserva(String fecha, String horaInicio, String horaFin, String nomInstalacion, String cedulaSocio, int costo) {
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.nomInstalacion = nomInstalacion;
        this.cedulaSocio = cedulaSocio;
        this.costo = costo;
    }    

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getNomInstalacion() {
        return nomInstalacion;
    }

    public void setNomInstalacion(String nomInstalacion) {
        this.nomInstalacion = nomInstalacion;
    }

    public String getCedulaSocio() {
        return cedulaSocio;
    }

    public void setCedulaSocio(String cedulaSocio) {
        this.cedulaSocio = cedulaSocio;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public ArrayList<ReservaArticulos> getListaReservaArticulos() {
        return listaReservaArticulos;
    }

    public void setListaReservaArticulos(ArrayList<ReservaArticulos> listaReservaArticulos) {
        this.listaReservaArticulos = listaReservaArticulos;
    }
    
    
}

