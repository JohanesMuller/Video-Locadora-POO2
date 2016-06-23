
package br.unisc.video_locadora.Classes;

import br.unisc.video_locadora.SQLConnector.Connect;
import br.unisc.video_locadora.controll.GeradorDeGrafico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Funcionario {
    Connection con;
    static PreparedStatement stmp = null;
    
    String nome;
    String login;
    String senha;
    int id;
    int codtipo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getCodtipo() {
        return codtipo;
    }

    public void setCodtipo(int codtipo) {
        this.codtipo = codtipo;
    }
    
    public boolean AdicionarFilme(Filmes f) {
        try {
            //insert into filme(id, codlocadora, titulo, ano, diretor, genero, idioma)
            String sql = "INSERT INTO filme "
                    + " (codlocadora, titulo, ano, diretor, genero, idioma, locado) "
                    + " values (1,?,?,?,?,?,?);";
            con = Connect.Connect();
            PreparedStatement stm = 
                    con.prepareStatement(sql);
            stm.setString(1, f.getTitulo());
            stm.setString(2, f.getAno());
            stm.setString(3, f.getDiretor());
            stm.setString(4, f.getGenero());
            stm.setString(5, f.getIdioma());
            stm.setString(6, f.getLocado());
            stm.execute();
            stm.close();
            con.close();
            return true;

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }
    
    public  List<Filmes> buscaFilme(String titulo) {
        List<Filmes> lista = null;
        try {
            con = Connect.Connect();
            String query;
            if (titulo.isEmpty() == true) {
                query = "SELECT * FROM filme";
            } else {
                query = "SELECT * FROM filme where titulo like '%" + titulo + "%' ";
            }
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            lista = new ArrayList<>();
            while (rs.next()) {
                Filmes f = new Filmes();
                f.setId(rs.getInt("id"));
                f.setTitulo(rs.getString("titulo"));
                f.setAno(rs.getString("ano"));
                f.setDiretor(rs.getString("diretor"));
                f.setGenero(rs.getString("genero"));
                f.setIdioma(rs.getString("idioma"));
                f.setLocado(rs.getString("locado"));
                lista.add(f);
            }
            rs.close();
            st.close();
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return lista;
    }
    
    public boolean excluirFilme(String id) throws SQLException {
        try {
            con = Connect.Connect();
            con.setAutoCommit(false);
            String sql = ("DELETE FROM filme WHERE id='" + id + "'");
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            con.commit();
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            con.rollback();
        } finally {
            if (stmp != null) {
                stmp.close();
            }
            if (con != null) {
                con.setAutoCommit(true);
                con.close();
            }
        }
        return false;
    }
    
    public boolean AtualizarFilme(String id, String titulo, String ano, String diretor, String genero, String ling, String loc) throws SQLException {
        try {
            con = Connect.Connect();
            con.setAutoCommit(false);
            String sql = ("UPDATE filme SET titulo='" + titulo + "',ano='" + ano + "',diretor='" + diretor
                    + "',genero='" + genero + "',idioma='" + ling + "',locado='" + loc
                    + "' WHERE id='" + id + "'");
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            con.commit();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            con.rollback();
        } finally {
            if (stmp != null) {
                stmp.close();
            }
            if (con != null) {
                con.setAutoCommit(true);
                con.close();
            }
        }
        return false;
    }
    
    public static List<GeradorDeGrafico> grafico(List<Filmes> lista) { 
        List<GeradorDeGrafico> graf = null;
        graf = new ArrayList<>();
        int cont = 0;
        String[] genero = new String[20];
        for (Filmes f : lista) { // adiciona os generos dos filmes
            if (cont == 0){
                genero[cont] = f.getGenero();
                cont++;
            } else {
                int kk = 0;
                for (int i = 0; i < cont; i++) {
                    if (genero[i].equalsIgnoreCase(f.getGenero())){
                        i = cont;
                        kk = 1;
                    }
                }
                if (kk == 0) {
                    genero[cont] = f.getGenero();
                    cont++;
                }
            }
        }
        for (int i = 0; i < cont; i++) { // faz a contagem de cada genero
            GeradorDeGrafico gr = new GeradorDeGrafico();
            gr.setGenero(genero[i]);
            int qtd = 0;
            for (Filmes p : lista){
                if (genero[i].equalsIgnoreCase(p.getGenero())){
                    qtd ++;
                }
            }
            gr.setQtd(qtd);
            graf.add(gr);
        }
        return graf;
    }
}
