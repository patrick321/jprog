/*
 * Dies ist ein Template für den Datenbankzugriff einer Java-Application mit dem 
 * JDBC-Connector. Die URL und die Zugangsdaten der MYSQL-Datenbank werden aus einer 
 * seperaten "jdbc.properties"-Datei im Projektordner ausgelesen und erlauben damit eine 
 * einfache Modifikation der Daten, ohne das Programm neu kompilieren zu müssen. 
 * 
 */

package mysql;

import com.mysql.jdbc.Connection;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author Patrick L. Schubert
 * @version 1.0.1
 */
public class Mysql {

    private static final String DBCLASSNAME = "com.mysql.jdbc.Driver";
    private static String url;
    private static String username;
    private static String password;
    private static String table;
    
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        readProperties();
        selectAllfromQuery();
    }
    
    public static void readProperties() throws FileNotFoundException, IOException{
        /* Hier werden die Datenbankzugangsdaten aus der jdbc.properties Datei im 
         * Projektordner eingelesen und gesetzt.            
         */
        Properties jdbc = new Properties();
        InputStream in =null;
        in = Mysql.class.getResourceAsStream("jdbc.properties");
        jdbc.load(in);
        url =jdbc.getProperty("url");
        username = jdbc.getProperty("username");
        password = jdbc.getProperty("password");
        table = jdbc.getProperty("table");
    }
    
    public static void selectAllfromQuery() throws ClassNotFoundException, SQLException{
        //Führt eine SQL abfrage zur Auswahl aller gespeicherten Daten aus und gibt diese aus.           
        Class.forName(DBCLASSNAME);
        Properties properties = new Properties();
        properties.put("user", username);
        properties.put("password", password);
        Connection connection = (Connection) DriverManager.getConnection(url, properties);
        Statement stmt = connection.createStatement();
        ResultSet result = stmt.executeQuery("SELECT * FROM "+table);
        while(result.next()) {
            System.out.printf("%s, %s, %s%n", result.getString(1), result.getString(2), result.getString(3));
        }
        connection.close();
    }
    
    public static boolean loggedIn(String loginname, String loginpass) throws ClassNotFoundException, SQLException{
        //Überprüft, ob der als Parameter übergebene Username in kombination mit dem Passwort existiert und liefert
        //als Boolean zurück, ob ein Login mit den entsprechenden Daten erfolgreich war oder nicht.
        String user = loginname;
        String pass = loginpass;
        Class.forName(DBCLASSNAME);
        Properties properties = new Properties();
        properties.put("user", username);
        properties.put("password", password);
        Connection connection = (Connection) DriverManager.getConnection(url, properties);
        Statement stmt = connection.createStatement();
        ResultSet result = stmt.executeQuery("SELECT * FROM "+table+" WHERE username='"+loginname+"' AND password='"+loginpass+"'");
        if (result.next()){
            connection.close();
            return true;
        }else{
            connection.close();
            return false;
        }
    }
    
    public static void insertData(String query) throws ClassNotFoundException, SQLException{
        //Führt übergebenen Insert-Befehl in der Datenbank aus.
        Class.forName(DBCLASSNAME);
        Properties properties = new Properties();
        properties.put("user", username);
        properties.put("password", password);
        Connection connection = (Connection) DriverManager.getConnection(url, properties);
        Statement stmt = connection.createStatement();
        stmt.execute(query);
        connection.close();
    }
    
    public static void updateData(String query) throws ClassNotFoundException, SQLException{
        //Führt übergebenen Insert-Befehl in der Datenbank aus.
        Class.forName(DBCLASSNAME);
        Properties properties = new Properties();
        properties.put("user", username);
        properties.put("password", password);
        Connection connection = (Connection) DriverManager.getConnection(url, properties);
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(query);
        connection.close();
    }
}
    
