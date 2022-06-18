/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Atila
 */
public class QAcessDB {
    private Connection connection;
    private Statement statement;
    protected ResultSet resultSet;

    public Connection getConnection() {
        return connection;
    }

    public Statement getStatement() {
        return statement;
    }
    
    public boolean connect(){
        String server = "jdbc:mysql://localhost:3306/correspondencia";
        String user = "root";
        String pwd = "ubiq2022";
        String driver = "com.mysql.cj.jdbc.Driver";
        
        try{
            Class.forName(driver);
            this.connection = (Connection)DriverManager.getConnection(server, user, pwd);
            this.statement = (Statement)this.connection.createStatement();
        }catch(Exception e){
            System.out.println("Erro ao conectar ao banco: "+e);
        }
        
        if(this.connection !=  null){
            return true;
        }
        return false;
    }
}
