/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS 10
 */
public class VentanaLogin extends javax.swing.JFrame {
    

    /**
     * Creates new form VentanaCliente
     */
    public VentanaLogin() {
        initComponents();
        this.setSize(570,500);
        this.setLocationRelativeTo(null);
        this.setFocusable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuario = new javax.swing.JLabel();
        contrasena = new javax.swing.JLabel();
        textoUsuario = new javax.swing.JTextField();
        textoContrasena = new javax.swing.JPasswordField();
        salir = new javax.swing.JButton();
        ingresar = new javax.swing.JButton();
        fondoMagbox = new javax.swing.JLabel();
        fondoBlanco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        usuario.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        usuario.setText("Usuario :");
        getContentPane().add(usuario);
        usuario.setBounds(250, 350, 110, 40);

        contrasena.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        contrasena.setText("Contraseña:");
        getContentPane().add(contrasena);
        contrasena.setBounds(220, 380, 130, 40);

        textoUsuario.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        getContentPane().add(textoUsuario);
        textoUsuario.setBounds(350, 350, 110, 30);

        textoContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoContrasenaActionPerformed(evt);
            }
        });
        getContentPane().add(textoContrasena);
        textoContrasena.setBounds(350, 390, 110, 30);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir);
        salir.setBounds(430, 440, 90, 30);

        ingresar.setText("Ingresar");
        ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarMouseClicked(evt);
            }
        });
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(ingresar);
        ingresar.setBounds(320, 440, 90, 30);

        fondoMagbox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/magbox.jpg"))); // NOI18N
        getContentPane().add(fondoMagbox);
        fondoMagbox.setBounds(-40, -50, 620, 410);

        fondoBlanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Blancoo.jpg"))); // NOI18N
        getContentPane().add(fondoBlanco);
        fondoBlanco.setBounds(0, 0, 583, 504);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
       String cuenta = "Marcos";//Acá se encuentra el usuario y la contrasena
       String clave = "123";
      if(textoUsuario.getText().equals(cuenta)&&textoContrasena.getText().equals(clave)){
         VentanaDatos ventanaDatos = new VentanaDatos();
         dispose();
         ventanaDatos.setVisible(true);
       }else if(textoUsuario.getText().equals("")&&textoContrasena.getText().equals("")){
          JOptionPane.showMessageDialog(this,"Campo vacio");
      }else{
           JOptionPane.showMessageDialog(this,"Usuario y/o contraseña incorrecta" );
      }
           
    }//GEN-LAST:event_ingresarActionPerformed

    private void textoContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoContrasenaActionPerformed

    private void ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresarMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contrasena;
    private javax.swing.JLabel fondoBlanco;
    private javax.swing.JLabel fondoMagbox;
    private javax.swing.JButton ingresar;
    private javax.swing.JButton salir;
    private javax.swing.JPasswordField textoContrasena;
    private javax.swing.JTextField textoUsuario;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables

    private Object ventanaCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}