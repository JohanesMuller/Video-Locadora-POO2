
package br.unisc.video_locadora.Screens;

import br.unisc.video_locadora.Panels.Funcionario_ADDMOVIE;
import br.unisc.video_locadora.Panels.Funcionario_DELETEMOVIE;
import br.unisc.video_locadora.Panels.Funcionario_GERARGRAFICO;
import br.unisc.video_locadora.Panels.Funcionario_SEARCHMOVIE;
import br.unisc.video_locadora.Panels.Funcionario_UPDATEMOVIE;
import br.unisc.video_locadora.controll.Generator_PDF;
import br.unisc.video_locadora.controll.Share;
import com.itextpdf.text.DocumentException;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author will
 */
public class Screen_Atendente extends javax.swing.JFrame {
    
    Funcionario_ADDMOVIE addMovie;
    Funcionario_SEARCHMOVIE searchMovie;
    Funcionario_DELETEMOVIE delMovie;
    Funcionario_UPDATEMOVIE upMovie;
    Funcionario_GERARGRAFICO genGrafico;
    
    public Screen_Atendente() {
        
        initComponents();
        
        
        addMovie = new Funcionario_ADDMOVIE();
        addMovie.setSize(480, 300);
        addMovie.setBounds(10, 10, addMovie.getWidth(),
                addMovie.getHeight());
        getContentPane().add(addMovie);
        addMovie.setVisible(false);
        
        searchMovie = new Funcionario_SEARCHMOVIE();
        searchMovie.setSize(480, 300);
        searchMovie.setBounds(10, 10, searchMovie.getWidth(),
                searchMovie.getHeight());
        getContentPane().add(searchMovie);
        searchMovie.setVisible(false);
        
        delMovie = new Funcionario_DELETEMOVIE();
        delMovie.setSize(480, 300);
        delMovie.setBounds(10, 10, delMovie.getWidth(),
                delMovie.getHeight());
        getContentPane().add(delMovie);
        delMovie.setVisible(false);
        
        upMovie = new Funcionario_UPDATEMOVIE();
        upMovie.setSize(480, 300);
        upMovie.setBounds(10, 10, upMovie.getWidth(),
                upMovie.getHeight());
        getContentPane().add(upMovie);
        upMovie.setVisible(false);
        
        genGrafico = new Funcionario_GERARGRAFICO();
        genGrafico.setSize(480, 300);
        genGrafico.setBounds(10, 10, genGrafico.getWidth(),
                genGrafico.getHeight());
        getContentPane().add(genGrafico);
        genGrafico.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnGerarPDF = new javax.swing.JButton();
        btnDeleteMovie = new javax.swing.JButton();
        btnEditMovie = new javax.swing.JButton();
        btnSearchMovie = new javax.swing.JButton();
        btnAddMovie = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnGerarGrafico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Locadora_Atendente");
        setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel1.setText("Atendente");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnGerarPDF.setText("Gerar PDF");
        btnGerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarPDFActionPerformed(evt);
            }
        });

        btnDeleteMovie.setText("Excluir");
        btnDeleteMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMovieActionPerformed(evt);
            }
        });

        btnEditMovie.setText("Atualizar");
        btnEditMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditMovieActionPerformed(evt);
            }
        });

        btnSearchMovie.setText("Procurar");
        btnSearchMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchMovieActionPerformed(evt);
            }
        });

        btnAddMovie.setText("Adicionar");
        btnAddMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMovieActionPerformed(evt);
            }
        });

        jLabel2.setText("Filme");

        btnGerarGrafico.setText("Gerar Grafico");
        btnGerarGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarGraficoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddMovie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearchMovie)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditMovie)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteMovie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGerarPDF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(btnGerarGrafico))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddMovie)
                    .addComponent(btnSearchMovie)
                    .addComponent(btnEditMovie)
                    .addComponent(btnDeleteMovie)
                    .addComponent(btnGerarPDF)
                    .addComponent(btnGerarGrafico))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(289, 289, 289)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMovieActionPerformed
        addMovie.setVisible(true);
        searchMovie.setVisible(false);
        genGrafico.setVisible(false);
        delMovie.setVisible(false);
        upMovie.setVisible(false);
    }//GEN-LAST:event_btnAddMovieActionPerformed

    private void btnSearchMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchMovieActionPerformed
        addMovie.setVisible(false);
        searchMovie.setVisible(true);
        delMovie.setVisible(false);
        genGrafico.setVisible(false);
        upMovie.setVisible(false);
    }//GEN-LAST:event_btnSearchMovieActionPerformed

    private void btnEditMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditMovieActionPerformed
        addMovie.setVisible(false);
        searchMovie.setVisible(false);
        genGrafico.setVisible(false);
        delMovie.setVisible(false);
        upMovie.setVisible(true);
        upMovie.TextId.setText(String.valueOf(Share.idFilme));
        upMovie.TextGenero.setText(Share.genero);
        upMovie.TextDiretor.setText(Share.diretor);
        upMovie.TextTitulo.setText(Share.titulo);
        upMovie.TextIdioma.setText(Share.linguagem);
        upMovie.TextLoc.setText(Share.locado);
        upMovie.TextAno.setText(Share.ano);
    }//GEN-LAST:event_btnEditMovieActionPerformed

    private void btnDeleteMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMovieActionPerformed
        addMovie.setVisible(false);
        searchMovie.setVisible(false);
        delMovie.setVisible(true);
        upMovie.setVisible(false);
        genGrafico.setVisible(false);
        delMovie.TextId.setText(String.valueOf(Share.idFilme));
        delMovie.TextGenero.setText(Share.genero);
        delMovie.TextDiretor.setText(Share.diretor);
        delMovie.TextTitulo.setText(Share.titulo);
        delMovie.TextIdioma.setText(Share.linguagem);
        delMovie.TextLoc.setText(Share.locado);
        delMovie.TextAno.setText(Share.ano);
        
    }//GEN-LAST:event_btnDeleteMovieActionPerformed

    private void btnGerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarPDFActionPerformed
        Generator_PDF genPDF = new Generator_PDF();
        try {
            genPDF.geraRelatorio();
        } catch (DocumentException ex) {
            Logger.getLogger(Screen_Atendente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Screen_Atendente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGerarPDFActionPerformed

    private void btnGerarGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarGraficoActionPerformed
        genGrafico.setVisible(true);
        genGrafico.criaGrafico();
        addMovie.setVisible(false);
        searchMovie.setVisible(false);
        delMovie.setVisible(false);
        upMovie.setVisible(false);
    }//GEN-LAST:event_btnGerarGraficoActionPerformed

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
            java.util.logging.Logger.getLogger(Screen_Atendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen_Atendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen_Atendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen_Atendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen_Atendente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMovie;
    private javax.swing.JButton btnDeleteMovie;
    private javax.swing.JButton btnEditMovie;
    private javax.swing.JButton btnGerarGrafico;
    private javax.swing.JButton btnGerarPDF;
    private javax.swing.JButton btnSearchMovie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
