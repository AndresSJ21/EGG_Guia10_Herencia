
package Entidades;

import java.util.ArrayList;
import java.util.List;

/*
* Desarrollador: Andrés Panella
 +           - Polideportivo
                Atributos:
                    Nombre:
                    TipoDeInstalacion (Techado o Abierto)
                    super(ancho, alto, largo)
                Metodos
                    calcularSuperficie
                    clacularVolumen

*/

public class Polideportivo extends Edificio{
//atributos
    private String nombre;
    private Enum tipoInstalacion;
    
    //constructores
    public Polideportivo (){
        
    }
    public Polideportivo (double ancho, double largo, double alto, String nombre, Enum tipoInstalacion){
        super(ancho, largo, alto);
        this.nombre=nombre;
        this.tipoInstalacion=tipoInstalacion;
    }
    
    //getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Enum getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(Enum tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    //metodos
    
    public Polideportivo crearPolideportivo(){
        /*
        TODO METODO PARA CREAR POLIDEPORTIVO
        */
    }
    
    
    
    @Override
    public double calcularSuperficie (double ancho, double largo){
        double superficie;
        superficie=super.ancho*super.largo;
        return superficie;
    }
    
    @Override
    public double calcularVolumen(double ancho, double largo, double alto){
        double volumen;
        volumen=super.alto*super.ancho*super.largo;
        return volumen;
    }
    
    //toString
    @Override
    public String toString(){
        return "Polideportivo: \n"
                + "   Nombre: " + nombre + "\n"
                + "   Tipo Instalación: " + tipoInstalacion + "\n"
                + "   " + super.toString();
    }
}
