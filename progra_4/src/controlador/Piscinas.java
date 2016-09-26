package controlador;



public class Piscinas extends Instalaciones {

    private int profundidad;
    private int carriles;

    public Piscinas(int profundidad, int carriles, String nombre, String caracteristicas, String dimesion) {
        super(nombre, caracteristicas, dimesion);
        this.profundidad = profundidad;
        this.carriles = carriles;
    }

    public int getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }

    public int getCarriles() {
        return carriles;
    }

    public void setCarriles(int carriles) {
        this.carriles = carriles;
    }
    
   

}

