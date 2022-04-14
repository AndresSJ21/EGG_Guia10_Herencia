package Entidades;

import Interfaces.CalculosGeometricos;
import java.util.Scanner;

/*
* Desarrollador: Andrés Panella
 */
public class Rectangulo extends FormaGeometrica implements CalculosGeometricos {

    //atributos
    private double base;
    private double altura;
    private double areaRectangulo;
    private double perimetroRectangulo;

    //constructores
    public Rectangulo() {

    }

    public Rectangulo(double base, double altura, String nombre, int dimensiones) {
        super(nombre, dimensiones);
        this.base = base;
        this.altura = altura;
    }

    //setters and getters
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getareaRectangulo() {
        return areaRectangulo;
    }

    public double getperimetroRectangulo() {
        return perimetroRectangulo;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setAreaRectangulo(double areaRectangulo) {
        this.areaRectangulo = areaRectangulo;
    }

    public void setPerimetroRectangulo(double perimetroRectangulo) {
        this.perimetroRectangulo = perimetroRectangulo;
    }

    
    //metodos
    public Rectangulo crearRectangulo (){
        FormaGeometrica fG=new FormaGeometrica();
        FormaGeometrica fG1;
        fG1=fG.crearFormaGeometrica();
        Scanner leer = new Scanner(System.in);
        System.out.println("Crearemos un "+ fG1.getNombre());
        System.out.println("Ingrese la longitud de la base en cm: ");
        double base= leer.nextInt();
        Scanner lee= new Scanner(System.in);
        System.out.println("Ingrese la longitud de la altura en cm: ");
        double altura= lee.nextInt();
        return new Rectangulo(base, altura, fG1.getNombre(), fG1.getDimensiones());
        
    }
    
    
    
    
    
    //implementamos las interfaces
    @Override
    public double area(){
        areaRectangulo = base * altura;
        return areaRectangulo;
    }

    @Override
    public double perimetro() {
        perimetroRectangulo = (2 * base) + (2 * altura);
        return perimetroRectangulo;

    }

    @Override
    public String toString() {
        return "Forma Geométrica: "+ super.getNombre()+"\n"
                + "     Dimensiones: "+ super.getDimensiones()+"\n"
                + "     base: " + base + ", altura: " + altura + "\n"
                + "     Área: " + areaRectangulo + ", Perímetro: " + perimetroRectangulo+"\n\n";
    }

    
    
    
}
