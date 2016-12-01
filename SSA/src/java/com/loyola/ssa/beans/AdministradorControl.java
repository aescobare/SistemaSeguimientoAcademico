package com.loyola.ssa.beans;

import com.loyola.ssa.impDAO.AdministradorDAOimp;
import com.loyola.ssa.DAO.AdministradorDAO;
import com.loyola.ssa.entities.Administrador;
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
 * @author CARMEN
 */
@ManagedBean (name="administradorControl")
@ViewScoped
public class AdministradorControl  {
    
    private AdministradorDAO administradorDAO;
    private List<Administrador>administradores;
    private Administrador administradorUp;
    
    @PostConstruct
            public void init(){
            administradorUp=new Administrador();
            try{
                administradorDAO=new AdministradorDAOimp();
                administradores =administradorDAO.listarAdministrador();
                        
            }catch(SQLException ex){
                System.out.println("Error al listar");
                administradores=new ArrayList<>();
            }
            }
            public List<Administrador>getAdministradores()
            {return administradores;}
            public void setAdministradores(List<Administrador>administradores)
            {this.administradores=administradores;}
            public Administrador getAdministradorUp()
            {return administradorUp;}
            public void setAdministradorUp(Administrador administradorUp)
            {this.administradorUp=administradorUp;}
           
    
    public void insertarAdministrador(){
      try{
      administradorDAO.insertar_administrador(administradorUp);
      }catch(SQLException ex){
      System.out.println("Error al registrar");
      }
    }  
    
}
