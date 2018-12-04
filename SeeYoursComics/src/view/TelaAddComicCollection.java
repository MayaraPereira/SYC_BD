/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.ComicCollectionDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Comic;

/**
 *
 * @author Mayara Medeiros
 */
public class TelaAddComicCollection extends javax.swing.JFrame {

    private ArrayList<Comic> lista = new ArrayList<Comic>();
    private TelaLogin login = new TelaLogin();
    DefaultListModel modelo;
    /**
     * Creates new form TelaAddComicCollection
     */
    public TelaAddComicCollection() {
        initComponents();
        comicsjList.setModel( new DefaultListModel());
        modelo = ( DefaultListModel ) comicsjList.getModel();
        povoarLista();
    }

    
    public void povoarLista(){
        //DataSource dataSource = new DataSource();
        
        try {
            String SQL = "Select * FROM comic";
            PreparedStatement ps = login.getDataSource().getConnection().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                System.out.println(login.getId_user());
                System.out.println(rs.getInt("id_user"));
                if (login.getId_user() == (rs.getInt("id_user"))){
                    Comic comic = new Comic();
                    comic.setId(rs.getInt("id"));
                    comic.setTitulo(rs.getString("titulo"));
                    comic.setEdicao(rs.getString("edicao"));
                    comic.setSuperheroi(rs.getString("superheroi"));
                    comic.setPreco(rs.getDouble("preco"));
                    comic.setStatusEmprestimo(rs.getBoolean("statusEmprestimo"));
                    comic.setId_user(rs.getInt("id_user"));
                    getLista().add(comic);
                    
                }
            }
            if (getLista().size() == 0 && rs.next() == false){
                JOptionPane.showMessageDialog(null, "Nenhuma Revista Cadastrada");
                addComicjButton.setEnabled(false);
            }else if (getLista().size() != 0 && rs.next() == false){              
                for (Comic c : getLista()) {
                    modelo.addElement(c);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        comicsjList = new javax.swing.JList<>();
        comicsjLabel = new javax.swing.JLabel();
        CanceljButton = new javax.swing.JButton();
        addComicjButton = new javax.swing.JButton();

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

        comicsjList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        comicsjList.setPreferredSize(new java.awt.Dimension(800, 433));
        jScrollPane2.setViewportView(comicsjList);

        comicsjLabel.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        comicsjLabel.setForeground(new java.awt.Color(255, 255, 255));
        comicsjLabel.setText("Comics");

        CanceljButton.setBackground(new java.awt.Color(255, 255, 255));
        CanceljButton.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        CanceljButton.setText("Back");
        CanceljButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CanceljButtonActionPerformed(evt);
            }
        });

        addComicjButton.setBackground(new java.awt.Color(255, 255, 255));
        addComicjButton.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        addComicjButton.setText("Add");
        addComicjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addComicjButtonActionPerformed(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(540, 540, 540)
                        .addComponent(comicsjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CanceljButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addComicjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                .addComponent(comicsjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CanceljButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addComicjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
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

    private void sycjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sycjLabelMouseClicked
        // TODO add your handling code here:
        TelaMenuPrincipal menu = new TelaMenuPrincipal();
        dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_sycjLabelMouseClicked

    private void comicsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comicsjButtonActionPerformed
        // TODO add your handling code here:
        TelaComics form = new TelaComics();
        dispose();
        form.setVisible(true);
    }//GEN-LAST:event_comicsjButtonActionPerformed

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

    private void CanceljButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CanceljButtonActionPerformed
        // TODO add your handling code here:
        TelaEditarCollection editarCollection = new TelaEditarCollection();
        dispose();
        editarCollection.setVisible(true);

    }//GEN-LAST:event_CanceljButtonActionPerformed

    private void addComicjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addComicjButtonActionPerformed
        // TODO add your handling code here:
        if (comicsjList.getSelectedIndex() != -1) {
            TelaCollections collections = new TelaCollections();
            ComicCollectionDAO comicColDao = new ComicCollectionDAO(login.getDataSource());
            comicColDao.adicionarDados(collections.getCollectionEdit(), getLista().get(comicsjList.getSelectedIndex()).getId());
            comicsjList.clearSelection();
            JOptionPane.showMessageDialog(null, "Revista Adicionada");
        }else{
            JOptionPane.showMessageDialog(null, "Nenhuma Revista Selecionada");
        }

    }//GEN-LAST:event_addComicjButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAddComicCollection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAddComicCollection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAddComicCollection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAddComicCollection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAddComicCollection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CanceljButton;
    private javax.swing.JButton addComicjButton;
    private javax.swing.JButton collectionsjButton;
    private javax.swing.JButton comicsjButton;
    private javax.swing.JLabel comicsjLabel;
    private javax.swing.JList<String> comicsjList;
    private javax.swing.JButton dadosUserjButton;
    private javax.swing.JButton emprestimosjButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel superHeroisFundo;
    private javax.swing.JLabel sycjLabel;
    // End of variables declaration//GEN-END:variables


    /**
     * @return the lista
     */
    public ArrayList<Comic> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(ArrayList<Comic> lista) {
        this.lista = lista;
    }
}
