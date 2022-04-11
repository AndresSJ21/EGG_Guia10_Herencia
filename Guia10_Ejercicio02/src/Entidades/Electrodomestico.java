
package Entidades;

import Enumeradores.Colores;
import Enumeradores.EficienciaEnergetica;
import java.util.Scanner;


public class Electrodomestico {
    //atributos
    protected Double precio;
    protected Colores color;
    protected EficienciaEnergetica consumoEnergetico;
    protected Double peso;

    
    //constructores
    public Electrodomestico(Double precio, Colores color, EficienciaEnergetica consumoEnergetico, Double peso) {
        this.precio=precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Electrodomestico() {
    }
    
    
    //getters and setters

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public EficienciaEnergetica getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(EficienciaEnergetica consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
       
    
    
    
    public void crarElectrodomestico() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese color del electrodoméstico: Blanco, Rojo, Azul, Negro, Gris");
        this.color = comprobarColor(leer.next().toUpperCase());

        Scanner lee = new Scanner(System.in);
        System.out.println("Ingrese clasificación según consumo energético: A, B, C, D, E");
        this.consumoEnergetico = comprobarConsumoEnergetico(lee.next().toUpperCase().charAt(0));

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el peso del equipo");
        this.peso = teclado.nextDouble();
        this.precio = 1000d;
        

    }

    public Colores comprobarColor(String color) {

        Colores color1 = Colores.BLANCO;
        for (Colores value : Colores.values()) {
            if (color.equalsIgnoreCase(value.name())) {
                color1 = Colores.valueOf(color);
            }
        }
        return color1;
    }

    public EficienciaEnergetica comprobarConsumoEnergetico(char letra) {

        EficienciaEnergetica letraConsumo = EficienciaEnergetica.F;
        for (EficienciaEnergetica eficiencia : EficienciaEnergetica.values()) {
            if (letra == eficiencia.name().charAt(0)) {
                letraConsumo = eficiencia;
            }
        }
        return letraConsumo;

    }

    public Double precioFinal() {
             
        Double precio1=0d;
        switch (consumoEnergetico) {
            case A:
                precio1=1000d;
                break;
                
            case B:
                precio1=800d;
                break;
            
            case C:
                precio1=600d;
                break;
                
            case D: 
                precio1=500d;
                break;
                
            case E: 
                precio1=300d;
                break;
                
            case F: 
                precio1=100d;
                break;  
        }
        if(peso>=80d){
            precio1+=1000d;
        }else if(peso>=50){
            precio1+=800d;
        }else if(peso>=20){
            precio1+=500d;
        }else if(peso>=1){
            precio1+=100d;
        }
        precio=(precio1+precio);
        return precio;
    }
    //toString

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
    
}
