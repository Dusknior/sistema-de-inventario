/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.io.File;
import javax.swing.table.DefaultTableModel;
import Clases.Metodos_CSV;
import Clases.Metodos_Eventos;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Clases.Metodos_Inventario;
import javax.swing.JOptionPane;
        
public class Inventario extends javax.swing.JFrame {
 
    Metodos_Eventos evento =  new Metodos_Eventos(); 
    
    public Inventario() {
        initComponents();
        Buscar.setEnabled(false);
        
        
    }
    File Documento;
    DefaultTableModel cargar;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Seleccionar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        Llenar = new javax.swing.JTextField();
        btnFactura = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Datos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Resultado = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes Inventario/Inventario.png"))); // NOI18N
        jLabel1.setText("INVENTARIO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Multiply_32px.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cerrar(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Minimixar(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, -1, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 800, 100));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Seleccionar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Seleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes Inventario/product-realise.png"))); // NOI18N
        Seleccionar.setText("CARGAR INVENTARIO");
        Seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarActionPerformed(evt);
            }
        });
        jPanel3.add(Seleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        Buscar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes Inventario/industrial-.png"))); // NOI18N
        Buscar.setText("BUSCAR ARTICULOS");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        jPanel3.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        Llenar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                LlenarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LlenarKeyTyped(evt);
            }
        });
        jPanel3.add(Llenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 60, 30));

        btnFactura.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes Inventario/clipboard.png"))); // NOI18N
        btnFactura.setText("FACTURA");
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });
        jPanel3.add(btnFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes Inventario/smart-home (1).png"))); // NOI18N
        jButton1.setText("SISTEMA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 780, 90));

        Datos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(Datos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 780, 300));

        Resultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Resultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CANTIDAD", "ARTICULO", "REF", "PRECIO DE COSTO", "PRECIO DE VENTA", "TIPO"
            }
        ));
        jScrollPane2.setViewportView(Resultado);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 780, 90));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 810, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarActionPerformed
      Buscar.setEnabled(true);
      try {
            cargar = Metodos_CSV.modelo_de_csv(Documento);
            Datos.setModel(cargar);
        } catch (IOException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SeleccionarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
    Metodos_Inventario.buscar(Datos, Resultado, Llenar);
    }//GEN-LAST:event_BuscarActionPerformed

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
       int resultado = JOptionPane.showConfirmDialog(null,"??Desea realizar alguna factura?","Pregunta",JOptionPane.YES_NO_OPTION);
        if (resultado == 0) {
             Factura F = new Factura();
             dispose();
             F.show(); 
        }
    }//GEN-LAST:event_btnFacturaActionPerformed

    private void LlenarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LlenarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_LlenarKeyReleased

    private void LlenarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LlenarKeyTyped
       evento.LetrasKeyPress(evt);
    }//GEN-LAST:event_LlenarKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int resultado = JOptionPane.showConfirmDialog(null,"??Desea ir al sistema?","Pregunta",JOptionPane.YES_NO_OPTION);
        if (resultado == 0) {
             Ventas F = new Ventas();
             dispose();
             F.show(); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Cerrar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cerrar
        // TODO add your handling code here:
         int c;
        c = JOptionPane.showConfirmDialog(null,"??Quiere salir de el Inventario?","Salir",JOptionPane.YES_NO_OPTION);
        if(c == 0){
           dispose();
        }
    }//GEN-LAST:event_Cerrar

    private void Minimixar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Minimixar
        // TODO add your handling code here:
          this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_Minimixar

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
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JTable Datos;
    private javax.swing.JTextField Llenar;
    private javax.swing.JTable Resultado;
    private javax.swing.JButton Seleccionar;
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
