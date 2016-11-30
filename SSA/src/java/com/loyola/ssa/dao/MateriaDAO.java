/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loyola.ssa.dao;

import com.loyola.ssa.entities.Materia;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ariel
 */
public interface MateriaDAO {
    List<Materia> listar() throws SQLException;
    
    void insertar(Materia materia) throws SQLException;
}
