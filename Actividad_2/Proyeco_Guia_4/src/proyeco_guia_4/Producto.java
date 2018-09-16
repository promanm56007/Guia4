
package proyeco_guia_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Producto extends javax.swing.JFrame {

    Connection con = null;
    Statement stmt = null;
    Conexion cn = new Conexion();
    public Producto() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon icono = new ImageIcon("icon.ico");
        this.setIconImage(icono.getImage());
        
    }
public void insert(int cadena1 ,String cadena2 ,String cadena3 ,String cadena4,String cadena5){
     con = cn.getConexion();   
     try
        {
            stmt = con.createStatement();
            stmt.execute("insert into productos " +" values (" +
                    cadena1 + ",'" + cadena2 + "','" + cadena3 +"','"+ cadena4 +"','"+cadena5+"')");
            stmt.close();
        }
        catch (SQLException sqlExcept)
        {
            sqlExcept.printStackTrace();
        }
        }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salir1 = new javax.swing.JButton();
        id_p_l = new javax.swing.JLabel();
        id_p = new javax.swing.JTextField();
        nombre_p_l = new javax.swing.JLabel();
        valor_p_l = new javax.swing.JLabel();
        marca_p_l = new javax.swing.JLabel();
        cantidad_p_l = new javax.swing.JLabel();
        nombre_p = new javax.swing.JTextField();
        valor_p = new javax.swing.JTextField();
        marca_p = new javax.swing.JTextField();
        cantidad_p = new javax.swing.JTextField();
        crear = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir1.setBackground(new java.awt.Color(255, 51, 51));
        salir1.setText("Salir");
        salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir1ActionPerformed(evt);
            }
        });
        getContentPane().add(salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 70, -1));

        id_p_l.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        id_p_l.setText("ID:");
        getContentPane().add(id_p_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 230, 50));

        id_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_pActionPerformed(evt);
            }
        });
        id_p.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_pKeyTyped(evt);
            }
        });
        getContentPane().add(id_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 120, 30));

        nombre_p_l.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        nombre_p_l.setText("Nombre del Producto:");
        getContentPane().add(nombre_p_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 230, 50));

        valor_p_l.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        valor_p_l.setText("Valor del Producto:");
        getContentPane().add(valor_p_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 220, 40));

        marca_p_l.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        marca_p_l.setText("Marca del Producto:");
        getContentPane().add(marca_p_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 230, 50));

        cantidad_p_l.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        cantidad_p_l.setText("Cantidad Actual del Producto:");
        getContentPane().add(cantidad_p_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 300, 50));

        nombre_p.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombre_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_pActionPerformed(evt);
            }
        });
        nombre_p.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombre_pKeyTyped(evt);
            }
        });
        getContentPane().add(nombre_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 250, 30));

        valor_p.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valor_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor_pActionPerformed(evt);
            }
        });
        valor_p.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valor_pKeyTyped(evt);
            }
        });
        getContentPane().add(valor_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 250, 30));

        marca_p.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        marca_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marca_pActionPerformed(evt);
            }
        });
        marca_p.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                marca_pKeyTyped(evt);
            }
        });
        getContentPane().add(marca_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 250, 30));

        cantidad_p.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cantidad_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidad_pActionPerformed(evt);
            }
        });
        cantidad_p.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidad_pKeyTyped(evt);
            }
        });
        getContentPane().add(cantidad_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 180, 30));

        crear.setBackground(new java.awt.Color(204, 204, 204));
        crear.setText("CREAR PRODUCTO");
        crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearMouseClicked(evt);
            }
        });
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });
        getContentPane().add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 330, 50));

        volver.setBackground(new java.awt.Color(204, 204, 204));
        volver.setText("volver");
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMouseClicked(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 230, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyeco_guia_4/fondo_menu.png"))); // NOI18N
        fondo.setText("Aplicación de inventarios exito");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 618, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salir1ActionPerformed

    private void cantidad_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidad_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidad_pActionPerformed

    private void nombre_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_pActionPerformed

    private void valor_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor_pActionPerformed

    private void marca_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marca_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marca_pActionPerformed

    private void nombre_pKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre_pKeyTyped
      char c = evt.getKeyChar();
      if((c<'a'||c>'z')&&(c<'A'||c>'Z')&&(c<' '|| c >' '))evt.consume();
    }//GEN-LAST:event_nombre_pKeyTyped

    private void valor_pKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valor_pKeyTyped
        
        char c = evt.getKeyChar();
      if((c<'0'||c>'9'))evt.consume();
        
    }//GEN-LAST:event_valor_pKeyTyped

    private void cantidad_pKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidad_pKeyTyped
       char c = evt.getKeyChar();
      if((c<'0'||c>'9'))evt.consume();
    }//GEN-LAST:event_cantidad_pKeyTyped

    private void crearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearMouseClicked
        String cadena2,cadena3,cadena4,cadena5;
               
       int cadena1 = Integer.parseInt(id_p.getText());
        cadena2 = nombre_p.getText();
        cadena3 = valor_p.getText();
        cadena4 = marca_p.getText();
        cadena5 = cantidad_p.getText();
     insert(cadena1,cadena2,cadena3,cadena4,cadena5);
        
        this.id_p.setText("");
        this.nombre_p.setText("");
        this.valor_p.setText("");
        this.cantidad_p.setText("");
        this.marca_p.setText("");

    }//GEN-LAST:event_crearMouseClicked

    private void id_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_pActionPerformed

    private void id_pKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_pKeyTyped

    }//GEN-LAST:event_id_pKeyTyped

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearActionPerformed

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
        dispose();
        menu menu = new menu();
        menu.setVisible(true);
    }//GEN-LAST:event_volverMouseClicked

    private void marca_pKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_marca_pKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_marca_pKeyTyped
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidad_p;
    private javax.swing.JLabel cantidad_p_l;
    private javax.swing.JButton crear;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField id_p;
    private javax.swing.JLabel id_p_l;
    private javax.swing.JTextField marca_p;
    private javax.swing.JLabel marca_p_l;
    private javax.swing.JTextField nombre_p;
    private javax.swing.JLabel nombre_p_l;
    private javax.swing.JButton salir1;
    private javax.swing.JTextField valor_p;
    private javax.swing.JLabel valor_p_l;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
