/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loyola.ssa.dao;

import com.loyola.ssa.entities.Horario;
import java.sql.SQLException;
import java.util.List;

public interface HorarioDAO {
    List<Horario> listar() throws SQLException;
    
    void insertar(Horario horario) throws SQLException;
    void actualizar(Horario horario) throws SQLException;
}
