/*
 * Dies ist ein Template für den Datenbankzugriff einer Java-Application mit dem 
 * JDBC-Connector. Die URL und die Zugangsdaten der MYSQL-Datenbank werden aus einer 
 * seperaten "jdbc.properties"-Datei im Projektordner ausgelesen und erlauben damit eine 
 * einfache Modifikation der Daten, ohne das Programm neu kompilieren zu müssen. 
 * 
 */

package Main;

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
    public static String table;
    
    public Mysql() throws FileNotFoundException, IOException{
        //Hier wird die .properties Datei ausgelesen und die Variablen gesetzt.
        Properties jdbc = new Properties();
        InputStream in = this.getClass().getResourceAsStream("resources/jdbc.properties");
        jdbc.load(in);
        url =jdbc.getProperty("url");
        username = jdbc.getProperty("username");
        password = jdbc.getProperty("password");
        table = jdbc.getProperty("table");
        
    }
    
    public static void selectAllfromQuery(String user) throws ClassNotFoundException, SQLException{
        //Fuehrt eine SQL abfrage zur Auswahl aller gespeicherten Daten aus und gibt diese aus. 
        //Im angegebenen Fall für eine 3-Spaltige Tabelle
        Class.forName(DBCLASSNAME);
        Properties properties = new Properties();
        properties.put("user", username);
        properties.put("password", password);
        Connection connection = (Connection) DriverManager.getConnection(url, properties);
        Statement stmt = connection.createStatement();
        ResultSet result = stmt.executeQuery("SELECT * FROM "+table+" WHERE username=\""+user+"\";");
        while(result.next()) {
            System.out.printf("%s, %s, %s%n", result.getString(1), result.getString(2), result.getString(3));
        }
        connection.close();
    }
    
    public static String selectOne(String user, String column) throws ClassNotFoundException, SQLException{
        Class.forName(DBCLASSNAME);
        Properties properties = new Properties();
        properties.put("user", username);
        properties.put("password", password);
        Connection connection = (Connection) DriverManager.getConnection(url, properties);
        Statement stmt = connection.createStatement();
        ResultSet result = stmt.executeQuery("SELECT "+column+" FROM "+table+" WHERE username=\""+user+"\";");
        while(result.next()){
            return result.getString(column);
        }
        return "0";
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
        ResultSet result = stmt.executeQuery("SELECT * FROM "+table+" WHERE username='"+loginname+"' AND password='"+loginpass+"';");
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
        //Führt übergebenen Update-Befehl in der Datenbank aus.
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
    
