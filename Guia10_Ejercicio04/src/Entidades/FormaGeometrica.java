
package Entidades;

import java.util.Scanner;

/*
* Desarrollador: Andrés Panella
*/

public class FormaGeometrica {
//atributos
   private String nombre;
   private int dimensiones;

// constructores

public FormaGeometrica(){
    
}   

public FormaGeometrica(String nombre, int dimensiones){
    this.nombre=nombre;
    this.dimensiones=dimensiones;
}
   
//getters and setters 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(int dimensiones) {
        this.dimensiones = dimensiones;
    }

    
    //metodos
    public FormaGeometrica crearFormaGeometrica(){
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese nombre de la forma geométrica a cargar: ");
        String nombre = leer.nextLine();
        
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingrese la dimensión de la forma geométrica, 1, 2 o 3: ");
        int dimension = lee.nextInt();
            
        
        return new FormaGeometrica(nombre, dimension);
    }
    
    
//toString

    @Override
    public String toString() {
        return "FormaGeometrica{" + "nombre=" + nombre + ", dimensiones=" + dimensiones + '}';
    }
    

}

