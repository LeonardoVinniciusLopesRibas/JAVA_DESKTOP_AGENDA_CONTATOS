package visao;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import util.PosicaoFormulario;

public class Principal extends javax.swing.JFrame {

    PosicaoFormulario form = new PosicaoFormulario();

    //Método construtor
    public Principal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setarIcone();

    }

    private void setarIcone() {
        //C:\\Users\\leona\\OneDrive\\Documentos\\NetBeansProjects\\AgendaContatos\\src\\main\\java\\img\\
        Image iconArquivo = Toolkit.getDefaultToolkit().getImage("C:\\Users\\leona\\OneDrive\\Documentos\\NetBeansProjects\\AgendaContatos\\src\\main\\java\\img\\arquivo.png");
        ImageIcon iconeArquivo = new ImageIcon(iconArquivo);
        jmArquivo.setIcon(iconeArquivo);

        Image iconSobre = Toolkit.getDefaultToolkit().getImage("C:\\Users\\leona\\OneDrive\\Documentos\\NetBeansProjects\\AgendaContatos\\src\\main\\java\\img\\me.png");
        ImageIcon iconeSobre = new ImageIcon(iconSobre);
        jmSobre.setIcon(iconeSobre);

        Image iconCadastros = Toolkit.getDefaultToolkit().getImage("C:\\Users\\leona\\OneDrive\\Documentos\\NetBeansProjects\\AgendaContatos\\src\\main\\java\\img\\novo.png");
        ImageIcon iconeCadastros = new ImageIcon(iconCadastros);
        jmCadastros.setIcon(iconeCadastros);

        Image iconContatos = Toolkit.getDefaultToolkit().getImage("C:\\Users\\leona\\OneDrive\\Documentos\\NetBeansProjects\\AgendaContatos\\src\\main\\java\\img\\contato.png");
        ImageIcon iconeContatos = new ImageIcon(iconContatos);
        jmiContatos.setIcon(iconeContatos);

        Image iconCidade = Toolkit.getDefaultToolkit().getImage("C:\\Users\\leona\\OneDrive\\Documentos\\NetBeansProjects\\AgendaContatos\\src\\main\\java\\img\\cidade.png");
        ImageIcon iconeCidade = new ImageIcon(iconCidade);
        jmiCidade.setIcon(iconeCidade);

        Image iconBairro = Toolkit.getDefaultToolkit().getImage("C:\\Users\\leona\\OneDrive\\Documentos\\NetBeansProjects\\AgendaContatos\\src\\main\\java\\img\\bairro.png");
        ImageIcon iconeBairro = new ImageIcon(iconBairro);
        jmiBairro.setIcon(iconeBairro);

        Image iconTipoContato = Toolkit.getDefaultToolkit().getImage("C:\\Users\\leona\\OneDrive\\Documentos\\NetBeansProjects\\AgendaContatos\\src\\main\\java\\img\\tipo.png");
        ImageIcon iconeTipoContato = new ImageIcon(iconTipoContato);
        jmiTipoContato.setIcon(iconeTipoContato);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktop = new javax.swing.JDesktopPane();
        jmbBarraMenu = new javax.swing.JMenuBar();
        jmArquivo = new javax.swing.JMenu();
        jmCadastros = new javax.swing.JMenu();
        jmiCidade = new javax.swing.JMenuItem();
        jmiBairro = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmiTipoContato = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiContatos = new javax.swing.JMenuItem();
        jmSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AGENDA DE CONTATOS");
        setResizable(false);

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
        );

        jmArquivo.setMnemonic('A');
        jmArquivo.setText("Arquivo");

        jmCadastros.setMnemonic('C');
        jmCadastros.setText("Cadastros");

        jmiCidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiCidade.setText("Cidade");
        jmiCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCidadeActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiCidade);

        jmiBairro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiBairro.setText("Bairro");
        jmiBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBairroActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiBairro);
        jmCadastros.add(jSeparator2);

        jmiTipoContato.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiTipoContato.setText("Tipo de Contato");
        jmiTipoContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTipoContatoActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiTipoContato);

        jmArquivo.add(jmCadastros);
        jmArquivo.add(jSeparator1);

        jmiContatos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiContatos.setText("Contatos");
        jmiContatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiContatosActionPerformed(evt);
            }
        });
        jmArquivo.add(jmiContatos);

        jmbBarraMenu.add(jmArquivo);

        jmSobre.setMnemonic('S');
        jmSobre.setText("Sobre");
        jmbBarraMenu.add(jmSobre);

        setJMenuBar(jmbBarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiContatosActionPerformed
        // TODO add your handling code here:

        //ContatoVisao contatoTela = new ContatoVisao();
        //jDesktop.add(contatoTela);
        //contatoTela.setVisible(true);
        ContatoVisao tela;
        form.abrirFormulario(tela = new ContatoVisao(), jDesktop);
    }//GEN-LAST:event_jmiContatosActionPerformed

    private void jmiBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBairroActionPerformed
        // TODO add your handling code here:
        //BairroVisao bairroTela = new BairroVisao();
        //jDesktop.add(bairroTela);
        //bairroTela.setVisible(true);
        BairroVisao tela;
        form.abrirFormulario(tela = new BairroVisao(), jDesktop);
    }//GEN-LAST:event_jmiBairroActionPerformed

    private void jmiCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCidadeActionPerformed
        // TODO add your handling code here:
        //CidadeVisao cidadeTela = new CidadeVisao();
        //jDesktop.add(cidadeTela);
        //cidadeTela.setVisible(true);
        CidadeVisao tela;
        form.abrirFormulario(tela = new CidadeVisao(), jDesktop);

    }//GEN-LAST:event_jmiCidadeActionPerformed

    private void jmiTipoContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTipoContatoActionPerformed
        // TODO add your handling code here:
        //TipoContatoVisao contatoVisaoTela = new TipoContatoVisao();
        //jDesktop.add(contatoVisaoTela);
        //contatoVisaoTela.setVisible(true);
        TipoContatoVisao tela;
        form.abrirFormulario(tela = new TipoContatoVisao(), jDesktop);

    }//GEN-LAST:event_jmiTipoContatoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu jmArquivo;
    private javax.swing.JMenu jmCadastros;
    private javax.swing.JMenu jmSobre;
    private javax.swing.JMenuBar jmbBarraMenu;
    private javax.swing.JMenuItem jmiBairro;
    private javax.swing.JMenuItem jmiCidade;
    private javax.swing.JMenuItem jmiContatos;
    private javax.swing.JMenuItem jmiTipoContato;
    // End of variables declaration//GEN-END:variables
}
