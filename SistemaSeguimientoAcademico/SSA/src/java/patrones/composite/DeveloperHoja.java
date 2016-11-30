/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.composite;

/**
 *
 * @author FERNANDO
 */
public class DeveloperHoja implements Empleado{
    
    private String Nombre;
    private double Salario;
    
    public DeveloperHoja(String nombre, double salario){
        this.Nombre=nombre;
        this.Salario=salario;
        
    }

   
    
    
    public void add(Empleado empleado){
        
    }
    
    public String getNombre(){
        return Nombre;
        
    }
    public double getSalario(){
        return Salario;
        
    }
    
    public void print(){
        System.out.println("Empleado");
        System.out.println("Nombre:"+getNombre());
        System.out.println("Salario:"+getSalario());
        System.out.println("----------");
    }




}

