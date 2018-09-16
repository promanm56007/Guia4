
package proyeco_guia_4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class surtir extends javax.swing.JFrame {
Connection con = null;
    Statement stmt = null;
    Conexion cn = new Conexion();
      String var;
      String var2;
      String var3;
    public surtir() {
    initComponents();
        initComponents();
        this.setLocationRelativeTo(null);
        
        ImageIcon icono = new ImageIcon("icon.ico");
        this.setIconImage(icono.getImage());
    }
public void consulta() {
    con = cn.getConexion();
        String cap="";
        ResultSet rs = null;
        var2 = var;
        String sql2="Select id, nombre, valor, marca, cantidad FROM productos where nombre = '"+var2+"'";
            
   try { 
 
     if ( con != null ) 
	   System.out.println("Se ha establecido una conexión a la base de datos " + "\n "  ); 
        stmt = con.createStatement(); 
	rs = stmt.executeQuery(sql2);
	
	   while ( rs.next() ) { 
               
	           String id = rs.getString("id"); 
	           String inom = rs.getString("nombre"); 
	           String idom = rs.getString("valor"); 
                   String itel = rs.getString("marca"); 
                   String inick = rs.getString("cantidad");
	           id_p.setText(id);
                   nombre_p.setText(inom);
                   valor_p.setText(idom);
                   marca_p.setText(itel);
                   cantidad_p.setText(inick);
                  
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        consulta_especifica = new javax.swing.JButton();
        id_p_l = new javax.swing.JLabel();
        id_p = new javax.swing.JTextField();
        nombre_p_l = new javax.swing.JLabel();
        nombre_p = new javax.swing.JTextField();
        valor_p_l = new javax.swing.JLabel();
        valor_p = new javax.swing.JTextField();
        marca_p_l = new javax.swing.JLabel();
        marca_p = new javax.swing.JTextField();
        cantidad_p = new javax.swing.JTextField();
        volver = new javax.swing.JButton();
        salir1 = new javax.swing.JButton();
        b_vender = new javax.swing.JButton();
        cantidad_p_l1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        consulta_especifica.setBackground(new java.awt.Color(204, 204, 204));
        consulta_especifica.setText("ELEGIR PRODUCTO A SURTIR");
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
        getContentPane().add(consulta_especifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 330, 40));

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
        getContentPane().add(id_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 120, 30));

        nombre_p_l.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        nombre_p_l.setText("Nombre del Producto:");
        getContentPane().add(nombre_p_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 230, 50));

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

        valor_p_l.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        valor_p_l.setText("Valor del Producto:");
        getContentPane().add(valor_p_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 220, 40));

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

        marca_p_l.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        marca_p_l.setText("Marca del Producto:");
        getContentPane().add(marca_p_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 230, 50));

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
        getContentPane().add(cantidad_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 180, 30));

        volver.setBackground(new java.awt.Color(204, 204, 204));
        volver.setText("volver");
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMouseClicked(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 230, -1));

        salir1.setBackground(new java.awt.Color(255, 51, 51));
        salir1.setText("Salir");
        salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir1ActionPerformed(evt);
            }
        });
        getContentPane().add(salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 70, -1));

        b_vender.setBackground(new java.awt.Color(204, 204, 204));
        b_vender.setText("surtir");
        b_vender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_venderMouseClicked(evt);
            }
        });
        getContentPane().add(b_vender, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 380, 50));

        cantidad_p_l1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        cantidad_p_l1.setText("Cantidad Actual del Producto:");
        getContentPane().add(cantidad_p_l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 300, 50));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyeco_guia_4/fondo_menu.png"))); // NOI18N
        fondo.setText("Aplicación de inventarios exito");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 618, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_pActionPerformed

    private void id_pKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_pKeyTyped

    }//GEN-LAST:event_id_pKeyTyped

    private void nombre_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_pActionPerformed

    private void nombre_pKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre_pKeyTyped
        char c = evt.getKeyChar();
        if((c<'a'||c>'z')&&(c<'A'||c>'Z')&&(c<' '|| c >' '))evt.consume();
    }//GEN-LAST:event_nombre_pKeyTyped

    private void valor_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor_pActionPerformed

    private void valor_pKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valor_pKeyTyped

        char c = evt.getKeyChar();
        if((c<'0'||c>'9'))evt.consume();

    }//GEN-LAST:event_valor_pKeyTyped

    private void marca_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marca_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marca_pActionPerformed

    private void marca_pKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_marca_pKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_marca_pKeyTyped

    private void cantidad_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidad_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidad_pActionPerformed

    private void cantidad_pKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidad_pKeyTyped
        char c = evt.getKeyChar();
        if((c<'0'||c>'9'))evt.consume();
    }//GEN-LAST:event_cantidad_pKeyTyped

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
        dispose();
        menu menu = new menu();
        menu.setVisible(true);
    }//GEN-LAST:event_volverMouseClicked

    private void salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salir1ActionPerformed

    private void consulta_especificaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consulta_especificaMouseClicked
        // codigo ConsultarUusario
        String cap="";
        ResultSet rs = null;
        var = javax.swing.JOptionPane.showInputDialog(this,"Nombre del producto","Surtir producto",javax.swing.JOptionPane.QUESTION_MESSAGE);
        String sql="SELECT* FROM  productos WHERE nombre = '"+var+"'";
        if(var == null)
        javax.swing.JOptionPane.showMessageDialog(this,"La accion fue cancelada","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        else {
            if (var.equals("")) {
                javax.swing.JOptionPane.showMessageDialog(this,"Favor de ingresar el nombre del producto \nque desea surtir","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                try {
                  con = cn.getConexion();
                    if ( con != null )
                    System.out.println("Se ha establecido una conexión a la base de datos " +"\n ");

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

    private void consulta_especificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta_especificaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consulta_especificaActionPerformed

    private void b_venderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_venderMouseClicked
editarRegistro();
    }//GEN-LAST:event_b_venderMouseClicked
public void editarRegistro(){
var =cantidad_p.getText();
System.out.println(var);
int num = Integer.parseInt(var);
System.out.println(var);
Integer nueva;
var3 =javax.swing.JOptionPane.showInputDialog(this,"ingrese cantidad a adiconar","Surtir",javax.swing.JOptionPane.QUESTION_MESSAGE); 
 nueva = Integer.valueOf(var3);

num = num + nueva;
var = Integer.toString(num);
System.out.println(var);
 var2 = nombre_p.getText();
 
try {
    
 
                    String sql="UPDATE productos set cantidad ='"+var+"' where nombre = '"+var2+"'" ;
                     con = cn.getConexion(); 
                     System.out.println("done2");
                    if ( con != null )
                    System.out.println("Se ha establecido una conexión a la base de datos " +
                        "\n " );
                     System.out.println("done3");
                    stmt = con.createStatement();
                    stmt.executeUpdate(sql);
                    System.out.println("done4");
                    
                    this.id_p.setText("");
                    this.nombre_p.setText("");
                    this.valor_p.setText("");
                    this.cantidad_p.setText("");
                    this.marca_p.setText("");
                    System.out.println("done5");

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_vender;
    private javax.swing.JTextField cantidad_p;
    private javax.swing.JLabel cantidad_p_l1;
    private javax.swing.JButton consulta_especifica;
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
