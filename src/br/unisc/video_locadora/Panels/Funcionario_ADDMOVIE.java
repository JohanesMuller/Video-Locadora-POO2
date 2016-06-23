/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisc.video_locadora.Panels;

import br.unisc.video_locadora.Classes.Atendente;
import br.unisc.video_locadora.Classes.Filmes;
import br.unisc.video_locadora.Classes.Funcionario;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author will
 */
public class Funcionario_ADDMOVIE extends javax.swing.JPanel {

    
    public Funcionario_ADDMOVIE() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtClose = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TextLoc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TextTitulo = new javax.swing.JTextField();
        TextIdade = new javax.swing.JTextField();
        TextDiretor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextGenero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BtAdd = new javax.swing.JButton();
        TextLing = new javax.swing.JTextField();

        setLayout(null);

        BtClose.setText("Fechar");
        BtClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCloseActionPerformed(evt);
            }
        });
        add(BtClose);
        BtClose.setBounds(251, 11, 80, 23);

        jLabel4.setText("Diretor:");
        add(jLabel4);
        jLabel4.setBounds(5, 79, 60, 14);
        add(TextLoc);
        TextLoc.setBounds(75, 160, 148, 20);

        jLabel7.setText("Locado:");
        add(jLabel7);
        jLabel7.setBounds(5, 163, 60, 14);
        add(TextTitulo);
        TextTitulo.setBounds(75, 12, 150, 20);
        add(TextIdade);
        TextIdade.setBounds(75, 45, 150, 20);
        add(TextDiretor);
        TextDiretor.setBounds(75, 76, 150, 20);

        jLabel5.setText("Gênero:");
        add(jLabel5);
        jLabel5.setBounds(5, 105, 60, 14);

        jLabel6.setText("Linguagem:");
        add(jLabel6);
        jLabel6.setBounds(5, 133, 70, 14);

        jLabel2.setText("Título:");
        add(jLabel2);
        jLabel2.setBounds(15, 15, 60, 14);
        add(TextGenero);
        TextGenero.setBounds(75, 102, 148, 20);

        jLabel3.setText("Ano:");
        add(jLabel3);
        jLabel3.setBounds(15, 48, 50, 14);

        BtAdd.setText("Adicionar");
        BtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAddActionPerformed(evt);
            }
        });
        add(BtAdd);
        BtAdd.setBounds(238, 159, 90, 23);
        add(TextLing);
        TextLing.setBounds(80, 130, 148, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void BtCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCloseActionPerformed
        setVisible(false);
    }//GEN-LAST:event_BtCloseActionPerformed

    private void BtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAddActionPerformed
        Filmes f = new Filmes();
        f.setTitulo(TextTitulo.getText());
        f.setAno(TextIdade.getText());
        f.setDiretor(TextDiretor.getText());
        f.setGenero(TextGenero.getText());
        f.setIdioma(TextLing.getText());
        f.setLocado(TextLoc.getText());
        Atendente a = new Atendente();
        try {
            a.AdicionarFilme(f);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        TextTitulo.setText("");
        TextIdade.setText("");
        TextDiretor.setText("");
        TextGenero.setText("");
        TextLing.setText("");
        TextLoc.setText("");
    }//GEN-LAST:event_BtAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAdd;
    private javax.swing.JButton BtClose;
    public javax.swing.JTextField TextDiretor;
    private javax.swing.JTextField TextGenero;
    public javax.swing.JTextField TextIdade;
    private javax.swing.JTextField TextLing;
    private javax.swing.JTextField TextLoc;
    public javax.swing.JTextField TextTitulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}