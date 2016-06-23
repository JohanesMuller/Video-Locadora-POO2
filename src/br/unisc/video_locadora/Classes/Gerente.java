
package br.unisc.video_locadora.Classes;

import br.unisc.video_locadora.SQLConnector.Connect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Gerente extends Funcionario{
    
    public boolean AddAtentente(Atendente a) throws SQLException {
        try {
            con = Connect.Connect();
            con.setAutoCommit(false);
            String sql = "insert into users (nome, usuario, senha, codtipo) values (?, ?, ?, ?);";
            stmp = con.prepareStatement(sql);
            System.out.println("nome"+ a.getNome());
            stmp.setString(1, a.getNome());
            stmp.setString(2, a.getLogin());
            stmp.setString(3, a.getSenha());
            stmp.setInt(4, a.getCodtipo());
            stmp.execute();
            con.commit();
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
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
    
    public List<Atendente> buscaAtendentes(String valor) {
        List<Atendente> lista = null;
        try {
            con = Connect.Connect();
            String query;
            if (valor.isEmpty() == true) {
                query = "SELECT * FROM users";
            } else {
                query = "SELECT * FROM users where nome like '%" + valor + "%' ";
            }
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            lista = new ArrayList<>();
            while (rs.next()) {
                Atendente a = new Atendente();
                a.setId(rs.getInt("id"));
                a.setNome(rs.getString("nome"));
                a.setLogin(rs.getString("usuario"));
                a.setSenha(rs.getString("senha"));
                a.setCodtipo(rs.getInt("codtipo"));
                lista.add(a);
            }
            rs.close();
            st.close();
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return lista;
    }
    
    public boolean AtualizarFuncionario(String id, String nome, String usuario, String senha, int codtipo) throws SQLException {
        try {
            con = Connect.Connect();
            con.setAutoCommit(false);
            String sql = ("UPDATE users SET nome='" + nome + "',usuario='" + usuario + "',senha='" + senha
                    + "',codtipo='" + codtipo
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
    
    public boolean excluirFilme(String id) throws SQLException {
        try {
            con = Connect.Connect();
            con.setAutoCommit(false);
            String sql = ("DELETE FROM users WHERE id='" + id + "'");
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
}
