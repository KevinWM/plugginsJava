package controlador;


public class Socios {

    private String nombre;
    private String direccion;
    private String cuidad;
    private String provincia;
    private String telefono;
    private int couta;
    private String idSocio;

    public Socios (String nom, String ced, String tel, String pro, String ciu, String dir, int couta) {
        this.nombre = nom;
        this.idSocio = ced;
        this.telefono = tel;
        this.provincia = pro;
        this.cuidad = ciu;
        this.direccion = dir;
        this.couta = couta;
        
    }

    public int getCouta () {
        return couta;
    }

    public void setCouta (int val) {
        this.couta = val;
    }

    public String getCuidad () {
        return cuidad;
    }

    public void setCuidad (String val) {
        this.cuidad = val;
    }

    public String getDireccion () {
        return direccion;
    }

 
    public void setDireccion (String val) {
        this.direccion = val;
    }

   
    public String getIdSocio () {
        return idSocio;
    }

    public void setIdSocio (String val) {
        this.idSocio = val;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String val) {
        this.nombre = val;
    }

    public String getProvincia () {
        return provincia;
    }

    public void setProvincia (String val) {
        this.provincia = val;
    }

    public String getTelefono () {
        return telefono;
    }

    public void setTelefono (String val) {
        this.telefono = val;
    }

}

