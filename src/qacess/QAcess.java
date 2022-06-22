/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qacess;


import java.sql.Statement;
import controllers.OcorrenciaController;
import models.repository.QAcessDB;
import views.ViewOcorrencia;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import models.Condomino;
import models.Ocorrencia;
import models.Unidade;
import models.repository.OcorrenciaDB;
import models.repository.UnidadeDB;
import models.repository.UsuarioBD;
import views.ViewCorrespondencia;


/**
 *
 * @author GCL
 */
public class QAcess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
 
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        QAcessDB cdb = new QAcessDB();
        if(cdb.connect()){
            System.out.println("Conexão OK com o banco de dados.");
        }else{
            System.out.println("Deu ruim com a conexão!");
        }
        
        Statement statement = cdb.getStatement();
        
        ViewOcorrencia viewOcorrencia = new ViewOcorrencia(statement);
        viewOcorrencia.setVisible(true);
        
        ViewCorrespondencia viewCorrespondencia = new ViewCorrespondencia();
        viewCorrespondencia.setVisible(true);
        OcorrenciaController ocorrenciaController = new OcorrenciaController(statement, viewOcorrencia);
        
//        UnidadeDB unidadeDB = new UnidadeDB(statement);
//        Unidade unidade = new Unidade();
//        
//        unidade.setCondominio("Condominio Águas Claras");
//        unidade.setCep("41230540");
//        unidade.setBloco("A1");
//        unidade.setNumero("129");
//        
//        unidadeDB.insertUnidade(unidade);
//           
//        UsuarioBD usuarioBD = new UsuarioBD(statement);
//        Condomino condomino = new Condomino();
//        
//        condomino.setNome("Atila Bezerra");
//        condomino.setCpf("07189087699");
//        condomino.setDataNascimento(formato.parse("16/02/2022"));
//        condomino.setEmail("atila@gmail.com");
//        condomino.setEstadoCivil("Casado");
//        condomino.setUnidade(unidade);
//        
//        usuarioBD.insertUsuario(condomino);
//        
//        OcorrenciaDB ocorrenciaDB = new OcorrenciaDB(statement);
//        Ocorrencia ocorrencia = new Ocorrencia();
//        
//        ocorrencia.setLocal("Quadra do Condomínio no Bloco A");
//        ocorrencia.setDescricao("O gol está muito enferrujado, risco de machucados graves.");  
//        Date data = new Date();
//        ocorrencia.setData(data);
//        ocorrencia.setCondomino(condomino);
//        
//        ocorrenciaDB.insertOcorrencia(ocorrencia);
//
//        ArrayList<Ocorrencia> ocorrencias = new ArrayList<>();
//        
//        ocorrencias = ocorrenciaDB.listOcorrencias();
//        
//        for (Ocorrencia ocorrencia1 : ocorrencias) {
//            System.out.println("Id Correspondência: " + ocorrencia1.getId());
//            System.out.println("Local: " + ocorrencia1.getLocal());
//            System.out.println("Descrição: " + ocorrencia1.getDescricao());
//            System.out.println("Status: " + ocorrencia1.getStatus());
//            System.out.println("Data: " + ocorrencia1.getData());
//            System.out.println("Condomino Id: " + ocorrencia1.getCondomino().getId());
//            System.out.println("Condomino Responsável: " + ocorrencia1.getCondomino().getNome());
//            System.out.println("Cpf: " + ocorrencia1.getCondomino().getCpf());
//            System.out.println("Data Nascimento: " + ocorrencia1.getCondomino().getDataNascimento());
//            System.out.println("Email: " + ocorrencia1.getCondomino().getEmail());
//            System.out.println("Estado Civil: " + ocorrencia1.getCondomino().getEstadoCivil());
//            System.out.println("Unidade Id: " + ocorrencia1.getCondomino().getUnidade().getId());
//            System.out.println("Condominio: " + ocorrencia1.getCondomino().getUnidade().getCondominio());
//            System.out.println("Cep: " + ocorrencia1.getCondomino().getUnidade().getCep());
//            System.out.println("Bloco: " + ocorrencia1.getCondomino().getUnidade().getBloco());
//            System.out.println("Numero: " + ocorrencia1.getCondomino().getUnidade().getNumero());
//            System.out.println("==================================================");
//        }
    }   
}
