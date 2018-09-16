package proyeco_guia_4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        usuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyeco_guia_4/logo-exito.png"))); // NOI18N
        logo.setText("jLabel3");
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 410, 210));

        password.setText("123456");
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 140, 30));

        usuario.setText("admin");
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 140, 30));

        jButton1.setBackground(new java.awt.Color(51, 255, 0));
        jButton1.setText("Iniciar");
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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 353, 80, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyeco_guia_4/fondo.jpg"))); // NOI18N
        fondo.setText("Aplicación de inventarios exito");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 618, -1));

        salir.setBackground(new java.awt.Color(255, 51, 51));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 435, 70, -1));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Crear base de datos");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 160, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_usuarioActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String user = "admin";
        String contraseña ="123456";
        String pass = new String(password.getPassword());
if(usuario.getText().equals(user) && pass.equals(contraseña)){
    
menu menu = new menu();
menu.setVisible(true);
dispose();
}else{
JOptionPane.showMessageDialog(this, "Error al ingresar usuario o clave");

}
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
  Conexion conexion = new Conexion();
  conexion.CrearBD();
    }//GEN-LAST:event_jButton2MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton salir;
    public javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables

}
