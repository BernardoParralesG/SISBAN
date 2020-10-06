/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author EQUINOX
 */
public class Conexion {
    private Connection conn;
    private String url;
    private String username;
    private String password;
    
    public Conexion(){
    }
    public Conexion(Connection conn){
        this.conn=conn;
    }
    public void conectar() throws ClassNotFoundException, SQLException{
        Class.forName("oracle.jdbc.OracleDriver");//"oracle.jdbc.driver.OracleDriver"
        url="jdbc:oracle:thin:@localhost:1521:XE";
        username="adminsb";
        password="admin";
        conn = DriverManager.getConnection(url, username, password);
    }

    public void desconectar() throws Exception{
        try{
            if(conn!=null){
                if(conn.isClosed()==false){
                    conn.close();
                }
            }
        }catch(SQLException e){
            throw e;
        }
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
    
    
    
}
