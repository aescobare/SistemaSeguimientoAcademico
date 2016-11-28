/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronComposite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author FERNANDO
 */
public class ManagerComposite implements Empleado{
    
    private String Nombre;
    
    private double Salario;
    
    public ManagerComposite(String nombre,double salario){
        this.Nombre=nombre;
        this.Salario=salario;
        
    }
    List<Empleado> empleados = new ArrayList<Empleado>();
    
    public void add(Empleado empleado){
        empleados.add(empleado);
    }
    public String getNombre(){
        return Nombre;
    }
    
    public double getSalario(){
        return Salario;
    }
    
    public void print(){
        System.out.println("Gerente");
        System.out.println("Nombre:"+getNombre());
        System.out.println("Salario:"+getSalario());
        System.out.println("----------");
        
        Iterator<Empleado> empleadoIterator=empleados.iterator();
        while(empleadoIterator.hasNext()){
            Empleado empleado=empleadoIterator.next();
            empleado.print();
        }
        
    }


}

