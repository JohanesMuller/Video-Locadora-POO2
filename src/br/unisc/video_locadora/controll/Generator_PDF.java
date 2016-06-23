/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisc.video_locadora.controll;

import br.unisc.video_locadora.Classes.Filmes;
import br.unisc.video_locadora.Classes.Funcionario;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author will
 */
public class Generator_PDF {
    
    List<Filmes> listaF;
    Funcionario f = new Funcionario();
    
    
    public void geraRelatorio() throws DocumentException, FileNotFoundException {
        // Cria um novo documento com tamanho e margens definidas pelo usuário
        // new Document(tamanho da página, margem esquerda, margem direita,
        // margem topo, margem rodapé);
        Document doc = new Document(PageSize.A4, 10, 10, 10, 10);
        try {

            JFileChooser jFileChooser = new JFileChooser();

        //seta para selecionar apenas arquivos
        jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        //desabilita todos os tipos de arquivos
        jFileChooser.setAcceptAllFileFilterUsed(false);

        //filtra por extensao
        jFileChooser.setFileFilter(new FileFilter() {
            @Override
            public String getDescription() {
                return "Extensão PDF";
            }

            @Override
            public boolean accept(File f) {
                return f.getName().toLowerCase().endsWith("pdf");
            }
        });

        //mostra janela para salvar
        int acao = jFileChooser.showSaveDialog(null);

        //executa acao conforme opcao selecionada
        if (acao == JFileChooser.APPROVE_OPTION) {
            //escolheu arquivo
            System.out.println(jFileChooser.getSelectedFile().getAbsolutePath());
            PdfWriter.getInstance(doc, new FileOutputStream(jFileChooser.getSelectedFile().getAbsolutePath() + ".pdf"));
            doc.open();

            listaF = f.buscaFilme("");

            // Definindo uma fonte, com tamanho 20 e negrito
            Font f = new Font(Font.FontFamily.COURIER, 30, Font.BOLD);
            Font f2 = new Font(Font.FontFamily.HELVETICA, 20, Font.BOLD);

            // adicionando um parágrafo ao documento com a fonte acima
            Paragraph pa = new Paragraph("Relatório", f);
            // Setando o alinhamento p/ o centro
            pa.setAlignment(Paragraph.ALIGN_CENTER);

            // Definindo
            pa.setSpacingAfter(50);
            doc.add(pa);

            //doc.add(new Paragraph(" "));

            // Criando uma tabela com 4 colunas
            PdfPTable table = new PdfPTable(7);
            // Título para a tabela
            Paragraph tableHeader = new Paragraph("Todos os Títulos", f2);

            PdfPCell header = new PdfPCell(tableHeader);
            // Definindo que o header vai ocupar as 4 colunas
            header.setColspan(7);
            // Definindo alinhamento do header
            header.setHorizontalAlignment(Paragraph.ALIGN_CENTER);
            // Adicionando o header à tabela
            table.addCell(header);

            List<String> list = new ArrayList<>();
            list.add("Id");
            list.add("Título");
            list.add("Ano");
            list.add("Diretor");
            list.add("Gênero");
            list.add("Linguagem");
            list.add("Locado");
            for (Filmes p : listaF) {
                list.add(String.valueOf(p.getId()));
                list.add(p.getTitulo());
                list.add(String.valueOf(p.getAno()));
                list.add(p.getDiretor());
                list.add(p.getGenero());
                list.add(p.getIdioma());
                list.add(p.getLocado());
            }

            for (String s : list) {
                table.addCell(s);
            }

            doc.add(table);

            /* doc.add(new Paragraph(" ID | Nome | Idade | Cidade"));
            for (Pessoa p : lista) {
                doc.add(new Paragraph(p.getId() + " |  " + p.getNome() + "  |  " + p.getIdade() + "  |  " + p.getCidade()));
            }*/
        }
        } catch (FileNotFoundException | DocumentException e) {
            System.err.println(e.getMessage());
        }
        doc.close();
    }
    
}
