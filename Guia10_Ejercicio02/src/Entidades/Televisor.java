package Entidades;

import Enumeradores.Colores;
import Enumeradores.EficienciaEnergetica;
import java.util.Scanner;

public class Televisor extends Electrodomestico {

    //atributos
    protected Double resolucion;
    protected Boolean sintonizadorTDT;

    //constructores
    public Televisor() {
    }

    public Televisor(Double resolucion, Boolean sintonizadorTDT, Double precio, Colores color, EficienciaEnergetica consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    //getters and setters
    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor creaTelevisor() {

        Televisor tele1 = new Televisor();
        tele1.crarElectrodomestico();

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la resolucion de la TV en pulgadas");
        tele1.resolucion = leer.nextDouble();
        String opcion = null;
        do {
            Scanner lee = new Scanner(System.in);
            System.out.println("Indique si la TV cuenta con sintonizador TDT: S o N ");
            opcion = lee.nextLine();
            if (opcion.equalsIgnoreCase("s")) {
                tele1.sintonizadorTDT = true;
            } else if (opcion.equalsIgnoreCase("n")) {
                tele1.sintonizadorTDT = false;
            } else {
                System.out.println("dato incorrecto, vuelva a intentar");
                opcion = "volver a pedir dato";
            }
        } while (opcion.equalsIgnoreCase("volver a pedir dato"));
        return tele1;

    }

    @Override
    public Double precioFinal(){
        
   Double precioF =super.precioFinal();
   if(this.resolucion>40){
       precioF *= 1.3;
   }
    if (this.sintonizadorTDT){
        precioF +=  500;
    }    
    return precioF;
    }
    
    //toString

    @Override
    public String toString() {
        return "Televisor{" + "resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT +", Color: "+ super.color+""
                + "\nConsumo Energético: "+ super.consumoEnergetico +", Peso: "+ super.peso+'}';
    }

}
