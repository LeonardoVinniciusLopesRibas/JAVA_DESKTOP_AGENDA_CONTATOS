package visao;

import javax.swing.JComboBox;
import javax.swing.JLabel;

public class BairroVisao extends FormPadrao {

    JLabel jlBairro;
    JComboBox jcbBairro;

    public BairroVisao() {
        
        
    }
    
    @Override
    public void inicializarComponentes() {
        setTitle("Cadastro de Bairro");
        jlBairro = new JLabel("Cidade");
        jlBairro.setBounds(11, 60, 50, 25);
        jpnFormulario.add(jlBairro);

        jcbBairro = new JComboBox();
        jcbBairro.setBounds(11, 80, 250, 25);
        jpnFormulario.add(jcbBairro);
    }

    @Override
    public void salvarVisao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void criarTabela() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void consultaVisao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void atualizarFormulario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void excluirVisao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
