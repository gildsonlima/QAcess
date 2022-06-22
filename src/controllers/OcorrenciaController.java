/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.Condomino;
import models.Ocorrencia;
import models.repository.OcorrenciaDB;
import models.repository.UsuarioBD;
import views.ViewOcorrencia;

/**
 *
 * @author GCL
 */
public class OcorrenciaController implements ActionListener{
    private ViewOcorrencia viewOcorrencia;
    private Statement statement;
    private OcorrenciaDB ocorrenciaDB;
    private UsuarioBD condominoDB;
    private Condomino condomino;
        
    public OcorrenciaController(Statement statement, ViewOcorrencia viewOcorrencia){
        this.statement = statement;
        this.ocorrenciaDB = new OcorrenciaDB(statement);
        this.condominoDB = new UsuarioBD(statement);
        this.viewOcorrencia = viewOcorrencia;
        
        this.viewOcorrencia.botaoEnviar.addActionListener(this);
        this.viewOcorrencia.botaoPesquisa.addActionListener(this);
        this.viewOcorrencia.botaoLimpar.addActionListener(this);
        
    }
    
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == this.viewOcorrencia.botaoEnviar){
            
            Condomino condomino = condominoDB.getCondominoByNome(this.viewOcorrencia.txtNome.getText()) ;
            
            if(condomino != null){
                Ocorrencia ocorrencia = new Ocorrencia();
                ocorrencia.setDescricao(this.viewOcorrencia.txtOcorrencia.getText());
                ocorrencia.setLocal(this.viewOcorrencia.txtLocal.getText());

                ocorrencia.setCondomino(condomino);
                fillTable(this.viewOcorrencia.tableOcorrencia);
                if(this.ocorrenciaDB.insertOcorrencia(ocorrencia)){
                    System.out.println("Sucesso ao inserir a Ocorrencia!");
               }else{
                   System.out.println("Erro ao inserir a Ocorrencia!");
               }
            }else{
                JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
            }
            
            
        }else{
            if(e.getSource() == this.viewOcorrencia.botaoPesquisa){
                fillTable(this.viewOcorrencia.tableOcorrencia);
                System.out.println("pesquisando");
            }else{
                if(e.getSource() == this.viewOcorrencia.botaoLimpar){
                    this.viewOcorrencia.txtLocal.setText("");
                    this.viewOcorrencia.txtNome.setText("");
                    this.viewOcorrencia.txtOcorrencia.setText("");
                    
                }
            }
        }       
    }
    
    public void fillTable(JTable table){
        //criar essa defaultTable para a gente conseguir manipular os dados que vão estar nela
        DefaultTableModel defaultTable = new DefaultTableModel();
        
        //apontar nossa tabela que estar na tela para a que a gente está montando localmente
        table.setModel(defaultTable);
        //adicionar as colunas com os nomes que a gente quer que seja exibido
        defaultTable.addColumn("Criador");
        defaultTable.addColumn("Data");
        defaultTable.addColumn("Local");
        defaultTable.addColumn("Status");
        // criar as colunas de cada linha
        
        Object [] colunas  = new Object[4];
        ArrayList<Ocorrencia> ocorrencias = this.ocorrenciaDB.getOcorrenciasDB();
        for (Ocorrencia ocorrencia : ocorrencias) {
            condomino = ocorrencia.getCondomino();
            colunas[0] = condomino.getNome();
            colunas[1] = ocorrencia.getData();
            colunas[2] = ocorrencia.getLocal();
            colunas[3] = ocorrencia.getStatus();
            
            defaultTable.addRow(colunas);
        }
    }
    
}
