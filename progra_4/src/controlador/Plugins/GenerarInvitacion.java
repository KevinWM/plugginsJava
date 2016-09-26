/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.Plugins;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.*;
import static controlador.Progra4.*;
import controlador.Plugins.*;
import java.util.ArrayList;

/**
 *
 * @author Jona_RV
 */
public class GenerarInvitacion extends JFrame implements Interface{
    

    private JPanel contentPane;
    public String fecha;
    public String cedula;
     /**
     * Create the frame.
     */
    public GenerarInvitacion() {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        setBounds(0,0,600,400);
    }
    
    public void paint (Graphics g)
    {
        super.paint(g);
        Toolkit t = Toolkit.getDefaultToolkit ();
        Image imagen = t.getImage ("123.jpg");
        g.drawImage (imagen, 0, 0, this);
        Color col = new Color (255, 255, 255);
        g.setColor (col);
        String horaIni = "";
        String horaFin = "";
        String nomIns = "";
        for(int i = 0; i<cenDep.getListaReserva().size(); i++){
            if((this.cedula.equals(cenDep.getListaReserva().get(i).getCedulaSocio())) &
                    (this.fecha.equals(cenDep.getListaReserva().get(i).getFecha()))){
                    nomIns = cenDep.getListaReserva().get(i).getNomInstalacion();
                    horaIni = cenDep.getListaReserva().get(i).getHoraInicio();
                    horaFin = cenDep.getListaReserva().get(i).getHoraFin();
                    break;
            }
        }
        g.drawString("Instalacion:   "+nomIns,  150, 75);
        g.drawString("Fecha     :    "+fecha,  150, 100);
        g.drawString("Hora Inicio : "+horaIni,  150, 120);
        g.drawString("Hora Final  : "+horaFin,  150, 150);
    }

    @Override
    public void cargar(Object o) {
        
        ArrayList<String> lista = new ArrayList<String>();
        lista = (ArrayList<String>)o;
        GenerarInvitacion gInv = new GenerarInvitacion();        
        gInv.cedula = lista.get(0);
        gInv.fecha = lista.get(1);
        
        
        gInv.setVisible(true);
    }
}
