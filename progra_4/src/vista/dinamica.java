/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import controlador.*;
import modelo.*;
import vista.*;
import controlador.Plugins.*;
import static controlador.Progra4.*;
import java.util.ArrayList;
/**
 *
 * @author Jona_RV
 */
public class dinamica extends javax.swing.JInternalFrame {

    /**
     * Creates new form dinamica
     */
    public dinamica() {
        initComponents();
        cargarSocioReporteCombobox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BTNgenerar1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        socioReporteComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        BTNgenerar2 = new javax.swing.JButton();
        BTNgenerar3 = new javax.swing.JButton();
        fechaReservaComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Reporte Reservas HTML:");

        BTNgenerar1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BTNgenerar1.setText("Generar");
        BTNgenerar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNgenerar1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Reporte Socio Reserva");

        socioReporteComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        socioReporteComboBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        socioReporteComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                socioReporteComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Socio:");

        BTNgenerar2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BTNgenerar2.setText("Generar");
        BTNgenerar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNgenerar2MouseClicked(evt);
            }
        });

        BTNgenerar3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BTNgenerar3.setText("Generar Invitacion");
        BTNgenerar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNgenerar3MouseClicked(evt);
            }
        });

        fechaReservaComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fechaReservaComboBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Fecha:");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Cerrar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel5.setText("Los Reportes se almacenan en la carpeta raiz del Proyecto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)
                                .addComponent(BTNgenerar1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18)
                                            .addComponent(socioReporteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(44, 44, 44)
                                            .addComponent(BTNgenerar2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BTNgenerar3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fechaReservaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(14, 14, 14)))))
                        .addGap(0, 105, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(BTNgenerar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(socioReporteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(BTNgenerar2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaReservaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addComponent(BTNgenerar3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNgenerar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNgenerar1MouseClicked
        // TODO add your handling code here:
        metodos met  = new metodos();
        met.cargaDinamica(true, cenDep.getListaReserva());
    }//GEN-LAST:event_BTNgenerar1MouseClicked

    public void cargarSocioReporteCombobox(){
        
        int tam = cenDep.getListaSocios().size();
        
        if(tam > 0){
            for(int i = 0; i < tam; i++){
                socioReporteComboBox.addItem(cenDep.getListaSocios().get(i).getNombre());
            }
        }
    }
    
    
    private void BTNgenerar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNgenerar2MouseClicked
        // TODO add your handling code here:
        int tam = cenDep.getListaSocios().size();

        if(tam > 0){
            for(int i = 0; i < tam; i++){
                if(socioReporteComboBox.getSelectedItem().equals(cenDep.getListaSocios().get(i).getNombre())){
                    metodos met = new metodos();
                    met.cargaDinamica(true, cenDep.getListaSocios().get(i).getIdSocio());
                }
            }
        }
    }//GEN-LAST:event_BTNgenerar2MouseClicked

    private void BTNgenerar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNgenerar3MouseClicked
        // TODO add your handling code here:
        int tam = cenDep.getListaSocios().size();

        if(tam > 0){
            for(int i = 0; i < tam; i++){
                if(socioReporteComboBox.getSelectedItem().equals(cenDep.getListaSocios().get(i).getNombre())){
                    ArrayList<String> lista = new ArrayList<String>();
                    lista.add(cenDep.getListaSocios().get(i).getIdSocio());
                    lista.add(fechaReservaComboBox.getSelectedItem().toString());                    
                    metodos met = new metodos();
                    met.cargaDinamica(true, lista);
                }
            }
        }
    }//GEN-LAST:event_BTNgenerar3MouseClicked

    private void socioReporteComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_socioReporteComboBoxActionPerformed
        // TODO add your handling code here:
        int tam = cenDep.getListaSocios().size();
        int tamR = cenDep.getListaReserva().size();
        fechaReservaComboBox.removeAllItems();

        for(int i = 0; i < tam; i++){
            if(socioReporteComboBox.getSelectedItem().equals(cenDep.getListaSocios().get(i).getNombre())){
                for(int y = 0; y < tamR; y++){
                    if(cenDep.getListaSocios().get(i).getIdSocio().equals(cenDep.getListaReserva().get(y).getCedulaSocio())){
                        fechaReservaComboBox.addItem(cenDep.getListaReserva().get(y).getFecha());
                    }
                }
            }
        }
    }//GEN-LAST:event_socioReporteComboBoxActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNgenerar1;
    private javax.swing.JButton BTNgenerar2;
    private javax.swing.JButton BTNgenerar3;
    private javax.swing.JComboBox fechaReservaComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox socioReporteComboBox;
    // End of variables declaration//GEN-END:variables
}
