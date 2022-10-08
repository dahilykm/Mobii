/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;
import java.sql.Connection;
import java.sql.DriverManager;


        


/**
 *
 * @author Dahily Manzano
 */
public class DBConnection {
    Connection connection;
    static String bd ="railway";
    static String port ="5763";
    static String login ="root";
    static String password ="wHhfx0VYq5UBGPhv1IS0";
    static String ip = "containers-us-west-81.railway.app";

    public DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://"+ DBConnection.ip +":" + DBConnection.port + "/" + DBConnection.bd;
            connection=DriverManager.getConnection(url, DBConnection.login, this.password);
            System.out.println("Conexion establecida");
        } catch (Exception ex) {
            System.out.println("error en la conexion");
        }
    }
    public Connection getConnection(){
     return connection;
    }
    public void desconectar(){
        connection=null;
    }
}
