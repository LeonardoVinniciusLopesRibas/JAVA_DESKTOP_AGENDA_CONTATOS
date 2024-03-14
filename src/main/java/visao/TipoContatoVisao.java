package visao;

import controle.TipoContatoControler;

public class TipoContatoVisao extends FormPadrao {
    
    public TipoContatoVisao() {
    }

    @Override
    public void inicializarComponentes() {
        setTitle("Cadastro de Tipo de Contato");
        
    }
    
    //INSTANCIANDO CONTROLLER
    TipoContatoControler tcc = new TipoContatoControler();

    @Override
    public void salvarVisao() {
        //INSERIR COMANDO
        tcc.salvarControle(jtfId.getText(), jtfDescricao.getText());
    }
    
}
