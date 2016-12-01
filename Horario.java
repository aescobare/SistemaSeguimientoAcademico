
package com.loyola.ssa.entities;
import java.util.Date;

public class Horario {
     private int id_horario;
     private Date hora_inicio;
     private Date hora_fin;
     private boolean turno;
     private Date dia;

public Horario (int id_horario, Date hora_inicio, Date hora_fin, boolean turno, Date dia){
        this.id_horario = id_horario;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.turno = turno;
        this.dia = dia;
        }

    public Horario() {
        
    }
    
            
    public int getid_horario() {
        return id_horario;
    }

    public void setid_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public Date getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(Date hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public Date getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(Date hora_fin) {
        this.hora_fin = hora_fin;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public int getIdhorario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public java.sql.Date getTurno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   



}

