package dao;

import beans.Residuo;
import conexao.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ResiduoDAO {
    private Connection conn;

    public ResiduoDAO() {
        this.conn = ConexaoDB.conectar();
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
            stmt.setInt(5, residuo.getCnpj());
            stmt.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir o Resíduo: " + e.getMessage());
        }
    }
}