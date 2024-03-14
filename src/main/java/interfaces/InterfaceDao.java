package interfaces;

import java.sql.SQLException;
import javax.swing.JComboBox;

public interface InterfaceDao {

    public void salvarDao(Object... valor);
    public void excluirDao(int id);
    public void consultaDao(Object... valor)throws SQLException;
    public void carregarComboBoxDao(JComboBox itens)throws SQLException;
    
}
