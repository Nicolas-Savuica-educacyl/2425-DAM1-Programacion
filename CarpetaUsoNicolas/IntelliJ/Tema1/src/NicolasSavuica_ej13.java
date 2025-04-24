import java.util.Scanner;

public class NicolasSavuica_ej13 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Introduzca el número que desee:");
        int numeroIntroducido = numero.nextInt();
        System.out.println("El número introducido es: " + numeroIntroducido );
        System.out.println("El doble de ese número es " + numeroIntroducido * 2);
        System.out.println("El triple de ese número es " + numeroIntroducido * 3);

    }
}
