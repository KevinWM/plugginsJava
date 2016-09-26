/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.Plugins;

import ClassLoader.FileClassLoader;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Jona_RV
 */
public class metodos {
    
    /**
     * Metodo que realiza la seleccion de archivo .class y 
     * realiza la carga dinamica del archivo
     */
    
    public void cargaDinamica(boolean dinamico, Object o){
        
        try{
            JFileChooser chooser = new JFileChooser();
            chooser.setDialogTitle("Seleccione el archivo de Carga Dinamica");
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo Class", "class");
            chooser.setFileFilter(filter);
            String name = "";
            String adr = "";
            int returnVal = chooser.showOpenDialog(chooser);
            if(returnVal == JFileChooser.APPROVE_OPTION) {
                name = chooser.getSelectedFile().getName();
                adr = chooser.getSelectedFile().getAbsolutePath();
            }
            String[] n = name.split(".class");
            String[] dir = adr.split(n[0]);
            FileClassLoader loader = new FileClassLoader(dir[0]);
            
          if (dinamico == true){

              Class c = loader.loadClass(n[0]);
              Object repor = c.newInstance();    
              ((Interface)repor).cargar(o);
          }
          else
              if (n[0].equals("ReporteReservaHTML"))
              {
                ReporteReservaHTML rep = new ReporteReservaHTML();
                rep.cargar(0);
              }
        }
        catch(Exception e){System.out.println("Me caí!!!\n"); e.printStackTrace();
        }
    }
}
