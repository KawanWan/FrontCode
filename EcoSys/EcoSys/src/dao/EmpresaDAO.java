package dao;

import beans.Empresa;
import conexao.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author augusto.vernek
 */
public class EmpresaDAO {
    private Connection conn = ConexaoDB.conectar();
    
    public void inserir(Empresa empresa){
        String sql = "INSERT INTO empresa(cnpj, nome, rua, bairro, numero, custoTransporte) VALUES "
                + "(?, ?, ?, ?, ?, ?)";
        try{            
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, empresa.getCnpj());
            stmt.setString(2, empresa.getNome());
            stmt.setString(3, empresa.getRua());
            stmt.setString(4, empresa.getBairro());
            stmt.setString(5, empresa.getNumero());
            stmt.setDouble(6, empresa.getCustoTransporte());
            stmt.execute();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao inserir a empresa: " + e.getMessage());   
        }
    }
    
    public ArrayList<Empresa> selecionar() {
        ArrayList<Empresa> listaEmpresa = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from empresa");
            while (rs.next()) {
                listaEmpresa.add(
                        new Empresa(
                                rs.getString("cnpj"),
                                rs.getString("nome"),
                                rs.getString("rua"),
                                rs.getString("bairro"),
                                rs.getString("numero"),
                                rs.getDouble("custoTransporte")));
            }
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpresaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaEmpresa;
    }
    
    public Empresa selecionarPorCnpj(String cnpj){
        Empresa empresa = null;
        try {
            PreparedStatement stmt = conn.prepareStatement("select * from empresa where cnpj = ?");
            stmt.setString(1, cnpj);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                empresa = new Empresa(rs.getString("cnpj"), rs.getString("nome"),
                        rs.getString("rua"), rs.getString("bairro"), rs.getString("numero"), 
                rs.getDouble("custoTransporte"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpresaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return empresa;
    }
}
