package proyeco_guia_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Consulta_especifica extends javax.swing.JFrame {

    Connection con = null;
    Statement stmt = null;
    Conexion cn = new Conexion();
      String var;
        String var2;
    public Consulta_especifica() {
        initComponents();
        initComponents();
        this.setLocationRelativeTo(null);
        
        ImageIcon icono = new ImageIcon("icon.ico");
        this.setIconImage(icono.getImage());
      
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre_p = new javax.swing.JTextField();
        valor_p = new javax.swing.JTextField();
        valor_p_l = new javax.swing.JLabel();
        marca_p_l = new javax.swing.JLabel();
        marca_p = new javax.swing.JTextField();
        cantidad_p_l = new javax.swing.JLabel();
        cantidad_p = new javax.swing.JTextField();
        consulta_especifica = new javax.swing.JButton();
        nombre_p_l1 = new javax.swing.JLabel();
        id_p = new javax.swing.JTextField();
        nombre_p_l2 = new javax.swing.JLabel();
        volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 51));

        nombre_p.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombre_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_pActionPerformed(evt);
            }
        });

        valor_p.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valor_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor_pActionPerformed(evt);
            }
        });

        valor_p_l.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        valor_p_l.setText("Valor:");

        marca_p_l.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        marca_p_l.setText("Marca:");

        marca_p.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        marca_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marca_pActionPerformed(evt);
            }
        });

        cantidad_p_l.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        cantidad_p_l.setText("Cantidad:");

        cantidad_p.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cantidad_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidad_pActionPerformed(evt);
            }
        });

        consulta_especifica.setBackground(new java.awt.Color(153, 204, 255));
        consulta_especifica.setText("Consultar");
        consulta_especifica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consulta_especificaMouseClicked(evt);
            }
        });
        consulta_especifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulta_especificaActionPerformed(evt);
            }
        });

        nombre_p_l1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        nombre_p_l1.setText("ID:");

        id_p.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        id_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_pActionPerformed(evt);
            }
        });

        nombre_p_l2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        nombre_p_l2.setText("Nombre producto:");

        volver.setBackground(new java.awt.Color(255, 153, 153));
        volver.setText("volver");
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(consulta_especifica, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(marca_p_l, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(marca_p, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(valor_p_l, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valor_p, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cantidad_p_l, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidad_p, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nombre_p_l1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(id_p, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nombre_p_l2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(nombre_p, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombre_p_l1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre_p_l2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre_p, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valor_p_l, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valor_p, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marca_p_l, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marca_p, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidad_p_l, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidad_p, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(volver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(consulta_especifica, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void consulta() {
    con = cn.getConexion();
        ResultSet rs = null;
        var2 = var;
        String sql2="Select id, nombre, valor, marca, cantidad FROM productos where nombre = '"+var2+"'";
   try { 
     if ( con != null ) 
	   System.out.println("Se ha establecido una conexión a la base de datos " +"\n "  );   
	stmt = con.createStatement(); 
	rs = stmt.executeQuery(sql2); 
	int i=1; 
	   while ( rs.next() ) { 
               
	           String id = rs.getString("id"); 
	           String inom = rs.getString("nombre"); 
	           String ival = rs.getString("valor"); 
                   String imar = rs.getString("marca"); 
                   String ican = rs.getString("cantidad"); 
                   id_p.setText(id);
                   nombre_p.setText(inom);
                   valor_p.setText(ival);
                   marca_p.setText(imar);
                   cantidad_p.setText(ican);
	         } 
	        } 
                  catch( SQLException ex ) { 
                      ex.printStackTrace(); 
	                  }finally { 
	                  if ( rs != null ) { 
	                      try    { 
	                          rs.close(); 
	                      } catch( SQLException ex ) { 
	                          System.out.println( ex.getMessage()); 
	                          ex.printStackTrace(); 
	                      } 
	                  } 
	                  if ( stmt != null ) { 
	                      try    { 
	                          stmt.close(); 
	                      } catch( SQLException ex ) { 
	                          System.out.println( ex.getMessage()); 
	                          ex.printStackTrace(); 
	                      } 
	                  } 
	                  if ( con != null ) { 
	                      try    { 
	                          con.close(); 
	                      } catch( SQLException ex ) { 
	                          System.out.println( ex.getMessage()); 
	                          ex.printStackTrace(); 
         } 
       }
     }    
    }

    private void nombre_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_pActionPerformed

    private void valor_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor_pActionPerformed

    private void marca_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marca_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marca_pActionPerformed

    private void cantidad_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidad_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidad_pActionPerformed

    private void consulta_especificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta_especificaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consulta_especificaActionPerformed

    private void consulta_especificaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consulta_especificaMouseClicked
        String cap="";
        ResultSet rs = null; 
   var = javax.swing.JOptionPane.showInputDialog(this,"Nombre del producto","Consulta producto",javax.swing.JOptionPane.QUESTION_MESSAGE);
        String sql="SELECT* FROM  productos WHERE nombre = '"+var+"'";
        if(var == null)  
        javax.swing.JOptionPane.showMessageDialog(this,"La accion fue cancelada","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
      else {   
        if (var.equals("")) {
            javax.swing.JOptionPane.showMessageDialog(this,"Favor de ingresar el nombre del producto \nque desea consultar","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
         else {
        try {
            
          con = cn.getConexion();
             if ( con != null ) 
                    System.out.println("Se ha establecido una conexión a la base de datos " + "\n " ); 
                  stmt = con.createStatement(); 
                  rs = stmt.executeQuery(sql);
              consulta();      
       }    catch (SQLException ex) {
                Logger.getLogger(Consulta_especifica.class.getName()).log(Level.SEVERE, null, ex);
            } 
        finally {
            if (con != null) {
                try {
                    con.close();
                    stmt.close();
                } catch ( Exception e ) { 
                         System.out.println( e.getMessage());
                }
              }
            }
           
        }
      }  


    }//GEN-LAST:event_consulta_especificaMouseClicked

    private void id_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_pActionPerformed

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
        dispose();
        menu menu = new menu();
        menu.setVisible(true);
    }//GEN-LAST:event_volverMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidad_p;
    private javax.swing.JLabel cantidad_p_l;
    private javax.swing.JButton consulta_especifica;
    private javax.swing.JTextField id_p;
    private javax.swing.JTextField marca_p;
    private javax.swing.JLabel marca_p_l;
    private javax.swing.JTextField nombre_p;
    private javax.swing.JLabel nombre_p_l1;
    private javax.swing.JLabel nombre_p_l2;
    private javax.swing.JTextField valor_p;
    private javax.swing.JLabel valor_p_l;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
