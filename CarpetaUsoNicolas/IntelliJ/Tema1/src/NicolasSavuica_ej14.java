import java.util.Scanner;

public class NicolasSavuica_ej14 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Introduzca el número que desee:");
        int numeroIntroducido = numero.nextInt();
        System.out.println("El número introducido es: " + numeroIntroducido );
        System.out.println("El doble de ese número es " + numeroIntroducido * 2);
        System.out.println("El triple de ese número es " + numeroIntroducido * 3);

        System.out.println("Introduzca Su dirección:");
        String direccionIntroducida = numero.next();
        System.out.println("Su dirección es: " + direccionIntroducida );

        System.out.println("Introduzca su numero telefonico:");
        int movilIntroducido = numero.nextInt();
        System.out.println("El número introducido es: " + movilIntroducido );
    }
}
