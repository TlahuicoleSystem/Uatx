package em5;

/**
 *
 * @author Josue-Chuwi
 */
import javax.swing.JFileChooser;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Visual extends javax.swing.JFrame {

    Em5 codigo;  //Hacemos uso de la clase Em5
    String secretKey;

    public Visual() { // Constructor
        initComponents();
        codigo = new Em5(); // Inicializamos la varible 
        secretKey = "SomosProgramadores";
    }

    public String abrir() { // Metodo para abir el archivo
        String direc = "", texto = "";
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(this);
        File archivo = jf.getSelectedFile();
        if (archivo != null) {
            direc = (archivo.getAbsolutePath());
        }

        try {
            BufferedReader lectura = new BufferedReader(new FileReader(direc));
            String linea = lectura.readLine();
            while (linea != null) {
                texto = texto + linea + "\n";
                linea = lectura.readLine();
            }
        } catch (Exception ex) {
            Logger.getLogger(Visual.class.getName()).log(Level.SEVERE, null, ex);
        }

        return texto;
    }
    
    
    
    
    public void guardar(String cadena){
        String rutadestino = "";
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(this);
        File archivo = jf.getSelectedFile();
        if (archivo != null) {
            rutadestino = (archivo.getAbsolutePath());
        }
        //CREAMOS EL DOCUMENTO
        try {
            String ruta = rutadestino + ".txt";
            String contenido = cadena;
            File file = new File(ruta);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
            JOptionPane.showMessageDialog(null, "ARCHIVO CREADO CORRECTAMENTE");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        inicial_des = new javax.swing.JTextArea();
        boton_des = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        salida_des = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        bus_ingre_des = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        guardar_salida_des = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inicial_encriptar = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        boton_encriptar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        salida_encriptar = new javax.swing.JTextArea();
        bus_ingre_encrip = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        guardar_salida_encrip = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("INGRESA EL TEXTO... O BUSCA UN ARCHIVO A CONTINUACION...");

        inicial_des.setColumns(20);
        inicial_des.setRows(5);
        jScrollPane3.setViewportView(inicial_des);

        boton_des.setText("PROCESAR");
        boton_des.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_desActionPerformed(evt);
            }
        });

        salida_des.setColumns(20);
        salida_des.setRows(5);
        jScrollPane4.setViewportView(salida_des);

        jLabel6.setText("SU MENSAJE ES...");

        bus_ingre_des.setText("BUSCAR");
        bus_ingre_des.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bus_ingre_desActionPerformed(evt);
            }
        });

        jLabel7.setText("PARA GUARDAR EL RESULTADO DA CLICK EN EL BOTON GUARDAR");

        guardar_salida_des.setText("GUARDAR");
        guardar_salida_des.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_salida_desActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                            .addComponent(guardar_salida_des))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bus_ingre_des))
                        .addComponent(boton_des)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(261, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bus_ingre_des))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boton_des)
                .addGap(50, 50, 50)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(guardar_salida_des))
                .addContainerGap())
        );

        jTabbedPane1.addTab("DES-ENCRIPTAR", jPanel2);

        inicial_encriptar.setColumns(20);
        inicial_encriptar.setRows(5);
        jScrollPane1.setViewportView(inicial_encriptar);

        jLabel1.setText("INGRESA EL TEXTO...       O BUSCA UN ARCHIVO A CONTINUACION...");

        boton_encriptar.setText("PROCESAR");
        boton_encriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_encriptarActionPerformed(evt);
            }
        });

        jLabel3.setText("SU MENSAJE ES...");

        salida_encriptar.setColumns(20);
        salida_encriptar.setRows(5);
        jScrollPane5.setViewportView(salida_encriptar);

        bus_ingre_encrip.setText("BUSCAR");
        bus_ingre_encrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bus_ingre_encripActionPerformed(evt);
            }
        });

        jLabel8.setText("PARA GUARDAR EL RESULTADO DA CLICK EN EL BOTON GUARDAR");

        guardar_salida_encrip.setText("GUARDAR");
        guardar_salida_encrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_salida_encripActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guardar_salida_encrip))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                                    .addComponent(bus_ingre_encrip))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(107, 107, 107)
                                    .addComponent(boton_encriptar))
                                .addComponent(jScrollPane1)))))
                .addContainerGap(295, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bus_ingre_encrip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(boton_encriptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(guardar_salida_encrip))
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("ENCRIPTAR", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_encriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_encriptarActionPerformed
        // BOTON PARA ENCRIPTAR
        String cadenaOriginal = inicial_encriptar.getText(); //Recuperamos los datos el text

        //Llamamos el metodo y recuperaos el return
        String cadenaEncriptada = codigo.ecnode(secretKey, cadenaOriginal);

        salida_encriptar.setText(cadenaEncriptada);
    }//GEN-LAST:event_boton_encriptarActionPerformed

    
    
    
    private void boton_desActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_desActionPerformed
        // BOTON PARA DESENCRIPTAR
        String cadenaOriginal = inicial_des.getText();//Recuperamos los datos el text

        //Llamamos el metodo y recuperaos el return
        String cadenaDes = codigo.deecnode(secretKey, cadenaOriginal);

        salida_des.setText(cadenaDes);
    }//GEN-LAST:event_boton_desActionPerformed

     
    
    private void bus_ingre_encripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bus_ingre_encripActionPerformed
        // Metodo para buscar un archivo a encriptar
        inicial_encriptar.setText(abrir());
    }//GEN-LAST:event_bus_ingre_encripActionPerformed


    
    private void bus_ingre_desActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bus_ingre_desActionPerformed
        // Metodo para buscar un archivo a des-encriptar
        inicial_des.setText(abrir());
    }//GEN-LAST:event_bus_ingre_desActionPerformed

    
    
    private void guardar_salida_desActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_salida_desActionPerformed
        // Boton para guar el archivo desencriptado
        guardar(salida_des.getText());
    }//GEN-LAST:event_guardar_salida_desActionPerformed

    
    
    private void guardar_salida_encripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_salida_encripActionPerformed
        // Boton para guardar el archivo encriptado
        guardar(salida_encriptar.getText());
    }//GEN-LAST:event_guardar_salida_encripActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) { //metodo main
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
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                //PARA VENTANA AGRADABLE
                try {
                    try {
                        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    } catch (UnsupportedLookAndFeelException ex) {
                        Logger.getLogger(Visual.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Visual.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Visual.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Visual.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                
                new Visual().setVisible(true); // NO TOCAR

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_des;
    private javax.swing.JButton boton_encriptar;
    private javax.swing.JButton bus_ingre_des;
    private javax.swing.JButton bus_ingre_encrip;
    private javax.swing.JButton guardar_salida_des;
    private javax.swing.JButton guardar_salida_encrip;
    private javax.swing.JTextArea inicial_des;
    private javax.swing.JTextArea inicial_encriptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea salida_des;
    private javax.swing.JTextArea salida_encriptar;
    // End of variables declaration//GEN-END:variables
}
