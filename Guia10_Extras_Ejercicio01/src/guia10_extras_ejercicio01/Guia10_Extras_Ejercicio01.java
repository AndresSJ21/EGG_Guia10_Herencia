package guia10_extras_ejercicio01;

import Utilidades.Utiles;

/*
* Desarrollador: Andrés Panella

app alquiler amarres embarcaciones


datos Barco normal
    - matricula (string)
    - eslora (double, en pies) es la longitud del barco(eslora de flotacion, eslora de perpendiculares, 
        eslora máxima, eslora total: esta es la que contampla la mayor longitud) 1 pie == 30.48 cms
    - año de fabricacion 
    
    Barcos Especiales
        - Veleros  
            *Nro de mástiles
        
        - Barcos a Motor
            *Potencia en CV

        - Yates de lujo
            *Potencia en CV y nro de camarotes

calculo monto alquiler amarre
    monto barco normal = nro días ocupacion * Modulo Barco( 10* metros de slora)

    monto velero = monto normal + nro de mástiles

    monto Barcos a motor = monto normal + potencia en CV

    monto Yates = monto normal + potencia en CV + nro camarotes

menu para elegir embarcación
metodo carga datos embarcacion
metodos calculo importe alquiler amarre


 */
public class Guia10_Extras_Ejercicio01 {

    public static void main(String[] args) {
 
        
        Utiles util = new Utiles();
        util.menu();

        System.out.println("Fin");
   
}

}
