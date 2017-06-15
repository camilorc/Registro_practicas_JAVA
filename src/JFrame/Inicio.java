package JFrame;



import Model.DTO.Usuario;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Camilo-PC
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
    }
    
    public static Usuario usuarioActual;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jt_usuario = new javax.swing.JTextField();
        btn_ingresar = new javax.swing.JButton();
        jl_mensaje_error = new javax.swing.JLabel();
        jt_pass = new javax.swing.JPasswordField();
        jt_dv = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Iniciar Sesión");

        jLabel2.setText("Usuario:");

        jLabel3.setText("Contraseña:");

        jt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_usuarioActionPerformed(evt);
            }
        });
        jt_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_usuarioKeyTyped(evt);
            }
        });

        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        jl_mensaje_error.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jt_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_passActionPerformed(evt);
            }
        });

        jt_dv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_dvActionPerformed(evt);
            }
        });
        jt_dv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_dvKeyTyped(evt);
            }
        });

        jLabel4.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(btn_ingresar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jt_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(jt_pass))))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_dv, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addComponent(jl_mensaje_error, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_dv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btn_ingresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jl_mensaje_error, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        Validar();
        try {
            Usuario usuario = new Usuario();
            usuario.setRut(Integer.parseInt(jt_usuario.getText()) );
            usuario.setPass(jt_pass.getText());
            usuario.setDv(jt_dv.getText());
            System.out.println("RUT: "+usuario.getRut());
            System.out.println("DV: "+usuario.getDv());
            System.out.println("PASS: "+usuario.getPass());
            //Usamos método de la clase
            if(usuario.IniciarSesion()){
                System.out.println("Iniciada sesión correcta" + usuario.getId_rol());
                System.out.println("Iniciada sesión correcta" + usuario.getNombres());
                System.out.println("Iniciada sesión correcta" + usuario.getRut());
                //Significa que si el usuario es Jefe de Carrera (ROL 1)
                if(usuario.getId_rol() == 1){
                    //Puede entrar al Index de su perfil
                    System.out.println("Entro en el 1");
                    usuarioActual = usuario;
                    System.out.println("Entro en el rol");
                    IndexJefeCarrera frame = new IndexJefeCarrera();
                    frame.setVisible(true);
                    this.setVisible(false);
                //Significa que si el usuario es Coordinador (ROL 2)
                }else if(usuario.getId_rol() == 2){
                    usuarioActual = usuario;
                    System.out.println("Entro en el 2");
                    IndexCoordinadorCarrera icc = new IndexCoordinadorCarrera();
                    icc.setVisible(true);
                    this.setVisible(false);
                }else{
                    jl_mensaje_error.setText("Usuario sin acceso");
                }
                

            }else{
                jl_mensaje_error.setText("Usuario no encontrado");
            }
            
        } catch (Exception e) {
            jl_mensaje_error.setText("Ocurrio un error");
        }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void jt_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_usuarioKeyTyped
        char c = evt.getKeyChar();
        int largo = 8;
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (jt_usuario.getText().length() >= largo) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo 8 caracteres");
        }
    }//GEN-LAST:event_jt_usuarioKeyTyped

    private void jt_dvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_dvKeyTyped
        int largo = 1;
        if (jt_dv.getText().length() >= largo) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo un caracter");
        }
    }//GEN-LAST:event_jt_dvKeyTyped

    private void jt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_usuarioActionPerformed
        
    }//GEN-LAST:event_jt_usuarioActionPerformed

    private void jt_dvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_dvActionPerformed
        
    }//GEN-LAST:event_jt_dvActionPerformed

    private void jt_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_passActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jl_mensaje_error;
    private javax.swing.JTextField jt_dv;
    private javax.swing.JPasswordField jt_pass;
    private javax.swing.JTextField jt_usuario;
    // End of variables declaration//GEN-END:variables

    private void Validar() {
        try {
            if (!jt_dv.getText().isEmpty()) {
                if (!jt_pass.getText().isEmpty()) {
                    if (!jt_usuario.getText().isEmpty()) {
                        System.out.println("Ingresado");
                    } else {
                        JOptionPane.showMessageDialog(this, "Ingrese su rut", "Error!", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Ingrese password", "Error!", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese dv", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
