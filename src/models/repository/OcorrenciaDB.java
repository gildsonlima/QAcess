/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.repository;

import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;
import models.Condomino;
import models.Ocorrencia;
import models.Usuario;

/**
 *
 * @author Atila
 */
public class OcorrenciaDB {
    
    private ResultSet resultSet;
    private Statement statement;
    
    
    public OcorrenciaDB(Statement statement){
        this.statement = statement;
    }
    
    public boolean insertOcorrencia(Ocorrencia ocorrencia){
        try{
            String sql = "insert into ocorrencias "
                    + "(idocorrencia, idcondomino, local, descricao, status, data) "
                    + "values ('" + ocorrencia.getId() + "', "
                    + "'" + ocorrencia.getCondomino().getId() + "', "
                    + "'" + ocorrencia.getLocal()+ "', "
                    + "'" + ocorrencia.getDescricao() + "', "
                    + "'" + ocorrencia.getStatus() + "', "
                    + "'" + ocorrencia.getData() + "');";
            statement.execute(sql);
            return true;
            
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }
    
    public ArrayList<Ocorrencia> getOcorrenciasDB(){
        ArrayList<Ocorrencia> Ocorrencias = new ArrayList<>();
        try{
            String sql = "select * from ocorrencias";
            this.resultSet = this.statement.executeQuery(sql);
            Ocorrencia ocorrencia;
            while (this.resultSet.next()) {
                ocorrencia = new Ocorrencia();
                ocorrencia = setOcorrencia(
                                            resultSet.getString("idocorrencia"),
                                            resultSet.getString("local"),
                                            resultSet.getString("descricao"), 
                                            resultSet.getString("status"),
                                            resultSet.getString("data"),
                                            resultSet.getString("idcondomino"));
                
                Ocorrencias.add(ocorrencia);
            }
            
            for (Ocorrencia ocorren : Ocorrencias) {
                UsuarioBD usuarioBD = new UsuarioBD(this.statement);
                Condomino condomino = usuarioBD.getCondominoDB(ocorren.getCondomino().getId().toString());
                ocorren.setCondomino(condomino);
            }  
            
            
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        return Ocorrencias;
    }
    
    public Ocorrencia getOcorrenciaDB(String idocorrencia){
        Ocorrencia ocorrencia = new Ocorrencia();
        try{
            String sql = "SELECT * FROM ocorrencias WHERE idocorrencia = '" + idocorrencia + "';";
            this.resultSet = this.statement.executeQuery(sql);
            while(this.resultSet.next()) {
                ocorrencia = setOcorrencia(
                                            resultSet.getString("idocorrencia"),
                                            resultSet.getString("local"),
                                            resultSet.getString("descricao"),
                                            resultSet.getString("status"),
                                            resultSet.getString("data"),
                                            resultSet.getString("idcondomino"));
            }
            
            if(ocorrencia.getCondomino() != null){
                UsuarioBD usuarioBD = new UsuarioBD(this.statement);
                Condomino condomino = usuarioBD.getCondominoDB(ocorrencia.getCondomino().getId().toString());
                ocorrencia.setCondomino(condomino);
                return ocorrencia;
            }else{
                return null;
            }
            
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
            return null;
        }
    }
    
    private Ocorrencia setOcorrencia(String idocorrencia, 
                                    String local, String descricao, 
                                    String status, String data, String idcondomino){
        
        if(idocorrencia != null){
            Ocorrencia ocorrencia = new Ocorrencia();
            Condomino condomino = new Condomino();

            ocorrencia.setId(UUID.fromString(idocorrencia));
            ocorrencia.setLocal(local);
            ocorrencia.setDescricao(descricao);
            ocorrencia.setStatus(status);
            ocorrencia.setData(data);
            condomino.setId(UUID.fromString(idcondomino));
            ocorrencia.setCondomino(condomino);

            return ocorrencia;
        }else{
            return null;
        }
    }
}
