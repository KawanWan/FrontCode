package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexao {
    public Connection getConexao(){
       try{
           Connection con = DriverManager.getConnection(
                   "jdbc:mysql://localhost:3306/prjdc",
                   "root",
                   ""           
           );
           return con;
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Erro ao conectar" + e.getMessage()); 
           return null;
       }
        
    }
}
