package Estacionamiento;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;


public class LoginAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form LoginAdministrador
     */
    ConexionBD con = new ConexionBD();
    Connection cn = con.conexion();
    
    public LoginAdministrador() {
        initComponents();
        setSize(665, 520);
    }

    void entrar() {
        //Boton para ingresar
        String auxUsuario="", contraseña="";   
        String sql = "SELECT * FROM administrador";
        Statement st;
        try {
            st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                auxUsuario= rs.getString(3);
                contraseña = rs.getString(4);
                if (auxUsuario.equals(usuarioA.getText()) && Integer.parseInt(contraseñaA.getText()) == Integer.parseInt(contraseña)) {
                Administrador abrir = new Administrador();
                abrir.setVisible(true);
                dispose();
            }else{
                    JOptionPane.showMessageDialog(null, "DATOS INCORRECTOS");
                }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "LA CONTRASEÑA ES NUMERICA");
        }
        usuarioA.setText("");
        contraseñaA.setText("");


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuarioA = new javax.swing.JTextField();
        contraseñaA = new javax.swing.JPasswordField();
        entrarAdmin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(usuarioA);
        usuarioA.setBounds(400, 230, 180, 30);
        getContentPane().add(contraseñaA);
        contraseñaA.setBounds(400, 300, 180, 30);

        entrarAdmin.setText("Entrar");
        entrarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarAdminActionPerformed(evt);
            }
        });
        getContentPane().add(entrarAdmin);
        entrarAdmin.setBounds(430, 340, 130, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Josue-Chuwi\\Downloads\\AI_Estacionamiento_Facultad\\AI_Estacionamiento_Facultad\\src\\Imagenes\\Login_Admin.png")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 650, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarAdminActionPerformed
        entrar();
    }//GEN-LAST:event_entrarAdminActionPerformed

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
            java.util.logging.Logger.getLogger(LoginAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAdministrador().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contraseñaA;
    private javax.swing.JButton entrarAdmin;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField usuarioA;
    // End of variables declaration//GEN-END:variables
}
