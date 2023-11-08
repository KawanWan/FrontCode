package dao;

import beans.Residuo;
import conexao.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ResiduoDAO {

    private Connection conn = ConexaoDB.conectar();

    public ResiduoDAO() {
    }

    public void inserir(Residuo residuo) {
        String sql = "INSERT INTO residuo(nome, quantidade, valorVenda, classe, empresa_CNPJ) VALUES "
                + "(?, ?, ?, ?, ?)";
        try (Connection conn = ConexaoDB.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, residuo.getNome());
            stmt.setDouble(2, residuo.getQuantidade());
            stmt.setDouble(3, residuo.getValorVenda());
            stmt.setString(4, residuo.getClasse());
            stmt.setString(5, residuo.getCnpj());
            stmt.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir o Resíduo: " + ex.getMessage());
        }
    }

    public void editar(Residuo residuo) {
        String sql = "update produto set nome = ?, qtde = ? , valor =? where id = ?";

        try (Connection conn = ConexaoDB.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, residuo.getNome());
            stmt.setDouble(2, residuo.getQuantidade());
            stmt.setDouble(3, residuo.getValorVenda());
            stmt.setString(4, residuo.getClasse());
            stmt.setString(5, residuo.getCnpj());
            stmt.execute();

        } catch (SQLException ex) {
            System.out.println("Erro ao editar resíduo: " + ex.getMessage());
        }
    }

    public boolean excluir(int id) {
        String sql = "delete from residuo where id = ?";

        try (Connection conn = ConexaoDB.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            return stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir resíduo: " + ex.getMessage());
        }

        return false;
    }

    public ArrayList<Residuo> getAll() {
        String sql = "SELECT * FROM residuo";
        ArrayList<Residuo> residuos = new ArrayList<>();

        try (Connection conn = ConexaoDB.conectar(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                double quantidade = rs.getDouble("quantidade");
                double valorVenda = rs.getDouble("valorVenda");
                String classe = rs.getString("classe");
                String cnpj = rs.getString("cnpj");

                Residuo res = new Residuo(id, nome, quantidade, valorVenda, classe, cnpj);
                residuos.add(res);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao buscar Todos produto: " + ex.getMessage());
        }

        return residuos;
    }

    public Residuo getByID(int idParam) {
        String sql = "SELECT * FROM residuo where id=?";
        Residuo res = null;

        try (Connection conn = ConexaoDB.conectar(); PreparedStatement stmt = conn.prepareStatement(sql);) {

            stmt.setInt(1, idParam);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String nome = rs.getString("nome");
                double quantidade = rs.getInt("quantidade");
                double valorVenda = rs.getDouble("valorVenda");
                String classe = rs.getString("classe");
                String cnpj = rs.getString("cnpj");
                int id = rs.getInt("id");

                res = new Residuo(id, nome, quantidade, valorVenda, classe, cnpj);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao buscar Todos produto: " + ex.getMessage());
        }

        return res;
    }
}
