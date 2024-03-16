/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import interfaces.InterfaceDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.TipoContatoModelo;

/**
 *
 * @author leona
 */
public class TipoContatoDao implements InterfaceDao {

    String sql;
    PreparedStatement pstmt = null;
    ResultSet rs;

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
            if (tcm.getId() > 0) {
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
        
        sql = "DELETE FROM tipocontato WHERE id = ?";
           
        try{
             pstmt = ConexaoBanco.abreConnection().prepareStatement(sql);
            pstmt.setInt(1, id);
            pstmt.execute();
            pstmt.close();
            JOptionPane.showMessageDialog(null, "ITEM EXCLUÍDO COM SUCESSO");
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    @Override
    public void consultaDao(Object... valor) throws SQLException {
        DefaultTableModel tabela = (DefaultTableModel) valor[1];
        if ("".equals((String) valor[0])) {
            sql = "SELECT * FROM tipocontato";
        } else {
            //sql = "SELECT * FROM tipocontato WHERE descricao LIKE '%" + valor[0] + "%'";
            sql = "SELECT * FROM tipocontato WHERE LOWER(descricao) LIKE LOWER('%" + valor[0] + "%')";

        }

        //System.out.println("Executando consulta: " + sql); // Log de diagnóstico
        pstmt = ConexaoBanco.abreConnection().prepareStatement(sql);
        rs = pstmt.executeQuery();
        //int count = 0; // Contador para verificar a quantidade de registros

        while (rs.next()) {
            //count++;    
            tabela.addRow(
                    new Object[]{
                        rs.getInt("id"),
                        rs.getString("descricao")
                    }
            );
        }
        //System.out.println("Registros encontrados: " + count); // Log de diagnóstico
        pstmt.close();
    }

    @Override
    public void carregarComboBoxDao(JComboBox itens) throws SQLException {
    }

}
