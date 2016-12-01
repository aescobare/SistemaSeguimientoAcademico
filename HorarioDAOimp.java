package com.loyola.ssa.impDAO;
import java.util.Date;
import com.loyola.ssa.ConexionDB.DBconexion;
import com.loyola.ssa.dao.HorarioDAO;
import com.loyola.ssa.entities.Horario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class HorarioDAOimp implements HorarioDAO {

    @Override
        public List<Horario> listar() throws SQLException {
        List<Horario> horarios = new ArrayList<>();
        DBconexion dbConexion = new DBconexion();
        Connection dbConnection = null;
        Statement statement = null;

        String selectTableSQL = "SELECT * FROM horario";

        try {
            dbConnection = dbConexion.getConnection();
            statement = dbConnection.createStatement();

            System.out.println(selectTableSQL);

            // execute select SQL stetement
            ResultSet rs = statement.executeQuery(selectTableSQL);

            while (rs.next()) {

                Integer id_horario = rs.getInt("id_horario");
                Date hora_inicio = rs.getDate("hora_inicio");
                Date hora_fin = rs.getDate("hora_fin");
                boolean turno = rs.getBoolean("turno");
                Date dia = rs.getDate("dia");
                Horario horario = new Horario(id_horario, hora_inicio, hora_fin, turno, dia);
                horarios.add(horario);

            }

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        } finally {

            if (statement != null) {
                System.out.println("Error al intentar cerrar conexion statement");
            }

            if (dbConnection != null) {
                dbConnection.close();

            }

        }
        return horarios;
    }
    
    @Override
    public void insertar(Horario horario) throws SQLException {

        DBconexion dbConexion = new DBconexion();

        Connection dbConnection = null;
        PreparedStatement preparedStatement = null;

        String insertTableSQL = "INSERT INTO horario"
                + "(id_horario, turno, dia) VALUES"
                + "(?,?,?)";

        try {
            dbConnection = dbConexion.getConnection();
            preparedStatement = dbConnection.prepareStatement(insertTableSQL);

            preparedStatement.setInt(1, horario.getIdhorario());
            preparedStatement.setDate(2, horario.getTurno());
            preparedStatement.setDate(3, (java.sql.Date) horario.getDia());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        } finally {

            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (dbConnection != null) {
                dbConnection.close();
            }

        }

    }
    
    
}
