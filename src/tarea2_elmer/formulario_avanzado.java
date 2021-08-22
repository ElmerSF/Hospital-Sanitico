/*
Este formulario es para guardar la información de acuerdo con el tipo de empleado
 */
package tarea2_elmer;

import javax.swing.JOptionPane;

public class formulario_avanzado extends javax.swing.JFrame {

    private int opcion;

    public formulario_avanzado() {

        initComponents();

        look1();

    }

    void look1() { //bloquea todas las opciones y solo habilita las de doctor
        labespecialidad.setEnabled(true);
        txespecialidad.setEditable(true);
        labcertificaciones.setEnabled(true);
        txcertificaciones.setEditable(true);
        labasistente.setEnabled(false);
        asistente_si.setEnabled(false);
        asistente_no.setEnabled(false);
        labobstetra.setEnabled(false);
        obstetra_si.setEnabled(false);
        obstetra_no.setEnabled(false);
        labcamas.setEnabled(false);
        txcamas.setEditable(false);
        labdepartamento.setEnabled(false);
        txdepartamento.setEnabled(false);
        labcentro_costos.setEnabled(false);
        txcentro_costos.setEditable(false);
        lablabor.setEnabled(false);
        txlabor.setEditable(false);

    }

    void look2() {
        labespecialidad.setEnabled(false);
        txespecialidad.setEditable(false);
        labcertificaciones.setEnabled(false);
        txcertificaciones.setEditable(false);
        labasistente.setEnabled(true);
        asistente_si.setEnabled(true);
        asistente_no.setEnabled(true);
        labobstetra.setEnabled(true);
        obstetra_si.setEnabled(true);
        obstetra_no.setEnabled(true);
        labcamas.setEnabled(false);
        txcamas.setEditable(false);
        labdepartamento.setEnabled(false);
        txdepartamento.setEnabled(false);
        labcentro_costos.setEnabled(false);
        txcentro_costos.setEditable(false);
        lablabor.setEnabled(false);
        txlabor.setEditable(false);
    }

    void look3() {
        labespecialidad.setEnabled(false);
        txespecialidad.setEditable(false);
        labcertificaciones.setEnabled(false);
        txcertificaciones.setEditable(false);
        labasistente.setEnabled(false);
        asistente_si.setEnabled(false);
        asistente_no.setEnabled(false);
        labobstetra.setEnabled(false);
        obstetra_si.setEnabled(false);
        obstetra_no.setEnabled(false);
        labcamas.setEnabled(true);
        txcamas.setEditable(true);
        labdepartamento.setEnabled(false);
        txdepartamento.setEnabled(false);
        labcentro_costos.setEnabled(false);
        txcentro_costos.setEditable(false);
        lablabor.setEnabled(false);
        txlabor.setEditable(false);
    }

    void look4() {
        labespecialidad.setEnabled(false);
        txespecialidad.setEditable(false);
        labcertificaciones.setEnabled(false);
        txcertificaciones.setEditable(false);
        labasistente.setEnabled(false);
        asistente_si.setEnabled(false);
        asistente_no.setEnabled(false);
        labobstetra.setEnabled(false);
        obstetra_si.setEnabled(false);
        obstetra_no.setEnabled(false);
        labcamas.setEnabled(false);
        txcamas.setEditable(false);
        labdepartamento.setEnabled(true);
        txdepartamento.setEnabled(true);
        labcentro_costos.setEnabled(true);
        txcentro_costos.setEditable(true);
        lablabor.setEnabled(false);
        txlabor.setEditable(false);
    }

    void look5() {
        labespecialidad.setEnabled(false);
        txespecialidad.setEditable(false);
        labcertificaciones.setEnabled(false);
        txcertificaciones.setEditable(false);
        labasistente.setEnabled(false);
        asistente_si.setEnabled(false);
        asistente_no.setEnabled(false);
        labobstetra.setEnabled(false);
        obstetra_si.setEnabled(false);
        obstetra_no.setEnabled(false);
        labcamas.setEnabled(false);
        txcamas.setEditable(false);
        labdepartamento.setEnabled(false);
        txdepartamento.setEnabled(false);
        labcentro_costos.setEnabled(false);
        txcentro_costos.setEditable(false);
        lablabor.setEnabled(true);
        txlabor.setEditable(true);
    }

    void limpiar() {

        txespecialidad.setText("");
        txcertificaciones.setText("");

        asistente_si.setSelected(false);
        asistente_no.setSelected(false);

        obstetra_si.setSelected(false);
        obstetra_no.setSelected(false);

        txcamas.setText("");

        txdepartamento.setText("");
        txcentro_costos.setText("");

        txlabor.setText("");
    }

    void escogencia() {
        registro_datos em = new registro_datos();
        em.setTipo_empleado(tipo_empleado.getSelectedItem().toString());
        opcion = tipo_empleado.getSelectedIndex();

        switch (opcion) {
            case 0:
                medico ver1 = new medico();
                ver1.setEspecialidad(txespecialidad.getText());
                ver1.setCertificaciones(Integer.parseInt(txcertificaciones.getText()));

                break;

            case 1:
                enfermero ver2 = new enfermero();
                Resumen data = new Resumen();
                ver2.setAsistente(asistente_si.isSelected());
                ver2.setObstetra(obstetra_si.isSelected());
                if (asistente_si.isSelected()) {
                    data.setAsis("Si");
                } else {
                    data.setAsis("No");
                }

                if (obstetra_si.isSelected()) {
                    data.setObs("Si");
                } else {
                    data.setObs("No");
                }

                break;

            case 2:
                camilleros ver3 = new camilleros();
                ver3.setNumero_camas(Integer.parseInt(txcamas.getText()));

                break;

            case 3:
                administrativos ver4 = new administrativos();
                ver4.setDepartamento(txdepartamento.getText());
                ver4.setCentro_costos(txcentro_costos.getText());

                break;

            case 4:
                miscelaneos ver5 = new miscelaneos();
                ver5.setLabor_actual(txlabor.getText());

                break;

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        op_asistente = new javax.swing.ButtonGroup();
        op_obstetra = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labespecialidad = new javax.swing.JLabel();
        txespecialidad = new javax.swing.JTextField();
        labcertificaciones = new javax.swing.JLabel();
        txcertificaciones = new javax.swing.JTextField();
        labasistente = new javax.swing.JLabel();
        asistente_si = new javax.swing.JRadioButton();
        asistente_no = new javax.swing.JRadioButton();
        labobstetra = new javax.swing.JLabel();
        obstetra_si = new javax.swing.JRadioButton();
        obstetra_no = new javax.swing.JRadioButton();
        labcamas = new javax.swing.JLabel();
        txcamas = new javax.swing.JTextField();
        labdepartamento = new javax.swing.JLabel();
        txdepartamento = new javax.swing.JTextField();
        labcentro_costos = new javax.swing.JLabel();
        txcentro_costos = new javax.swing.JTextField();
        txlabor = new javax.swing.JTextField();
        lablabor = new javax.swing.JLabel();
        btmostrar_datos = new javax.swing.JButton();
        btsalir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btcancelar1 = new javax.swing.JButton();
        tipo_empleado = new javax.swing.JComboBox<>();
        labtipo_empleado = new javax.swing.JLabel();
        btmostrar_ventana = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setText("REGISTRO DEL PERSONAL DE PLANILLA");

        labespecialidad.setText("Especialidad");

        txespecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txespecialidadActionPerformed(evt);
            }
        });
        txespecialidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txespecialidadKeyTyped(evt);
            }
        });

        labcertificaciones.setText("Cantidad de Certificaciones ");

        txcertificaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txcertificacionesKeyTyped(evt);
            }
        });

        labasistente.setText("Es Asistente");

        op_asistente.add(asistente_si);
        asistente_si.setText("SI");
        asistente_si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asistente_siActionPerformed(evt);
            }
        });

        op_asistente.add(asistente_no);
        asistente_no.setText("NO");

        labobstetra.setText("Es Obstreta");

        op_obstetra.add(obstetra_si);
        obstetra_si.setText("SI");
        obstetra_si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obstetra_siActionPerformed(evt);
            }
        });

        op_obstetra.add(obstetra_no);
        obstetra_no.setText("NO");

        labcamas.setText("Numero de Camas que atiende");

        txcamas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txcamasKeyTyped(evt);
            }
        });

        labdepartamento.setText("Departamento");

        txdepartamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txdepartamentoKeyTyped(evt);
            }
        });

        labcentro_costos.setText("Centro de Costos");

        txcentro_costos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txcentro_costosKeyTyped(evt);
            }
        });

        txlabor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txlaborKeyTyped(evt);
            }
        });

        lablabor.setText("Labor actual");

        btmostrar_datos.setText("Mostrar Datos en Terminal");
        btmostrar_datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmostrar_datosActionPerformed(evt);
            }
        });

        btsalir.setText("Salir");
        btsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalirActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tarea2_elmer/enfermera 2.jpg"))); // NOI18N

        btcancelar1.setText("Cancelar");
        btcancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelar1ActionPerformed(evt);
            }
        });

        tipo_empleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medico", "Enfermero", "Camillero", "Administrativo", "Miscelaneo" }));
        tipo_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_empleadoActionPerformed(evt);
            }
        });

        labtipo_empleado.setText("Seleccione el tipo de Empleado");

        btmostrar_ventana.setText("Mostrar Datos en Ventana");
        btmostrar_ventana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmostrar_ventanaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labcamas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txcamas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labcentro_costos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txcentro_costos))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labdepartamento)
                                        .addGap(18, 18, 18)
                                        .addComponent(txdepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lablabor)
                                .addGap(18, 18, 18)
                                .addComponent(txlabor, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labobstetra, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(obstetra_si)
                                        .addGap(10, 10, 10)
                                        .addComponent(obstetra_no))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(asistente_si)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(asistente_no))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labasistente, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labcertificaciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txcertificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labtipo_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tipo_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labespecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txespecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btmostrar_datos, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(btcancelar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btmostrar_ventana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btsalir)
                .addGap(92, 92, 92))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tipo_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labtipo_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labespecialidad)
                            .addComponent(txespecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txcertificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labcertificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labasistente)
                            .addComponent(asistente_si)
                            .addComponent(asistente_no))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labobstetra)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(obstetra_si)
                                .addComponent(obstetra_no)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labcamas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txcamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labdepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txdepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labcentro_costos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txcentro_costos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lablabor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txlabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(btcancelar1)
                        .addGap(29, 29, 29)
                        .addComponent(btmostrar_datos)
                        .addGap(18, 18, 18)
                        .addComponent(btmostrar_ventana))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btsalir)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void asistente_siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asistente_siActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asistente_siActionPerformed

    private void obstetra_siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obstetra_siActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_obstetra_siActionPerformed

    private void btmostrar_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmostrar_datosActionPerformed
        escogencia();
        opcion = tipo_empleado.getSelectedIndex();
        switch (opcion) {
            case 0:
                medico ver1 = new medico();
                System.out.print(ver1.muestraDatos());

                break;

            case 1:
                enfermero ver2 = new enfermero();
                System.out.print(ver2.muestraDatos());
                break;

            case 2:
                camilleros ver3 = new camilleros();
                System.out.print(ver3.muestraDatos());
                break;

            case 3:
                administrativos ver4 = new administrativos();
                System.out.print(ver4.muestraDatos());
                break;

            case 4:
                miscelaneos ver5 = new miscelaneos();
                System.out.print(ver5.muestraDatos());
                break;

        }
    }//GEN-LAST:event_btmostrar_datosActionPerformed

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed

        int confirma = JOptionPane.showConfirmDialog(null, "Realmente desea salir", "Confirmación de salida", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            System.exit(0);
        }


    }//GEN-LAST:event_btsalirActionPerformed

    private void txespecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txespecialidadActionPerformed
        // TO
    }//GEN-LAST:event_txespecialidadActionPerformed

    private void btcancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelar1ActionPerformed
        limpiar();

    }//GEN-LAST:event_btcancelar1ActionPerformed

    private void tipo_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_empleadoActionPerformed
        // tipo de empleado
        registro_datos empleado = new registro_datos();
        empleado.setTipo_empleado(tipo_empleado.getSelectedItem().toString());
        opcion = tipo_empleado.getSelectedIndex();
        switch (opcion) {
            case 0:
                look1();

                break;

            case 1:
                look2();

                break;

            case 2:
                look3();

                break;

            case 3:
                look4();

                break;

            case 4:
                look5();

                break;

        }
    }//GEN-LAST:event_tipo_empleadoActionPerformed

    private void txespecialidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txespecialidadKeyTyped
        char a = evt.getKeyChar();

        if (((a < 'a' || a > 'z') && (a < 'A' || a > 'Z')) && (a != ' ')) {
            evt.consume(); // bloquea numeros permite solo letras y espacios//
        }
    }//GEN-LAST:event_txespecialidadKeyTyped

    private void txdepartamentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txdepartamentoKeyTyped
        char a = evt.getKeyChar();

        if (((a < 'a' || a > 'z') && (a < 'A' || a > 'Z')) && (a != ' ')) {
            evt.consume(); // bloquea numeros permite solo letras y espacios//
        }
    }//GEN-LAST:event_txdepartamentoKeyTyped

    private void txcentro_costosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txcentro_costosKeyTyped
        char a = evt.getKeyChar();

        if (((a < 'a' || a > 'z') && (a < 'A' || a > 'Z')) && (a != ' ')) {
            evt.consume(); // bloquea numeros permite solo letras y espacios//
        }
    }//GEN-LAST:event_txcentro_costosKeyTyped

    private void txlaborKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txlaborKeyTyped
        char a = evt.getKeyChar();

        if (((a < 'a' || a > 'z') && (a < 'A' || a > 'Z')) && (a != ' ')) {
            evt.consume(); // bloquea numeros permite solo letras y espacios//
        }
    }//GEN-LAST:event_txlaborKeyTyped

    private void txcertificacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txcertificacionesKeyTyped

        char a = evt.getKeyChar();
        if ((a < '0' || a > '9') && (a != '/')) {
            evt.consume();       // bloquea letras permite solo numeros y carácter /
        }

    }//GEN-LAST:event_txcertificacionesKeyTyped

    private void txcamasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txcamasKeyTyped

        char a = evt.getKeyChar();
        if ((a < '0' || a > '9') && (a != '/')) {
            evt.consume();       // bloquea letras permite solo numeros y carácter /
        }

    }//GEN-LAST:event_txcamasKeyTyped

    private void btmostrar_ventanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmostrar_ventanaActionPerformed
        escogencia();

        Resumen most = new Resumen();
        most.setVisible(true);
// mostrar los datos en una Ventana
    }//GEN-LAST:event_btmostrar_ventanaActionPerformed

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
            java.util.logging.Logger.getLogger(formulario_avanzado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulario_avanzado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulario_avanzado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulario_avanzado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulario_avanzado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton asistente_no;
    private javax.swing.JRadioButton asistente_si;
    private javax.swing.JButton btcancelar1;
    private javax.swing.JButton btmostrar_datos;
    private javax.swing.JToggleButton btmostrar_ventana;
    private javax.swing.JButton btsalir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labasistente;
    private javax.swing.JLabel labcamas;
    private javax.swing.JLabel labcentro_costos;
    private javax.swing.JLabel labcertificaciones;
    private javax.swing.JLabel labdepartamento;
    private javax.swing.JLabel labespecialidad;
    private javax.swing.JLabel lablabor;
    private javax.swing.JLabel labobstetra;
    private javax.swing.JLabel labtipo_empleado;
    private javax.swing.JRadioButton obstetra_no;
    private javax.swing.JRadioButton obstetra_si;
    private javax.swing.ButtonGroup op_asistente;
    private javax.swing.ButtonGroup op_obstetra;
    private javax.swing.JComboBox<String> tipo_empleado;
    private javax.swing.JTextField txcamas;
    private javax.swing.JTextField txcentro_costos;
    private javax.swing.JTextField txcertificaciones;
    private javax.swing.JTextField txdepartamento;
    private javax.swing.JTextField txespecialidad;
    private javax.swing.JTextField txlabor;
    // End of variables declaration//GEN-END:variables
}
