/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import controlador.*;

import static controlador.Progra4.cenDep;
import controlador.Socios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Jona_RV
 */
public class metodosBase {
    

    /**
 * Metodo para insertar socios a la base de datos
 * 
 */
    
    public static void insertarSocioBase(String n, String ced, String tel, String pro, String ciud, String dir, int cuota){
        
        String cadena = "jdbc:postgresql://localhost:5432/baseLenguajes";
        String user ="postgres";
        String pass = "12345"; 
        try { 
        Class.forName("org.postgresql.Driver"); 
        Connection conex = DriverManager.getConnection(cadena,user,pass);
        java.sql.Statement st = conex.createStatement(); 
        String sql = "insert into socio(nombre, cedula, telefono, provincia, ciudad, direccion, cuota) "
                + "values ('"+n+"', '"+ced+"', '"+tel+"', '"+pro+"', '"+ciud+"', '"+dir+"',"+ cuota+")"; 
        ResultSet result = st.executeQuery(sql);
        
        result.close(); 
        st.close(); conex.close();
        } catch(Exception exc) {
            System.out.println("Errorx:"+exc.getMessage()); 
        }
        
    }

/**
 * Metodo elimina un socio en la base de datos
 * 
 */
    
    public static void eliminarSocioBase(String cedula){
        
        String cadena = "jdbc:postgresql://localhost:5432/baseLenguajes";
        String user ="postgres";
        String pass = "12345"; 
        try { 
        Class.forName("org.postgresql.Driver"); 
        Connection conex = DriverManager.getConnection(cadena,user,pass);
        java.sql.Statement st = conex.createStatement(); 
        String sql = "delete from socio where cedula= '"+cedula+"'";
        ResultSet result = st.executeQuery(sql);
        result.close(); 
        st.close(); conex.close();
        } catch(Exception exc) {
            System.out.println("Errorx:"+e­xc.getMessage()); 
        }
    }
    
    /**
 * Metodo que carga desde la base de datos a la lista de socios de un centro
 * 
 */
    
    public static void cargarListaSocio(){
        
        String cadena = "jdbc:postgresql://localhost:5432/baseLenguajes";
        String user ="postgres";
        String pass = "12345"; 
        try { 
        Class.forName("org.postgresql.Driver"); 
        Connection conex = DriverManager.getConnection(cadena,user,pass);
        java.sql.Statement st = conex.createStatement(); 
        String sql = "SELECT * from socio "; 
        ResultSet result = st.executeQuery(sql); 
        while(result.next()) { 
            String nombre = result.getString("nombre"); 
            String cedula = result.getString("cedula"); 
            String telefono = result.getString("telefono"); 
            String provincia = result.getString("provincia"); 
            String ciudad = result.getString("ciudad"); 
            String direccion = result.getString("direccion"); 
            int cuota = Integer.parseInt(result.getString("cuota")); 
            Socios p = new Socios(nombre, cedula, telefono, provincia, ciudad, direccion, cuota);
            cenDep.getListaSocios().add(p);
        }
        result.close(); 
        st.close(); conex.close();
        } catch(Exception exc) {
            System.out.println("Errorx:"+e­xc.getMessage()); 
        }
        
    }
    
    /**
 * Metodo que elimina una instalacion en la base de datos 
 * 
 */
    
    public static void eliminarInstalacionBase(String tipo, String nombre){
        
        cenDep.getListaInstalaciones().clear();
        String cadena = "jdbc:postgresql://localhost:5432/baseLenguajes";
        String user ="postgres";
        String pass = "12345"; 
        try { 
        Class.forName("org.postgresql.Driver"); 
        Connection conex = DriverManager.getConnection(cadena,user,pass);
        java.sql.Statement st = conex.createStatement(); 
        
        if(tipo.equals("Piscinas")){
            String sql = "delete from piscina where nombre= '"+nombre+"'";
            ResultSet result = st.executeQuery(sql);
            result.close(); 
        }
        else if(tipo.equals("Cancha")){
            String sql = "delete from cancha where nombre= '"+nombre+"'";
            ResultSet result = st.executeQuery(sql);
            result.close(); 
        } 
        else if(tipo.equals("Pista")){
            String sql = "delete from pista where nombre= '"+nombre+"'";
            ResultSet result = st.executeQuery(sql);
            result.close(); 
        }
        else if(tipo.equals("Gym")){
            String sql = "delete from gym where nombre= '"+nombre+"'";
            ResultSet result = st.executeQuery(sql);
            result.close(); 
        }
        
        st.close(); conex.close();
        } catch(Exception exc) {
            System.out.println("Errorx:"+e­xc.getMessage()); 
        }
        cargarListaInstalacionesPiscina();
        cargarListaInstalacionesGym();
        cargarListaInstalacionesCancha();
        cargarListaInstalacionesPista();
    }
    
    /**
 *  Metodo que inserta una instalacion de tipo cancha a la base de datos
 */ 
       
    public static void insertarCanchaBase(String nom, String tip, String dimen, String caract){
        
        String cadena = "jdbc:postgresql://localhost:5432/baseLenguajes";
        String user ="postgres";
        String pass = "12345"; 
        try { 
        Class.forName("org.postgresql.Driver"); 
        Connection conex = DriverManager.getConnection(cadena,user,pass);
        java.sql.Statement st = conex.createStatement(); 
        String sql = "insert into cancha(nombre, tipo, dimensiones, caracteristicas) "
                + "values ('"+nom+"', '"+tip+"', '"+dimen+"', '"+caract+"')"; 
        ResultSet result = st.executeQuery(sql);
        
        result.close(); 
        st.close(); conex.close();
        } catch(Exception exc) {
            System.out.println("Errorx:"+e­xc.getMessage()); 
        }        
    }

     /**
 *  Metodo que carga instalaciones de tipo cancha desde la base de datos
 */
    
    public static void cargarListaInstalacionesCancha(){
        
        String cadena = "jdbc:postgresql://localhost:5432/baseLenguajes";
        String user ="postgres";
        String pass = "12345"; 
        try { 
        Class.forName("org.postgresql.Driver"); 
        Connection conex = DriverManager.getConnection(cadena,user,pass);
        java.sql.Statement st = conex.createStatement(); 
        String sql = "SELECT * from cancha "; 
        ResultSet result = st.executeQuery(sql); 
        while(result.next()) { 
            String nombre = result.getString("nombre"); 
            String caracteristicas = result.getString("caracteristicas"); 
            String tipo = result.getString("tipo"); 
            String dimensiones = result.getString("dimensiones"); 
             
            Cancha can = new Cancha(tipo, nombre, caracteristicas, dimensiones);
            cenDep.getListaInstalaciones().add(can);
        }
        result.close(); 
        st.close(); conex.close();
        } catch(Exception exc) {
            System.out.println("Errorx:"+e­xc.getMessage()); 
        }
    }
    
   /**
 *  Metodo que inserta una instalacion de tipo Pista a la base de datos
 */
    
    public static void insertarPistaBase(String n, int carr, String dimen, String caract){
        
        String cadena = "jdbc:postgresql://localhost:5432/baseLenguajes";
        String user ="postgres";
        String pass = "12345"; 
        try { 
        Class.forName("org.postgresql.Driver"); 
        Connection conex = DriverManager.getConnection(cadena,user,pass);
        java.sql.Statement st = conex.createStatement(); 
        String sql = "insert into pista(nombre, carriles, dimensiones, caracteristicas) "
                + "values ('"+n+"', '"+carr+"', '"+dimen+"', '"+caract+"')"; 
        ResultSet result = st.executeQuery(sql);
        
        result.close(); 
        st.close(); conex.close();
        } catch(Exception exc) {
            System.out.println("Errorx:"+e­xc.getMessage()); 
        }        
    }
    
     /**
 *  Metodo que carga instalaciones de tipo pista desde la base de datos
 */
    
    public static void cargarListaInstalacionesPista(){
        
        String cadena = "jdbc:postgresql://localhost:5432/baseLenguajes";
        String user ="postgres";
        String pass = "12345"; 
        try { 
        Class.forName("org.postgresql.Driver"); 
        Connection conex = DriverManager.getConnection(cadena,user,pass);
        java.sql.Statement st = conex.createStatement(); 
        String sql = "SELECT * from pista "; 
        ResultSet result = st.executeQuery(sql); 
        while(result.next()) { 
            String nombre = result.getString("nombre"); 
            String caracteristicas = result.getString("caracteristicas"); 
            String dimensiones = result.getString("dimensiones"); 
            int carriles = Integer.parseInt(result.getString("carriles")); 
             
            Pista pist = new Pista(carriles, nombre, caracteristicas, dimensiones);
            cenDep.getListaInstalaciones().add(pist);
        }
        result.close(); 
        st.close(); conex.close();
        } catch(Exception exc) {
            System.out.println("Errorx:"+e­xc.getMessage()); 
        }
    }
    
     /**
 *  Metodo que inserta una instalacion de tipo piscina a la base de datos
 */    
    
    public static void insertarPiscinaBase(String n, int carr, int prof, String dimen, String caract){
        
        String cadena = "jdbc:postgresql://localhost:5432/baseLenguajes";
        String user ="postgres";
        String pass = "12345"; 
        try { 
        Class.forName("org.postgresql.Driver"); 
        Connection conex = DriverManager.getConnection(cadena,user,pass);
        java.sql.Statement st = conex.createStatement(); 
        String sql = "insert into piscina(nombre, carriles, profundidad, dimensiones, caracteristicas) "
                + "values ('"+n+"', '"+carr+"', '"+prof+"', '"+dimen+"', '"+caract+"')"; 
        ResultSet result = st.executeQuery(sql);
        
        result.close(); 
        st.close(); conex.close();
        } catch(Exception exc) {
            System.out.println("Errorx:"+e­xc.getMessage()); 
        }        
    }
    
     /**
 *  Metodo que carga instalaciones de tipo piscina desde la base de datos
 */
    
    public static void cargarListaInstalacionesPiscina(){
        
        String cadena = "jdbc:postgresql://localhost:5432/baseLenguajes";
        String user ="postgres";
        String pass = "12345"; 
        try { 
        Class.forName("org.postgresql.Driver"); 
        Connection conex = DriverManager.getConnection(cadena,user,pass);
        java.sql.Statement st = conex.createStatement(); 
        String sql = "SELECT * from piscina "; 
        ResultSet result = st.executeQuery(sql); 
        while(result.next()) { 
            String nombre = result.getString("nombre"); 
            String caracteristicas = result.getString("caracteristicas"); 
            String dimensiones = result.getString("dimensiones"); 
            int profundidad = Integer.parseInt(result.getString("profundidad"));
            int carriles = Integer.parseInt(result.getString("carriles")); 
             
            Piscinas pisc = new Piscinas(profundidad, carriles, nombre, caracteristicas, dimensiones);
            cenDep.getListaInstalaciones().add(pisc);
        }
        result.close(); 
        st.close(); conex.close();
        } catch(Exception exc) {
            System.out.println("Errorx:"+e­xc.getMessage()); 
        }
    }
    
     /**
 *  Metodo que inserta una instalacion de tipo gimanasio a la base de datos
 */
    
    public static void insertarGymBase(String n, int cantMaq, String dimen, String caract){
        
        String cadena = "jdbc:postgresql://localhost:5432/baseLenguajes";
        String user ="postgres";
        String pass = "12345"; 
        try { 
        Class.forName("org.postgresql.Driver"); 
        Connection conex = DriverManager.getConnection(cadena,user,pass);
        java.sql.Statement st = conex.createStatement(); 
        String sql = "insert into gym(nombre, cantMaquinas, profundidad, dimensiones, caracteristicas) "
                + "values ('"+n+"', '"+cantMaq+"', '"+dimen+"', '"+caract+"')"; 
        ResultSet result = st.executeQuery(sql);
        
        result.close(); 
        st.close(); conex.close();
        } catch(Exception exc) {
            System.out.println("Errorx:"+e­xc.getMessage()); 
        }        
    }
    
     /**
 *  Metodo que carga instalaciones de tipo gimnasio desde la base de datos
 */
    
    public static void cargarListaInstalacionesGym(){
        
        String cadena = "jdbc:postgresql://localhost:5432/baseLenguajes";
        String user ="postgres";
        String pass = "12345"; 
        try { 
        Class.forName("org.postgresql.Driver"); 
        Connection conex = DriverManager.getConnection(cadena,user,pass);
        java.sql.Statement st = conex.createStatement(); 
        String sql = "SELECT * from gym "; 
        ResultSet result = st.executeQuery(sql); 
        while(result.next()) { 
            String nombre = result.getString("nombre"); 
            String caracteristicas = result.getString("caracteristicas"); 
            String dimensiones = result.getString("dimensiones"); 
            int cantMaquinas = Integer.parseInt(result.getString("cantMaquinas")); 
             
            Gym gym = new Gym(cantMaquinas, nombre, caracteristicas, dimensiones);
            cenDep.getListaInstalaciones().add(gym);
        }
        result.close(); 
        st.close(); conex.close();
        } catch(Exception exc) {
            System.out.println("Errorx:"+e­xc.getMessage()); 
        }
    }
    
     /**
 *  Metodo que carga articulos desde  la base de datos
 */
    
    public static void cargarListaArticulosBase(){
        
        cenDep.getListaArticulos().clear();
        
        String cadena = "jdbc:postgresql://localhost:5432/baseLenguajes";
        String user ="postgres";
        String pass = "12345"; 
        try { 
        Class.forName("org.postgresql.Driver"); 
        Connection conex = DriverManager.getConnection(cadena,user,pass);
        java.sql.Statement st = conex.createStatement(); 
        String sql = "SELECT * from articulo "; 
        ResultSet result = st.executeQuery(sql); 
        while(result.next()) { 
            String nombre = result.getString("nombre"); 
            String tipo = result.getString("tipo"); 
            int cantidad = Integer.parseInt(result.getString("cantidad")); 
             
            Articulo arc = new Articulo(nombre, tipo, cantidad);
            cenDep.getListaArticulos().add(arc);
        }
        result.close(); 
        st.close(); conex.close();
        } catch(Exception exc) {
            System.out.println("Errorx:"+e­xc.getMessage()); 
        }
    }
    
     /**
 *  Metodo que inserta articulos a la base de datos
 */
    
    public static void insertarArticuloBase(String nombre, String tipo, int cantidad){
        
        String cadena = "jdbc:postgresql://localhost:5432/baseLenguajes";
        String user ="postgres";
        String pass = "12345"; 
        try { 
        Class.forName("org.postgresql.Driver"); 
        Connection conex = DriverManager.getConnection(cadena,user,pass);
        java.sql.Statement st = conex.createStatement();
        
        String sql1 = "Select * from articulo where nombre = '" +nombre+"' and tipo = '"+tipo+"'"; 
        ResultSet result1 = st.executeQuery(sql1);
        
            if(result1.next() == false){
                String sql = "insert into articulo(nombre, tipo, cantidad) "
                    + "values ('"+nombre+"', '"+tipo+"', '"+cantidad+"')"; 
                st.executeQuery(sql);
            }else{
                String sql = "UPDATE articulo SET cantidad = (cantidad + '"+cantidad+"')"
                        + " WHERE tipo = '"+tipo+"' and nombre = '"+nombre+"';"; 
                st.executeQuery(sql);
            }
        
        st.close(); conex.close();
        } catch(Exception exc) {
            System.out.println("Errorx:"+e­xc.getMessage()); 
        }
        
        cargarListaArticulosBase();
    }
    
     /**
 *  Metodo que elimina un articulo en la base de datos
 */
    
    public static void eliminarArticuloBase(String nombre, String tipo, int cantidad){
                       
        String cadena = "jdbc:postgresql://localhost:5432/baseLenguajes";
        String user ="postgres";
        String pass = "12345"; 
        try { 
        Class.forName("org.postgresql.Driver"); 
        Connection conex = DriverManager.getConnection(cadena,user,pass);
        java.sql.Statement st = conex.createStatement();
        
        String sql1 = "Select * from articulo where nombre = '" +nombre+"' and tipo = '"+tipo+"'"; 
        ResultSet result1 = st.executeQuery(sql1);
        
            if(result1.next() == true){
                if(Integer.parseInt(result1.getString("cantidad")) >= cantidad){
                    String sql = "UPDATE articulo SET cantidad = (cantidad - '"+cantidad+"')"
                            + " WHERE tipo = '"+tipo+"' and nombre = '"+nombre+"';"; 
                    st.executeQuery(sql);
                }
                else{
                    String sql = "delete from articulo where nombre= '"+nombre+", tipo= '"+tipo+"'";
                }
            }
        st.close(); conex.close();
        } catch(Exception exc) {
            System.out.println("Errorx:"+e­xc.getMessage()); 
        }
        
        cargarListaArticulosBase();
    }
    
     /**
 *  Metodo que inserta una reservacion a la base de datos
 */
    
    public static void insertarReservaInstalacionBase(String cedS, String nomIns, String hora_Ini, String hora_fin, String fecha, int costo){
        
        cenDep.getListaReserva().clear();
        String cadena = "jdbc:postgresql://localhost:5432/baseLenguajes";
        String user ="postgres";
        String pass = "12345"; 
        try { 
        Class.forName("org.postgresql.Driver"); 
        Connection conex = DriverManager.getConnection(cadena,user,pass);
        java.sql.Statement st = conex.createStatement(); 
        String sql = "insert into reserva(cedulaSocio, nombreInstalacion, horaInicio, horaFin, fecha, costo) "
                + "values ('"+cedS+"', '"+nomIns+"', '"+hora_Ini+"', '"+hora_fin+"', '"+fecha+"', "+costo+")"; 
        ResultSet result = st.executeQuery(sql);
        
        result.close(); 
        st.close(); conex.close();
        } catch(Exception exc) {
            System.out.println("Errorx:"+e­xc.getMessage()); 
        }
        cargarListaReservaInstalacionesBase();
    }
    
    /**
     * Metodo que carga la lista de Reservar de instalaciones
     */
    
    public static void cargarListaReservaInstalacionesBase(){
        
        String cadena = "jdbc:postgresql://localhost:5432/baseLenguajes";
        String user ="postgres";
        String pass = "12345"; 
        try { 
        Class.forName("org.postgresql.Driver"); 
        Connection conex = DriverManager.getConnection(cadena,user,pass);
        java.sql.Statement st = conex.createStatement(); 
        String sql = "SELECT * from reserva "; 
        ResultSet result = st.executeQuery(sql); 
        while(result.next()) { 
            String nomIns = result.getString("nombreInstalacion"); 
            String ceduSoci = result.getString("cedulaSocio"); 
            String horaIni = result.getString("horaInicio"); 
            String horaFin = result.getString("horaFin"); 
            String fecha = result.getString("fecha");  
            int costo = Integer.parseInt(result.getString("costo")); 
            
            Reserva res = new Reserva(fecha, horaIni, horaFin, nomIns, ceduSoci, costo);
            cenDep.getListaReserva().add(res);
        }
        result.close(); 
        st.close(); conex.close();
        } catch(Exception exc) {
            System.out.println("Errorx:"+e­xc.getMessage()); 
        }
        
    }
    
    /**
     * Metodo que inserta en la base de datos una reserva de instalacion
     */
    
    public static void insertarReservaArticuloInstalacionBase(String cedS, String nomArt, String tipoArt,  String fecha, int cantidad, int costo){
        
        cenDep.getListaReserva().clear();
        cargarListaReservaInstalacionesBase();
        String cadena = "jdbc:postgresql://localhost:5432/baseLenguajes";
        String user ="postgres";
        String pass = "12345"; 
        try { 
        Class.forName("org.postgresql.Driver"); 
        Connection conex = DriverManager.getConnection(cadena,user,pass);
        java.sql.Statement st = conex.createStatement(); 
        String sql = "insert into reservaArticulo"
                + "(cedulaSocio, nombreArt, tipoArt, fecha, cantidad, costo) "
                + "values ('"+cedS+"', '"+nomArt+"', '"+tipoArt+"', '"+fecha+"',"+cantidad+", "+costo+")"; 
        ResultSet result = st.executeQuery(sql);
        
        result.close(); 
        st.close(); conex.close();
        } catch(Exception exc) {
            System.out.println("Errorx:"+e­xc.getMessage()); 
        }
        cargarListaReservaArticuloInstalacionesBase();
    }
    
    /**
     * Metodo que carga la lista de Reservar de articulos desde la base de datos
     */
    
    public static void cargarListaReservaArticuloInstalacionesBase(){
        
        String cadena = "jdbc:postgresql://localhost:5432/baseLenguajes";
        String user ="postgres";
        String pass = "12345"; 
        try { 
        Class.forName("org.postgresql.Driver"); 
        Connection conex = DriverManager.getConnection(cadena,user,pass);
        java.sql.Statement st = conex.createStatement(); 
        String sql = "SELECT * from reservaArticulo "; 
        ResultSet result = st.executeQuery(sql); 
        while(result.next()) { 
            String ceduSoci = result.getString("cedulaSocio"); 
            String nomArt = result.getString("nombreArt"); 
            String tipoArt = result.getString("tipoArt"); 
            String fecha = result.getString("fecha");  
            int costo = Integer.parseInt(result.getString("costo"));
            int cantidad = Integer.parseInt(result.getString("cantidad")); 
            
            ReservaArticulos resA = new ReservaArticulos(ceduSoci, nomArt, tipoArt, fecha, cantidad, costo);
            
            int tam = cenDep.getListaReserva().size();
            
            if(tam > 0){
                for(int i = 0; i < tam; i++){
                    if(cenDep.getListaReserva().get(i).getCedulaSocio().equals(ceduSoci) & 
                            cenDep.getListaReserva().get(i).getFecha().equals(fecha)){
                        cenDep.getListaReserva().get(i).getListaReservaArticulos().add(resA);
                        cenDep.getListaReserva().get(i).getListaReservaArticulos().size();
                    }
                }
            }
        }
        result.close(); 
        st.close(); conex.close();
        } catch(Exception exc) {
            System.out.println("Errorx:"+e­xc.getMessage()); 
        }
    }
}
