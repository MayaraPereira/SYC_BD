/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.ComicDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mayara Medeiros
 */
public class TelaEditarComic extends javax.swing.JFrame {

    private TelaComics comics = new TelaComics();
    private TelaLogin login = new TelaLogin();
    /**
     * Creates new form TelaEditarComic
     */
    public TelaEditarComic() {
        initComponents();
        preencherEspaços();
    }
    
    public void preencherEspaços(){
        //DataSource dataSource = new DataSource();
        
        try {
            String SQL = "Select * FROM comic";
            PreparedStatement ps = login.getDataSource().getConnection().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();         
            System.out.println("entrou 1");
            
            while (rs.next()){
                System.out.println(comics.getRevistaEdit());
                System.out.println(rs.getInt("id"));
                if (comics.getRevistaEdit() == (rs.getInt("id"))){
                    System.out.println("entrou 2");
                    titulojTextField.setText(rs.getString("titulo"));
                    edicaojTextField.setText(rs.getString("edicao"));
                    superheroijTextField.setText(rs.getString("superheroi"));
                    precojTextField.setText(Double.toString(rs.getDouble("preco")));
                    nomeComicjLabel.setText(rs.getString("titulo"));
                    break;                    
                }
            }
            //dataSource.closeDataSource();
            ps.close();
        } catch (SQLException ex) {
            System.err.println("ERRO AO RECUPERAR " + ex.getMessage());
        } catch(Exception ex){
            System.err.println("ERRO GERAL..." + ex.getMessage());
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sycjLabel = new javax.swing.JLabel();
        superHeroisFundo = new javax.swing.JLabel();
        comicsjButton = new javax.swing.JButton();
        collectionsjButton = new javax.swing.JButton();
        emprestimosjButton = new javax.swing.JButton();
        dadosUserjButton = new javax.swing.JButton();
        nomeComicjLabel = new javax.swing.JLabel();
        titulojTextField = new javax.swing.JTextField();
        titulojLabel = new javax.swing.JLabel();
        superheroijTextField = new javax.swing.JTextField();
        superheroijLabel1 = new javax.swing.JLabel();
        edicaojLabel = new javax.swing.JLabel();
        edicaojTextField = new javax.swing.JTextField();
        precojLabel = new javax.swing.JLabel();
        precojTextField = new javax.swing.JTextField();
        cancelarjButton = new javax.swing.JButton();
        salvarjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setLocation(new java.awt.Point(300, 100));
        setResizable(false);

        sycjLabel.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        sycjLabel.setForeground(new java.awt.Color(255, 255, 255));
        sycjLabel.setText("SeeYoursComics");
        sycjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sycjLabelMouseClicked(evt);
            }
        });

        superHeroisFundo.setBackground(new java.awt.Color(0, 0, 0));
        superHeroisFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/top-10-melhores-super-herois-noticias-the-history-channel (1).jpg"))); // NOI18N

        comicsjButton.setBackground(new java.awt.Color(255, 255, 255));
        comicsjButton.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        comicsjButton.setText("Comics");
        comicsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comicsjButtonActionPerformed(evt);
            }
        });

        collectionsjButton.setBackground(new java.awt.Color(255, 255, 255));
        collectionsjButton.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        collectionsjButton.setText("Collections");
        collectionsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collectionsjButtonActionPerformed(evt);
            }
        });

        emprestimosjButton.setBackground(new java.awt.Color(255, 255, 255));
        emprestimosjButton.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        emprestimosjButton.setText("Loans");
        emprestimosjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emprestimosjButtonActionPerformed(evt);
            }
        });

        dadosUserjButton.setBackground(new java.awt.Color(255, 255, 255));
        dadosUserjButton.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        dadosUserjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user.png"))); // NOI18N
        dadosUserjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadosUserjButtonActionPerformed(evt);
            }
        });

        nomeComicjLabel.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        nomeComicjLabel.setForeground(new java.awt.Color(255, 255, 255));
        nomeComicjLabel.setText("Nome Comic");

        titulojLabel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        titulojLabel.setForeground(new java.awt.Color(255, 255, 255));
        titulojLabel.setText("Title");

        superheroijTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                superheroijTextFieldActionPerformed(evt);
            }
        });

        superheroijLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        superheroijLabel1.setForeground(new java.awt.Color(255, 255, 255));
        superheroijLabel1.setText("Super Hero");

        edicaojLabel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        edicaojLabel.setForeground(new java.awt.Color(255, 255, 255));
        edicaojLabel.setText("Edition");

        precojLabel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        precojLabel.setForeground(new java.awt.Color(255, 255, 255));
        precojLabel.setText("Price");

        precojTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precojTextFieldActionPerformed(evt);
            }
        });

        cancelarjButton.setBackground(new java.awt.Color(255, 255, 255));
        cancelarjButton.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        cancelarjButton.setText("Cancel");
        cancelarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarjButtonActionPerformed(evt);
            }
        });

        salvarjButton.setBackground(new java.awt.Color(255, 255, 255));
        salvarjButton.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        salvarjButton.setText("Save");
        salvarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(sycjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(comicsjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(collectionsjButton)
                .addGap(18, 18, 18)
                .addComponent(emprestimosjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dadosUserjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titulojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(edicaojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(superheroijTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(superheroijLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titulojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(edicaojTextField))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cancelarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salvarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(321, 321, 321))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(444, 444, 444)
                .addComponent(nomeComicjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(superHeroisFundo)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sycjLabel)
                        .addComponent(comicsjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(collectionsjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(emprestimosjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dadosUserjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(nomeComicjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(edicaojLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titulojLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(edicaojTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(titulojTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(superheroijLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(superheroijTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(precojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salvarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(superHeroisFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comicsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comicsjButtonActionPerformed
        // TODO add your handling code here:
        TelaComics form = new TelaComics();
        dispose();
        form.setVisible(true);
    }//GEN-LAST:event_comicsjButtonActionPerformed

    private void superheroijTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_superheroijTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_superheroijTextFieldActionPerformed

    private void precojTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precojTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precojTextFieldActionPerformed

    private void cancelarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarjButtonActionPerformed
        // TODO add your handling code here:
        titulojTextField.setText("");
        edicaojTextField.setText("");
        superheroijTextField.setText("");
        precojTextField.setText("");
        dispose();
        comics.setVisible(true);
    }//GEN-LAST:event_cancelarjButtonActionPerformed

    private void salvarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarjButtonActionPerformed
        // TODO add your handling code here:
         ComicDAO comicDao = new ComicDAO(login.getDataSource());
         if (!titulojTextField.getText().equals("")){
            comicDao.atualizarDados(comics.getRevistaEdit(), titulojTextField.getText(), edicaojTextField.getText(), superheroijTextField.getText(), Double.parseDouble(precojTextField.getText()));
            comics.modelo.clear();
            comics.lista.clear();
            comics.povoarLista();
            dispose();
            comics.setVisible(true);
         }else{
             JOptionPane.showMessageDialog(null, "Atualizacao nao realizada");
         }
    }//GEN-LAST:event_salvarjButtonActionPerformed

    private void collectionsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_collectionsjButtonActionPerformed
        // TODO add your handling code here:
        TelaCollections form = new TelaCollections();
        dispose();
        form.setVisible(true);
    }//GEN-LAST:event_collectionsjButtonActionPerformed

    private void emprestimosjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emprestimosjButtonActionPerformed
        // TODO add your handling code here:
        TelaLoans form = new TelaLoans();
        dispose();
        form.setVisible(true);
    }//GEN-LAST:event_emprestimosjButtonActionPerformed

    private void dadosUserjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadosUserjButtonActionPerformed
        // TODO add your handling code here:
        TelaDadosUser form = new TelaDadosUser();
        dispose();
        form.setVisible(true);
    }//GEN-LAST:event_dadosUserjButtonActionPerformed

    private void sycjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sycjLabelMouseClicked
        // TODO add your handling code here:
        TelaMenuPrincipal menu = new TelaMenuPrincipal();
        dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_sycjLabelMouseClicked

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
            java.util.logging.Logger.getLogger(TelaEditarComic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditarComic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditarComic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditarComic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditarComic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarjButton;
    private javax.swing.JButton collectionsjButton;
    private javax.swing.JButton comicsjButton;
    private javax.swing.JButton dadosUserjButton;
    private javax.swing.JLabel edicaojLabel;
    private javax.swing.JTextField edicaojTextField;
    private javax.swing.JButton emprestimosjButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nomeComicjLabel;
    private javax.swing.JLabel precojLabel;
    private javax.swing.JTextField precojTextField;
    private javax.swing.JButton salvarjButton;
    private javax.swing.JLabel superHeroisFundo;
    private javax.swing.JLabel superheroijLabel1;
    private javax.swing.JTextField superheroijTextField;
    private javax.swing.JLabel sycjLabel;
    private javax.swing.JLabel titulojLabel;
    private javax.swing.JTextField titulojTextField;
    // End of variables declaration//GEN-END:variables

}
