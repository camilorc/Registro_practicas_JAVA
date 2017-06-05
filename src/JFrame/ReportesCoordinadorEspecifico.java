/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame;

import Model.DAO.CarreraDAO;
import Model.DAO.Reportes;
import Model.DAO.SedeDAO;
import Model.DTO.Carrera;
import Model.DTO.Sede;
import Model.DTO.Usuario;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Camilo-PC
 */
public class ReportesCoordinadorEspecifico extends javax.swing.JFrame {

    /**
     * Creates new form ReportesJefeCarrera
     */
    public ReportesCoordinadorEspecifico() {
        initComponents();
        llenarComboSede();
        llenarComboCarrera();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcb_sede = new javax.swing.JComboBox();
        jcb_carrera = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_ejecutar = new javax.swing.JButton();
        jlb_mensaje = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_tabla = new javax.swing.JTable();
        jcb_estado = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btn_volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jcb_sede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_sedeActionPerformed(evt);
            }
        });

        jcb_carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_carreraActionPerformed(evt);
            }
        });

        jLabel2.setText("Sede");

        jLabel3.setText("Carrera");

        btn_ejecutar.setText("Ejecutar");
        btn_ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ejecutarActionPerformed(evt);
            }
        });

        jlb_mensaje.setText("jLabel1");

        jt_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Rut", "Nombres", "Apellido Paterno", "Apellido Materno"
            }
        ));
        jScrollPane2.setViewportView(jt_tabla);

        jcb_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cursando", "Pendiente", "Terminada", " " }));

        jLabel1.setText("Estado de la práctica");

        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel2)
                        .addGap(179, 179, 179)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jcb_sede, 0, 160, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(jcb_estado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addComponent(jcb_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlb_mensaje))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(168, 168, 168)
                            .addComponent(btn_ejecutar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_volver))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb_sede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ejecutar)
                    .addComponent(btn_volver))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jlb_mensaje)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ejecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ejecutarActionPerformed
        limpiarTabla();
        jlb_mensaje.setText("");
        Reportes reporte = new Reportes();
        DefaultTableModel modelo = (DefaultTableModel)jt_tabla.getModel();
        Sede sede = new Sede();
        Carrera carrera = new Carrera();
        
        int estado = jcb_estado.getSelectedIndex() + 1;
        try {
            sede = (Sede) jcb_sede.getSelectedItem();
            carrera = (Carrera) jcb_carrera.getSelectedItem();
            ArrayList<Usuario> lista = reporte.ReporteEspecifico(sede.getIdSede(), carrera.getIdCarrera(),estado);
            Object[] fila = new Object[modelo.getColumnCount()];
            
            for (int i = 0; i < lista.size(); i++) {
                fila[0] = lista.get(i).getRut()+"-"+lista.get(i).getDv();
                fila[1] = lista.get(i).getNombres();
                fila[2] = lista.get(i).getApellido1();
                fila[3] = lista.get(i).getApellido2();
                modelo.addRow(fila);
            }
           
            jlb_mensaje.setText("Encontrado");
        } catch (Exception e) {
            jlb_mensaje.setText("Error al generar la estadistica");
        }
        
        
        
        
        
    }//GEN-LAST:event_btn_ejecutarActionPerformed

    private void jcb_sedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_sedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_sedeActionPerformed

    private void jcb_carreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_carreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_carreraActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        IndexCoordinadorCarrera frame = new IndexCoordinadorCarrera();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_volverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReportesCoordinadorEspecifico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportesCoordinadorEspecifico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportesCoordinadorEspecifico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportesCoordinadorEspecifico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportesCoordinadorEspecifico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ejecutar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox jcb_carrera;
    private javax.swing.JComboBox<String> jcb_estado;
    private javax.swing.JComboBox jcb_sede;
    private javax.swing.JLabel jlb_mensaje;
    private javax.swing.JTable jt_tabla;
    // End of variables declaration//GEN-END:variables

    private void llenarComboSede() {
        SedeDAO sedes = new SedeDAO();
        ArrayList<Sede> listaSedes = sedes.BuscarTodasLasSedes();
        for (Sede sede : listaSedes) {
            jcb_sede.addItem(sede);
        }
    }

    private void llenarComboCarrera() {
        CarreraDAO carreras = new CarreraDAO();
        ArrayList<Carrera> listaCarreras = carreras.BuscarTodasLasCarreras();
        for (Carrera carrera : listaCarreras) {
            jcb_carrera.addItem(carrera);
        }
    }

    private void limpiarTabla() {
         DefaultTableModel modelo = (DefaultTableModel)jt_tabla.getModel();
         int a = modelo.getRowCount()-1;
        for (int i = a; i >= 0; i--) {           
            modelo.removeRow(jt_tabla.getRowCount()-1);
        } 
    }
}
