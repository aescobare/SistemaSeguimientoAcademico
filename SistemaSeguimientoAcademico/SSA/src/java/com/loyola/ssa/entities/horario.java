
package com.loyola.ssa.entities;


import java.util.Date;

public class horario {
     private int Id_horario;
     private Date hora_inicio;
     private Date hora_fin;
     private boolean turno;
     private Date dia;
    
    public int getId_horario() {
        return Id_horario;
    }

    public void setId_horario(int Id_horario) {
        this.Id_horario = Id_horario;
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
   



}
