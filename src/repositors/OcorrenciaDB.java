/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositors;

import java.sql.ResultSet;
import java.sql.Statement;
import models.Ocorrencia;

/**
 *
 * @author Atila
 */
public class OcorrenciaDB {
    
    protected ResultSet resultSet;
    
    public boolean insertUsuario(Statement statement, Ocorrencia ocorrencia){
        try{
            String sql = "insert into ocorrencia "
                    + "(id, idCondomino, local, status, descricao, data) "
                    + "values ('" + ocorrencia.getId()+ "', "
                    + "'" + ocorrencia.getCondomino().getId() + "', "
                    + "'" + ocorrencia.getLocal()+ "', "
                    + "'" + ocorrencia.getStatus() + "', "
                    + "'" + ocorrencia.getDescricao() + "', "
                    + "'" + ocorrencia.getData() + "');";
            
            statement.execute(sql);
            return true;
            
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }
}
