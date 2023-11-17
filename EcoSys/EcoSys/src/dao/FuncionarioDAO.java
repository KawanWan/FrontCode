package dao;

import beans.Funcionario;
import conexao.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FuncionarioDAO {

    private Connection conn = ConexaoDB.conectar();

    public FuncionarioDAO() {
    }

    public boolean verificar(String login, String senha) {
        String sql = "SELECT * FROM funcionario WHERE nome = ? AND senha = ?";
        boolean logar = false;
        try (PreparedStatement stmt = this.conn.prepareStatement(sql)) {
            stmt.setString(1, login);
            stmt.setString(2, senha);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                logar = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar o Banco de Dados: " + e.getMessage());
        }
        return logar;
    }

    public void inserir(Funcionario funcionario) {
        String sql = "INSERT INTO funcionario(nome, senha, cpf, data_nasc) VALUES "
                + "(?, ?, ?, ?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getSenha());
            stmt.setString(3, funcionario.getCPF());
            stmt.setString(4, funcionario.getData_nasc());
            stmt.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir o Funcionário: " + e.getMessage());
        }
    }

    public void editar(Funcionario funcionario) {
        try {
            String sql = "update funcionario set senha = ? where nome = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, funcionario.getSenha());
            stmt.setString(2, funcionario.getNome());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean verificarFuncionario(String nome, String data, String cpf) {
        String sql = "SELECT * FROM funcionario WHERE nome = ? AND data_nasc = ? AND cpf = ?";
        boolean confere = false;
        try (PreparedStatement stmt = this.conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, data);
            stmt.setString(3, cpf);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                confere = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar o Banco de Dados: " + e.getMessage());
        }
        return confere;
    }
}
