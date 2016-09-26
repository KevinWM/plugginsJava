package controlador;


public class Instalaciones {

    private String nombre;
    private String caracteristicas;
    private String dimesion;

    public Instalaciones(String nombre, String caracteristicas, String dimesion) {
        this.nombre = nombre;
        this.caracteristicas = caracteristicas;
        this.dimesion = dimesion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getDimesion() {
        return dimesion;
    }

    public void setDimesion(String dimesion) {
        this.dimesion = dimesion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nCaracteristicas: " + caracteristicas + "\nDimesion: " + dimesion;
    }    
}

