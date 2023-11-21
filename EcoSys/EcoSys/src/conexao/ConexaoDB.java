package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

    public static Connection conectar() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/bancolixoeletronico?useSSL=false&serverTimezone=UTC";
            String usuario = "root";
            String senha = "KWdmDN#18072021";

            conn = DriverManager.getConnection(url, usuario, senha);

            System.out.println("Conexão Estabelecida!");
        } catch (SQLException ex) {
            System.out.println(Connection.class.getName() + " " + ex.getMessage());
        }
        return conn;
    }
}
