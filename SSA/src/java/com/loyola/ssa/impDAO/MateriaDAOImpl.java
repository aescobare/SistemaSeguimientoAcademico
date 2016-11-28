/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loyola.ssa.impDAO;

import com.loyola.ssa.ConexionDB.DBconexion;
import com.loyola.ssa.dao.MateriaDAO;
import com.loyola.ssa.entities.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ariel
 */
public class MateriaDAOImpl implements MateriaDAO {

    @Override
    public List<Materia> listar() throws SQLException {
        List<Materia> materias = new ArrayList<>();
        DBconexion dbConexion = new DBconexion();
        Connection dbConnection = null;
        Statement statement = null;

        String selectTableSQL = "SELECT * FROM materia";

        try {
            dbConnection = dbConexion.getConnection();
            statement = dbConnection.createStatement();

            System.out.println(selectTableSQL);

            // execute select SQL stetement
            ResultSet rs = statement.executeQuery(selectTableSQL);

            while (rs.next()) {

                Integer materiaId = rs.getInt("materia_id");
                String codMateria = rs.getString("cod_materia");
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                Materia materia = new Materia(materiaId, codMateria, nombre, descripcion);
                materias.add(materia);

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
        return materias;
    }

    @Override
    public void insertar(Materia materia) throws SQLException {

        DBconexion dbConexion = new DBconexion();

        Connection dbConnection = null;
        PreparedStatement preparedStatement = null;

        String insertTableSQL = "INSERT INTO materia"
                + "(cod_materia, nombre, descripcion) VALUES"
                + "(?,?,?)";

        try {
            dbConnection = dbConexion.getConnection();
            preparedStatement = dbConnection.prepareStatement(insertTableSQL);

            preparedStatement.setString(1, materia.getCodMateria());
            preparedStatement.setString(2, materia.getNombre());
            preparedStatement.setString(3, materia.getDescripcion());

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
