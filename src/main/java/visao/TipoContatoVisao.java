package visao;

import controle.TipoContatoControler;
import javax.swing.table.DefaultTableModel;

public class TipoContatoVisao extends FormPadrao {

    public TipoContatoVisao() {
    }

    @Override
    public void inicializarComponentes() {
        setTitle("Cadastro de Tipo de Contato");
        tcc = new TipoContatoControler();
        consultaVisao();

    }

    //INSTANCIANDO CONTROLLER
    TipoContatoControler tcc = new TipoContatoControler();

    @Override
    public void salvarVisao() {
        //INSERIR COMANDO
        tcc.salvarControle(jtfId.getText(), jtfDescricao.getText());
    }

    @Override
    public void criarTabela() {
        tabela = utilTabela.criarTabela(
                jpnConsulta,
                //id e descrição
                new Object[]{60, 400},
                //alinhar dados
                new Object[]{"centro", "esquerda"},
                //titulo da tabela
                new Object[]{"ID", "DESCRIÇÃO"});
        modelo = (DefaultTableModel) tabela.getModel();
    }

    @Override
    public void consultaVisao() {
        modelo.setNumRows(0);
        tcc.consultarControle(jtfConsulta.getText(), modelo);
    }

}
