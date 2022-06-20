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
   private Funcionario funcionárioResponsavelPelaRecepcao;
   private Date dataRecepcionadaPeloCondominio;
   private Condomino condominoResponsavelPelaRetirada;
   private Funcionario funcionarioResponsavelPelaEntrega;
   private Date dataRecepcionadaPeloCondomino;
   
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
            this.setDataRecepcionadaPeloCondomino(date);
        }else{
            this.status = status;
        }
        return true;
    }

    public Funcionario getFuncionárioResponsavelPelaRecepcao() {
        return funcionárioResponsavelPelaRecepcao;
    }

    public void setFuncionárioResponsavelPelaRecepcao(Funcionario funcionárioResponsavelPelaRecepcao) {
        this.funcionárioResponsavelPelaRecepcao = funcionárioResponsavelPelaRecepcao;
    }

    public Date getDataRecepcionadaPeloCondominio() {
        return dataRecepcionadaPeloCondominio;
    }

    public void setDataRecepcionadaPeloCondominio(Date dataRecepcionadaPeloCondominio) {
        this.dataRecepcionadaPeloCondominio = dataRecepcionadaPeloCondominio;
    }

    public Condomino getCondominoResponsavelPelaRetirada() {
        return condominoResponsavelPelaRetirada;
    }

    public void setCondominoResponsavelPelaRetirada(Condomino condominoResponsavelPelaRetirada) {
        this.condominoResponsavelPelaRetirada = condominoResponsavelPelaRetirada;
    }

    public Funcionario getFuncionarioResponsavelPelaEntrega() {
        return funcionarioResponsavelPelaEntrega;
    }

    public void setFuncionarioResponsavelPelaEntrega(Funcionario funcionarioResponsavelPelaEntrega) {
        this.funcionarioResponsavelPelaEntrega = funcionarioResponsavelPelaEntrega;
    }

    public Date getDataRecepcionadaPeloCondomino() {
        return dataRecepcionadaPeloCondomino;
    }

    public void setDataRecepcionadaPeloCondomino(Date dataRecepcionadaPeloCondomino) {
        this.dataRecepcionadaPeloCondomino = dataRecepcionadaPeloCondomino;
    }
}
