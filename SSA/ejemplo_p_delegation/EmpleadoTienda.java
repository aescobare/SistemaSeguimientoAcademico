
package ejemplo_p_delegation;

/**
 *
 * @author CARMEN
 */
public class EmpleadoTienda extends Persona {
////////////Crear la variable de tipo clase Empleado llamado empleado
    Empleado empleado;
    
    /////dentro del constructor de EmpleadoTienda se realiza una instancia de la clase Empleado
    public EmpleadoTienda() {
        
        empleado=new Empleado();
    }
    //// se crea la variable de tipo clase llamado empleado
    
    
    
     public void cobrar()
             
 {
/////// se llama al metodo de la clase Empleado para obtener su comportamiento
     empleado.cobrar();
     
 }
    
     public static void main(String []args)
     {
         ////////se crea un objeto de la clase EmpleadoTienda para hacer llamado a los metodos que hereda y usa
         EmpleadoTienda empleadoTienda=new EmpleadoTienda();
         empleadoTienda.cobrar();
         empleadoTienda.hablar();
         empleadoTienda.caminar();
     }
    
}
