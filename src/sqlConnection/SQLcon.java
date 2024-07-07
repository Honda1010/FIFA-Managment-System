
package sqlConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author mohaned
 */
public class SQLcon {
        public static Connection connecrb(){
      try{
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          Connection conn=DriverManager.getConnection("jdbc:sqlserver://localhost\\LAPTOP-3P0T45J3:1433;databaseName=fifa3;encrypt=true; trustServerCertificate=true;","admin","1234");//admin and 12345 is username and password in sql server
          return conn;  
      }catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
      }
        return null; 
    }
    
}
