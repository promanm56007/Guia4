
package proyeco_guia_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Consulta_producto extends javax.swing.JFrame {
Connection con = null;
Statement stmt = null;
   
Conexion cn = new Conexion();
String titulos[] = {"id","nombre","valor","marca","cantidad"};
   String fila[] = new String [6];
   DefaultTableModel modelo;
        
   
      public Consulta_producto() {
         initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon icono = new ImageIcon("icon.ico");
        this.setIconImage(icono.getImage());
        con = cn.getConexion();
        mostrar();
        
    }
public void mostrar(){

   try
        {
            stmt = con.createStatement();
            ResultSet results = stmt.executeQuery("select * from productos" );
             modelo = new DefaultTableModel(null,titulos);
            while(results.next())
            {
                   fila[0] = results.getString("id");
                   fila[1] = results.getString("nombre");
                   fila[2] = results.getString("valor");
                   fila[3] = results.getString("marca");
                   fila[4] = results.getString("cantidad");
                   modelo.addRow(fila);
            }
                tabla.setModel(modelo);
                TableColumn tid = tabla.getColumn("id");
                tid.setMaxWidth(25);
                TableColumn tn = tabla.getColumn("nombre");
                tn.setMaxWidth(165);
                TableColumn tv = tabla.getColumn("valor");
                tv.setMaxWidth(160);
                TableColumn tm = tabla.getColumn("marca");
                tm.setMaxWidth(90);
                TableColumn tc = tabla.getColumn("cantidad");
                tc.setMaxWidth(72);
             
                results.close();
                stmt.close();
        }
        catch (SQLException sqlExcept)
        {
            sqlExcept.printStackTrace();
        }
}
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tablas = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        volver = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablas.setViewportView(tabla);

        getContentPane().add(tablas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 510, -1));

        volver.setBackground(new java.awt.Color(204, 204, 204));
        volver.setText("volver");
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMouseClicked(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 230, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyeco_guia_4/fondo_menu.png"))); // NOI18N
        fondo.setText("Aplicación de inventarios exito");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 618, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
    dispose();
    menu menu = new menu();
    menu.setVisible(true);
    }//GEN-LAST:event_volverMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JTable tabla;
    private javax.swing.JScrollPane tablas;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables

}
