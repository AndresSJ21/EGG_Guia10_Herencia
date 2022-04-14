package Utilidades;

import Entidades.BarcoAmotor;
import Entidades.Velero;
import Entidades.YateDeLujo;
import java.util.Date;
import java.util.Scanner;

/*
* Desarrollador: Andrés Panella
 */
public class Utiles {

    public Date ingresaFecha() {
        
        System.out.println("Año");
        Scanner leeAnio = new Scanner(System.in);
        int anio = leeAnio.nextInt();

        System.out.println("Mes");
        Scanner leeMes = new Scanner(System.in);
        int mes = leeMes.nextInt();

        System.out.println("Día");
        Scanner leeDia = new Scanner(System.in);
        int dia = leeDia.nextInt();

        return new Date(anio - 1900, mes - 1, dia);

    }

    public int calculaDias() {

        System.out.println("Ingrese fecha inicio alquiler");
        Date inicio = ingresaFecha();
        System.out.println("Ingrese fecha fin alquiler");
        Date fin = ingresaFecha();
        int dias;
        dias = Math.round((fin.getTime() - inicio.getTime()) / 1000 / 60 / 60 / 24);
        return dias;
    }

    public void menu() {
        String opcion = null;

        do {

            Scanner leer = new Scanner(System.in);
            System.out.println("Menu alquiler amarres");
            System.out.println("Por favor ingrese los datos solicitados a continuación: ");
            System.out.println("   Tipo de embarcacion:\n"
                    + "     1- Velero\n"
                    + "     2- Barco a Motor\n"
                    + "     3- Yate de Lujo");
            int tipoEmbarcacion = leer.nextInt();
            double precioAlquiler;
            if ((tipoEmbarcacion == 1) || (tipoEmbarcacion == 2) || (tipoEmbarcacion == 3)) {

                switch (tipoEmbarcacion) {
                    case 1:
                        Velero v1 = new Velero();
                        v1 = v1.creaVelero();
                        
                        precioAlquiler=v1.calculaImporteAlquiler();
                        System.out.println(v1.toString());
                        System.out.println("El alquiler correspondiente es de "+precioAlquiler+" Pesos\n\n");
                        break;

                    case 2:
                        BarcoAmotor bM1 = new BarcoAmotor();
                        bM1 = bM1.creaBarcoAmotor();
                        precioAlquiler=bM1.calculaImporteAlquiler();
                        System.out.println(bM1.toString());
                        System.out.println("El alquiler correspondiente es de "+precioAlquiler+" Pesos\n\n");
                        
                        break;

                    case 3:
                        YateDeLujo yDl1 = new YateDeLujo();
                        yDl1 = yDl1.creaYateDeLujo();
                        precioAlquiler=yDl1.calculaImporteAlquiler();
                        System.out.println(yDl1.toString());
                        System.out.println("El alquiler correspondiente es de "+precioAlquiler+" Pesos\n\n");
                        break;
                    default:

                }
                System.out.println("Si desea cargar el alquiler de otro Amarre presione S o cualquier otra tecla para salir");
                Scanner lee = new Scanner(System.in);
                opcion = lee.nextLine();

            } else {
                System.out.println("La opción ingresada no es correcta, intentelo nuevamente");
                opcion = "s";
            }

        } while (opcion.equalsIgnoreCase("S"));
    }
}
