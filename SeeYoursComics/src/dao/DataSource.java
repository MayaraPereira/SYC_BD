/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Mayara Medeiros
 */
public class DataSource {
    //servidor
    private String hostname;
    private int port;
    private String database;
    private String username;
    private String password;
    
    private Connection connection;
    
    public DataSource(){
        //pedido de conexao
        try {
            hostname = "localhost";
            port = 3306;
            database = "syc";
            username = "root";
            password = "root";

            String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useTimezone=true&serverTimezone=UTC";
            
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            connection = DriverManager.getConnection(url, username, password);
            
            System.out.println("conectou...");
            
        } catch (SQLException ex) {
            System.err.println("ERRO NA CONEXAO " + ex.getMessage());
        } catch (Exception ex){
            System.err.println("ERRO GERAL " + ex.getMessage());
        }
        
    }
    
    public Connection getConnection(){
        return this.connection;
    }
    
    public void closeDataSource(){
        try {
            connection.close();
        } catch (Exception ex) {
            System.err.println("ERRO AO DESCONECTAR " + ex.getMessage());
        }
    }
}
