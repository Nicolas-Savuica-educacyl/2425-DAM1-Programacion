/*
Proponga tres ejemplos de objetos del mundo real :
Para cada uno de ellos, determine la clase a la que pertenecen.
Asocie a cada clase un identificador descriptivo adecuado.
Enumere varios atributos y operaciones para cada una de las clases
Escriba el código necesario para definir las clases utilizando el lenguaje de programación Java
 */


public class ObjetoMesa {

    public static void main(String[] args) {

        ClaseMesa mesa = new ClaseMesa(4, "Madera", "Amarillo", 20);

        System.out.println("La mesa tiene " + mesa.getPatas());
        System.out.println("El material de la mesa es " + mesa.getMaterial());
        System.out.println("El color de la mesa es " + mesa.getColor());
        System.out.println("El area de la mesa es " + mesa.area());

    }
}
