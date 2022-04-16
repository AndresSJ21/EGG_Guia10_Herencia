
package Entidades;

/*
* Desarrollador: Andrés Panella
*/

public abstract class Edificio {
    //atributos
    protected double ancho;
    protected double largo;
    protected double alto;
    
    //constructores
    public Edificio(){
        
    }
    public Edificio(double ancho, double largo, double alto){
        this.largo=largo;
        this.ancho=ancho;
        this.alto=alto;
    }

    //getters and setters

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
    
    
    
    
    //metodos abstractos
    public abstract double calcularSuperficie();

    /**
     *
     * @return
     */
    public abstract double calcularVolumen();
    
    //toString
    @Override
    public String toString (){
        
        return "Ancho: " + ancho + ", Largo: " + largo + ", Alto: " + alto;
    }
    
    
    
    
}
