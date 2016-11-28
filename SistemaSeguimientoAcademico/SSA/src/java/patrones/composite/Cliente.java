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
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado1= new DeveloperHoja("Jose",100000.0);
        Empleado empleado2= new DeveloperHoja("Juan",100000.0);
        Empleado gerente1= new ManagerComposite("Sofia",300000.0);
        
        gerente1.add(empleado1);
        gerente1.add(empleado2);
        
        Empleado gerenteGeneral = new ManagerComposite("Antonio",400000.0);
        
        gerenteGeneral.add(gerente1);
        gerenteGeneral.print();
        
        
        
    }
    
}

    

