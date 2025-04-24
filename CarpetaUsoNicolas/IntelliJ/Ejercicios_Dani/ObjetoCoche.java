/*
Proponga tres ejemplos de objetos del mundo real :
Para cada uno de ellos, determine la clase a la que pertenecen.
Asocie a cada clase un identificador descriptivo adecuado.
Enumere varios atributos y operaciones para cada una de las clases
Escriba el código necesario para definir las clases utilizando el lenguaje de programación Java
 */


public class ObjetoCoche {

    public static void main(String[] args) {

        ClaseCoche coche = new ClaseCoche(100, "rojo", "Peugeot", true);

        System.out.println("Los caballos del coche son " + coche.caballos);
        System.out.println("El color del coche es " + coche.color);
        System.out.println("La marca del coche es " + coche.marca);
        System.out.println("El coche está encendido?" + coche.cocheEncendido(coche.estado));

    }


}

