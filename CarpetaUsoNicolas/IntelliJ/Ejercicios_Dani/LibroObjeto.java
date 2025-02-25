/*
Define una clase libro que pueda ser utilizada para representar los libroa que hay
en una biblioteca. Supón que cada libro tiene los siguientes atributos:
Título, Autor, Año de publicación, Editorial, ISBN.

Escribe una clase con un metodo main y al final muestre los datos sobreescribiendo el metodo toString
 */


public class LibroObjeto {

    public static void main(String[] args) {

        ClaseLibro lib = new ClaseLibro("El Quijote", "Cervantes", 1605, "Null", 123456);

        System.out.println("El título es " + lib.titulo);
        System.out.println("El autor es " + lib.autor);
        System.out.println("El año de publicacion es " + lib.anoDePublicacion);
        System.out.println("La editorial es " + lib.editorial);
        System.out.println("El ISBN es " + lib.isbn);

        ClaseLibro lib2= new ClaseLibro("Cien años de Soledad", "Gabriel Garcia Marquez", 1967, "Null",161616161);

        System.out.println(lib2);// sobreescribo el metodo toString
    }
}
