package dao;

import beans.Funcionario;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class FuncionarioDAO {
    private Conexao conexao;
    private Connection conn;

    public FuncionarioDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir(Funcionario funcionario){
        String sql = "INSERT INTO funcionario(nome, cpf, senha, data_nasc) VALUES "
                + "(?, ?, ?, ?)";
        try{            
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCPF());
            stmt.setString(3, funcionario.getSenha());
            stmt.setString(4, funcionario.getData_nasc());
            stmt.execute();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao inserir o Funcionário: " + e.getMessage());   
        }
    }
}
