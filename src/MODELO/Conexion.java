package MODELO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {
    public Connection con;

    public Conexion() {
    }

    public Conexion(Connection con) {
        this.con = con;
    }
    
    public void conectar() throws ClassNotFoundException, SQLException{
        try{
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(url,"adminsb","admin");
        }
        catch(SQLException e){
        }
    }
    
    public void desconectar() throws Exception{
        try {
            if(con!=null){
                if(con.isClosed()==false){
                    con.close();
                }
            }
        } catch (SQLException e) {
        }
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    
}
