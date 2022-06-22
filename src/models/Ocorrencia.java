/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author GCL
 */
public class Ocorrencia {
    
    private UUID id;
    private Condomino condomino;
    private String local;
    private String descricao;
    private String status;
    private String data;
    
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    public Ocorrencia(){
        this.status = "Pendente";
        this.id = UUID.randomUUID();
        Date date = new Date();
        this.data = formato.format(date);
    }

    public UUID getId() {
        return id;
    }
    
    public boolean setId(UUID uuid){
        this.id = uuid;
        return true;
    }

    public Condomino getCondomino() {
        return condomino;
    }

    public boolean setCondomino(Condomino condomino) {
        this.condomino = condomino;
        return true;
    }
    
    public String getLocal() {
        return local;
    }

    public boolean setLocal(String local) {
        this.local = local;
        return true;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean setDescricao(String descricao) {
        this.descricao = descricao;
        return true;
    }
    
    public String getStatus() {
        return status;
    }

    public boolean setStatus(String status) {
        this.status = status;
        return true;
    }   

    public String getData() {
        return data;
    }

    public boolean setData(String data) { 
        
        this.data = data;
        
        return true;
    }
}
