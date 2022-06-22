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
        
    public OcorrenciaController(Statement statement, ViewOcorrencia viewOcorrencia){
        this.statement = statement;
        this.ocorrenciaDB = new OcorrenciaDB(statement);
        this.condominoDB = new UsuarioBD(statement);
        this.viewOcorrencia = viewOcorrencia;
        this.viewOcorrencia.botaoEnviar.addActionListener(this);
    }
    
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == this.viewOcorrencia.botaoEnviar){
            verificarCondomino(this.viewOcorrencia.txtNome.getText());
            Condomino condomino = verificarCondomino(this.viewOcorrencia.txtNome.getText());
            
            if(condomino != null){
                Ocorrencia ocorrencia = new Ocorrencia();
                ocorrencia.setDescricao(this.viewOcorrencia.txtOcorrencia.getText());
                ocorrencia.setLocal(this.viewOcorrencia.txtNome.getText());
                ocorrencia.setCondomino(condomino);
                fillTable(this.viewOcorrencia.tableOcorrencia);
                if(this.ocorrenciaDB.insertOcorrencia(ocorrencia)){
                    System.out.println("Sucesso ao inserir a Ocorrencia!");
                }else{
                    System.out.println("Erro ao inserir a Ocorrencia!");
                }
            }else{
                JOptionPane.showConfirmDialog(null, "Deu ruim aqui vei");
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
        ArrayList<Ocorrencia> ocorrencias = this.ocorrenciaDB.listOcorrencias();
        for (Ocorrencia ocorrencia : ocorrencias) {
            colunas[0] = ocorrencia.getId();
            colunas[1] = formato.format(ocorrencia.getData());
            colunas[2] = ocorrencia.getLocal();
            colunas[3] = ocorrencia.getStatus();
            
            defaultTable.addRow(colunas);
        }
    }
    
    
    private Condomino verificarCondomino(String nome){
        UsuarioBD usuarioBD = new UsuarioBD(statement);
        Condomino condomino = usuarioBD.listCondominoNome(nome);
        if(condomino == null){
            return null;
        }else{
            return condomino;
        }
    }
}
