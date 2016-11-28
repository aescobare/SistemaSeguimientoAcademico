package com.loyola.ssa.entities;
import java.util.Date;

public class notas extends Estudiante {

    private int   id_nota;
    //private int   id_estudiante;
    private float   valor;
    private Date     fecha;
   // private int   id_docente;
   // private int   id_usuario;
   
////constructor
    public notas(int id_nota, int id_estudiante, float valor, Date fecha, int id_docente, int id_usuario) {
        super(id_usuario,);
        this.id_nota = id_nota;
        
        this.valor = valor;
        this.fecha = fecha;
        
        Docente docente;
    }
    
    
    public void asociar_docente()
    {
        docente.agregar_docente;
    }
    public int getId_nota() {
        return id_nota;
    }

    public void setId_nota(int id_nota) {
        this.id_nota = id_nota;
    }

    

    public void getvalor() {
        float valor;
    }

    public void setvalor(float valor) {
        this.valor = valor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

  

    
}
