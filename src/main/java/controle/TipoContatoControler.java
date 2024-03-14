package controle;

import dao.TipoContatoDao;
import interfaces.InterfaceController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.TipoContatoModelo;

public class TipoContatoControler implements InterfaceController {

    TipoContatoModelo tcm = new TipoContatoModelo();
    TipoContatoDao tcd = new TipoContatoDao();

    @Override
    public void salvarControle(Object... valor) {
        if ("".equals(valor[0])) {
            tcm.setId(0);
        } else {
            tcm.setId((int) valor[0]);
        }
        tcm.setDescricao((String) valor[1]);

        //ENVIAR INF PARA DAOS
        tcd.salvarDao(tcm);

    }

    @Override
    public void excluirControle(int id) {

    }

    @Override
    public void carregarComboBox() {

    }

    @Override
    public void consultarControle(Object... valor) {
        try {
            tcd.consultaDao(valor);
        } catch (SQLException ex) {
            Logger.getLogger(TipoContatoControler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
