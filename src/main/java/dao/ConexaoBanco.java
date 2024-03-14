package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoBanco {

    private static final String DRIVERCLASS = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/agendaContatosDesktop";
    private static final String USER = "postgres";
    private static final String SENHA = "gtsnfe2010";
    
    
    public static Connection abreConnection() {
        Connection con = null;
        try{
           Class.forName(DRIVERCLASS); 
           con = DriverManager.getConnection(URL, USER, SENHA);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        
        
        
        return con;
    }

}
