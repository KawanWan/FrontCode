package dao;

import beans.Funcionario;
import conexao.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class FuncionarioDAO {
    private Connection conn = ConexaoDB.conectar();

    public FuncionarioDAO() {
    }
    
    public boolean verificar(String login, String senha) {
        String sql = "SELECT * FROM funcionario WHERE nome = ? AND senha = ?";
        boolean logar = false;
        try (PreparedStatement stmt = this.conn.prepareStatement(sql)){
            stmt.setString(1, login);
            stmt.setString(2, senha);
            
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                logar = true;
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao acessar o Banco de Dados: " + e.getMessage());   
        }
        return logar;
    }
    
    public void inserir(Funcionario funcionario){
        String sql = "INSERT INTO funcionario(nome, senha, cpf, data_nasc) VALUES "
                + "(?, ?, ?, ?)";
        try{            
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, funcionario.getNome());
            stmt.setString(3, funcionario.getSenha());
            stmt.setString(2, funcionario.getCPF());
            stmt.setString(4, funcionario.getData_nasc());
            stmt.execute();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao inserir o Funcionário: " + e.getMessage());   
        }
    }
}
