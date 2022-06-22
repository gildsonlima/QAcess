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
public class Correspondencia {
      
   private UUID id;
   private String remetente;
   private Unidade unidade;
   private String status;
   private Funcionario funcionarioRecebimento;  
   private Date dataRecebimento; 
   private Condomino condominoRetirada; 
   private Funcionario funcionarioEntrega; 
   private Date dataRetirada; 
   private String tipoEncomenda;
   private String condigoEncomenda;
   private String destinatario;
   
   
    public Correspondencia(){
        this.status = "Pendente";
        this.id = UUID.randomUUID();
    }
    
    public UUID getId() {
        return id;
    }
    
    public String getRemetente() {
        return remetente;
    }

    public boolean setRemetente(String remetente) {
        this.remetente = remetente;
        return true;
    }
    
    public Unidade getUnidade() {
        return unidade;
    }

    public boolean setUnidade(Unidade unidade) {
        this.unidade = unidade;
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

    public Funcionario getFuncionarioRecebimento() {
        return funcionarioRecebimento;
    }

    public void setFuncionarioRecebimento(Funcionario funcionarioRecebimento) {
        this.funcionarioRecebimento = funcionarioRecebimento;
    }

    public Date getDataRecebimento() {
        return dataRecebimento;
    }

    public void setDataRecebimento(Date dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }

    public Condomino getCondominoRetirada() {
        return condominoRetirada;
    }

    public void setCondominoRetirada(Condomino condominoRetirada) {
        this.condominoRetirada = condominoRetirada;
    }

    public Funcionario getFuncionarioEntrega() {
        return funcionarioEntrega;
    }

    public void setFuncionarioEntrega(Funcionario funcionarioEntrega) {
        this.funcionarioEntrega = funcionarioEntrega;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public String getTipoEncomenda() {
        return tipoEncomenda;
    }

    public void setTipoEncomenda(String tipoEncomenda) {
        this.tipoEncomenda = tipoEncomenda;
    }

    public String getCondigoEncomenda() {
        return condigoEncomenda;
    }

    public void setCondigoEncomenda(String condigoEncomenda) {
        this.condigoEncomenda = condigoEncomenda;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    
    
}
