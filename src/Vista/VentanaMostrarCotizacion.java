/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Datos.GuardarDatos;
import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS 10
 */
public class VentanaMostrarCotizacion extends javax.swing.JFrame {

    /** Creates new form VentanaMostrarCotizacion */
    public VentanaMostrarCotizacion() {
        initComponents();
        this.setSize(577, 338);
        this.setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        botonMostrar = new javax.swing.JButton();
        datosCotizacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        recuperarDatos = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setText("Volver");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(330, 260, 150, 50);

        botonMostrar.setText("Mostrar");
        botonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonMostrar);
        botonMostrar.setBounds(130, 260, 160, 50);

        datosCotizacion.setText("Ingresar informacion.");
        getContentPane().add(datosCotizacion);
        datosCotizacion.setBounds(120, 30, 190, 50);

        recuperarDatos.setColumns(20);
        recuperarDatos.setRows(5);
        jScrollPane1.setViewportView(recuperarDatos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(120, 100, 190, 100);

        jLabel2.setText("Datos :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 100, 70, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Fondo pantallas 4.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 580, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       VentanaDatos ventanaDatos = new VentanaDatos();
         dispose();
         ventanaDatos.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void botonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarActionPerformed
        GuardarDatos  gd = new GuardarDatos();
        if(datosCotizacion.getText().equals("")){
          JOptionPane.showMessageDialog(this,"Campo vacio");
        }else{
            String linea = datosCotizacion.getText();
            String mostrar= "";
            gd.mostrarCotizacion(linea , mostrar);
            recuperarDatos.setText(gd.getMostrar());
            if(recuperarDatos.getText().equals("")){
                JOptionPane.showMessageDialog(this,"no hay cotizaciones asociadas");
            }
        }
    }//GEN-LAST:event_botonMostrarActionPerformed


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
            java.util.logging.Logger.getLogger(VentanaMostrarCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMostrarCotizacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonMostrar;
    private javax.swing.JTextField datosCotizacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea recuperarDatos;
    // End of variables declaration//GEN-END:variables

}
