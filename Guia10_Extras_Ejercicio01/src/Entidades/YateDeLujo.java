package Entidades;

import Interfaces.CalculoAlquiler;
import Utilidades.Utiles;
import java.util.Scanner;

/*
* Desarrollador: Andrés Panella
 */
public class YateDeLujo extends Embarcacion implements CalculoAlquiler{
//atributos

    private int potenciaMotor;
    private int nroCamarotes;

//constructores
    public YateDeLujo() {

    }

    public YateDeLujo(String matricula, double slora, int anhoFabricacion, int potenciaMotor, int nroCamarotes) {
        super(matricula, slora, anhoFabricacion);
        this.potenciaMotor = potenciaMotor;
        this.nroCamarotes = nroCamarotes;
    }

//getters and setters
    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public int getNroCamarotes() {
        return nroCamarotes;
    }

    public void setNroCamarotes(int nroCamarotes) {
        this.nroCamarotes = nroCamarotes;
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
    public YateDeLujo creaYateDeLujo() {
        System.out.println("Ingrese los datos del Yate: ");
        Embarcacion e1 = new Embarcacion();
        e1 = e1.creaEmbarcacion();
        Scanner leer = new Scanner(System.in);
        System.out.println("Potencia del Motor en CV: ");
        int potenciaMotor = leer.nextInt();
        System.out.println("Cantidad de Camarotes ");
        Scanner lee = new Scanner(System.in);
        int nroCamarotes = lee.nextInt();
        return new YateDeLujo(e1.getMatricula(), e1.getSlora(), e1.getAnhoFabricacion(), potenciaMotor, nroCamarotes);
    }

    
        @Override
    public double calculaImporteAlquiler(){
        Utiles util = new Utiles();
        double precio = 0;
        double precioBase=util.calculaDias()*10*this.slora;
        precio = precioBase + this.potenciaMotor + this.nroCamarotes;
        return precio; 
    }
    
    
//toString
    @Override
    public String toString() {
        return "Embarcación:\n"
                + "   Tipo: Yate de lujo\n"
                + "     Matricula: " + super.getMatricula() + "\n"
                + "     Slora: " + super.getSlora() + "\n"
                + "     Año de Fabricacion: " + super.getAnhoFabricacion() + "\n"
                + "     Potencia del Motor:" + potenciaMotor + " CV\n"
                + "     Número de Camarotes: " + nroCamarotes;
    }

}
