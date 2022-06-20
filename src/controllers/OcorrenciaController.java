/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import javax.swing.JOptionPane;
import models.Condomino;
import models.Ocorrencia;
import models.repository.OcorrenciaDB;
import models.repository.QAcessDB;
import views.ViewOcorrencia;

/**
 *
 * @author GCL
 */
public class OcorrenciaController implements ActionListener{
    private ViewOcorrencia viewOcorrencia;
    private Statement statement;
    private OcorrenciaDB ocorrenciaDB;
    
    public OcorrenciaController(Statement statement, ViewOcorrencia viewOcorrencia){
        this.statement = statement;
        this.ocorrenciaDB = new OcorrenciaDB(statement);
        this.viewOcorrencia = viewOcorrencia;
        this.viewOcorrencia.botaoEnviar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == this.viewOcorrencia.botaoEnviar){
            
            Condomino condomino = new Condomino();
            
            Ocorrencia ocorrencia = new Ocorrencia();
            ocorrencia.setDescricao(this.viewOcorrencia.txtOcorrencia.getText());
            ocorrencia.setLocal(this.viewOcorrencia.txtNome.getText());
            ocorrencia.setCondomino(condomino);
            
            if(this.ocorrenciaDB.insertOcorrencia(ocorrencia)){
                System.out.println("Sucesso ao inserir a Ocorrencia!");
           }else{
               System.out.println("Erro ao inserir a Ocorrencia!");
           }
        }       
    }
}
