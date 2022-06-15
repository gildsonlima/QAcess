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
   private String remetente;
   private Condomino condominoRetirada;
   private Unidade endereco;
   private Funcionario funcionarioEntrega;
   private Funcionario funcionarioRetirada;
   
    public Correspondencia(){
        this.status = "Pendente";
    }

    public int getId() {
        return id;
    }

    public boolean setId(int id) {
        this.id = id;
        return true;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public boolean setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
        return true;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public boolean setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
        return true;
    }

    public String getStatus() {
        return status;
    }

    public boolean setStatus(String status) {
        if(status.equalsIgnoreCase("Entregue")){
            this.status = status;
            Date date = new Date();
            this.setDataRetirada(date);
        }else{
            this.status = status;
        }
        
        return true;
    }

    public String getRemetente() {
        return remetente;
    }

    public boolean setRemetente(String remetente) {
        this.remetente = remetente;
        return true;
    }

    public Unidade getEndereco() {
        return endereco;
    }

    public boolean setEndereco(Unidade endereco) {
        this.endereco = endereco;
        return true;
    }

    public Funcionario getFuncionarioEntrega() {
        return funcionarioEntrega;
    }

    public void setFuncionarioEntrega(Funcionario funcionarioEntrega) {
        this.funcionarioEntrega = funcionarioEntrega;
    }

    public Funcionario getFuncionarioRetirada() {
        return funcionarioRetirada;
    }

    public void setFuncionarioRetirada(Funcionario funcionarioRetirada) {
        this.funcionarioRetirada = funcionarioRetirada;
    }

    public Condomino getCondominoRetirada() {
        return condominoRetirada;
    }

    public void setCondominoRetirada(Condomino condominoRetirada) {
        this.condominoRetirada = condominoRetirada;
    }

}
