
package Entidades;

import Interfaces.CalculosGeometricos;
import java.util.Scanner;




/*
* Desarrollador: Andrés Panella
*/

public class Circulo extends FormaGeometrica implements CalculosGeometricos{
    
    //atributos
    private double radio;
    private double areaCirculo;
    private double perimetroCirculo;
    static final double pi = 3.1415;
    
    //constructores
    public Circulo (){
    }   
    public Circulo (double radio, String nombre, int dimensiones){
        super(nombre, dimensiones);
        this.radio=radio;
    }
    
    //getters and setters
    public double getRadio(){
        return radio;
    }
    
    public void setRadio(double radio){
        this.radio=radio;
    }
    
    public double getAreaCirculo(){
        return areaCirculo;
    }
    
    public void setAreaCirculo(double areaCirculo){
        this.areaCirculo=areaCirculo;
    }
    
    public double getPerimetroCirculo (){
        return perimetroCirculo;
    }
    
    public void setPerimetroCirculo(double perimetroCirculo){
        this.perimetroCirculo=perimetroCirculo;
    }
    
    
        //metodos
    public Circulo crearCirculo (){
        FormaGeometrica fG=new FormaGeometrica();
        FormaGeometrica fG1;
        fG1=fG.crearFormaGeometrica();
        Scanner leer = new Scanner(System.in);
        System.out.println("Crearemos un "+ fG1.getNombre());
        System.out.println("Ingrese el radio en cm: ");
        double radio = leer.nextInt();
        return new Circulo(radio, fG1.getNombre(), fG1.getDimensiones());
        
    }
    
    
    //implementamos las interfaces
    @Override
    public double area(){
        areaCirculo = pi * radio * radio;
        return areaCirculo;
    }

    @Override
    public double perimetro() {
        perimetroCirculo=2*pi*radio;
        return perimetroCirculo;
               
    }

@Override
    public String toString() {
        return "Forma Geométrica: "+ super.getNombre()+"\n"
                + "     Dimensiones: "+ super.getDimensiones()+"\n"
                + "     Radio: " + radio + "\n"
                + "     Área: " + areaCirculo + ", Perímetro: " + perimetroCirculo+"\n\n";
    }

    
    
    
    
    
}
