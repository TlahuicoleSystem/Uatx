/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author Josue-Chuwi
 */
public class MEDICAMENTO extends javax.swing.JFrame {

    /**
     * Creates new form MEDICAMENTO
     */
    public MEDICAMENTO() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        contacto = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        imagen1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto1 = new javax.swing.JTextArea();
        paracetamol = new javax.swing.JRadioButton();
        prednisona = new javax.swing.JRadioButton();
        ibuprofeno = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        imagen2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        texto2 = new javax.swing.JTextArea();
        neurobion = new javax.swing.JRadioButton();
        fentanilo = new javax.swing.JRadioButton();
        Bromu = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        imagen3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        texto3 = new javax.swing.JTextArea();
        telefono = new javax.swing.JRadioButton();
        facebook = new javax.swing.JRadioButton();
        twiter = new javax.swing.JRadioButton();
        web = new javax.swing.JRadioButton();
        correo = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        texto1.setEditable(false);
        texto1.setColumns(20);
        texto1.setRows(5);
        jScrollPane1.setViewportView(texto1);

        buttonGroup1.add(paracetamol);
        paracetamol.setText("Paracetamol");
        paracetamol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paracetamolActionPerformed(evt);
            }
        });

        buttonGroup1.add(prednisona);
        prednisona.setText("prednisona");
        prednisona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prednisonaActionPerformed(evt);
            }
        });

        buttonGroup1.add(ibuprofeno);
        ibuprofeno.setText("ibuprofeno");
        ibuprofeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ibuprofenoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(paracetamol)
                        .addGap(179, 179, 179)
                        .addComponent(prednisona)
                        .addGap(244, 244, 244)
                        .addComponent(ibuprofeno)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(imagen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paracetamol)
                    .addComponent(prednisona)
                    .addComponent(ibuprofeno))
                .addGap(20, 20, 20))
        );

        contacto.addTab("TABLETAS", jPanel2);

        texto2.setEditable(false);
        texto2.setColumns(20);
        texto2.setRows(5);
        jScrollPane2.setViewportView(texto2);

        neurobion.setText("neurobion");
        neurobion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neurobionActionPerformed(evt);
            }
        });

        fentanilo.setText("fentanilo");
        fentanilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fentaniloActionPerformed(evt);
            }
        });

        Bromu.setText("BromuroHioscina");
        Bromu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BromuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(neurobion)
                        .addGap(65, 65, 65)
                        .addComponent(fentanilo)
                        .addGap(67, 67, 67)
                        .addComponent(Bromu)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(imagen2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(neurobion)
                    .addComponent(fentanilo)
                    .addComponent(Bromu))
                .addContainerGap())
        );

        contacto.addTab("INYECTABLES", jPanel3);

        texto3.setColumns(20);
        texto3.setRows(5);
        jScrollPane3.setViewportView(texto3);

        telefono.setText("Telefono:");
        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });

        facebook.setText("Facebook");
        facebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facebookActionPerformed(evt);
            }
        });

        twiter.setText("Twiter");
        twiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twiterActionPerformed(evt);
            }
        });

        web.setText("Web");
        web.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                webActionPerformed(evt);
            }
        });

        correo.setText("Correo");
        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(telefono)
                        .addGap(66, 66, 66)
                        .addComponent(facebook))
                    .addComponent(imagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(twiter)
                        .addGap(106, 106, 106)
                        .addComponent(web)
                        .addGap(77, 77, 77)
                        .addComponent(correo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(imagen3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefono)
                    .addComponent(facebook)
                    .addComponent(twiter)
                    .addComponent(web)
                    .addComponent(correo))
                .addGap(40, 40, 40))
        );

        contacto.addTab("CONTACTO", jPanel4);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Menu Principal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(581, 581, 581)
                        .addComponent(jButton2))
                    .addComponent(contacto, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(contacto, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paracetamolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paracetamolActionPerformed
        // TODO add your handling code here:
        if (paracetamol.isSelected()) {
            imagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/paracetamol.jpg")));
            texto1.setText("El paracetamol, también conocido como acetaminofén \n o acetaminofeno, es un fármaco con propiedades analgésicas\n y antipiréticas utilizado principalmente para tratar la fiebre,\n y el dolor leve y moderado, ​​ aunque existen pocas evidencias de que su uso\n sea realmente eficaz en el alivio de la fiebre en niños.");
        }
    }//GEN-LAST:event_paracetamolActionPerformed

    private void prednisonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prednisonaActionPerformed
        // TODO add your handling code here:
        if (prednisona.isSelected()) {
            imagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/prednisona.jpg")));
            texto1.setText("Prednisona es un fármaco corticosteroide sintético \nque se toma usualmente en forma oral, pero puede ser administrado\n por vía intramuscular y es usado para un gran número de\n afecciones, como asma, gripe, fiebre, tos y para la bilis.");
        }

    }//GEN-LAST:event_prednisonaActionPerformed

    private void ibuprofenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ibuprofenoActionPerformed
        // TODO add your handling code here:
        if (ibuprofeno.isSelected()) {
            imagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/ibuprofeno.jpg")));
            texto1.setText("El ibuprofeno es un antiinflamatorio no esteroideo\n (AINE), utilizado frecuentemente como antipirético, analgésico\n y antiinflamatorio. Se utiliza para el alivio sintomático de\n la fiebre, dolor de cabeza (cefalea), dolor dental (odontalgia), dolor\n muscular o mialgia, molestias de la menstruación (dismenorrea),\n dolor neurológico de carácter leve o moderado y dolor postquirúrgico. También se usa para tratar cuadros inflamatorios, como los que se presentan en artritis,\n artritis reumatoide (AR), hinchazón muscular, dolor de garganta y artritis gotosa. Es usado en ocasiones\n para tratar el acné debido a sus propiedades antiinflamatorias1​ y ha sido expendido en Japón en forma tópica para acné de adultos.2​");
        }
    }//GEN-LAST:event_ibuprofenoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        MenuPrincipal MP = new MenuPrincipal();
        MP.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void neurobionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neurobionActionPerformed
        // TODO add your handling code here:
        if (neurobion.isSelected()) {
            imagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/neurobion.jpg")));
            texto2.setText("Recibe el nombre de Neurobion o Nervobion un fármaco o \nmedicamento en forma de complejo multivitamínico el cual resulta conocido por contribuir a\n luchar contra inflamaciones y dolores derivados de la falta de cierto tipo de vitaminas.");
        }
    }//GEN-LAST:event_neurobionActionPerformed

    private void fentaniloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fentaniloActionPerformed
        // TODO add your handling code here:
        if (fentanilo.isSelected()) {
            imagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/fentanilo.jpg")));
            texto2.setText("El fentanilo es un agonista narcótico sintético opioide \nutilizado en medicina por sus acciones de analgesia y anestesia, tiene una potencia superior \na la morfina por lo que se emplea a dosis más baja que ésta, siendo el \nefecto final a dosis equivalentes similar al de la morfina.");
        }
    }//GEN-LAST:event_fentaniloActionPerformed

    private void BromuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BromuActionPerformed
        // TODO add your handling code here:
        if (Bromu.isSelected()) {
            imagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/BromuroHioscina.jpeg")));
            texto2.setText("La butilescopolamina es un antiespasmódico abdominal \nderivado de la escopolamina que se utiliza para tratar el dolor y las molestias causadas por cólicos \nabdominales u otras actividades espasmódicas del sistema digestivo.");
        }
    }//GEN-LAST:event_BromuActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
        if (telefono.isSelected()) {
            imagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/telefono.jpg")));
            texto3.setText("2783659072");
        }
    }//GEN-LAST:event_telefonoActionPerformed

    private void facebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facebookActionPerformed
        // TODO add your handling code here:
        if (facebook.isSelected()) {
            imagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/facebook.jpg")));
            texto3.setText("www.facebook.com/hospital");
        }
    }//GEN-LAST:event_facebookActionPerformed

    private void twiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twiterActionPerformed
        // TODO add your handling code here:
        if (twiter.isSelected()) {
            imagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/twiter.jpg")));
            texto3.setText("www.twiter,com/hospital");
        }
    }//GEN-LAST:event_twiterActionPerformed

    private void webActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_webActionPerformed
        // TODO add your handling code here:
        if (web.isSelected()) {
            imagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/Web.jpg")));
            texto3.setText("www.hospitalbuenaventura.com");
        }
    }//GEN-LAST:event_webActionPerformed

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
        if (correo.isSelected()) {
            imagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/imagenes/correo.jpg")));
            texto3.setText("www.josue@Hospitalbuenaventura");
        }
    }//GEN-LAST:event_correoActionPerformed

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
            java.util.logging.Logger.getLogger(MEDICAMENTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MEDICAMENTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MEDICAMENTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MEDICAMENTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MEDICAMENTO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Bromu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTabbedPane contacto;
    private javax.swing.JRadioButton correo;
    private javax.swing.JRadioButton facebook;
    private javax.swing.JRadioButton fentanilo;
    private javax.swing.JRadioButton ibuprofeno;
    private javax.swing.JLabel imagen1;
    private javax.swing.JLabel imagen2;
    private javax.swing.JLabel imagen3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton neurobion;
    private javax.swing.JRadioButton paracetamol;
    private javax.swing.JRadioButton prednisona;
    private javax.swing.JRadioButton telefono;
    private javax.swing.JTextArea texto1;
    private javax.swing.JTextArea texto2;
    private javax.swing.JTextArea texto3;
    private javax.swing.JRadioButton twiter;
    private javax.swing.JRadioButton web;
    // End of variables declaration//GEN-END:variables
}
