package controlador;

 
public class Pista extends Instalaciones {
    
    private int carriles;

    public Pista(int carriles, String nombre, String caracteristicas, String dimesion) {
        super(nombre, caracteristicas, dimesion);
        this.carriles = carriles;
    }

    public int getCarriles() {
        return carriles;
    }

    public void setCarriles(int carriles) {
        this.carriles = carriles;
    }

    
    
}

