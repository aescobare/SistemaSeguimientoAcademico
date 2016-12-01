
package com.loyola.ssa.beans;

import com.loyola.ssa.dao.HorarioDAO;
import com.loyola.ssa.entities.Horario;
import com.loyola.ssa.impDAO.HorarioDAOimp;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "horarioBean")
@ViewScoped 
public class HorarioBean {
    private HorarioDAO horarioDao;
    private List<Horario> horarios;
    private Horario horarioActual;

    @PostConstruct
    public void init(){
        horarioActual = new Horario();
        try {
            horarioDao = new HorarioDAOimp();
            horarios = horarioDao.listar();
        } catch (SQLException e) {
            System.out.println("Error al intentar listar horarios");
            horarios = new ArrayList<>();
        }
    }

public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }

    public Horario getHorarioActual() {
        return horarioActual;
    }

    public void setHorarioActual(Horario horarioActual) {
        this.horarioActual = horarioActual;
    }
    
    public void insertarHorario(){
        try {
            horarioDao.insertar(horarioActual);
        } catch (SQLException e) {
            System.out.println("Error horario");
        }
    }
    
    
}
