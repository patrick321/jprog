/*
 * Diese Klasse stellt eine Verbindung mit einer sql-Datenbank her,
 * die im vorherigen ausgewählt werden muss.
 * 
 */
package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Patrick L. Schubert
 */
public class DBConnect {
    Connection conn = null;
    
    
    public static Connection ConnectDB(String path){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:"+path);
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
            
        }
    }
}
