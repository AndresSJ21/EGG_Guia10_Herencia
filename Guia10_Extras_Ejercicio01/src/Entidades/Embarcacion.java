
package Entidades;

import java.util.Scanner;

/*
* Desarrollador: Andrés Panella
*/

public class Embarcacion {
//atributos
    protected String matricula;
    protected double slora;
    protected int anhoFabricacion;
    
//constructores
    public Embarcacion(){
        
    }
    public Embarcacion(String matricula, double slora, int anhoFabricacion){
        this.matricula=matricula;
        this.slora=slora;
        this.anhoFabricacion=anhoFabricacion;
    }
    
//getters and setters

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSlora() {
        return slora;
    }

    public void setSlora(double slora) {
        this.slora = slora;
    }

    public int getAnhoFabricacion() {
        return anhoFabricacion;
    }

    public void setAnhoFabricacion(int anhoFabricacion) {
        this.anhoFabricacion = anhoFabricacion;
    }
    
    
//metodos
    public Embarcacion creaEmbarcacion(){
        System.out.println("Ingrese datos de la embarcación a cargar:");
        System.out.println("   Matricula:");
        Scanner leer = new Scanner(System.in);
        String matricula = leer.nextLine();
        
        System.out.println("   Slora en metros:");
        Scanner lee = new Scanner(System.in);
        double slora = lee.nextDouble();
        
        System.out.println("   Año de Fabricación:");
        int anhoFabricacion = lee.nextInt();
        
        return new Embarcacion (matricula, slora, anhoFabricacion);
    }
    
    
    
    
//toString

    @Override
    public String toString() {
        return "Embarcacion{" + "matricula=" + matricula + ", slora=" + slora + ", anhoFabricacion=" + anhoFabricacion + '}';
    }

}
