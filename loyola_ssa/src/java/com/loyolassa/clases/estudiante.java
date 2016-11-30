package com.loyolassa.clases;


public class estudiante {
    private int   id_estudiante;
    private int cod_estudiante;
    private int id_usuario;
    private String tipo_estudiante;
    
    public estudiante(int id_estudiante, int cod_estudiante, int id_usuario, String tipo_estudiante){
            this.id_estudiante= id_estudiante;
            this.cod_estudiante=cod_estudiante;
            this.id_usuario=id_usuario;
            this.tipo_estudiante=tipo_estudiante;
            
        }
    public int getId_estudiante(){
        return id_estudiante;
    }
    
    public void setId_estudiante(int id_estudiante){
        this.id_estudiante=id_estudiante;
    }
    
    public int getCod_estudiante(){
        return cod_estudiante;
    }
    
    public void setCod_estudiante(int cod_estudiante){
        this.cod_estudiante=cod_estudiante;
    }
    
    public int getId_usuario(){
        return id_usuario;
    }
    
    public void setId_usuario(int id_usuario){
        this.id_usuario=id_usuario;
    }
    
    public String getTipo_estudiante(){
        return tipo_estudiante;
    }
    
    public void setTipo_estudiante(String tipo_estudiante){
        this.tipo_estudiante=tipo_estudiante;
    }
}
 