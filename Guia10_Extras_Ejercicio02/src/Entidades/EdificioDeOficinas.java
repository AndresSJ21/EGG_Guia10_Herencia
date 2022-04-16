package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

/*
* Desarrollador: Andrés Panella
- Edificio de Oficinas
                Atributos:
                    nro de oficinas
                    cantidad de personas por oficina
                    nro de pisos
                    super(ancho, alto, largo)
                Métodos
                    calcularSuperficie
                    calcularVolumen
                    cantidadPersonas
                            calcula y muestra personas máximas en edificio (según las que entren en cada oficina y cuantas oficinas por piso)
                            calcula y muestra cantidad de personas por piso
                    
 */
public class EdificioDeOficinas extends Edificio {

    //atributos
    private int nroDeOficinas;
    private ArrayList<Oficina> oficinas;
    private int cantPisos;

    //construstores
    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(double ancho, double largo, double alto, int nroDeOficinas, ArrayList<Oficina> oficinas, int cantPisos) {
        super(ancho, largo, alto);
        this.nroDeOficinas = nroDeOficinas;
        this.oficinas = oficinas;
        this.cantPisos = cantPisos;
    }

    //getters and setters
    public int getNroDeOficinas() {
        return nroDeOficinas;
    }

    public void setNroDeOficinas(int nroDeOficinas) {
        this.nroDeOficinas = nroDeOficinas;
    }

    public ArrayList<Oficina> getOficinas() {
        return oficinas;
    }

    public void setOficinas(ArrayList<Oficina> oficinas) {
        this.oficinas = oficinas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
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
    public EdificioDeOficinas crearEdificioDeOficinas() {
        /*
        1- definir cantidad de pisos
        2- definir cantidad de oficinas por piso
            a- una misma cantidad para todos los pisos
            b- cantidad custumizada
        3- definir factor de ocupacion para cada oficina
            a- una misma cantidad para dosos los pisos
            b- cantidad customizada por oficina
        4- crear un edificio padre
         */

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el ancho del edificio: ");
        super.ancho = leer.nextDouble();
      
        System.out.println("Ingrese el largo del edificio: ");
        super.largo = leer.nextDouble();
    
        System.out.println("Ingrese el alto del edificio: ");
        super.alto = leer.nextDouble();
  
        System.out.println("Ingrese cantidad de pisos: ");
        int cantPisos = leer.nextInt();


        
        String opcion;
        int cantOficinas;
        int nroOficina;
        ArrayList<Oficina> offices = new ArrayList<Oficina>();
        
        do {
            System.out.println("Desea que todos los pisos tengan la misma cantidad de oficinas? ");
            System.out.println("Ingrese S para misma cantidad o N para elegir piso a piso: ");
                Scanner tecla = new Scanner(System.in);
                opcion = tecla.nextLine();
            if ((opcion.equalsIgnoreCase("S") ) || (opcion.equalsIgnoreCase("s"))) {
                System.out.println("Ingrese la cantidad de oficinas por piso: ");
                cantOficinas = leer.nextInt();
               
                System.out.println("Ingrese la cantidad de personas por oficina: ");
                int cantPersonas = leer.nextInt();
                
                for (int i = 0; i < (cantPisos + 1); i++) {
                    for (int j = 0; j < cantOficinas; j++) {
                        nroOficina=i*100+j+1;
                        offices.add(new Oficina(nroOficina, cantPersonas, i));
                    }
                }
            break;
            
            } else if ((opcion.equalsIgnoreCase("N") ) || (opcion.equalsIgnoreCase("n"))) {
                for (int i = 0; i < (cantPisos + 1); i++) {
                    System.out.println("Ingrese la cantidad de oficinas para el piso " + i);
                    cantOficinas = leer.nextInt();
                    
                    for (int j = 0; j < cantOficinas; j++) {
                        nroOficina=i*100+j+1;
                        System.out.println("Ingrese la cantidad de personas para la oficina "+nroOficina);
                        int cantPersonas = leer.nextInt();
                       
                        offices.add(new Oficina(nroOficina, cantPersonas, i));
                    }
                }
             break;       
            }
            System.out.println("No ha ingresado una opcion valida, inténtelo nuevamente"); 
        } while (!(opcion.equalsIgnoreCase("S") || opcion.equalsIgnoreCase("N")));
        
        return new EdificioDeOficinas(super.getAncho(), super.getLargo(), super.getAlto(), offices.size(), offices, cantPisos);
    }

    @Override
    public double calcularSuperficie() {
        double superficie;
        superficie = super.largo * super.ancho;
        return superficie;
    }

    @Override
    public double calcularVolumen() {
        double volumen;
        volumen = super.ancho * super.largo * super.alto;
        return volumen;
    }

    public int calcularPersonasPorPiso(int nroPiso) {
        int personasPorPiso = 0;
        for (Oficina oficina : oficinas) {
            if (nroPiso == oficina.getPiso()) {
                personasPorPiso += oficina.getFactorOcupacion();
            }
        }
        return personasPorPiso;
    }

    public int calcularPersonasTotal() {
        int personasTotal = 0;
        for (Oficina oficina : oficinas) {
            personasTotal += oficina.getFactorOcupacion();
        }
        return personasTotal;
    }

    //toString
    @Override
    public String toString() {
        return "Edificio De Oficinas: \n"
                + "  Dimensiones: \n"
                + "     Ancho: " + super.ancho + " mts\n"
                + "     Largo: " + super.largo + " mts\n"
                + "     Alto:  " + super.alto + " mts\n"
                + "  Cantidad de pisos: " + cantPisos + "\n"
                + "  Nro de Oficinas: " + nroDeOficinas + "\n"
                + "  Listado Oficinas: \n"
                + "    " + oficinas.toString() + "\n";

    }

}
