
package br.unisc.video_locadora.controll;

import br.unisc.video_locadora.SQLConnector.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Controll {
    Connection con;
    
    public int codTipoUser = 0;
    
    public int authenticate(String user, String pass){
        int id = -1;
        try {
            String sql = "SELECT u.id, t.codtipo from users u, tipousuario t"
                    + " where u.usuario=? and "
                    + " u.senha = ? and"
                    + " u.codtipo = t.codtipo;";
            con = Connect.Connect();
            try (PreparedStatement stm = con.prepareStatement(sql) // aqui o erro
            ) {
                stm.setString(1, user);
                stm.setString(2, pass);
                ResultSet rs = stm.executeQuery();
                rs.next();
                id = rs.getInt("id");
                codTipoUser = rs.getInt("codtipo");
                rs.close();
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return id;
    }
}
