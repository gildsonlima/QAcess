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
    
    public boolean insertOcorrencia(Statement statement,Ocorrencia ocorrencia){
        try{
            String sql = "insert into ocorrencias "
                    + "(idocorrencias, local, descricao, status, data) "
                    + "values ('" + ocorrencia.getId()+ "', "
                    //+ "'" + ocorrencia.getCondomino().getId() + "', "
                    + "'" + ocorrencia.getLocal()+ "', "
                    + "'" + ocorrencia.getDescricao() + "', "
                    + "'" + ocorrencia.getStatus() + "', "
                    + "'" + ocorrencia.getData() + "');";
            System.out.println(sql);
            statement.execute(sql);
            return true;
            
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }
}
