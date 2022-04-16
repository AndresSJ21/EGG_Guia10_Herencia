
package guia10_extras_ejercicio02;

import Entidades.Edificio;
import Utilidades.Orchestrator;
import java.util.ArrayList;


/*
* Desarrollador: Andrés Panella
*/

public class Guia10_Extras_Ejercicio02 {


    public static void main(String[] args) {
        Orchestrator o = new Orchestrator();
        ArrayList<Edificio> e = new ArrayList<Edificio>();
        e=o.creaEdificios();
        System.out.println(o.datosEdificios(e));
    }

}
/*

SuperClase Edificio
atributos:
    ancho
    alto
    largo

Metodos:
    calcuarSuperficie(). Calcula superficie del edificio
    calcularVolumen(). Calcula volumen del edificio
        SubClases:
 +           - Polideportivo
                Atributos:
                    Nombre:
                    TipoDeInstalacion (Techado o Abierto)
                    super(ancho, alto, largo)
                Metodos
                    calcularSuperficie
                    clacularVolumen

            - Edificio de Oficinas
                Atributos:
                    nro de oficinas
                    cantidad de personas por oficina
                    nro de pisos
                    super(ancho, alto, largo)
                Métodos
                    calcularSuperficie
                    calcularVolumen
                    cantidadPersonas
                            calcula y muestra personas máximas en edificio (según las que entren en cada oficina y cuantas oficinas por piso)
                            calcula y muestra cantidad de personas por piso
                    
            - en el Main:
                crear ArrayList de tipo Edificio
                    - dos polideportivos
                    - dos edificios de oficinas
                recorrer ArrayList para:
                    - calcular y mostrar volumen y superficie para cada elemento
                    - contabilizar polideportivos techados y abiertos
                    - para los edificios de oficinas ejecutar cantidadPersonas
*/