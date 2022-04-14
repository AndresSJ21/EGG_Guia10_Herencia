
package guia10_ejercicio04;

import Entidades.Circulo;
import Entidades.Rectangulo;


/*
* Desarrollador: Andrés Panella
*/

public class Guia10_Ejercicio04 {
/*
calcular perímetro
calcular area

entidad formaGeometrica
entidad circulo
entidad rectángulo
        
interfaz calculoFormas
           calcula areaCirculo
           calcula areaRectangulo
           constante PI
                   
crear circulo
        implementa interfaz perimetro
        implementa interfaz area
                
                
crear rectangulo
        implementa interfaz perimetro
        implementa interfaz area   

    */
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo();
        r= r.crearRectangulo();
        r.setPerimetroRectangulo(r.perimetro());
        r.setAreaRectangulo(r.area());
        System.out.println(r.toString());
        
        Circulo c = new Circulo();
        c= c.crearCirculo();
        c.setAreaCirculo(c.area());
        c.setPerimetroCirculo(c.perimetro());
        System.out.println(c.toString());
    }

}
