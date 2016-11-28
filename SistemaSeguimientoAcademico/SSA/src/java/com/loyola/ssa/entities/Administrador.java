package com.loyola.ssa.entities;
import java.util.Date;
public class Administrador extends Usuario
{
    private int id_administrador;
    private final Date fecha_creacion;

    
    

  ///////CONSTRUCTORES
    public Administrador(Date fecha_creacion) 
    {
        super();
        this.fecha_creacion = fecha_creacion;
        
    }
    
    ////////GETTERS AND SETTERS
    public int getId_administrador() 
    {
        return id_administrador;
    }

    public void setId_administrador(int id_administrador) 
    {
        this.id_administrador = id_administrador;
    }
    public Date getFecha_creacion() {
        return fecha_creacion;
    }
 
       /////////////METODOS DE LA CLASE /////////
    
     public void Ingresar_por_cargo()
    {
    }
    
}
