/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import repositors.OcorrenciaDB;

/**
 *
 * @author GCL
 */
public class OcorrenciaController implements ActionListener{
    private Statement statement;
    private OcorrenciaDB ocorrenciaDB;
    
    public OcorrenciaController(Statement statement, OcorrenciaDB ocorrenciaDB){
        this.statement = statement;
        this.ocorrenciaDB = ocorrenciaDB;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
