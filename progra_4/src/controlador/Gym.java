package controlador;


public class Gym extends Instalaciones {

   private int cantMaquinas;

    public Gym(int cantMaquinas, String nombre, String caracteristicas, String dimesion) {
        super(nombre, caracteristicas, dimesion);
        this.cantMaquinas = cantMaquinas;
    }

    public int getCantMaquinas() {
        return cantMaquinas;
    }

    public void setCantMaquinas(int cantMaquinas) {
        this.cantMaquinas = cantMaquinas;
    }

    

}

