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
public class Funcionario extends Usuario{
    
    private String cargo;
    
    public Funcionario(){
        this.id = UUID.randomUUID();
    }

    public String getCargo() {
        return cargo;
    }

    public boolean setCargo(String cargo) {
        this.cargo = cargo;
        return true;
    }
}
