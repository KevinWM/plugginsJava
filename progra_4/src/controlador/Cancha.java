package controlador;


public class Cancha extends Instalaciones {

    private String tipo;

    public Cancha(String tipo, String nombre, String caracteristicas, String dimesion) {
        super(nombre, caracteristicas, dimesion);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

