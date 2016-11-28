/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loyola.ssa.beans;

import com.loyola.ssa.dao.MateriaDAO;
import com.loyola.ssa.entities.Materia;
import com.loyola.ssa.impDAO.MateriaDAOImpl;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author ariel
 */
@ManagedBean(name = "materiaBean")
@ViewScoped
public class MateriaBean {
    
    private MateriaDAO materiaDao;
    private List<Materia> materias;
    private Materia materiaActual;
    
    @PostConstruct
    public void init(){
        materiaActual = new Materia();
        try {
            materiaDao = new MateriaDAOImpl();
            materias = materiaDao.listar();
        } catch (SQLException ex) {
            System.out.println("Error al intentar listar las materias");
            materias = new ArrayList<>();
        }
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public Materia getMateriaActual() {
        return materiaActual;
    }

    public void setMateriaActual(Materia materiaActual) {
        this.materiaActual = materiaActual;
    }
    
    public void insertarMateria(){
        try {
            materiaDao.insertar(materiaActual);
        } catch (SQLException ex) {
            System.out.println("Error al intentar insrtar materia");
        }
    }
    
    
}
