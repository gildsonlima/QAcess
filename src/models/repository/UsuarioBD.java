/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.repository;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.UUID;
import models.Condomino;
import models.Funcionario;
import models.Unidade;
import models.Usuario;

/**
 *
 * @author Atila
 */
public class UsuarioBD {
    private ResultSet resultSet;
    private Statement statement;
    
    public UsuarioBD(Statement statement){
        this.statement = statement;
    }
    
    public boolean insertUsuario(Usuario usuario){
        try{
            String valuesPadrao = "values ('" + usuario.getId() + "', "
                    + "'" + usuario.getNome() + "', "
                    + "'" + usuario.getCpf() + "', "
                    + "'" + usuario.getDataNascimento() + "', "
                    + "'" + usuario.getEmail() + "', "
                    + "'" + usuario.getContato() + "', "
                    + "'" + usuario.getEstadoCivil() +"'";
            
            if(usuario instanceof Condomino){
                String sql = "insert into condominos "
                    + "(idcondomino, nome, cpf, dataNascimento, email, contato, estadoCivil, idUnidade) "
                    + valuesPadrao + ", '" + ((Condomino) usuario).getUnidade().getId()+"'" + ");";
                    this.statement.execute(sql);
            }else{
                String sql = "insert into funcionarios "
                    + "(idfuncionario, nome, cpf, dataNascimento, email, contato, estadoCivil, cargo) "
                    + valuesPadrao + ", '" + ((Funcionario) usuario).getCargo() +"'" + ");";
                    this.statement.execute(sql);
            }
            
            return true;
            
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }
    
    public ArrayList<Usuario> listFuncionarios (){
        ArrayList<Usuario> funcionarios = new ArrayList<>();
        try{
            String sql = "select * from funcionarios";
            this.resultSet = this.statement.executeQuery(sql);
            Funcionario funcionario;
            while (this.resultSet.next()) {
                funcionario = new Funcionario();
                
                funcionario = setFuncionario(
                                            resultSet.getString("idfuncionario"),
                                            resultSet.getString("nome"),
                                            resultSet.getString("cpf"),
                                            resultSet.getString("dataNascimento"),
                                            resultSet.getString("email"),
                                            resultSet.getString("contato"),
                                            resultSet.getString("estadoCivil"),
                                            resultSet.getString("cargo")
                                         );
                
                funcionarios.add(funcionario);      
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        return funcionarios;
    }
    
    public ArrayList<Usuario> listCondominos (){
        ArrayList<Usuario> condominos = new ArrayList<>();
        try{
            String sql = "select * from condominos";
            this.resultSet = this.statement.executeQuery(sql);
            Condomino condomino; 
            while (this.resultSet.next()) {
                condomino = new Condomino();
                condomino = setCondomino(
                                            resultSet.getString("idcondomino"),
                                            resultSet.getString("nome"),
                                            resultSet.getString("cpf"),
                                            resultSet.getString("dataNascimento"),
                                            resultSet.getString("email"),
                                            resultSet.getString("contato"),
                                            resultSet.getString("estadoCivil"),
                                            resultSet.getString("idunidade")
                                         );
                condominos.add(condomino); 
            }
            
            for (Usuario condom : condominos) {
                UnidadeDB unidadeDB = new UnidadeDB(this.statement);
                Unidade unidade = unidadeDB.listUnidadeUnique(((Condomino)condom).getUnidade().getId().toString());
                ((Condomino) condom).setUnidade(unidade);
            }            
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        return condominos;
    }

    public Condomino listCondominoUnique(String idcondomino){
        Condomino condomino = new Condomino();
        try{
            String sql = "SELECT * FROM condominos WHERE idcondomino = '" + idcondomino + "';";
            this.resultSet = this.statement.executeQuery(sql);
            while (this.resultSet.next()) {
                condomino = setCondomino(
                                            resultSet.getString("idcondomino"),
                                            resultSet.getString("nome"),
                                            resultSet.getString("cpf"),
                                            resultSet.getString("dataNascimento"),
                                            resultSet.getString("email"),
                                            resultSet.getString("contato"),
                                            resultSet.getString("estadoCivil"),
                                            resultSet.getString("idunidade")
                                         );
            }
            
            UnidadeDB unidadeDB = new UnidadeDB(this.statement);
            Unidade unidade = unidadeDB.listUnidadeUnique(condomino.getUnidade().getId().toString());
            condomino.setUnidade(unidade);
            
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        return condomino;
    }
    
    public Funcionario listFuncionarioUnique(String idfuncionario){
        Funcionario funcionario = new Funcionario();
        try{
            String sql = "SELECT * FROM funcionarios WHERE idfuncionario = '" + idfuncionario + "';";
            this.resultSet = this.statement.executeQuery(sql);
            while (this.resultSet.next()) {
                funcionario = setFuncionario(
                                            resultSet.getString("idfuncionario"),
                                            resultSet.getString("nome"),
                                            resultSet.getString("cpf"),
                                            resultSet.getString("dataNascimento"),
                                            resultSet.getString("email"),
                                            resultSet.getString("contato"),
                                            resultSet.getString("estadoCivil"),
                                            resultSet.getString("cargo")
                                         );
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return funcionario;
    }
    
    private Condomino setCondomino(String idcondomino, String nome, 
                                 String cpf, String dataNascimento, 
                                 String email, String contato, 
                                 String estadoCivil, String idunidade){
        
        Condomino condomino = new Condomino();
        Unidade unidade = new Unidade();
        
        condomino.setId(UUID.fromString(idcondomino));
        condomino.setNome(nome);
        condomino.setCpf(cpf);
        condomino.setDataNascimento(dataNascimento);
        condomino.setEmail(email);
        condomino.setContato(contato);
        condomino.setEstadoCivil(estadoCivil);
        unidade.setId(UUID.fromString(idunidade));
        condomino.setUnidade(unidade);
        
        return condomino;
    }
    
    private Funcionario setFuncionario(String idfuncionario, String nome, 
                                 String cpf, String dataNascimento, 
                                 String email, String contato, 
                                 String estadoCivil, String cargo){
        
        Funcionario funcionario = new Funcionario();
        
        funcionario.setId(UUID.fromString(idfuncionario));
        funcionario.setNome(nome);
        funcionario.setCpf(cpf);
        funcionario.setDataNascimento(dataNascimento);
        funcionario.setEmail(email);
        funcionario.setContato(contato);
        funcionario.setEstadoCivil(estadoCivil);
        funcionario.setCargo(cargo);
        
        return funcionario;
    }
}
