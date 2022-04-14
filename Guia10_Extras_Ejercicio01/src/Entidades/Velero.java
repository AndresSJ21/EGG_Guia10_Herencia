
package Entidades;


import Interfaces.CalculoAlquiler;
import Utilidades.Utiles;
import java.util.Date;
import java.util.Scanner;

/*
* Desarrollador: Andrés Panella
*/

public class Velero extends Embarcacion implements CalculoAlquiler{
//atributos
    private int nroMastiles;
    
//constructores
    public Velero(){
        
    }
    
    public Velero (String matricula, double slora, int anhoFabricacion, int nroMastiles){
        super(matricula, slora, anhoFabricacion);
        this.nroMastiles=nroMastiles;
    }
    
    
//getters and setters
    
    public int getNroMastiles() {
        return nroMastiles;
    }

    public void setNroMastiles(int nroMastiles) {
        this.nroMastiles = nroMastiles;
    }

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
    public Velero creaVelero(){
        System.out.println("Ingrese los datos del Velero: ");
        Embarcacion e1=new Embarcacion();
        e1=e1.creaEmbarcacion();
        Scanner leer = new Scanner(System.in);
        System.out.println("Número de mástiles: ");
        int cantMastiles=leer.nextInt();
        return new Velero(e1.getMatricula(), e1.getSlora(), e1.getAnhoFabricacion(), cantMastiles);
    }
       
    
    @Override
    public double calculaImporteAlquiler(){
        Utiles util = new Utiles();
        double precio = 0;
        double precioBase=util.calculaDias()*10*this.slora;
        precio = precioBase + this.nroMastiles;
        return precio; 
    }
    
//toString

    @Override
    public String toString() {
        return "Embarcación:\n"
                + "   Tipo: Velero\n"
                + "     Matricula: " + super.getMatricula() + "\n"
                + "     Slora: " + super.getSlora() + "\n"
                + "     Año de Fabricacion: " + super.getAnhoFabricacion() + "\n"
                + "     Número de mástiles: " + nroMastiles;
    }

    
}
