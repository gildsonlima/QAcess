/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

/**
 *
 * @author GCL
 */
public class ViewOcorrencia extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public ViewOcorrencia() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        popupMenu1 = new java.awt.PopupMenu();
        telaCadastro = new javax.swing.JTabbedPane();
        abaCadastrar = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOcorrencia = new javax.swing.JTextArea();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botaoEnviar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        labelLocal = new javax.swing.JLabel();
        txtLocal = new javax.swing.JTextField();
        listaUnidades = new javax.swing.JComboBox<>();
        abaPesquisar = new javax.swing.JDesktopPane();
        botaoPesquisa = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableOcorrencia = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        telaCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ocorrência", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Lato Semibold", 0, 18))); // NOI18N

        abaCadastrar.setBackground(java.awt.SystemColor.menu);

        jLabel1.setFont(new java.awt.Font("Lato Semibold", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de ocorrências");

        txtOcorrencia.setColumns(20);
        txtOcorrencia.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        txtOcorrencia.setLineWrap(true);
        txtOcorrencia.setRows(5);
        txtOcorrencia.setWrapStyleWord(true);
        txtOcorrencia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtOcorrencia.setMargin(new java.awt.Insets(5, 10, 5, 5));
        jScrollPane1.setViewportView(txtOcorrencia);

        txtNome.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        txtNome.setToolTipText("");
        txtNome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Lato Semibold", 0, 15)); // NOI18N
        jLabel2.setText("Nome ");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Lato Semibold", 0, 15)); // NOI18N
        jLabel3.setText("Unidade");

        jLabel4.setFont(new java.awt.Font("Lato Semibold", 0, 15)); // NOI18N
        jLabel4.setText("Descrição da ocorrêcia");

        botaoEnviar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botaoEnviar.setText("Enviar");

        botaoLimpar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botaoLimpar.setText("Limpar ");
        botaoLimpar.setToolTipText("");

        labelLocal.setFont(new java.awt.Font("Lato Semibold", 0, 15)); // NOI18N
        labelLocal.setText("Local");

        txtLocal.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        txtLocal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtLocal.setMinimumSize(new java.awt.Dimension(7, 26));

        listaUnidades.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        listaUnidades.setMaximumRowCount(100);
        listaUnidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "101", "102", "103", "104" }));

        abaCadastrar.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        abaCadastrar.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        abaCadastrar.setLayer(txtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        abaCadastrar.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        abaCadastrar.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        abaCadastrar.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        abaCadastrar.setLayer(botaoEnviar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        abaCadastrar.setLayer(botaoLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        abaCadastrar.setLayer(labelLocal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        abaCadastrar.setLayer(txtLocal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        abaCadastrar.setLayer(listaUnidades, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout abaCadastrarLayout = new javax.swing.GroupLayout(abaCadastrar);
        abaCadastrar.setLayout(abaCadastrarLayout);
        abaCadastrarLayout.setHorizontalGroup(
            abaCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abaCadastrarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(abaCadastrarLayout.createSequentialGroup()
                        .addGroup(abaCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(abaCadastrarLayout.createSequentialGroup()
                                .addGroup(abaCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(abaCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(abaCadastrarLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(126, 126, 126)
                                        .addComponent(labelLocal))
                                    .addGroup(abaCadastrarLayout.createSequentialGroup()
                                        .addComponent(listaUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(0, 67, Short.MAX_VALUE)))
                .addContainerGap())
        );
        abaCadastrarLayout.setVerticalGroup(
            abaCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaCadastrarLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(abaCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(labelLocal))
                .addGap(20, 20, 20)
                .addGroup(abaCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addGroup(abaCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoEnviar)
                    .addComponent(botaoLimpar))
                .addContainerGap())
        );

        telaCadastro.addTab("Cadastrar", null, abaCadastrar, "");

        abaPesquisar.setBackground(new java.awt.Color(240, 240, 240));

        botaoPesquisa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botaoPesquisa.setText("Pesquisar");

        txtPesquisa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPesquisa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tableOcorrencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tableOcorrencia);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Pesquisa de ocorrências");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Filtro da pesquisa");

        abaPesquisar.setLayer(botaoPesquisa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        abaPesquisar.setLayer(txtPesquisa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        abaPesquisar.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        abaPesquisar.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        abaPesquisar.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout abaPesquisarLayout = new javax.swing.GroupLayout(abaPesquisar);
        abaPesquisar.setLayout(abaPesquisarLayout);
        abaPesquisarLayout.setHorizontalGroup(
            abaPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaPesquisarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(abaPesquisarLayout.createSequentialGroup()
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addComponent(botaoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(abaPesquisarLayout.createSequentialGroup()
                        .addGroup(abaPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        abaPesquisarLayout.setVerticalGroup(
            abaPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaPesquisarLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(20, 20, 20)
                .addGroup(abaPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        telaCadastro.addTab("Pesquisar", abaPesquisar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaCadastro, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaCadastro, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        telaCadastro.getAccessibleContext().setAccessibleName("Ocorrencia");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void txtUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnidadeActionPerformed

    }//GEN-LAST:event_txtUnidadeActionPerformed

    private void txtUnidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUnidadeFocusGained

    }//GEN-LAST:event_txtUnidadeFocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewOcorrencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewOcorrencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewOcorrencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewOcorrencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewOcorrencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane abaCadastrar;
    public javax.swing.JDesktopPane abaPesquisar;
    public javax.swing.JButton botaoEnviar;
    public javax.swing.JButton botaoLimpar;
    public javax.swing.JButton botaoPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelLocal;
    private javax.swing.JComboBox<String> listaUnidades;
    private java.awt.PopupMenu popupMenu1;
    public javax.swing.JTable tableOcorrencia;
    public javax.swing.JTabbedPane telaCadastro;
    public javax.swing.JTextField txtLocal;
    public javax.swing.JTextField txtNome;
    public javax.swing.JTextArea txtOcorrencia;
    public javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
