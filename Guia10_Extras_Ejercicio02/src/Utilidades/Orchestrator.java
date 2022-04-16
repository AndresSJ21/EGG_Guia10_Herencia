package Utilidades;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;

/*
* Desarrollador: Andrés Panella
 */
public class Orchestrator {

    public ArrayList<Edificio> creaEdificios() {

        ArrayList<Edificio> edificios = new ArrayList<Edificio>();
        Polideportivo p1 = new Polideportivo();
        EdificioDeOficinas eDo1 = new EdificioDeOficinas();
        edificios.add(p1.crearPolideportivo());
        edificios.add(p1.crearPolideportivo());
        edificios.add(eDo1.crearEdificioDeOficinas());
        edificios.add(eDo1.crearEdificioDeOficinas());

        return edificios;
    }

    public String datosEdificios(ArrayList<Edificio> edificios) {
        int count = 0, techados = 0;

        for (Edificio aux : edificios) {
            System.out.println("\n\n"+aux.toString());
            if (aux instanceof EdificioDeOficinas) {

                System.out.println("Superficie: " + aux.calcularSuperficie());
                System.out.println("Volumen: " + aux.calcularVolumen());
                for (int i = 0; i < ((EdificioDeOficinas) aux).getCantPisos() + 1; i++) {
                    System.out.println("En el piso " + i + " hay " + ((EdificioDeOficinas) aux).calcularPersonasPorPiso(i)+ " personas");
                }
                System.out.println("En el edificio hay " + ((EdificioDeOficinas) aux).calcularPersonasTotal()+" personas en total\n\n");
            }
            if (aux instanceof Polideportivo) {
                System.out.println("Superficie: " + aux.calcularSuperficie());
                System.out.println("Volumen: " + aux.calcularVolumen()+"\n\n");
                count++;
                if (((Polideportivo) aux).getTipoInstalacion().equalsIgnoreCase("Techado")) {
                    techados++;
                }

            }

        }
        return "De los " + count + " Polideportivos, la cantidad de techados es " + techados;
    }

}
