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
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, residuo.getNome());
            stmt.setDouble(2, residuo.getQuantidade());
            stmt.setDouble(3, residuo.getValorVenda());
            stmt.setString(4, residuo.getClasse());
            stmt.setString(5, residuo.getCnpj());
            stmt.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir o Resíduo: " + e.getMessage());
        }
    }
    
    public void update(Residuo editado) {
        String sql = "UPDATE residuo SET nome = ?, quantidade = ?, valorVenda = ?, classe = ?, empresa_CNPJ = ? WHERE id = ?";
        
        try (PreparedStatement stmt = this.conn.prepareStatement(sql)) {
            stmt.setString(1, editado.getNome());
            stmt.setDouble(2, editado.getQuantidade());
            stmt.setDouble(3, editado.getValorVenda());
            stmt.setString(4, editado.getClasse());
            stmt.setString(5, editado.getCnpj());
            stmt.setInt(6, editado.getId());
            
            stmt.executeUpdate();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao encontrar o id registrado: " + e.getMessage());
        }
    }
    
    public boolean excluir(int id) {
        String sql = "delete from residuo where id = ?";
        boolean verificacao = false;

        try (PreparedStatement stmt = this.conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.execute();
            
            verificacao = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir resíduo: " + ex.getMessage());
        }

        return verificacao;
    }
    
    public Residuo getById(int idParametro) {
        String sql = "SELECT * FROM residuo WHERE id= ?";
        Residuo rSelecionado = null;
        
        try (PreparedStatement stmt = this.conn.prepareStatement(sql)) {
            stmt.setInt(1, idParametro);
            
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int idReturn = rs.getInt("id");
                    String nome = rs.getString("nome");
                    double quantidade = rs.getDouble("quantidade");
                    double valorVenda = rs.getDouble("valorVenda");
                    String classe = rs.getString("classe");
                    String cnpj = rs.getString("empresa_CNPJ");

                    rSelecionado = new Residuo(idReturn, nome, quantidade, valorVenda, classe);
                    rSelecionado.setCnpj(cnpj);
                }
            }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao encontrar o id registrado: " + e.getMessage());
        }
        return rSelecionado;
    }
    
    public ArrayList<Residuo> mostrarTodos() {
        String sql = "SELECT * FROM residuo";
        ArrayList<Residuo> residuos = new ArrayList<>();
        
        try (PreparedStatement stmt = this.conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                double quantidade = rs.getDouble("quantidade");
                double valorVenda = rs.getDouble("valorVenda");
                String classe = rs.getString("classe");
                String cnpj = rs.getString("empresa_CNPJ");
                
                Residuo r = new Residuo(id, nome, quantidade, valorVenda, classe);
                r.setCnpj(cnpj);
                
                residuos.add(r);
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao acessar a tabela: " + e.getMessage());
        }
        return residuos;
    }
}