/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import beans.Funcionario;
import beans.Residuo;
import dao.FuncionarioDAO;
import dao.ResiduoDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import utils.TableModelCreator;

/**
 *
 * @author ciceroaon
 */
public class HomeView extends javax.swing.JFrame {

    private String nomeUsuario;
    private int idSelecionado;
    private Residuo residuoSelecionado = null;

    /**
     * Creates new form HomeView
     */
    /**
     * Creates new form HomeView
     */
    public HomeView() {
        initComponents();

        atualizarTabela();
        mudaEstadoBotoes(false);
    }

    public Residuo getResiduoSelecionado() {
        return residuoSelecionado;
    }

    public void atualizarTabela() {
        try {
            List<Residuo> lstResiduos = new ResiduoDAO().getAll();

            TableModel tableModelProdutos = TableModelCreator.createTableModel(Residuo.class, lstResiduos, null);
            tbResiduos.setModel(tableModelProdutos);
            mudaEstadoBotoes(false);
        } catch (Exception e) {
            System.out.println("Houve um erro ao tentar popular a tabela");
        }
    }

    private void mudaEstadoBotoes(boolean novoEstado) {
        btnEditar.setEnabled(novoEstado);
        btnExcluir.setEnabled(novoEstado);
    }

    public void setUsuario(String nome) {
        this.nomeUsuario = nome;
    }

    public String getUsuario() {
        return nomeUsuario;
    }

    public void abaSelecionada(boolean residuos, boolean cadastrar) {
        jResiduos.setVisible(residuos);
        abaResiduos.setSelected(residuos);
        jCadastrar.setVisible(cadastrar);
        abaCadastrar.setSelected(cadastrar);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraLateral = new javax.swing.JPanel();
        abaCadastrar = new javax.swing.JToggleButton();
        abaResiduos = new javax.swing.JToggleButton();
        lblUserName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        abaCadastrar1 = new javax.swing.JToggleButton();
        jMain = new javax.swing.JPanel();
        jCadastrar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnCadastro = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        pssCSenha = new javax.swing.JPasswordField();
        pssSenha = new javax.swing.JPasswordField();
        txtDataNasc = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jResiduos = new javax.swing.JPanel();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbResiduos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Descarte Consciente");

        barraLateral.setBackground(new java.awt.Color(57, 48, 74));

        abaCadastrar.setBackground(new java.awt.Color(32, 32, 48));
        abaCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        abaCadastrar.setText("Cadastrar Funcionário");
        abaCadastrar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        abaCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abaCadastrarActionPerformed(evt);
            }
        });

        abaResiduos.setBackground(new java.awt.Color(32, 32, 48));
        abaResiduos.setForeground(new java.awt.Color(255, 255, 255));
        abaResiduos.setSelected(true);
        abaResiduos.setText("Resíduos");
        abaResiduos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        abaResiduos.setMargin(new java.awt.Insets(0, 0, 0, 0));
        abaResiduos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abaResiduosActionPerformed(evt);
            }
        });

        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserName.setText(this.nomeUsuario);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Perfil.png"))); // NOI18N

        abaCadastrar1.setBackground(new java.awt.Color(32, 32, 48));
        abaCadastrar1.setForeground(new java.awt.Color(255, 255, 255));
        abaCadastrar1.setText("Cadastrar Funcionário");
        abaCadastrar1.setEnabled(false);
        abaCadastrar1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        abaCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abaCadastrar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraLateralLayout = new javax.swing.GroupLayout(barraLateral);
        barraLateral.setLayout(barraLateralLayout);
        barraLateralLayout.setHorizontalGroup(
            barraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraLateralLayout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addGroup(barraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(barraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(abaCadastrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(abaResiduos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(abaCadastrar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(barraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))))
        );
        barraLateralLayout.setVerticalGroup(
            barraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUserName)
                .addGap(25, 25, 25)
                .addComponent(abaResiduos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(abaCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(abaCadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMain.setBackground(new java.awt.Color(32, 32, 48));
        jMain.setAlignmentX(0.0F);
        jMain.setAlignmentY(0.0F);
        jMain.setMaximumSize(new java.awt.Dimension(720, 480));
        jMain.setName(""); // NOI18N
        jMain.setPreferredSize(new java.awt.Dimension(600, 430));
        jMain.setLayout(new java.awt.CardLayout());

        jCadastrar.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cadastro de Funcionários");

        btnCadastro.setText("Cadastrar");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirme a Senha:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Data de Nascimento:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CPF:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Senha:");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nome:");

        javax.swing.GroupLayout jCadastrarLayout = new javax.swing.GroupLayout(jCadastrar);
        jCadastrar.setLayout(jCadastrarLayout);
        jCadastrarLayout.setHorizontalGroup(
            jCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCadastrarLayout.createSequentialGroup()
                .addGroup(jCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jCadastrarLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jCadastrarLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(jCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jCadastrarLayout.createSequentialGroup()
                                .addGroup(jCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(32, 32, 32)
                                .addGroup(jCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jCadastrarLayout.createSequentialGroup()
                                        .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtNome)
                                    .addComponent(txtCpf)
                                    .addComponent(pssSenha)
                                    .addComponent(pssCSenha)))
                            .addComponent(jLabel6))))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        jCadastrarLayout.setVerticalGroup(
            jCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCadastrarLayout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(51, 51, 51)
                .addGroup(jCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pssSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(14, 14, 14)
                .addGroup(jCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pssCSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(83, 83, 83)
                .addComponent(btnCadastro)
                .addGap(140, 140, 140))
        );

        jMain.add(jCadastrar, "card3");

        jResiduos.setOpaque(false);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        tbResiduos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbResiduos);

        javax.swing.GroupLayout jResiduosLayout = new javax.swing.GroupLayout(jResiduos);
        jResiduos.setLayout(jResiduosLayout);
        jResiduosLayout.setHorizontalGroup(
            jResiduosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jResiduosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jResiduosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jResiduosLayout.createSequentialGroup()
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jResiduosLayout.setVerticalGroup(
            jResiduosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jResiduosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jResiduosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jResiduosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMain.add(jResiduos, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(barraLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jMain, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMain, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
            .addComponent(barraLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void abaResiduosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abaResiduosActionPerformed
        abaSelecionada(true, false);
        if (abaResiduos.isSelected()) {
            abaResiduos.setBackground(new java.awt.Color(32, 32, 48));
        } else {
            abaResiduos.setBackground(new java.awt.Color(12, 124, 89));
        }
    }//GEN-LAST:event_abaResiduosActionPerformed

    private void abaCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abaCadastrarActionPerformed
        abaSelecionada(false, true);
        if (abaCadastrar.isSelected()) {
            abaCadastrar.setBackground(new java.awt.Color(32, 32, 48));
        } else {
            abaCadastrar.setBackground(new java.awt.Color(12, 124, 89));
        }
    }//GEN-LAST:event_abaCadastrarActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        try {
            String nome = txtNome.getText();
            String cpf = txtCpf.getText();
            String datanasc = txtDataNasc.getText();
            if (pssSenha.getText().equals(pssCSenha.getText())) {
                String senha = pssSenha.getText();

                Funcionario funcionario = new Funcionario();
                funcionario.setNome(nome);
                funcionario.setCPF(cpf);
                funcionario.setData_nasc(datanasc);
                funcionario.setSenha(senha);

                FuncionarioDAO fdao = new FuncionarioDAO();
                fdao.inserir(funcionario);

                txtNome.setText("");
                txtCpf.setText("");
                txtDataNasc.setText("");
                pssSenha.setText("");
                pssCSenha.setText("");

                if (funcionario.getIdFuncionario() != 0) {
                    JOptionPane.showMessageDialog(null, "Funcionário cadastrado! ID cadastrado é: " + funcionario.getIdFuncionario());
                }

            } else {
                JOptionPane.showMessageDialog(null, "As senhas não coincidem: ");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o funcionário: " + e.getMessage());
        }
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        residuoSelecionado = new ResiduoDAO().getByID(idSelecionado);

        fCadResiduo1 cadResiduo = new fCadResiduo1(this, true, this);
        cadResiduo.setVisible(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        residuoSelecionado = null;

        fCadResiduo1 cadResiduo = new fCadResiduo1(this, true, this);
        cadResiduo.setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void abaCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abaCadastrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_abaCadastrar1ActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        new ResiduoDAO().excluir(idSelecionado);

        atualizarTabela();

        mudaEstadoBotoes(false);
    }//GEN-LAST:event_btnExcluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton abaCadastrar;
    private javax.swing.JToggleButton abaCadastrar1;
    private javax.swing.JToggleButton abaResiduos;
    private javax.swing.JPanel barraLateral;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JPanel jCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jMain;
    private javax.swing.JPanel jResiduos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPasswordField pssCSenha;
    private javax.swing.JPasswordField pssSenha;
    private javax.swing.JTable tbResiduos;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDataNasc;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
