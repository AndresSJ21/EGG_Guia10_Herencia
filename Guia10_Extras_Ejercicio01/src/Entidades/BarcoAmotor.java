package Entidades;

import Interfaces.CalculoAlquiler;
import Utilidades.Utiles;
import java.util.Scanner;

/*
* Desarrollador: Andrés Panella
 */
public class BarcoAmotor extends Embarcacion implements CalculoAlquiler {
//atributos

    private int potenciaMotor;

//constructores
    public BarcoAmotor() {

    }

    public BarcoAmotor(String matricula, double slora, int anhoFabricacion, int potenciaMotor) {
        super(matricula, slora, anhoFabricacion);
        this.potenciaMotor = potenciaMotor;
    }

//getters and setters
    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
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
    public BarcoAmotor creaBarcoAmotor() {
        System.out.println("Ingrese los datos del Barco a Motor: ");
        Embarcacion e1 = new Embarcacion();
        e1 = e1.creaEmbarcacion();
        Scanner leer = new Scanner(System.in);
        System.out.println("Potencia del Motor en CV: ");
        int potenciaMotor = leer.nextInt();
        return new BarcoAmotor(e1.getMatricula(), e1.getSlora(), e1.getAnhoFabricacion(), potenciaMotor);
    }

    @Override
    public double calculaImporteAlquiler() {
        Utiles util = new Utiles();
        double precio = 0;
        double precioBase = util.calculaDias() * 10 * this.slora;
        precio = precioBase + this.potenciaMotor;
        return precio;
    }

//toString
    @Override
    public String toString() {
        return "Embarcación:\n"
                + "   Tipo: Barco a Motor\n"
                + "     Matricula: " + super.getMatricula() + "\n"
                + "     Slora: " + super.getSlora() + "\n"
                + "     Año de Fabricacion: " + super.getAnhoFabricacion() + "\n"
                + "     Potencia del Motor: " + potenciaMotor + " CV";
    }

}
