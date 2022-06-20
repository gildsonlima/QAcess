/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import models.repository.CorrespondenciaDB;

/**
 *
 * @author Atila
 */
public class CorrespondenciaController implements ActionListener {
    
    private Statement statement;
    private CorrespondenciaDB correspondenciaBD;
    
    public CorrespondenciaController(Statement statement, CorrespondenciaDB correspondenciaDB){
        this.statement = statement;
        this.correspondenciaBD = correspondenciaDB;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
