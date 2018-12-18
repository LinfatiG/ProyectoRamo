/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Datos.Cliente;
import Datos.GuardarDatos;
import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS 10
 */
public class VentanaMostrarCliente extends javax.swing.JFrame {

    /**
     * Creates new form VentanaMostrarCliente
     */
    public VentanaMostrarCliente() {
        initComponents();
        this.setSize(558, 371);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonVolver = new javax.swing.JButton();
        datosCliente = new javax.swing.JTextField();
        mostrarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        recuperarDatos = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        imagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        botonVolver.setText("Volver");
        botonVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonVolverMouseClicked(evt);
            }
        });
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });
        getContentPane().add(botonVolver);
        botonVolver.setBounds(320, 280, 140, 50);

        datosCliente.setText("Escribir informacion");
        datosCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosClienteActionPerformed(evt);
            }
        });
        getContentPane().add(datosCliente);
        datosCliente.setBounds(80, 10, 260, 80);

        mostrarCliente.setText("Mostrar");
        mostrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarCliente);
        mostrarCliente.setBounds(150, 280, 140, 50);

        recuperarDatos.setColumns(20);
        recuperarDatos.setRows(5);
        jScrollPane1.setViewportView(recuperarDatos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 120, 260, 120);

        jLabel1.setText("Datos :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 130, 100, 20);

        imagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Fondo pantallas 4.jpg"))); // NOI18N
        getContentPane().add(imagenFondo);
        imagenFondo.setBounds(-10, -10, 570, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVolverMouseClicked
        VentanaDatos ventanaDatos = new VentanaDatos();
         dispose();
         ventanaDatos.setVisible(true);
    }//GEN-LAST:event_botonVolverMouseClicked

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        //ignorar
    }//GEN-LAST:event_botonVolverActionPerformed

    private void datosClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosClienteActionPerformed
        //ignorar
    }//GEN-LAST:event_datosClienteActionPerformed

    private void mostrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarClienteActionPerformed
        GuardarDatos  gd = new GuardarDatos();
        if(datosCliente.getText().equals("")){
          JOptionPane.showMessageDialog(this,"Campo vacio");
        }else{
            String linea = datosCliente.getText();
            String mostrar= "";
            gd.mostrarCliente(linea , mostrar);
            recuperarDatos.setText(gd.getMostrar());
            if(recuperarDatos.getText().equals("")){
                JOptionPane.showMessageDialog(this,"El cliente buscado no se encuentra registrado");
            }
        }
    }//GEN-LAST:event_mostrarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaMostrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaMostrarCliente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField datosCliente;
    private javax.swing.JLabel imagenFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mostrarCliente;
    private javax.swing.JTextArea recuperarDatos;
    // End of variables declaration//GEN-END:variables
}