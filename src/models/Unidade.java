/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.UUID;

/**
 *
 * @author GCL
 */
public class Unidade {
    
    private UUID id;
    private String condominio;
    private String cep;
    private String numero;
    private String bloco;
    
    public Unidade(){
        this.id = UUID.randomUUID();
    }
    
    public UUID getId() {
        return id;
    }
    
    public boolean setId(UUID uuid) {
        this.id = uuid;
        return true;
    }
    
    public String getCondominio() {
        return condominio;
    }

    public boolean setCondominio(String condominio) {
        this.condominio = condominio;
        return true;
    }

    public String getCep() {
        return cep;
    }

    public boolean setCep(String cep) { 
        this.cep = cep;
        return true;
    }
 
    public String getNumero() {
        return numero;
    }

    public boolean setNumero(String numero) {
        this.numero = numero;
        return true;
    }

    public String getBloco() {
        return bloco;
    }

    public boolean setBloco(String bloco) {
        this.bloco = bloco;
        return true;
    }
}
