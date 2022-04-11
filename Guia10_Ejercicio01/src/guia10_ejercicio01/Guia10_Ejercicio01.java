package guia10_ejercicio01;


import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;



public class Guia10_Ejercicio01 {

    public static void main(String[] args) {
Animal perro = new Perro ("Stich", "Carnivoro", 15, "Doberman");
perro.Alimentarse();
Perro perro1=new Perro("Teddy","Croquetas",10,"Chihuahua");
perro1.Alimentarse();

Animal gato = new Gato ("Pelusa","Galletas",15,"Siames");
gato.Alimentarse();
Animal caballo = new Caballo ("Spark","Pasto",25,"Fino");
caballo.Alimentarse();


    }

}
