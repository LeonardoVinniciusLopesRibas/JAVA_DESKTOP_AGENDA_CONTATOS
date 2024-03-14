package controle;

import dao.TipoContatoDao;
import interfaces.InterfaceController;
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

}
