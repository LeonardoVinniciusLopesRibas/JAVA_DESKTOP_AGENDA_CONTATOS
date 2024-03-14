package visao;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CidadeVisao extends FormPadrao {
    
    JLabel jlUf;
    JLabel jlCep;

    JComboBox jcbUf;
    JTextField jtfCep;
    
    public CidadeVisao() {
    }

    @Override
    public void inicializarComponentes() {
        setTitle("Cadastro de Bairro");
        jlUf = new JLabel("UF");
        jlUf.setBounds(11, 60, 50, 25);
        jpnFormulario.add(jlUf);

        jcbUf = new JComboBox();
        jcbUf.setBounds(11, 80, 100, 25);
        jpnFormulario.add(jcbUf);
        
        jlCep = new JLabel("CEP");
        jlCep.setBounds(150, 60, 100, 25);
        jpnFormulario.add(jlCep);
        
        jtfCep = new JTextField();
        jtfCep.setBounds(150, 80, 150, 25);
        jpnFormulario.add(jtfCep);
        
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
}
