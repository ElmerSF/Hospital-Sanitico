/*
 Este formulario es la primera pantalla que se muestra al usuario, para que haga el registro
 */
package tarea2_elmer;

import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;

public class formulario_basico extends javax.swing.JFrame {

    public formulario_basico() {

        initComponents();

        limpiar();
        look();

    }

    void limpiar() {

        txcedula.setText("");
        txnombre.setText("");
        txfecha_nacimiento.setText("");
        txfecha_ingreso.setText("");
        selhombre.setEnabled(false);
        selmujer.setEnabled(false);

    }

    void look() {

        txcedula.setEnabled(false);
        txnombre.setEnabled(false);
        txfecha_nacimiento.setEnabled(false);
        txfecha_ingreso.setEnabled(false);
        btregistro.setEnabled(true);
        btcancelar.setEnabled(false);
        btsiguiente.setEnabled(false);
        selhombre.setEnabled(false);
        selmujer.setEnabled(false);
    }

    void free() {

        txcedula.setEnabled(true);
        txnombre.setEnabled(true);
        txfecha_nacimiento.setEnabled(true);
        txfecha_ingreso.setEnabled(true);
        btregistro.setEnabled(true);
        btcancelar.setEnabled(true);
        btsiguiente.setEnabled(true);
        selhombre.setEnabled(true);
        selmujer.setEnabled(true);
    }

    void validar(String txcedula, String txnombre, String txfecha_nacimiento, String txfecha_ingreso) {

        if (txcedula.equals("") || txnombre.equals("") || txfecha_nacimiento.equals("") || txfecha_ingreso.equals("")) {

            JOptionPane.showMessageDialog(null, "No se pueden dejar espacios en Blanco", "Error espacios en blanco", JOptionPane.ERROR_MESSAGE);

        } else {
            registro_datos guardaDatos = new registro_datos();
            guardaDatos.setCedula(Integer.parseInt(this.txcedula.getText()));
            guardaDatos.setNombre(this.txnombre.getText());
            guardaDatos.setFecha_nacimiento(this.txfecha_nacimiento.getText());
            guardaDatos.setFecha_ingreso(this.txfecha_ingreso.getText());

            if (selhombre.isSelected()) {
                guardaDatos.setSexo("hombre");
            } else {
                guardaDatos.setSexo("mujer");
            }

            formulario_avanzado dat = new formulario_avanzado();
            dat.setVisible(true);
            this.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        Sexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        selmujer = new javax.swing.JRadioButton();
        selhombre = new javax.swing.JRadioButton();
        txcedula = new javax.swing.JTextField();
        txnombre = new javax.swing.JTextField();
        txfecha_ingreso = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jLabel10 = new javax.swing.JLabel();
        btregistro = new javax.swing.JButton();
        btsalir = new javax.swing.JButton();
        btsiguiente = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();
        txfecha_nacimiento = new javax.swing.JTextField();

        jLabel8.setText("Fecha de Nacimiento");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setName("Registro Planilla"); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Cooper Black", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("HOSPITAL SANITICO ");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setText("REGISTRO DEL PERSONAL DE PLANILLA");

        jLabel4.setText("Nombre");

        jLabel5.setText("Identificación");

        jLabel7.setText("Fecha de Nacimiento");

        jLabel6.setText("Fecha de Ingreso al Hospital");

        jLabel9.setText("Sexo");

        Sexo.add(selmujer);
        selmujer.setText("Mujer");
        selmujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selmujerActionPerformed(evt);
            }
        });

        Sexo.add(selhombre);
        selhombre.setText("Hombre");
        selhombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selhombreActionPerformed(evt);
            }
        });

        txcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txcedulaActionPerformed(evt);
            }
        });
        txcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txcedulaKeyTyped(evt);
            }
        });

        txnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txnombreActionPerformed(evt);
            }
        });
        txnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txnombreKeyTyped(evt);
            }
        });

        txfecha_ingreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfecha_ingresoKeyTyped(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tarea2_elmer/enfermera.jpg"))); // NOI18N

        btregistro.setText("Nuevo Registro");
        btregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btregistroActionPerformed(evt);
            }
        });

        btsalir.setText("Salir");
        btsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalirActionPerformed(evt);
            }
        });

        btsiguiente.setText("Siguiente >>");
        btsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsiguienteActionPerformed(evt);
            }
        });

        btcancelar.setText("Cancelar");
        btcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelarActionPerformed(evt);
            }
        });

        txfecha_nacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfecha_nacimientoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btsalir)
                                .addGap(42, 42, 42))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btsiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(25, 25, 25)
                                            .addComponent(txnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(27, 27, 27)
                                                            .addComponent(selhombre)))
                                                    .addGap(18, 18, 18))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(45, 45, 45)))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txfecha_ingreso, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                                .addComponent(selmujer)
                                                .addComponent(txfecha_nacimiento)))))
                                .addGap(90, 90, 90)))
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfecha_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selhombre)
                    .addComponent(selmujer))
                .addGap(37, 37, 37)
                .addComponent(btregistro)
                .addGap(27, 27, 27)
                .addComponent(btsiguiente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btcancelar)
                .addGap(29, 29, 29)
                .addComponent(btsalir)
                .addGap(222, 222, 222))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txcedulaActionPerformed
        txcedula.transferFocus();   // el cursor brinque a la proxima caja de texto
    }//GEN-LAST:event_txcedulaActionPerformed

    private void selhombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selhombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selhombreActionPerformed

    private void selmujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selmujerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selmujerActionPerformed

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        int confirma = JOptionPane.showConfirmDialog(null, "Realmente desea salir", "Confirmación de salida", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            this.dispose(); //salir del programa
        }
    }//GEN-LAST:event_btsalirActionPerformed

    private void btregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btregistroActionPerformed
        limpiar();
        free();//libera las cajas de texto
        txcedula.requestFocus();
    }//GEN-LAST:event_btregistroActionPerformed

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
        look();        // bloquea las cajas de texto
    }//GEN-LAST:event_btcancelarActionPerformed

    private void txnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txnombreActionPerformed
        txnombre.transferFocus();        // espacio para escribir el nombre
    }//GEN-LAST:event_txnombreActionPerformed

    private void btsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsiguienteActionPerformed

        validar((txcedula.getText()), txnombre.getText(), txfecha_nacimiento.getText(), txfecha_ingreso.getText());


    }//GEN-LAST:event_btsiguienteActionPerformed

    private void txcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txcedulaKeyTyped
        char a = evt.getKeyChar(); // bloquea letras permite solo numeros

        if (a < '0' || a > '9') {
            evt.consume();
        }

    }//GEN-LAST:event_txcedulaKeyTyped

    private void txfecha_ingresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfecha_ingresoKeyTyped

        char a = evt.getKeyChar();
        if ((a < '0' || a > '9') && (a != '/')) {
            evt.consume();       // bloquea letras permite solo numeros y carácter /
        }


    }//GEN-LAST:event_txfecha_ingresoKeyTyped

    private void txnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txnombreKeyTyped
        char a = evt.getKeyChar();

        if (((a < 'a' || a > 'z') && (a < 'A' || a > 'Z')) && (a != ' ')) {
            evt.consume(); // bloquea numeros permite solo letras y espacios//
        }

    }//GEN-LAST:event_txnombreKeyTyped

    private void txfecha_nacimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfecha_nacimientoKeyTyped
        char a = evt.getKeyChar();

        if ((a < '0' || a > '9') && (a != '/')) {
            evt.consume();       // bloquea letras permite solo numeros
        }
    }//GEN-LAST:event_txfecha_nacimientoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Sexo;
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btregistro;
    private javax.swing.JButton btsalir;
    private javax.swing.JButton btsiguiente;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton selhombre;
    private javax.swing.JRadioButton selmujer;
    private javax.swing.JTextField txcedula;
    private javax.swing.JTextField txfecha_ingreso;
    private javax.swing.JTextField txfecha_nacimiento;
    private javax.swing.JTextField txnombre;
    // End of variables declaration//GEN-END:variables
}
