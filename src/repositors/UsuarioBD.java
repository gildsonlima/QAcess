/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositors;

import java.sql.ResultSet;
import java.sql.Statement;
import models.Condomino;
import models.Funcionario;
import models.Usuario;

/**
 *
 * @author Atila
 */
public class UsuarioBD {
    protected ResultSet resultSet;
    
    public boolean insertUsuario(Statement statement, Usuario usuario){
        try{
            String valuesPadrao = "values ('" + usuario.getId() + "', "
                    + "'" + usuario.getNome() + "', "
                    + "'" + usuario.getCpf() + "', "
                    + "'" + usuario.getDataNascimento() + "', "
                    + "'"+ usuario.getEmail() + "', "
                    + "'" + usuario.getContato() + "', "
                    + "'" + usuario.getEstadoCivil() +"'";
            
            if(usuario instanceof Condomino){
                String sql = "insert into condomino "
                    + "(id, nome, cpf, dataNascimento, email, contato, estadoCivil, idUnidade) "
                    + valuesPadrao + ", '" + ((Condomino) usuario).getUnidade().getId()+"'" + ");";
                    statement.execute(sql);
            }else{
                String sql = "insert into funcionario "
                    + "(id, nome, cpf, dataNascimento, email, contato, estadoCivil, cargo) "
                    + valuesPadrao + ", '" + ((Funcionario) usuario).getCargo() +"'" + ");";
                    statement.execute(sql);
            }
            return true;
            
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }
}
