package controlador;


public class ReservaArticulos {

    
    private String cedulaSocio;
    private String nombreArt;  
   private String tipoArt;
    private String fecha;
    private int cantidad;
    private int costo;

    public ReservaArticulos(String cedulaSocio, String nombreArt, String tipoArt, String fecha, int cantidad, int costo) {
        
        this.cedulaSocio = cedulaSocio;
        this.nombreArt = nombreArt;
        this.tipoArt = tipoArt;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.costo = costo;
    }


    public String getCedulaSocio() {
        return cedulaSocio;
    }

    public void setCedulaSocio(String cedulaSocio) {
        this.cedulaSocio = cedulaSocio;
    }

    public String getNombreArt() {
        return nombreArt;
    }

    public void setNombreArt(String nombreArt) {
        this.nombreArt = nombreArt;
    }

    public String getTipoArt() {
        return tipoArt;
    }

    public void setTipoArt(String tipoArt) {
        this.tipoArt = tipoArt;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
 
   
}

