package com.loyola.ssa.beans;
import com.loyola.ssa.DAO.EstudianteDAO;
import com.loyola.ssa.Modelo.Estudiante;
import java.util.List;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.ViewScoped;


@ManagedBean
@ViewScoped
public class EstudianteBean {
    
    private Estudiante estudiante=new Estudiante();
    private List<Estudiante> lstEstudiante;

    public List<Estudiante> getLstEstudiante() {
        return lstEstudiante;
    }

    public void setLstEstudiante(List<Estudiante> lstEstudiante) {
        this.lstEstudiante = lstEstudiante;
    }
    
    
    

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    
    public void registrar() throws Exception{
        EstudianteDAO dao;
        
        try{
            dao = new EstudianteDAO();
            dao.registrar(estudiante);
        } catch(Exception e){
            throw e;
        }
    }
    
    
    public void listar() throws Exception{
        EstudianteDAO dao;
        
        try{
            dao = new EstudianteDAO();
          //  lstEstudiante = dao.listar();
            dao.listar();
        } catch(Exception e){
            throw e;
        }
    }
    
    public void leerID(Estudiante est) throws Exception{
        EstudianteDAO dao;
        Estudiante temp;
        
        try{
            dao = new EstudianteDAO();
            temp=dao.leerID(est);
            
            if(temp !=null){
                this.estudiante=temp;
            
            }
            
            
        } catch(Exception e){
            throw e;
        }
    
    }
    
    
    public void modificar() throws Exception{
        EstudianteDAO dao;
        
        try{
            dao = new EstudianteDAO();
            dao.modificar(estudiante);
            this.listar();
        } catch(Exception e){
            throw e;
        }
    }
    
    
    public void eliminar(Estudiante est) throws Exception{
        EstudianteDAO dao;
        
        try{
            dao = new EstudianteDAO();
            dao.eliminar(est);
            this.listar();
        } catch(Exception e){
            throw e;
        }
    }
    
}
