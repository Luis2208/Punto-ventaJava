/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TWD_D
 */
public class AgregarRegistro extends javax.swing.JFrame {

    /**
     * Creates new form AgregarRegistro
     */
    public AgregarRegistro() {
        initComponents();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CODIGO = new javax.swing.JTextField();
        NOMBREPA = new javax.swing.JTextField();
        DESCRIPPA = new javax.swing.JTextField();
        PRODUCTOO = new javax.swing.JTextField();
        MARCAA = new javax.swing.JTextField();
        PRESENTACION = new javax.swing.JTextField();
        PRECIOO = new javax.swing.JTextField();
        CANTIDADD = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AGREGAR NUEVO REGISTRO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 46));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 204));
        jLabel2.setText("CODIGO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 66, 285, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 204));
        jLabel3.setText("NOMBRE DE PASILLO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 108, 285, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 204));
        jLabel4.setText("DESCRIPCI??N DE PASILLO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 151, 285, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 204));
        jLabel5.setText("NOMBRE DEL PRODUCTO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 193, 285, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 255, 204));
        jLabel6.setText("MARCA");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 234, 285, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 255, 204));
        jLabel7.setText("PRESENTACI??N DEL PRODUCTO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 276, 285, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 255, 204));
        jLabel8.setText("PRECIO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 318, 285, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 255, 204));
        jLabel9.setText("CANTIDAD");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 359, 285, -1));
        getContentPane().add(CODIGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 64, 256, -1));
        getContentPane().add(NOMBREPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 106, 256, -1));
        getContentPane().add(DESCRIPPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 149, 256, -1));
        getContentPane().add(PRODUCTOO, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 191, 256, -1));
        getContentPane().add(MARCAA, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 232, 256, -1));
        getContentPane().add(PRESENTACION, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 274, 256, -1));
        getContentPane().add(PRECIOO, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 316, 256, -1));
        getContentPane().add(CANTIDADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 357, 256, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/signo de mas.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 80, 113, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/escoba.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 232, 113, 119));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FLECHA.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 383, 111, 109));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lluvia.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                        CODIGO.setText("");
                        NOMBREPA.setText("");
                        DESCRIPPA.setText("");
                        PRODUCTOO.setText("");
                        MARCAA.setText("");
                        PRESENTACION.setText("");
                        PRECIOO.setText("");
                        CANTIDADD.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       VENTANA_PRINCIPAL a = new VENTANA_PRINCIPAL ();
          a.setVisible(true);
          this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int C, su, Codigo = 0, i= 0, b;
           String NombPa, DesP, NombrePro, Marc, PresP;
           double Precio, Cantidad;
           long t;
          
            try{
                File F = new File("inventario.dat");
                RandomAccessFile inve = new RandomAccessFile(F,"rw");
                
                t = inve.length();
                inve.seek(t);
                su= 1;
                Codigo= Integer.parseInt(CODIGO.getText());
                NombPa = NOMBREPA.getText();
                if(NombPa.length()<34)
                    for(C=NombPa.length(); C<34; C++){
                        NombPa= NombPa + " ";
                        DesP = DESCRIPPA.getText();
                        NombrePro= PRODUCTOO.getText();
                        Marc= MARCAA.getText();
                        PresP= PRESENTACION.getText();
                        Precio = Double.parseDouble(PRECIOO.getText());
                        Cantidad = Double.parseDouble(CANTIDADD.getText());
                        if(PresP.length()<34)
                            for(b=PresP.length(); b<34; b++)
                                  PresP= PresP + " ";
                        inve.writeInt(Codigo);
                        inve.writeUTF(NombPa);
                        inve.writeUTF(DesP);
                        inve.writeUTF(NombrePro);
                        inve.writeUTF(Marc);
                        inve.writeUTF(PresP);
                        inve.writeDouble(Precio);
                        inve.writeDouble(Cantidad);
                        CODIGO.setText("");
                        NOMBREPA.setText("");
                        DESCRIPPA.setText("");
                        PRODUCTOO.setText("");
                        MARCAA.setText("");
                        PRESENTACION.setText("");
                        PRECIOO.setText("");
                        CANTIDADD.setText("");
                    }
                        
                
           } catch (FileNotFoundException ex) {
            Logger.getLogger(AgregarRegistro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AgregarRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CANTIDADD;
    private javax.swing.JTextField CODIGO;
    private javax.swing.JTextField DESCRIPPA;
    private javax.swing.JTextField MARCAA;
    private javax.swing.JTextField NOMBREPA;
    private javax.swing.JTextField PRECIOO;
    private javax.swing.JTextField PRESENTACION;
    private javax.swing.JTextField PRODUCTOO;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
