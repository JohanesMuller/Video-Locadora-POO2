/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisc.video_locadora.Screens;

import br.unisc.video_locadora.Panels.Funcionario_ADDMOVIE;
import br.unisc.video_locadora.Panels.Funcionario_DELETEMOVIE;
import br.unisc.video_locadora.Panels.Funcionario_GERARGRAFICO;
import br.unisc.video_locadora.Panels.Funcionario_SEARCHMOVIE;
import br.unisc.video_locadora.Panels.Funcionario_UPDATEMOVIE;
import br.unisc.video_locadora.Panels.Gerente_ADDFUNCIONARIO;
import br.unisc.video_locadora.Panels.Gerente_DELETEFUNCIONARIO;
import br.unisc.video_locadora.Panels.Gerente_SEARCHFUNCIONARIO;
import br.unisc.video_locadora.Panels.Gerente_UPDATEFUNCIONARIO;
import br.unisc.video_locadora.controll.Generator_PDF;
import br.unisc.video_locadora.controll.Share;
import com.itextpdf.text.DocumentException;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Screen_Gerente extends javax.swing.JFrame {

    Funcionario_ADDMOVIE addMovie;
    Funcionario_SEARCHMOVIE searchMovie;
    Funcionario_DELETEMOVIE delMovie;
    Funcionario_UPDATEMOVIE upMovie;
    Funcionario_GERARGRAFICO genGrafico;
    
    Gerente_SEARCHFUNCIONARIO searchFuncionario;
    Gerente_ADDFUNCIONARIO addFuncionario;
    Gerente_UPDATEFUNCIONARIO upFuncioario;
    Gerente_DELETEFUNCIONARIO delFuncionario;
    
    
    public Screen_Gerente() {
        initComponents();
        setSize(715, 500);
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
        //abaixo atendentes:
        
        searchFuncionario = new Gerente_SEARCHFUNCIONARIO();
        searchFuncionario.setSize(480, 300);
        searchFuncionario.setBounds(10, 10, searchFuncionario.getWidth(),
                searchFuncionario.getHeight());
        getContentPane().add(searchFuncionario);
        searchFuncionario.setVisible(false);
        
        addFuncionario = new Gerente_ADDFUNCIONARIO();
        addFuncionario.setSize(480, 300);
        addFuncionario.setBounds(10, 10, addFuncionario.getWidth(),
                addFuncionario.getHeight());
        getContentPane().add(addFuncionario);
        addFuncionario.setVisible(false);
        
        upFuncioario = new Gerente_UPDATEFUNCIONARIO();
        upFuncioario.setSize(480, 300);
        upFuncioario.setBounds(10, 10, upFuncioario.getWidth(),
                upFuncioario.getHeight());
        getContentPane().add(upFuncioario);
        upFuncioario.setVisible(false);
        
        delFuncionario = new Gerente_DELETEFUNCIONARIO();
        delFuncionario.setSize(480, 300);
        delFuncionario.setBounds(10, 10, delFuncionario.getWidth(),
                delFuncionario.getHeight());
        getContentPane().add(delFuncionario);
        delFuncionario.setVisible(false);
        
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
        btnADDMOVIE = new javax.swing.JButton();
        btnSEARCHMOVIE = new javax.swing.JButton();
        btnEDITMOVIE = new javax.swing.JButton();
        vtnDELETEMOVIE = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnGerarPDF = new javax.swing.JButton();
        btnGerarGRAFICO = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnADDFUNCIONARIO = new javax.swing.JButton();
        btnSEARCHFUNCIONARIO = new javax.swing.JButton();
        btnEDITFUNCIONARIO = new javax.swing.JButton();
        btnDELETEFUNCIONARIO = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Locadora_Gerente");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 102, 204));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Gerente");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(6, 0, 70, 22);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnADDMOVIE.setText("Adicionar");
        btnADDMOVIE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDMOVIEActionPerformed(evt);
            }
        });

        btnSEARCHMOVIE.setText("Procurar");
        btnSEARCHMOVIE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSEARCHMOVIEActionPerformed(evt);
            }
        });

        btnEDITMOVIE.setText("Editar");
        btnEDITMOVIE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEDITMOVIEActionPerformed(evt);
            }
        });

        vtnDELETEMOVIE.setText("Excluir");
        vtnDELETEMOVIE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vtnDELETEMOVIEActionPerformed(evt);
            }
        });

        jLabel2.setText("Filmes");

        btnGerarPDF.setBackground(new java.awt.Color(210, 144, 119));
        btnGerarPDF.setText("GerarPDF");
        btnGerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarPDFActionPerformed(evt);
            }
        });

        btnGerarGRAFICO.setBackground(new java.awt.Color(123, 179, 255));
        btnGerarGRAFICO.setText("Gerar Grafico");
        btnGerarGRAFICO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarGRAFICOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnADDMOVIE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(btnSEARCHMOVIE)
                        .addGap(28, 28, 28)
                        .addComponent(btnEDITMOVIE)
                        .addGap(33, 33, 33)
                        .addComponent(vtnDELETEMOVIE)
                        .addGap(40, 40, 40)))
                .addComponent(btnGerarGRAFICO, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnGerarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnADDMOVIE)
                            .addComponent(btnSEARCHMOVIE)
                            .addComponent(btnEDITMOVIE)
                            .addComponent(vtnDELETEMOVIE))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGerarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGerarGRAFICO, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, 310, 720, 79);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnADDFUNCIONARIO.setText("Adicionar");
        btnADDFUNCIONARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDFUNCIONARIOActionPerformed(evt);
            }
        });

        btnSEARCHFUNCIONARIO.setText("Procurar");
        btnSEARCHFUNCIONARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSEARCHFUNCIONARIOActionPerformed(evt);
            }
        });

        btnEDITFUNCIONARIO.setText("Editar");
        btnEDITFUNCIONARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEDITFUNCIONARIOActionPerformed(evt);
            }
        });

        btnDELETEFUNCIONARIO.setText("Excluir");
        btnDELETEFUNCIONARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELETEFUNCIONARIOActionPerformed(evt);
            }
        });

        jLabel3.setText("Funcionarios");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnADDFUNCIONARIO)
                        .addGap(37, 37, 37)
                        .addComponent(btnSEARCHFUNCIONARIO)
                        .addGap(31, 31, 31)
                        .addComponent(btnEDITFUNCIONARIO)
                        .addGap(35, 35, 35)
                        .addComponent(btnDELETEFUNCIONARIO))
                    .addComponent(jLabel3))
                .addContainerGap(319, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnADDFUNCIONARIO)
                    .addComponent(btnSEARCHFUNCIONARIO)
                    .addComponent(btnEDITFUNCIONARIO)
                    .addComponent(btnDELETEFUNCIONARIO))
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 390, 710, 70);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Johanes\\Desktop\\Video_Locadora\\Imagens\\logo fundo.jpg")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(500, 0, 200, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnADDMOVIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDMOVIEActionPerformed
        addMovie.setVisible(true);
        searchMovie.setVisible(false);
        delMovie.setVisible(false);
        upMovie.setVisible(false);
        searchFuncionario.setVisible(false);
        addFuncionario.setVisible(false);
        upFuncioario.setVisible(false);
        delFuncionario.setVisible(false);
        genGrafico.setVisible(false);
    }//GEN-LAST:event_btnADDMOVIEActionPerformed

    private void btnSEARCHMOVIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSEARCHMOVIEActionPerformed
        addMovie.setVisible(false);
        searchMovie.setVisible(true);
        delMovie.setVisible(false);
        genGrafico.setVisible(false);
        upMovie.setVisible(false);
        addFuncionario.setVisible(false);
        searchFuncionario.setVisible(false);
        upFuncioario.setVisible(false);
        delFuncionario.setVisible(false);
    }//GEN-LAST:event_btnSEARCHMOVIEActionPerformed

    private void btnEDITMOVIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEDITMOVIEActionPerformed
        addMovie.setVisible(false);
        searchMovie.setVisible(false);
        delMovie.setVisible(false);
        upMovie.setVisible(true);
        addFuncionario.setVisible(false);
        genGrafico.setVisible(false);
        upFuncioario.setVisible(false);
        searchFuncionario.setVisible(false);
        delFuncionario.setVisible(false);
        upMovie.TextId.setText(String.valueOf(Share.idFilme));
        upMovie.TextGenero.setText(Share.genero);
        upMovie.TextDiretor.setText(Share.diretor);
        upMovie.TextTitulo.setText(Share.titulo);
        upMovie.TextIdioma.setText(Share.linguagem);
        upMovie.TextLoc.setText(Share.locado);
        upMovie.TextAno.setText(Share.ano);
    }//GEN-LAST:event_btnEDITMOVIEActionPerformed

    private void vtnDELETEMOVIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vtnDELETEMOVIEActionPerformed
        addMovie.setVisible(false);
        searchMovie.setVisible(false);
        delMovie.setVisible(true);
        upMovie.setVisible(false);
        addFuncionario.setVisible(false);
        searchFuncionario.setVisible(false);
        upFuncioario.setVisible(false);
        genGrafico.setVisible(false);
        delFuncionario.setVisible(false);
        delMovie.TextId.setText(String.valueOf(Share.idFilme));
        delMovie.TextGenero.setText(Share.genero);
        delMovie.TextDiretor.setText(Share.diretor);
        delMovie.TextTitulo.setText(Share.titulo);
        delMovie.TextIdioma.setText(Share.linguagem);
        delMovie.TextLoc.setText(Share.locado);
        delMovie.TextAno.setText(Share.ano);
    }//GEN-LAST:event_vtnDELETEMOVIEActionPerformed

    private void btnGerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarPDFActionPerformed
        Generator_PDF genPDF = new Generator_PDF();
        try {
            genPDF.geraRelatorio();
        } catch (DocumentException ex) {
            Logger.getLogger(Screen_Gerente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Screen_Gerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGerarPDFActionPerformed

    private void btnGerarGRAFICOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarGRAFICOActionPerformed
        addMovie.setVisible(false);
        searchMovie.setVisible(false);
        delMovie.setVisible(false);
        upMovie.setVisible(false);
        genGrafico.setVisible(true);
        genGrafico.criaGrafico();
        addFuncionario.setVisible(false);
        upFuncioario.setVisible(false);
        delFuncionario.setVisible(false);
        searchFuncionario.setVisible(false);
    }//GEN-LAST:event_btnGerarGRAFICOActionPerformed

    private void btnDELETEFUNCIONARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELETEFUNCIONARIOActionPerformed
        addMovie.setVisible(false);
        searchMovie.setVisible(false);
        delMovie.setVisible(false);
        upMovie.setVisible(false);
        genGrafico.setVisible(false);
        addFuncionario.setVisible(false);
        upFuncioario.setVisible(false);
        delFuncionario.setVisible(true);
        searchFuncionario.setVisible(false);
        delFuncionario.txtNome.setText(Share.nome);
        delFuncionario.txtLogin.setText(Share.usuario);
        delFuncionario.txtSenha.setText(Share.senha);
        delFuncionario.txtID.setText(String.valueOf(Share.idFuncionario));
        delFuncionario.txtTipoUsuario.setText(Share.tipoFuncionario);
    }//GEN-LAST:event_btnDELETEFUNCIONARIOActionPerformed

    private void btnEDITFUNCIONARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEDITFUNCIONARIOActionPerformed
        addMovie.setVisible(false);
        searchMovie.setVisible(false);
        delMovie.setVisible(false);
        upMovie.setVisible(false);
        addFuncionario.setVisible(false);
        upFuncioario.setVisible(true);
        delFuncionario.setVisible(false);
        genGrafico.setVisible(false);
        searchFuncionario.setVisible(false);
        upFuncioario.txtNome.setText(Share.nome);
        upFuncioario.txtLogin.setText(Share.usuario);
        upFuncioario.txtSenha.setText(Share.senha);
        upFuncioario.txtID.setText(String.valueOf(Share.idFuncionario));
        upFuncioario.choiceUPDATE.select(Share.tipoFuncionario);
    }//GEN-LAST:event_btnEDITFUNCIONARIOActionPerformed

    private void btnSEARCHFUNCIONARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSEARCHFUNCIONARIOActionPerformed
        addMovie.setVisible(false);
        searchMovie.setVisible(false);
        delMovie.setVisible(false);
        upMovie.setVisible(false);
        addFuncionario.setVisible(false);
        searchFuncionario.setVisible(true);
        upFuncioario.setVisible(false);
        delFuncionario.setVisible(false);
        genGrafico.setVisible(false);

    }//GEN-LAST:event_btnSEARCHFUNCIONARIOActionPerformed

    private void btnADDFUNCIONARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDFUNCIONARIOActionPerformed
        addMovie.setVisible(false);
        searchMovie.setVisible(false);
        delMovie.setVisible(false);
        upMovie.setVisible(false);
        addFuncionario.setVisible(true);
        upFuncioario.setVisible(false);
        searchFuncionario.setVisible(false);
        delFuncionario.setVisible(false);
        genGrafico.setVisible(false);
        addFuncionario.txtNome.setText(Share.nome);
        addFuncionario.txtLogin.setText(Share.usuario);
        addFuncionario.txtSenha.setText(Share.senha);
        addFuncionario.choiceADD.select(Share.tipoFuncionario);
    }//GEN-LAST:event_btnADDFUNCIONARIOActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen_Gerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnADDFUNCIONARIO;
    private javax.swing.JButton btnADDMOVIE;
    private javax.swing.JButton btnDELETEFUNCIONARIO;
    private javax.swing.JButton btnEDITFUNCIONARIO;
    private javax.swing.JButton btnEDITMOVIE;
    private javax.swing.JButton btnGerarGRAFICO;
    private javax.swing.JButton btnGerarPDF;
    private javax.swing.JButton btnSEARCHFUNCIONARIO;
    private javax.swing.JButton btnSEARCHMOVIE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton vtnDELETEMOVIE;
    // End of variables declaration//GEN-END:variables
}
