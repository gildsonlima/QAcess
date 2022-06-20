/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositors;

import java.sql.ResultSet;
import java.sql.Statement;
import models.Unidade;

/**
 *
 * @author Atila
 */
public class UnidadeDB {
    protected ResultSet resultSet;
    
    public boolean insertUnidade(Statement statement, Unidade unidade){
        try{
            String sql = "insert into unidade "
                    + "(id, condominio, cep, numero, bloco) "
                    + "values ('" + unidade.getId() + "', "
                    + "'" + unidade.getCondominio() + "', "
                    + "'" + unidade.getCep() + "', "
                    + "'" + unidade.getNumero() + "', "
                    + "'" + unidade.getBloco() + "');";
            
            statement.execute(sql);
            return true;
            
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }
}
