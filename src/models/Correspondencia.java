/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;

/**
 *
 * @author GCL
 */
public class Correspondencia {
    
   private int id;
   private Date dataEntrega;
   private Date dataRetirada;
   private String status;
   private Condomino remetente;
   private Unidade endereco;
   private Funcionario funcionarioRecepcao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Condomino getRemetente() {
        return remetente;
    }

    public void setRemetente(Condomino remetente) {
        this.remetente = remetente;
    }

    public Unidade getEndereco() {
        return endereco;
    }

    public void setEndereco(Unidade endereco) {
        this.endereco = endereco;
    }

    public Funcionario getFuncionarioRecepcao() {
        return funcionarioRecepcao;
    }

    public void setFuncionarioRecepcao(Funcionario funcionarioRecepcao) {
        this.funcionarioRecepcao = funcionarioRecepcao;
    }
   
   
    
}
