/*
 * Con esta clase nos conectamos a la bdSistemasConsultel
 */
package Conexion;



import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SISTEMAS_2
 */
public class Conectar {

    Connection conectar;
    public Statement sentencia;
    public ResultSet rs;
    Connection conn;
    public String driver = "com.mysql.cj.jdbc.Driver";
    public String usuario  = "root";
    public String contraseña  = "";
    public String nombreBD  = "bdtalentohumano?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public String ip  = "127.0.0.1";
    public String servidor  = "jdbc:mysql://"+ip+"/"+nombreBD+"";
    public String puerto  = "";

    public Conectar() {
        this.conn = null;
        this.usuario = usuario;
        this.contraseña=contraseña;
        this.nombreBD=nombreBD;
        this.ip=ip;
        this.puerto=puerto;
    }
        
    public Connection Conectar() {

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(servidor, usuario, contraseña);
            System.err.println("se establecio conexion con la base de datos");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido establecer una conexion con la Base de datos" + e.getMessage());
        }
        return conn;

    }

    
    public void desconectar(){
    
        try {
            conn.close();
    }catch (Exception e){
        Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE,null,e);
    }
}  

    public ResultSet consultar(String sql) {
        ResultSet res = null;
        
        try {
           PreparedStatement pstm = conn.prepareStatement(sql);
           res = pstm.executeQuery();
           } catch (SQLException e){
               System.err.println("Error en la consulta:" + e.getMessage());
             }
             return res;
        
    }

    
    
}



