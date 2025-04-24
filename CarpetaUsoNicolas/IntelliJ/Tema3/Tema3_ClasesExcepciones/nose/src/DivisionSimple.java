import java.util.NoSuchElementException;
import java.util.Scanner;

public class DivisionSimple {

    public static float realizarDivision(String cadena1, String cadena2) {
        float numero1 = Float.parseFloat(cadena1);
        float numero2 = Float.parseFloat(cadena2);

        if (numero2 == 0) {
            throw new ArithmeticException("No puedes dividir por cero.");
        }
        return numero1 / numero2;

    }

    public static void main(String[] args) {
        try (Scanner nicoScan = new Scanner(System.in)) {
            String cadena1;
            String cadena2;
            System.out.println("Escribe el primer numero");
            cadena1 = nicoScan.nextLine();

            System.out.println("Escribe el segundo numero");
            cadena2 = nicoScan.nextLine();


            System.out.println(" El resultado de la división es: " + realizarDivision(cadena1, cadena2));

        } catch (NoSuchElementException | IllegalStateException e) {
            System.out.println("COMO QUE NO HAS PUESTO NADA");
        } catch (NumberFormatException e) {
            System.out.println("Que es lo que has puesto que no es un numero, eh?");
        } catch (ArithmeticException e) {
            System.out.println("no puedes dividir por cerooooooo");

        }
    }
}
