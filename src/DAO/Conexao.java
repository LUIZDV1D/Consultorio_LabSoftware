package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro Alcantara
 */
public class Conexao extends ExecuteSQL{
    
    public static Connection AbrirConexao() {
        
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/consultorio";
            con = DriverManager.getConnection(url,"root","");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco", 
                    "Centro Medico", JOptionPane.ERROR_MESSAGE);
            e.getMessage();
            
        }
        
        return con;
    }
    
    public static void FecharConexao(Connection con) {
        try {
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    public Conexao(Connection con) {
        super(con);
    }
}
