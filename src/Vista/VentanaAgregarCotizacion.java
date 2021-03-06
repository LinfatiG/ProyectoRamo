/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Datos.GuardarDatos;
import Datos.Validador;
import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS 10
 */
public class VentanaAgregarCotizacion extends javax.swing.JFrame {

    /**
     * Creates new form VentanaAgregarCotizacion
     */
    public VentanaAgregarCotizacion() {
        initComponents();
        this.setSize(563, 352);
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

        jButton1 = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textoRut = new javax.swing.JTextField();
        textoNombre = new javax.swing.JTextField();
        textoContacto = new javax.swing.JTextField();
        textoDescripcion = new javax.swing.JTextField();
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
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(320, 270, 140, 50);

        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(botonGuardar);
        botonGuardar.setBounds(130, 270, 140, 50);

        jLabel2.setText("Rut :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 40, 50, 14);

        jLabel3.setText("Nombre : ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 90, 80, 14);

        jLabel5.setText("Contacto :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(130, 140, 90, 14);

        jLabel4.setText("Descripción :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 200, 110, 14);

        textoRut.setText("(Rut con puntos y guion.)");
        getContentPane().add(textoRut);
        textoRut.setBounds(220, 40, 200, 40);

        textoNombre.setText("(Primera letra mayuscula.)");
        getContentPane().add(textoNombre);
        textoNombre.setBounds(220, 90, 200, 40);

        textoContacto.setText("912345678");
        getContentPane().add(textoContacto);
        textoContacto.setBounds(220, 140, 200, 40);

        textoDescripcion.setText("Ingresar descripcion");
        getContentPane().add(textoDescripcion);
        textoDescripcion.setBounds(220, 190, 200, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Fondo pantallas 4.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-20, -10, 620, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     //ignorar 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
         VentanaDatos ventanaDatos = new VentanaDatos();
         dispose();
         ventanaDatos.setVisible(true);     
    }//GEN-LAST:event_jButton1MouseClicked

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
       Validador val = new Validador();
      GuardarDatos gd = new GuardarDatos();
      String nombre , rut , contacto , cotizacion ;
      nombre = textoNombre.getText(); 
        if (!val.validarNombre(nombre)){
        JOptionPane.showMessageDialog(this,"Asegurese de estar ingresando un nombre correcto(La primera letra tiene que ser Mayuscula)");                            
        }
        rut =textoRut.getText(); 
        if (!val.validarRut(rut)){
            JOptionPane.showMessageDialog(this,"Asegurese de estar ingresando un rut correcto)");                            
        }
        contacto = textoContacto.getText();
        if (!val.validarContacto(contacto)){
            JOptionPane.showMessageDialog(this,"Asegurese de estar ingresando un numero correcto");                            
        }
        cotizacion = textoDescripcion.getText();
        if (!val.validarTexto(cotizacion)){
            JOptionPane.showMessageDialog(this,"Asegurese de no ingresar caracteres)");                            
        }
        if(!val.validarNombre(nombre)||!val.validarRut(rut)||!val.validarContacto(contacto)||!val.validarTexto(cotizacion)){
            JOptionPane.showMessageDialog(this,"No se ha guardado.");
        }else{
        gd.guardarCotizacion(rut,nombre,contacto,cotizacion);
        JOptionPane.showMessageDialog(this,"Se guardo correctamente.");
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAgregarCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAgregarCotizacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField textoContacto;
    private javax.swing.JTextField textoDescripcion;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoRut;
    // End of variables declaration//GEN-END:variables
}
