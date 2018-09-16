
package proyeco_guia_4;

import javax.swing.ImageIcon;

public class menu extends javax.swing.JFrame {

    public menu() {
         initComponents();
        initComponents();
        this.setLocationRelativeTo(null);
        
        ImageIcon icono = new ImageIcon("icon.ico");
        this.setIconImage(icono.getImage());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salir = new javax.swing.JButton();
        salir1 = new javax.swing.JButton();
        crear_p = new javax.swing.JButton();
        vender_p = new javax.swing.JButton();
        ver_info_p = new javax.swing.JButton();
        mostrar_todo = new javax.swing.JButton();
        surtir = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        salir.setBackground(new java.awt.Color(255, 51, 51));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir1.setBackground(new java.awt.Color(255, 51, 51));
        salir1.setText("Salir");
        salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir1ActionPerformed(evt);
            }
        });
        getContentPane().add(salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 70, -1));

        crear_p.setBackground(new java.awt.Color(204, 204, 204));
        crear_p.setText("Crear un Producto");
        crear_p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crear_pMouseClicked(evt);
            }
        });
        getContentPane().add(crear_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 460, 60));

        vender_p.setBackground(new java.awt.Color(204, 204, 204));
        vender_p.setText("Vender un Producto");
        vender_p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vender_pMouseClicked(evt);
            }
        });
        getContentPane().add(vender_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 460, 60));

        ver_info_p.setBackground(new java.awt.Color(204, 204, 204));
        ver_info_p.setText("Ver la Información de un Producto");
        ver_info_p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ver_info_pMouseClicked(evt);
            }
        });
        getContentPane().add(ver_info_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 460, 60));

        mostrar_todo.setBackground(new java.awt.Color(204, 204, 204));
        mostrar_todo.setText("Mostrar Todos los Productos");
        mostrar_todo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrar_todoMouseClicked(evt);
            }
        });
        getContentPane().add(mostrar_todo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 460, 60));

        surtir.setBackground(new java.awt.Color(204, 204, 204));
        surtir.setText("Surtir de un  Producto");
        surtir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                surtirMouseClicked(evt);
            }
        });
        getContentPane().add(surtir, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 460, 60));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyeco_guia_4/fondo_menu.png"))); // NOI18N
        fondo.setText("Aplicación de inventarios exito");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 618, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir1ActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_salir1ActionPerformed

    private void crear_pMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crear_pMouseClicked
        
Producto producto = new Producto();
producto.setVisible(true);
dispose();
    }//GEN-LAST:event_crear_pMouseClicked

    private void mostrar_todoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrar_todoMouseClicked
     
       this.dispose();
        Consulta_producto cu = new Consulta_producto();
        cu.setLocationRelativeTo(null);
        cu.setVisible(true);
    }//GEN-LAST:event_mostrar_todoMouseClicked

    private void vender_pMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vender_pMouseClicked

       this.dispose();
        vender ve = new vender();
        ve.setLocationRelativeTo(null);
        ve.setVisible(true);
        
        
    }//GEN-LAST:event_vender_pMouseClicked

    private void ver_info_pMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ver_info_pMouseClicked
       dispose();
       Consulta_especifica consulta = new Consulta_especifica();
       consulta.setVisible(true);
    }//GEN-LAST:event_ver_info_pMouseClicked

    private void surtirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_surtirMouseClicked
    this.dispose();
        surtir ve = new surtir();
        ve.setLocationRelativeTo(null);
        ve.setVisible(true);
        
    }//GEN-LAST:event_surtirMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crear_p;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton mostrar_todo;
    private javax.swing.JButton salir;
    private javax.swing.JButton salir1;
    private javax.swing.JButton surtir;
    private javax.swing.JButton vender_p;
    private javax.swing.JButton ver_info_p;
    // End of variables declaration//GEN-END:variables
}
