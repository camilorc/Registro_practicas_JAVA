package JFrame;

import Model.DAO.CarreraDAO;
import Model.DAO.SedeDAO;
import Model.DAO.UsuarioDAO;
import Model.DTO.Sede;
import Model.DTO.Usuario;
import Model.DTO.Carrera;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 *
 * @author Camilo-PC
 */
public class IngresarCoordinador extends javax.swing.JFrame {

    /**
     * Creates new form IngresarDocente
     */
    public IngresarCoordinador() {
        initComponents();
        llenarComboSedes();
        llenarComboCarreras();
        jl_mensaje1.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jt_rut = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jt_dv = new javax.swing.JTextField();
        jt_pass = new javax.swing.JTextField();
        jt_nombres = new javax.swing.JTextField();
        jt_primer_apellido = new javax.swing.JTextField();
        jt_segundo_apellido = new javax.swing.JTextField();
        jt_direccion = new javax.swing.JTextField();
        jt_fono = new javax.swing.JTextField();
        jt_email = new javax.swing.JTextField();
        jb_crear = new javax.swing.JButton();
        jl_mensaje = new javax.swing.JLabel();
        btn_buscat = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jcb_sede = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jcb_carrera = new javax.swing.JComboBox();
        jl_mensaje1 = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        txtAnio = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingresar Coordinador");

        jLabel2.setText("RUT:");

        jLabel3.setText("Contraseña:");

        jLabel4.setText("Nombres:");

        jLabel5.setText("Primer Apellido:");

        jLabel6.setText("Segundo Apellido:");

        jLabel7.setText("Fecha de Nacimiento:");

        jLabel8.setText("Dirección:");

        jLabel9.setText("Teléfono:");

        jLabel10.setText("Email:");

        jt_rut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_rutKeyTyped(evt);
            }
        });

        jLabel13.setText("-");

        jt_dv.setToolTipText("");
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

        jt_nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_nombresKeyTyped(evt);
            }
        });

        jt_primer_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_primer_apellidoKeyTyped(evt);
            }
        });

        jt_segundo_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_segundo_apellidoKeyTyped(evt);
            }
        });

        jt_fono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_fonoKeyTyped(evt);
            }
        });

        jb_crear.setText("Crear");
        jb_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crearActionPerformed(evt);
            }
        });

        btn_buscat.setText("Buscar");
        btn_buscat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscatActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.setEnabled(false);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_update.setText("Actualizar");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        jLabel11.setText("Sede:");

        jLabel14.setText("Carrera:");

        jl_mensaje1.setText("jLabel15");

        txtDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiaKeyTyped(evt);
            }
        });

        txtMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMesActionPerformed(evt);
            }
        });
        txtMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMesKeyTyped(evt);
            }
        });

        txtAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnioKeyTyped(evt);
            }
        });

        jLabel15.setText("/");

        jLabel16.setText("/");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_volver))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn_limpiar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jb_crear)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn_buscat)
                            .addGap(42, 42, 42))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jl_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jl_mensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(btn_update)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_eliminar)
                                .addComponent(jLabel12))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jt_rut, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jt_dv, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jt_pass)
                            .addComponent(jt_primer_apellido)
                            .addComponent(jt_nombres)
                            .addComponent(jt_segundo_apellido)
                            .addComponent(jt_direccion)
                            .addComponent(jt_fono)
                            .addComponent(jt_email)
                            .addComponent(jcb_sede, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcb_carrera, 0, 196, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAnio)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btn_volver))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jt_rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jt_dv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jt_primer_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jt_segundo_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(jLabel16))
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jt_fono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel11)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_mensaje)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_buscat)
                                    .addComponent(jb_crear)
                                    .addComponent(btn_limpiar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_mensaje1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_eliminar)
                                        .addComponent(btn_update)))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcb_sede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcb_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jt_dvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_dvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_dvActionPerformed

    private void jb_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crearActionPerformed
        Validar();
        jl_mensaje1.setText("");
        String fecha = txtDia.getText() + "/" + txtMes.getText() + "/" + txtAnio.getText();
        try {
            Usuario coordinador = new Usuario();
            Sede sede = (Sede) jcb_sede.getSelectedItem();
            Carrera carrera = (Carrera) jcb_carrera.getSelectedItem();
            //Obtenemos atributos del formulario
            coordinador.setRut(Integer.parseInt(jt_rut.getText()));
            coordinador.setDv(jt_dv.getText());
            coordinador.setPass(jt_pass.getText());
            coordinador.setNombres(jt_nombres.getText());
            coordinador.setApellido1(jt_primer_apellido.getText());
            coordinador.setApellido2(jt_segundo_apellido.getText());
            coordinador.setFecha_nacimiento(fecha);
            coordinador.setDireccion(jt_direccion.getText());
            coordinador.setTelefono(Integer.parseInt(jt_fono.getText()));
            coordinador.setEmail(jt_email.getText());
            coordinador.setId_rol(2);
            coordinador.setId_sede(sede.getIdSede());
            coordinador.setNombre_sede(sede.getNombreSede());
            coordinador.setId_carrera(carrera.getIdCarrera());
            coordinador.setNombre_carrera(carrera.getNombreCarrera());

            if (coordinador.Create()) {
                jl_mensaje1.setText("Coordinador Creado");
                limpiarFormulario();
            } else {
                jl_mensaje1.setText("Error al crear al Coordinador");
            }

        } catch (Exception e) {
            jl_mensaje1.setText("Ocurrio un error: " + e);
        }

    }//GEN-LAST:event_jb_crearActionPerformed

    private void btn_buscatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscatActionPerformed
        jl_mensaje1.setText("");
        try {

            Usuario coordinador = new Usuario();
            coordinador.setRut(Integer.parseInt(jt_rut.getText()));
            coordinador.setDv(jt_dv.getText());
            //Le pasamos un 3 que es el IDROL de un DOCENTE
            if (coordinador.Buscar(2)) {
                jt_dv.setText(coordinador.getDv());
                jt_pass.setText(coordinador.getPass());
                jt_nombres.setText(coordinador.getNombres());
                jt_primer_apellido.setText(coordinador.getApellido1());
                jt_segundo_apellido.setText(coordinador.getApellido2());
                txtDia.setText(coordinador.getFecha_nacimiento().substring(1, 2));
                txtMes.setText(coordinador.getFecha_nacimiento().substring(3, 4));
                txtAnio.setText(coordinador.getFecha_nacimiento().substring(5, 8));
                jt_direccion.setText(coordinador.getDireccion());
                jt_fono.setText(Integer.toString(coordinador.getTelefono()));
                jt_email.setText(coordinador.getEmail());
                jl_mensaje1.setText("Coordinador encontrado");
            } else {
                jl_mensaje1.setText("Ocurrio un error");
            }
        } catch (Exception e) {
            jl_mensaje1.setText("Ocurrio un error");
        }
    }//GEN-LAST:event_btn_buscatActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        jl_mensaje1.setText("");
        try {
            Usuario coordinador = new Usuario();
            coordinador.setRut(Integer.parseInt(jt_rut.getText()));
            if (coordinador.Delete()) {
                limpiarFormulario();
                jl_mensaje1.setText("Coordinador Eliminado");
            } else {
                jl_mensaje1.setText("Ocurrio un error al Eliminar");
            }
        } catch (Exception e) {
            jl_mensaje1.setText("Ocurrio un error");
        }

    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        Validar();
        jl_mensaje1.setText("");
        String fecha = txtDia.getText() + "/" + txtMes.getText() + "/" + txtAnio.getText();
        try {
            Usuario coordinador = new Usuario();
            Sede sede = (Sede) jcb_sede.getSelectedItem();
            Carrera carrera = (Carrera) jcb_carrera.getSelectedItem();
            //Obtenemos atributos del formulario
            coordinador.setRut(Integer.parseInt(jt_rut.getText()));
            coordinador.setDv(jt_dv.getText());
            coordinador.setPass(jt_pass.getText());
            coordinador.setNombres(jt_nombres.getText());
            coordinador.setApellido1(jt_primer_apellido.getText());
            coordinador.setApellido2(jt_segundo_apellido.getText());
            coordinador.setFecha_nacimiento(fecha);
            coordinador.setDireccion(jt_direccion.getText());
            coordinador.setTelefono(Integer.parseInt(jt_fono.getText()));
            coordinador.setEmail(jt_email.getText());
            coordinador.setId_rol(2);
            coordinador.setId_sede(sede.getIdSede());
            coordinador.setNombre_sede(sede.getNombreSede());
            coordinador.setId_carrera(carrera.getIdCarrera());
            coordinador.setNombre_carrera(carrera.getNombreCarrera());

            if (coordinador.Update()) {
                jl_mensaje1.setText("Coordinador Actualizado");
            } else {
                jl_mensaje1.setText("Error al Actualizar al Coordinador");
            }

        } catch (Exception e) {
            jl_mensaje1.setText("Ocurrio un error: " + e);
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        jl_mensaje1.setText("");
        limpiarFormulario();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        IndexJefeCarrera frame = new IndexJefeCarrera();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_volverActionPerformed

    private void jt_nombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_nombresKeyTyped

    }//GEN-LAST:event_jt_nombresKeyTyped

    private void jt_primer_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_primer_apellidoKeyTyped

    }//GEN-LAST:event_jt_primer_apellidoKeyTyped

    private void jt_segundo_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_segundo_apellidoKeyTyped

    }//GEN-LAST:event_jt_segundo_apellidoKeyTyped

    private void jt_rutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_rutKeyTyped
        char c = evt.getKeyChar();
        int largo = 8;
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (jt_rut.getText().length() >= largo) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo 8 caracteres");
        }
    }//GEN-LAST:event_jt_rutKeyTyped

    private void jt_fonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_fonoKeyTyped
        char c = evt.getKeyChar();
        int largo = 10;
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (jt_fono.getText().length() >= largo) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo 10 caracteres");
        }
    }//GEN-LAST:event_jt_fonoKeyTyped

    private void jt_dvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_dvKeyTyped
        int largo = 1;
        if (jt_dv.getText().length() >= largo) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo un caracter");
        }
    }//GEN-LAST:event_jt_dvKeyTyped

    private void txtDiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiaKeyTyped

        char c = evt.getKeyChar();
        int largo = 2;
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (txtDia.getText().length() >= largo) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo 2 caracteres");
        }
    }//GEN-LAST:event_txtDiaKeyTyped

    private void txtMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMesActionPerformed

    }//GEN-LAST:event_txtMesActionPerformed

    private void txtMesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMesKeyTyped
        char c = evt.getKeyChar();
        int largo = 2;
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (txtMes.getText().length() >= largo) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo 2 caracteres");
        }
    }//GEN-LAST:event_txtMesKeyTyped

    private void txtAnioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnioKeyTyped
        char c = evt.getKeyChar();
        int largo = 4;
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (txtAnio.getText().length() >= largo) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo 4 caracteres");
        }
    }//GEN-LAST:event_txtAnioKeyTyped

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
            java.util.logging.Logger.getLogger(IngresarCoordinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarCoordinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarCoordinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarCoordinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new IngresarCoordinador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscat;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_volver;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jb_crear;
    private javax.swing.JComboBox jcb_carrera;
    private javax.swing.JComboBox jcb_sede;
    private javax.swing.JLabel jl_mensaje;
    private javax.swing.JLabel jl_mensaje1;
    private javax.swing.JTextField jt_direccion;
    private javax.swing.JTextField jt_dv;
    private javax.swing.JTextField jt_email;
    private javax.swing.JTextField jt_fono;
    private javax.swing.JTextField jt_nombres;
    private javax.swing.JTextField jt_pass;
    private javax.swing.JTextField jt_primer_apellido;
    private javax.swing.JTextField jt_rut;
    private javax.swing.JTextField jt_segundo_apellido;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtMes;
    // End of variables declaration//GEN-END:variables

    private void limpiarFormulario() {
        jt_rut.setText("");
        jt_dv.setText("");
        jt_pass.setText("");
        jt_nombres.setText("");
        jt_primer_apellido.setText("");
        jt_segundo_apellido.setText("");
        txtDia.setText("");
        txtMes.setText("");
        txtAnio.setText("");
        jt_direccion.setText("");
        jt_fono.setText("");
        jt_email.setText("");
    }

    private void llenarComboSedes() {
        SedeDAO sedes = new SedeDAO();
        ArrayList<Sede> listaSedes = sedes.BuscarTodasLasSedes();
        for (Sede sede : listaSedes) {
            jcb_sede.addItem(sede);
        }
    }

    private void llenarComboCarreras() {
        CarreraDAO carreras = new CarreraDAO();
        ArrayList<Carrera> listaCarreras = carreras.BuscarTodasLasCarreras();
        for (Carrera carrera : listaCarreras) {
            jcb_carrera.addItem(carrera);
        }
    }

    private void Validar() {
        try {
            if (!jt_direccion.getText().isEmpty()) {
                if (!jt_dv.getText().isEmpty()) {
                    if (!jt_email.getText().isEmpty()) {
                        if (!jt_fono.getText().isEmpty()) {
                            if (!jt_nombres.getText().isEmpty()) {
                                if (!jt_pass.getText().isEmpty()) {
                                    if (!jt_primer_apellido.getText().isEmpty()) {
                                        if (!jt_rut.getText().isEmpty()) {
                                            if (!jt_segundo_apellido.getText().isEmpty()) {
                                                if (Integer.parseInt(txtDia.getText()) >= 1 && Integer.parseInt(txtDia.getText()) <= 31) {
                                                    if (Integer.parseInt(txtMes.getText()) >= 1 && Integer.parseInt(txtMes.getText()) <= 12) {
                                                        if (Integer.parseInt(txtAnio.getText()) <= 2017) {
                                                            System.out.println("Validado");
                                                        } else {
                                                            JOptionPane.showMessageDialog(this, "El año debe ser menor a 2017");
                                                        }
                                                    } else {
                                                        JOptionPane.showMessageDialog(this, "El mes debe estar entre 1 y 12");
                                                    }
                                                } else {
                                                    JOptionPane.showMessageDialog(this, "El dia debe estar entre 1 y 31");
                                                }
                                            } else {
                                                JOptionPane.showMessageDialog(this, "Ingrese segundo apellido", "Error!", JOptionPane.ERROR_MESSAGE);
                                            }
                                        } else {
                                            JOptionPane.showMessageDialog(this, "Ingrese su rut", "Error!", JOptionPane.ERROR_MESSAGE);
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(this, "Ingrese primer apellido", "Error!", JOptionPane.ERROR_MESSAGE);
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(this, "Genere una password", "Error!", JOptionPane.ERROR_MESSAGE);
                                }
                            } else {
                                JOptionPane.showMessageDialog(this, "Ingrese sus nombres", "Error!", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "Ingrese su telefono", "Error!", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Ingrese email", "Error!", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Ingrese dv", "Error!", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese la direccion", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
