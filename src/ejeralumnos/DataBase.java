/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeralumnos;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alber
 */
public class DataBase {

    Connection conexion;

    public Connection getConexion() {
        return conexion;
    }

    public boolean cargarDriver() {
        try {
            DriverManager.registerDriver(new Driver());
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean conectar(String host, String puerto, String database, String usuario, String password) {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://" + host + ":" + puerto + "/" + database, usuario, password);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean desconectar() throws SQLException {

        if (conexion != null) {
            conexion.close();
            return true;
        }

        return false;

    }

    public PreparedStatement prepararSentencia(String sentencia) throws SQLException {
        return conexion.prepareStatement(sentencia);

    }

    public ResultSet consultaSinParametros(String consulta) throws SQLException {
        return prepararSentencia(consulta).executeQuery();
    }

    public boolean LiberarStatement(PreparedStatement ps) throws SQLException {
        if (ps != null) {
            ps.close();
            return true;
        }
        return false;
    }
    public boolean LiberarResult(ResultSet rs) throws SQLException {
        if (rs != null) {
            rs.close();
            return true;
        }
        return false;
    }
}
