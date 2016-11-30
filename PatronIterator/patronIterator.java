/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *
 * 
 * 
 * 
 * @author Christian Cuaquira
 */
public class patronIterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<String> lista = new ArrayList();
        lista.add("id_inscripcion");
        lista.add("fecha_inscripcion");
        lista.add("id_estudiante");
        lista.add("id_carrera");
        lista.add("tipo_inscripcion");
    /*    
        for(String s : lista) {
            System.out.println(s);
        }*/
        
        Iterator<String> iterador = lista.iterator();
        while(iterador.hasNext()){
            System.out.println(iterador.next());
        }
        
        
        
    }
    
}
