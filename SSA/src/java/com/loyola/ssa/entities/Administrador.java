package com.loyola.ssa.entities;

/**
 *
 * @author CARMEN
 */
public class Administrador 
{
    private Integer id_Admin;
    private Integer id_Usuario;
    private Integer ci_A;
    private String nombre_A;
    private String apellidos_A;
    private String cargo_A;

    public Administrador() {
    }
    
    public Administrador(Integer id_Admin, Integer id_Usuario, Integer ci_A, String nombre_A, String apellidos_A,String cargo_A) {
        this.id_Admin = id_Admin;
        this.id_Usuario = id_Usuario;
        this.ci_A = ci_A;
        this.nombre_A = nombre_A;
        this.apellidos_A = apellidos_A;
        this.cargo_A = cargo_A;
    }

    

        
    public Integer getId_Admin() {
        return id_Admin;
    }

    public void setId_Admin(Integer id_Admin) {
        this.id_Admin = id_Admin;
    }

    public Integer getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(Integer id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public Integer getCi_A() {
        return ci_A;
    }

    public void setCi_A(Integer ci_A) {
        this.ci_A = ci_A;
    }

    public String getNombre_A() {
        return nombre_A;
    }

    public void setNombre_A(String nombre_A) {
        this.nombre_A = nombre_A;
    }

    public String getApellidos_A() {
        return apellidos_A;
    }

    public void setApellidos_A(String apellidos_A) {
        this.apellidos_A = apellidos_A;
    }

    public String getCargo_A() {
        return cargo_A;
    }

    public void setCargo_A(String cargo_A) {
        this.cargo_A = cargo_A;
    }

    
    
    
    
    /* get and set*/    
    
      /*creando una variable de la clase Cargo*/

    /*public Administrador(int id_administrador,int id_usuario, int ci, String nombre, String apellidos) {
        //super(id_usuario, ci, nombre, apellidos);
        this.id_administrador = id_administrador;
        
    }*/
        
  /*  @Override
    public String toString(){
    String retorno = "Id_admin"+id_admin +"Id_usuario"+id_usuario +"Ci"+ci +"Nombre"+nombre +"Apellidos"+apellidos;
    return retorno;
    }
  */

    

}