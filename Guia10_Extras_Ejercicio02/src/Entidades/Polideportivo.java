package Entidades;

import java.util.Scanner;

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
public class Polideportivo extends Edificio {
//atributos

    private String nombre;
    private String tipoInstalacion;

    //constructores
    public Polideportivo() {

    }

    public Polideportivo(double ancho, double largo, double alto, String nombre, String tipoInstalacion) {
        super(ancho, largo, alto);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    //getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    @Override
    public double getAncho() {
        return ancho;
    }

        @Override
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

        @Override
    public double getLargo() {
        return largo;
    }

        @Override
    public void setLargo(double largo) {
        this.largo = largo;
    }

        @Override
    public double getAlto() {
        return alto;
    }

        @Override
    public void setAlto(double alto) {
        this.alto = alto;
    }

    //metodos
    public Polideportivo crearPolideportivo() {
        /*
        TODO METODO PARA CREAR POLIDEPORTIVO
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nombre del Polideportivo: ");
        String nombre1 = leer.nextLine();

        Scanner lee = new Scanner(System.in);
        System.out.println("Ingrese ancho del Polideportivo: ");
        double ancho1 = lee.nextDouble();

        System.out.println("Ingrese largo del Polideportivo: ");
        double largo1 = leer.nextDouble();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese alto del Polideportivo: ");
        double alto1 = teclado.nextDouble();

        String tipoInstalacion1 = null, opcion= null;

        do {
            Scanner leeTeclado = new Scanner(System.in);
            System.out.println("Ingrese el tipo de instalacion: \n"
                    + "Techado = 1\n"
                    + "Abierto = 2\n");
            opcion = leeTeclado.nextLine();
            
            if (opcion.equalsIgnoreCase("1")){
                tipoInstalacion1="Techado";
                break;
            }
            if (opcion.equalsIgnoreCase("2")) {
                tipoInstalacion1="Abierto";
                break;
            }
            System.out.println("La opción ingresada no es válida, inténtelo de nuevo");
        } while (!(opcion.equalsIgnoreCase("1") || opcion.equalsIgnoreCase("2")));

        return new Polideportivo(ancho1, largo1, alto1, nombre1, tipoInstalacion1);
    }

    @Override
    public double calcularSuperficie() {
        double superficie;
        superficie = super.ancho * super.largo;
        return superficie;
    }

    @Override
    public double calcularVolumen() {
        double volumen;
        volumen = super.alto * super.ancho * super.largo;
        return volumen;
    }

    //toString
    @Override
    public String toString() {
        return "Polideportivo: \n"
                + "   Nombre: " + nombre + "\n"
                + "   Tipo Instalación: " + tipoInstalacion + "\n"
                + "   " + super.toString();
    }
}
