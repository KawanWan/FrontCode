package dao;

import beans.Empresa;
import beans.Residuo;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ResiduoDAO {

    private Conexao conexao;
    private Connection conn;

    public ResiduoDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }

    public void inserir(Residuo residuo) {
        String sql = "INSERT INTO residuo(nome, quantidade, valorVenda, classe, empresa_CNPJ) VALUES "
                + "(?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, residuo.getNome());
            stmt.setInt(2, residuo.getQuantidade());
            stmt.setDouble(3, residuo.getValorVenda());
            stmt.setString(4, residuo.getClasse());
            stmt.setArray(5, residuo.getEmpresa());
            stmt.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir o Resíduo: " + e.getMessage());
        }
    }
}
