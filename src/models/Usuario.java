/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;
import java.util.UUID;

/**
 *
 * @author GCL
 */
public abstract class Usuario {
    
    protected UUID id;
    protected String nome;
    protected String cpf;
    protected Date dataNascimento;
    protected String email;
    protected String contato;
    protected String estadoCivil;
    protected String usuarioAcesso;
    protected String senha;
    
    private boolean validarCPF(){
        return true;
    }
    
    public UUID getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        this.nome = nome;
        return true;
    }
    
    public String getCpf() {
        return cpf;
    }

    public boolean setCpf(String cpf) {
        this.cpf = cpf;
        return true;
    } 
    
    public Date getDataNascimento() {
        return dataNascimento;
    }

    public boolean setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
        return true;
    }
    
    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        this.email = email;
        return true;
    }
    
    public String getContato() {
        return contato;
    }

    public boolean setContato(String contato) {
        this.contato = contato;
        return true;
    }
    
    public String getEstadoCivil() {
        return estadoCivil;
    }

    public boolean setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
        return true;
    }
    
    public String getUsuarioAcesso() {
        return usuarioAcesso;
    }

    public boolean setUsuarioAcesso(String usuarioAcesso) {
        this.usuarioAcesso = usuarioAcesso;
        return true;
    }

    public String getSenha() {
        return senha;
    }

    public boolean setSenha(String senha) {
        this.senha = senha;
        return true;
    }

    









  
}
