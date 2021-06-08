package Estacionamiento;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

public class Administrador extends javax.swing.JFrame {

    ConexionBD con = new ConexionBD();
    Connection cn = con.conexion();

    /**
     * Creates new form Administrador
     */
    public Administrador() {
        initComponents();
        setSize(665, 520);
        mostrar();
        mostrarD();

    }

    void mostrarD() {
        // Recuperamos los datos de sql en un vector y los ingresamosa a la tabla  
        String sql = "SELECT * FROM administrador";
        String datos[] = new String[3];
        Statement st;
        try {
            st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(2);
                datos[1] = rs.getString(3);
                datos[2] = rs.getString(4);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        nombreP.setText(datos[0]);
        usuarioP.setText(datos[1]);
        contraseñaP.setText(datos[2]);
    }

    void mostrar() {
        //Se crea el modelo de la tabla
        DefaultTableModel modelo1 = new DefaultTableModel();
        modelo1.addColumn("Matricula");
        modelo1.addColumn("Ocupacion");
        modelo1.addColumn("Turno");
        modelo1.addColumn("Nombre");
        mostrarDatos.setModel(modelo1);
        // Recuperamos los datos de sql en un vector y los ingresamosa a la tabla  
        String sql = "SELECT * FROM usuarios";
        String datos[] = new String[5];
        Statement st;
        try {
            st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                modelo1.addRow(datos);
            }
            mostrarDatos.setModel(modelo1);
        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void registrarNuevo() {
        String ocupacion;
        if (ocupacionEntrada.getSelectedItem().equals("Estudiante")) {
            ocupacion = "Estudiante";
        } else {
            ocupacion = "Personal";
        }
        ocupacionEntrada.getSelectedItem();
        try {
            // Boton para agregar elemtos a la base
            PreparedStatement act = cn.prepareStatement("INSERT INTO usuarios(Matricula,Ocupacion,Turno,Nombre) VALUES (?,?,?,?)");
            act.setString(1, matriculaNuevo.getText());
            act.setString(2, ocupacion);
            act.setString(3, licenciaturaNuevo.getText());
            act.setString(4, nombreNuevo.getText());
            act.executeUpdate();
            JOptionPane.showMessageDialog(null, "Guardado con exito");
            licenciaturaNuevo.setText("");
            nombreNuevo.setText("");
            matriculaNuevo.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        mostrar();

    }

    void eliminarUsuario() {
        // Boton eliminar
        int fila = mostrarDatos.getSelectedRow();
        String valormatricula = mostrarDatos.getValueAt(fila, 0).toString();
        try {
            PreparedStatement act = cn.prepareStatement("DELETE FROM usuarios WHERE Matricula='" + valormatricula + "'");
            act.executeUpdate();
            JOptionPane.showMessageDialog(null, "Elemento eliminado con exito");
            mostrar();
        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void generarReporte() {
        SimpleDateFormat dformat = new SimpleDateFormat("dd-MM-yyyy");
        String date = dformat.format(fechaC.getDate());
        System.out.println(date);

        //Se crea el modelo de la tabla
        DefaultTableModel modelo2 = new DefaultTableModel();
        modelo2.addColumn("Ocupacion");
        modelo2.addColumn("Nombre");
        modelo2.addColumn("Placa Vehiculo");
        modelo2.addColumn("Matricula Uatx");
        modelo2.addColumn("Folio de Ingreso");
        modelo2.addColumn("Hora de Entrada");
        modelo2.addColumn("Hora de Salida");
        modelo2.addColumn("Fecha");
        mostarDatosG.setModel(modelo2);
        // Recuperamos los datos de sql en un vector y los ingresamosa a la tabla  
        String sql = "SELECT * FROM ingresoSalida";
        String datos[] = new String[8];
        Statement st;
        int auxcontador=0;
        try {
            st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String auxFecha = rs.getString(8);
                if (auxFecha.equals(date)) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    datos[3] = rs.getString(4);
                    datos[4] = rs.getString(5);
                    datos[5] = rs.getString(6);
                    datos[6] = rs.getString(7);
                    datos[7] = rs.getString(8);
                    modelo2.addRow(datos);
                    auxcontador++;
                }
            }
            if(auxcontador==0){
                JOptionPane.showMessageDialog(null, "NO HAY REGISTROS EN ESA FECHA");
            }else{
                mostrarDatos.setModel(modelo2);
            }
        } catch (SQLException ex) {
            System.out.println("algo paso en sql");
        }
        catch (Exception ex) {
            
        }
       
    }

    void actualizarUsuario() {
        String ocupacion;
        if (ocupacionEntrada.getSelectedItem().equals("Estudiante")) {
            ocupacion = "Estudiante";
        } else {
            ocupacion = "Personal";
        }
        try {
            PreparedStatement act = cn.prepareStatement("UPDATE usuarios SET Matricula='" + matriculaNuevo.getText() + "',Ocupacion='" + ocupacion + "',Turno='" + licenciaturaNuevo.getText() + "',Nombre='" + nombreNuevo.getText() + "' WHERE Matricula='" + matriculaNuevo.getText() + "'");
            act.executeUpdate();
            JOptionPane.showMessageDialog(null, "MODIFICADO CON EXITO");
            mostrar();
            licenciaturaNuevo.setText("");
            nombreNuevo.setText("");
            matriculaNuevo.setText("");

        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void actualizarAdministrador() {
        try {
            PreparedStatement act = cn.prepareStatement("UPDATE administrador SET Nombre='" + nombreP.getText() + "',Usuario='" + usuarioP.getText() + "',Contraseña='" + contraseñaP.getText() + "' WHERE id='" + "1" + "'");
            act.executeUpdate();
            JOptionPane.showMessageDialog(null, "MODIFICADO CON EXITO");
            mostrarD();

        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void buscar() {
        //Se crea el modelo de la tabla
        DefaultTableModel modelo1 = new DefaultTableModel();
        modelo1.addColumn("Matricula");
        modelo1.addColumn("Ocupacion");
        modelo1.addColumn("Turno");
        modelo1.addColumn("Nombre");
        mostrarDatos.setModel(modelo1);
        // Recuperamos los datos de sql en un vector y los ingresamosa a la tabla  
        String sql = "SELECT * FROM usuarios WHERE Matricula LIKE '%" + matriculaB.getText() + "%'";
        String datos[] = new String[4];
        Statement st;
        try {
            st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                modelo1.addRow(datos);
            }
            mostrarDatos.setModel(modelo1);
        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Ingresar_Usuario = new javax.swing.JPanel();
        nombreNuevo = new javax.swing.JTextField();
        matriculaNuevo = new javax.swing.JTextField();
        licenciaturaNuevo = new javax.swing.JTextField();
        registrarNuevo = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrarDatos = new javax.swing.JTable();
        ocupacionEntrada = new javax.swing.JComboBox<>();
        inicio = new javax.swing.JButton();
        actualizarU = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        matriculaB = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        limpiar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        Perfiles = new javax.swing.JPanel();
        generar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        mostarDatosG = new javax.swing.JTable();
        fechaC = new com.toedter.calendar.JDateChooser();
        nombreP = new javax.swing.JTextField();
        actualizarD = new javax.swing.JButton();
        usuarioP = new javax.swing.JTextField();
        contraseñaP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTabbedPane1.setMaximumSize(new java.awt.Dimension(665, 520));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(665, 520));

        Ingresar_Usuario.setLayout(null);
        Ingresar_Usuario.add(nombreNuevo);
        nombreNuevo.setBounds(40, 180, 120, 30);

        matriculaNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriculaNuevoActionPerformed(evt);
            }
        });
        Ingresar_Usuario.add(matriculaNuevo);
        matriculaNuevo.setBounds(330, 180, 120, 30);
        Ingresar_Usuario.add(licenciaturaNuevo);
        licenciaturaNuevo.setBounds(180, 180, 120, 30);

        registrarNuevo.setBackground(new java.awt.Color(255, 255, 255));
        registrarNuevo.setText("Registrar Usuario");
        registrarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarNuevoActionPerformed(evt);
            }
        });
        Ingresar_Usuario.add(registrarNuevo);
        registrarNuevo.setBounds(50, 260, 130, 30);

        eliminar.setBackground(new java.awt.Color(255, 255, 255));
        eliminar.setText("Eliminar Usuario");
        eliminar.setMaximumSize(new java.awt.Dimension(115, 23));
        eliminar.setMinimumSize(new java.awt.Dimension(115, 23));
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        Ingresar_Usuario.add(eliminar);
        eliminar.setBounds(50, 300, 130, 30);

        mostrarDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(mostrarDatos);

        Ingresar_Usuario.add(jScrollPane1);
        jScrollPane1.setBounds(220, 290, 380, 120);

        ocupacionEntrada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Empleado Uat" }));
        ocupacionEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocupacionEntradaActionPerformed(evt);
            }
        });
        Ingresar_Usuario.add(ocupacionEntrada);
        ocupacionEntrada.setBounds(470, 180, 130, 30);

        inicio.setBackground(new java.awt.Color(255, 255, 255));
        inicio.setText("Ir a Principal");
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });
        Ingresar_Usuario.add(inicio);
        inicio.setBounds(50, 380, 130, 30);

        actualizarU.setBackground(new java.awt.Color(255, 255, 255));
        actualizarU.setText("Actualizar");
        actualizarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarUActionPerformed(evt);
            }
        });
        Ingresar_Usuario.add(actualizarU);
        actualizarU.setBounds(50, 340, 130, 30);

        buscar.setBackground(new java.awt.Color(255, 255, 255));
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        Ingresar_Usuario.add(buscar);
        buscar.setBounds(370, 260, 90, 23);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PARA MODIFICAR UN ELEMENTO INGRESE LOS NUEVOS CAMPOS Y DE CLICK EN ACTUALIZAR");
        Ingresar_Usuario.add(jLabel7);
        jLabel7.setBounds(50, 430, 470, 13);
        Ingresar_Usuario.add(matriculaB);
        matriculaB.setBounds(240, 260, 100, 20);

        jLabel8.setText("Ingrese Matrícula:");
        Ingresar_Usuario.add(jLabel8);
        jLabel8.setBounds(240, 240, 120, 14);

        limpiar.setBackground(new java.awt.Color(255, 255, 255));
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        Ingresar_Usuario.add(limpiar);
        limpiar.setBounds(500, 260, 90, 23);

        fondo.setBackground(new java.awt.Color(0, 0, 0));
        fondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Josue-Chuwi\\Downloads\\AI_Estacionamiento_Facultad\\AI_Estacionamiento_Facultad\\src\\Imagenes\\CRUD_Usuario.png")); // NOI18N
        Ingresar_Usuario.add(fondo);
        fondo.setBounds(0, 0, 650, 460);

        jTabbedPane1.addTab("Alta de Usuarios", Ingresar_Usuario);

        Perfiles.setMaximumSize(new java.awt.Dimension(665, 520));
        Perfiles.setMinimumSize(new java.awt.Dimension(665, 520));
        Perfiles.setLayout(null);

        generar.setText("Generar Reporte");
        generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarActionPerformed(evt);
            }
        });
        Perfiles.add(generar);
        generar.setBounds(60, 370, 113, 23);

        mostarDatosG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(mostarDatosG);

        Perfiles.add(jScrollPane2);
        jScrollPane2.setBounds(230, 230, 370, 160);
        Perfiles.add(fechaC);
        fechaC.setBounds(50, 300, 142, 20);
        Perfiles.add(nombreP);
        nombreP.setBounds(50, 180, 120, 30);

        actualizarD.setText("Actualizar");
        actualizarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarDActionPerformed(evt);
            }
        });
        Perfiles.add(actualizarD);
        actualizarD.setBounds(500, 180, 100, 23);
        Perfiles.add(usuarioP);
        usuarioP.setBounds(200, 180, 120, 30);
        Perfiles.add(contraseñaP);
        contraseñaP.setBounds(340, 180, 120, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Josue-Chuwi\\Downloads\\AI_Estacionamiento_Facultad\\AI_Estacionamiento_Facultad\\src\\Imagenes\\Perfiles.png")); // NOI18N
        Perfiles.add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 460);

        jTabbedPane1.addTab("Perfiles", Perfiles);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 1220, 830);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        // TODO add your handling code here:
        //yendo a login usuario
        dispose();
    }//GEN-LAST:event_inicioActionPerformed

    private void ocupacionEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocupacionEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ocupacionEntradaActionPerformed


    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        eliminarUsuario();
    }//GEN-LAST:event_eliminarActionPerformed


    private void registrarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarNuevoActionPerformed
        registrarNuevo();
    }//GEN-LAST:event_registrarNuevoActionPerformed


    private void matriculaNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriculaNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matriculaNuevoActionPerformed


    private void generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarActionPerformed
        generarReporte();
    }//GEN-LAST:event_generarActionPerformed


    private void actualizarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarDActionPerformed
        actualizarAdministrador();
    }//GEN-LAST:event_actualizarDActionPerformed


    private void actualizarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarUActionPerformed
        actualizarUsuario();
    }//GEN-LAST:event_actualizarUActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        buscar();
    }//GEN-LAST:event_buscarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // TODO add your handling code here:
        mostrar();
        matriculaB.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Ingresar_Usuario;
    private javax.swing.JPanel Perfiles;
    private javax.swing.JButton actualizarD;
    private javax.swing.JButton actualizarU;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField contraseñaP;
    private javax.swing.JButton eliminar;
    private com.toedter.calendar.JDateChooser fechaC;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton generar;
    private javax.swing.JButton inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField licenciaturaNuevo;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField matriculaB;
    private javax.swing.JTextField matriculaNuevo;
    private javax.swing.JTable mostarDatosG;
    private javax.swing.JTable mostrarDatos;
    private javax.swing.JTextField nombreNuevo;
    private javax.swing.JTextField nombreP;
    private javax.swing.JComboBox<String> ocupacionEntrada;
    private javax.swing.JButton registrarNuevo;
    private javax.swing.JTextField usuarioP;
    // End of variables declaration//GEN-END:variables

}
