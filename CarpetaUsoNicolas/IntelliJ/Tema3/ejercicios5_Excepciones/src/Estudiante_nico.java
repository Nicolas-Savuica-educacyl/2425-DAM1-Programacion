import java.util.Scanner;

public class Estudiante_nico {
    public static void main(String[] args) {
        Estudiante nico = new Estudiante();
        try {
            Scanner nicoScan = new Scanner(System.in);

            System.out.println("Pon la edad del estudiante");
            nico.EstablecerEdad(nicoScan.nextInt());
            System.out.println("Ahora el nombre");
            nico.EstablecerNombre(nicoScan.next());
        } catch (EdadInvalidaException e){
            System.out.println("Que dices, esa edad no me la creo yo");
        } catch (NombreInvalidoException e){
            System.out.println("pero pon un nombre, no?");        }
    }
}