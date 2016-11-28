/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loyola.ssa.entities;

/**
 *
 * @author ariel
 */
public class Materia {
    private Integer materiaId;
    private String codMateria;
    private String nombre;
    private String descripcion;

    public Materia() {
    }

    public Materia(Integer materiaId, String codMateria, String nombre, String descripcion) {
        this.materiaId = materiaId;
        this.codMateria = codMateria;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Integer getMateriaId() {
        return materiaId;
    }

    public void setMateriaId(Integer materiaId) {
        this.materiaId = materiaId;
    }

    public String getCodMateria() {
        return codMateria;
    }

    public void setCodMateria(String codMateria) {
        this.codMateria = codMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
