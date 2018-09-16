
package proyeco_guia_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
Connection con = null;
     public Connection CrearBD(){
       try{
         //obtenemos el driver de para mysql
         Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
         //obtenemos la conexión
         con = DriverManager.getConnection("jdbc:derby:.\\DB\\Derby.DB;create=true");
         if (con!=null){
            JOptionPane.showMessageDialog(null,"OK base de datos listo");
            String creartabla="create table productos (id int not null,nombre varchar(50), valor varchar(50), marca varchar(50), cantidad varchar(50),primary key(id))";
            try {
            PreparedStatement pstm = con.prepareStatement(creartabla);
            pstm.execute();
            pstm.close();
            
           
            
           JOptionPane.showMessageDialog(null,"BD Creada correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
        }
         }
      }catch(SQLException e){
       JOptionPane.showMessageDialog(null,e.getMessage(),"Error" ,  JOptionPane.ERROR_MESSAGE);
      }catch(ClassNotFoundException e){
         JOptionPane.showMessageDialog(null,e.getMessage(),"Error" ,  JOptionPane.ERROR_MESSAGE);
      }
       return con;
  }
   
    public Connection getConexion(){
    try{
    
    Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
    con = DriverManager.getConnection("jdbc:derby:.\\DB\\Derby.DB");
    JOptionPane.showMessageDialog(null,"Conexion exitosa");
    }catch(Exception ex){
    JOptionPane.showMessageDialog(null,"error en conexion"+ ex.getMessage());
    }
    return con;
    }
    
    
    
    public ResultSet consulta(String consulta){
    ResultSet rs = null;
    try{
    PreparedStatement ps = con.prepareStatement(consulta);
    rs = ps.executeQuery();
        
    JOptionPane.showMessageDialog(null,"consulta exitosa");
    }catch(Exception ex){
    JOptionPane.showMessageDialog(null,"error en consulta"+ ex.getMessage());
    }
    return rs;
    

    }    
    
}

