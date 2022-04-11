
package Entidades;

import Enumeradores.Colores;
import Enumeradores.EficienciaEnergetica;
import java.util.Scanner;

/*
* Desarrollador: Andrés Panella
*/

public class Lavadora extends Electrodomestico{
  //atributos
    protected int carga;
    
    
    //constructores
    public Lavadora() {
    }

    public Lavadora(int carga, Double precio, Colores color, EficienciaEnergetica consumoEnergetico, Double peso) {
        super(precio, color,consumoEnergetico,peso);
        this.carga = carga;
    }

    //getters and setters
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
   
    public Lavadora crearLavadora (){
        
        Lavadora lava1=new Lavadora();
        Scanner leer = new Scanner(System.in);
        lava1.crarElectrodomestico();
        System.out.println("Ingrese los kilos de carga admitidos");
        this.carga=leer.nextInt();
        return lava1;
        
    }
    
    
    @Override
    public String toString() {
        return "Lavadora:\n"
                + "" + "carga=" + carga + ", Color: "+super.color +""
               + "\nConsumo Energético: "+ super.consumoEnergetico + ", Peso: "+super.peso;
    }
    
    
}
