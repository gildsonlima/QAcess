/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qacess;

import views.ViewOcorrencia;
import java.time.LocalDateTime;
import java.util.Date;

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
        System.out.println(LocalDateTime.now());
        Date data = new Date();
        System.out.println("Data Agora: " + data);
    }
    
}
