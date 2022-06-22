/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.repository;

import java.sql.ResultSet;
import java.sql.Statement;
import models.Correspondencia;

/**
 *
 * @author Atila
 */
public class CorrespondenciaDB {
    
    protected ResultSet resultSet;
    
    public boolean insertCorrespondencia(Statement statement, Correspondencia correspondencia){
        try{
            String sql = "insert into correspondencias "
                    + "(idcorrespondencia, remetente, idunidade, status, idfuncionarioRecepcao, dataRecepcaoCondominio) "
                    + "values ('" + correspondencia.getId() + "', "
                    + "'" + correspondencia.getRemetente() + "', "
                    + "'" + correspondencia.getUnidade().getId() + "', "
                    + "'" + correspondencia.getStatus() + "', "
                    + "'" + correspondencia.getFuncionarioRecebimento().getId() + "', "
                    + "'" + correspondencia.getDataRecebimento() + "');";
            
            statement.execute(sql);
            return true;
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }
}
