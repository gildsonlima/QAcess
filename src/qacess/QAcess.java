/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qacess;

import controllers.OcorrenciaController;
import repositors.QAcessDB;
import views.ViewOcorrencia;
import java.sql.Statement;

/**
 *
 * @author GCL
 */
public class QAcess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ViewOcorrencia viewOcorrencia = new ViewOcorrencia();
        viewOcorrencia.setVisible(true);

        
        QAcessDB cdb = new QAcessDB();
        if(cdb.connect()){
            System.out.println("Conexão OK com o banco de dados.");
        }else{
            System.out.println("Deu ruim com a conexão!");
        }
        
        Statement statement = cdb.getStatement();
        
        OcorrenciaController ocorrenciaController = new OcorrenciaController( statement , viewOcorrencia);
        
    }   
}
