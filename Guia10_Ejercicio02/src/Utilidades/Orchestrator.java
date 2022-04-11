
package Utilidades;

import Entidades.Lavadora;
import Entidades.Televisor;



public class Orchestrator {
    public void creamosYmostramos(){
        
        Televisor t1 = new Televisor();
        t1=t1.creaTelevisor();
        System.out.println(t1.toString());
        System.out.println("El precio final es: " + t1.precioFinal()+" Pesos");
        
        Lavadora l1 = new Lavadora();
        l1=l1.crearLavadora();
        System.out.println(l1.toString());
        System.out.println("El precio final es: " + l1.precioFinal()+" Pesos");
 
    }
}
