/*
Proponga tres ejemplos de objetos del mundo real :
Para cada uno de ellos, determine la clase a la que pertenecen.
Asocie a cada clase un identificador descriptivo adecuado.
Enumere varios atributos y operaciones para cada una de las clases
Escriba el código necesario para definir las clases utilizando el lenguaje de programación Java
 */

public class ObjetoCuadrado {

    public static void main(String[] args) {

        ClaseCuadrado cuadrado = new ClaseCuadrado(4, "verde");

        System.out.println("El color del cuadrado es " + cuadrado.color);
        System.out.println("Los lados del cuadrado son  " + cuadrado.lados);
        System.out.println("El area es " + cuadrado.area(10));
        System.out.println("La longitud es " + cuadrado.longitud(10, 10, 10, 10));


    }
}
