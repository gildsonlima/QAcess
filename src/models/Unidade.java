/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author GCL
 */
public class Unidade {
    
    int id;
    private String numero;
    private String bloco;
    private String condominio;
    private String cep;

    public String getCep() {
        return cep;
    }

    public boolean setCep(String cep) {
        this.cep = cep;
        return true;
    }

    public int getId() {
        return id;
    }

    public boolean setId(int id) {
        this.id = id;
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

    public String getCondominio() {
        return condominio;
    }

    public boolean setCondominio(String condominio) {
        this.condominio = condominio;
        return true;
    }
}
