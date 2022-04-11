
package Utilidades;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

/*
* Desarrollador: Andrés Panella
*/

public class Orchestrator {
    public ArrayList<Electrodomestico> listaElectro = new ArrayList();
    
    public void creamosYmostramos(){
           
        
        Televisor t1 = new Televisor();
        t1=t1.creaTelevisor();
        listaElectro.add(t1);
    
        Lavadora l1 = new Lavadora();
        l1=l1.crearLavadora();
        listaElectro.add(l1);
    
        Televisor t2 = new Televisor();
        t1=t1.creaTelevisor();
        listaElectro.add(t1);
 
        Lavadora l2 = new Lavadora();
        l1=l1.crearLavadora();
        listaElectro.add(l1);
        
        Double precioFinal=0d;
        
        for (Electrodomestico electrodomestico : listaElectro) {
            
            System.out.println(electrodomestico.toString());
            System.out.println("El precio final es: " + electrodomestico.precioFinal()+" Pesos");
            precioFinal+=electrodomestico.precioFinal();
        }
        System.out.println("El precio de todos los productos disponibles es: "+ precioFinal);
    }
}
