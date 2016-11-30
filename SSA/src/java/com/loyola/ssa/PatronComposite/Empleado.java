/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronComposite;

/**
 *
 * @author FERNANDO
 */
public interface Empleado {
   
    public void add(Empleado empleado);
    public String getNombre();
    public double getSalario();
    public void print();
}




