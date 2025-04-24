public class Persona implements Educacion {
    int edad;
    String nombre;
    String DNI;


    public Persona(int edad, String DNI, String nombre) {
        this.edad = edad;
        this.DNI = DNI;
        this.nombre = nombre;
    }

    public void despedir() {
        System.out.println("Adios muy buenas :3");
    }

    public void saludar() {
        System.out.println("Hola, soy " + nombre);

    }
}
