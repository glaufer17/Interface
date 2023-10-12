package visao;

import controle.ControleAluno;
import controle.ControleDocente;
import java.time.LocalDate;

/**
 *
 * @author GLAUFER
 */
public class TelaCadastroDocente extends javax.swing.JFrame {

    
    private String nomeD;
    private String cpfD;
    private String emailD;
    private String generoD;
    private String formacao;
    private LocalDate dataNascimentoD;
    private ControleDocente controleDocente;
    private boolean editar;

    public TelaCadastroDocente(ControleDocente controleDocente) {
        initComponents();
        this.controleDocente = controleDocente;
        buttonGroup1.add(jR_MasculinoDoc);
        buttonGroup1.add(jR_femininoDoc);
        buttonGroup1.clearSelection();
        setLocationRelativeTo(null);
    }

    public TelaCadastroDocente(ControleDocente controleDocente, ListaDocente telaListaDocente, String nomeD, String cpfD, String emailD, String generoD, String formacao, LocalDate dataNascimentoD) {
        this(controleDocente);
        this.nomeD = nomeD;
        this.cpfD = cpfD;
        this.emailD = emailD;
        this.generoD = generoD;
        this.formacao = formacao;
        this.dataNascimentoD = dataNascimentoD;
        editar = true;
        //setarDadosTela();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jR_femininoDoc = new javax.swing.JRadioButton();
        jR_MasculinoDoc = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        MesDoc = new javax.swing.JSpinner();
        DiaDoc = new javax.swing.JSpinner();
        AnoDoc = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jC_Formacao = new javax.swing.JComboBox<>();
        jT_NomeDoc = new javax.swing.JTextField();
        jT_cpfDoc = new javax.swing.JTextField();
        jT_emailDoc = new javax.swing.JTextField();
        jB_Cancelar = new javax.swing.JButton();
        jB_Salvar = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Nome: ");

        jLabel3.setText("Email: ");

        jLabel4.setText("CPF: ");

        jLabel5.setText("Genero: ");

        jR_femininoDoc.setText("Feminino");
        jR_femininoDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jR_femininoDocActionPerformed(evt);
            }
        });

        jR_MasculinoDoc.setText("Masculino");

        jLabel6.setText("Dta. Nasc: ");

        jLabel7.setText("Formacao: ");

        jC_Formacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a Formacao", "TADS", "Direito", "Gastronomia", "Contabilidade", "Engenharia Civil", "Arquitetura" }));

        jB_Cancelar.setBackground(java.awt.SystemColor.controlHighlight);
        jB_Cancelar.setText("Cancelar");
        jB_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_CancelarActionPerformed(evt);
            }
        });

        jB_Salvar.setBackground(java.awt.SystemColor.activeCaption);
        jB_Salvar.setText("Salvar");
        jB_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_SalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jR_femininoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jR_MasculinoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jT_emailDoc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                        .addComponent(jT_cpfDoc, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jT_NomeDoc, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jB_Cancelar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB_Salvar))
                        .addComponent(jC_Formacao, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(DiaDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(MesDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(AnoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jT_NomeDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jT_cpfDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jT_emailDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jR_femininoDoc)
                    .addComponent(jR_MasculinoDoc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(MesDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DiaDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jC_Formacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Salvar)
                    .addComponent(jB_Cancelar))
                .addGap(23, 23, 23))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addContainerGap(345, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jR_femininoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jR_femininoDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jR_femininoDocActionPerformed

    private void jB_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_CancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jB_CancelarActionPerformed

    private void jB_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_SalvarActionPerformed
        nomeD = jT_NomeDoc.getText();
        cpfD = jT_cpfDoc.getText();
        emailD = jT_emailDoc.getText();

        generoD = jR_femininoDoc.isSelected() ? "Feminino" : "Masculino";
        int dia = (int) DiaDoc.getValue();
        int mes = (int) MesDoc.getValue();
        int ano = (int) AnoDoc.getValue();
        dataNascimentoD = LocalDate.of(ano, mes, dia);

        formacao = jC_Formacao.getSelectedItem().toString();
        System.out.println("nome: " + nomeD);
        System.out.println("CPF: " + cpfD);
        System.out.println("email: " + emailD);
        System.out.println("genero: " + generoD);
        System.out.println("data nascimento: " + dataNascimentoD);
        System.out.println("formacao: " + formacao);

        if (!editar) {
            controleDocente.adicionarDocente(nomeD, cpfD, emailD, generoD, formacao, dataNascimentoD);
        }else{
            controleDocente.editarDocente(nomeD, cpfD, emailD, generoD, formacao, dataNascimentoD);
        }
        controleDocente.getTelaListagem().setarDadosTabelaDocente();
        setVisible(false);
    }//GEN-LAST:event_jB_SalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner AnoDoc;
    private javax.swing.JSpinner DiaDoc;
    private javax.swing.JSpinner MesDoc;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jB_Cancelar;
    private javax.swing.JButton jB_Salvar;
    private javax.swing.JComboBox<String> jC_Formacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jR_MasculinoDoc;
    private javax.swing.JRadioButton jR_femininoDoc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jT_NomeDoc;
    private javax.swing.JTextField jT_cpfDoc;
    private javax.swing.JTextField jT_emailDoc;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
