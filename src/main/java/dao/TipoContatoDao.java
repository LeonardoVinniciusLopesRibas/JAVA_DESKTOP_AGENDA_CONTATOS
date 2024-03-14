/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import interfaces.InterfaceDao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.TipoContatoModelo;

/**
 *
 * @author leona
 */
public class TipoContatoDao implements InterfaceDao {

    String sql;
    PreparedStatement pstmt = null;

    @Override
    public void salvarDao(Object... valor) {

        TipoContatoModelo tcm = (TipoContatoModelo) valor[0];

        if (tcm.getId() == 0) {
            sql = "INSERT INTO tipocontato (descricao) VALUES(?)";

        } else {
            sql = "UPDATE tipocontato SET descricao = ? WHERE id = ?";
        }

        try {
            //PREPARANDO CONEXÃO E MANIPULANDO DADOS
            pstmt = ConexaoBanco.abreConnection().prepareStatement(sql);
            pstmt.setString(1, tcm.getDescricao());
            if(tcm.getId() > 0){
                pstmt.setInt(2, tcm.getId());
            }
            
            pstmt.execute();
            pstmt.close();
            JOptionPane.showMessageDialog(null, "REGISTRO GRAVADO");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @Override
    public void excluirDao(int id) {
    }

    @Override
    public void consultaDao(Object... valor) throws SQLException {
    }

    @Override
    public void carregarComboBoxDao(JComboBox itens) throws SQLException {
    }

}
