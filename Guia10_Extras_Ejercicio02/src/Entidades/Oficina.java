
package Entidades;

import java.util.Scanner;

/*
* Desarrollador: Andrés Panella
*/

public class Oficina {
    //atributos
    private int idOficina;
    private int factorOcupacion;
    private int piso;
    
    //constructores
    public Oficina(){
        
    }
    public Oficina(int idOficina, int factorOcupacion, int piso){
        this.idOficina=idOficina;
        this.factorOcupacion=factorOcupacion;
        this.piso=piso;
    }
    
    //getters and setters

    public int getIdOficina() {
        return idOficina;
    }

    public void setIdOficina(int idOficina) {
        this.idOficina = idOficina;
    }

    public int getFactorOcupacion() {
        return factorOcupacion;
    }

    public void setFactorOcupacion(int factorOcupacion) {
        this.factorOcupacion = factorOcupacion;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }
    
    
    //metodo
    
    public Oficina creaOficina (){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nro de oficina: ");
        int idOficina= leer.nextInt();
        leer=null;
        System.out.println("Ingrese el factor de ocupación: ");
        int factorOcupacion=leer.nextInt();
        leer=null;
        System.out.println("Ingrese el piso en el que se encuentra la oficina: ");
        int piso = leer.nextInt();
        
        return new Oficina (idOficina, factorOcupacion, piso);
    }
    
    @Override
    public String toString (){
        return "Oficina: " + idOficina + ", Piso: " + piso +  ", Factor de Ocupacion: " + factorOcupacion+"\n";
    }
    
    
}
