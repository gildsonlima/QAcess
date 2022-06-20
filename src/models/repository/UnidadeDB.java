/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.repository;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.UUID;
import models.Unidade;

/**
 *
 * @author Atila
 */
public class UnidadeDB {
    private ResultSet resultSet;
    private Statement statement;
    
    public UnidadeDB(Statement statement){
        this.statement = statement;
    }
    
    public boolean insertUnidade(Unidade unidade){
        try{
            String sql = "insert into unidades "
                    + "(idunidade, condominio, cep, numero, bloco) "
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
    
    public ArrayList<Unidade> listUnidades(){
        ArrayList<Unidade> unidades = new ArrayList<>();
        try{
            String sql = "select * from unidades";
            this.resultSet = statement.executeQuery(sql);
            Unidade unidade;
            while (this.resultSet.next()) {
                unidade = new Unidade();
                unidade = setUnidade(
                                        resultSet.getString("idunidade"), 
                                        resultSet.getString("condominio"),
                                        resultSet.getString("cep"),
                                        resultSet.getString("numero"), 
                                        resultSet.getString("bloco"));
                unidades.add(unidade);       
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return unidades;
    }
    
    public Unidade listUnidadeUnique(String idunidade){
        Unidade unidade= new Unidade();
        try{
            String sql = "SELECT * FROM unidades WHERE idunidade = '" + idunidade + "';";
            this.resultSet = statement.executeQuery(sql);
            while(this.resultSet.next()) {
                unidade = setUnidade(
                                        resultSet.getString("idunidade"), 
                                        resultSet.getString("condominio"),
                                        resultSet.getString("cep"),
                                        resultSet.getString("numero"), 
                                        resultSet.getString("bloco"));
            }
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        return unidade;
    }
    
    private Unidade setUnidade(String idunidade, String condominio, 
                                String cep, String numero, String bloco){
        
        Unidade unidade = new Unidade();
        unidade.setId(UUID.fromString(idunidade));
        unidade.setCondominio(condominio);
        unidade.setCep(cep);
        unidade.setNumero(numero);
        unidade.setBloco(bloco);
        
        return unidade;
    }
}
