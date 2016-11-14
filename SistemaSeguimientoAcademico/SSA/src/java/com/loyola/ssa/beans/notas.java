package com.loyola.ssa.entities;
import java.util.Date;

public class notas {

    private int   id_nota;
    private int   id_estudiante;
    private float   valor;
    private Date     fecha;
    private int   id_docente;
    private int   id_usuario;
   

    public notas(int id_nota, int id_estudiante, float valor, Date fecha, int id_docente, int id_usuario) {
        this.id_nota = id_nota;
        this.id_estudiante = id_estudiante;
        this.valor = valor;
        this.fecha = fecha;
        this.id_docente = id_docente;
        this.id_usuario = id_usuario;
    }
    public int getId_nota() {
        return id_nota;
    }

    public void setId_nota(int id_nota) {
        this.id_nota = id_nota;
    }

    public int getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(int id_estudiante) {
        this.id_estudiante = id_estudiante;
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

    public int getId_docente() {
        return id_docente;
    }

    public void setId_docente(int id_docente) {
        this.id_docente = id_docente;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    
}
