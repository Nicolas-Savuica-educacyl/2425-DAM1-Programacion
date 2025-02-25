import java.util.Scanner;

//programa que pida cuál es el radio de una circunferencia y nos calcule cuál es la longitud y el área. //
public class NicolasSavuica_ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduzca su peso, porfavor");
        double peso = sc.nextDouble();

        System.out.println("Su peso en la luna es: " + (peso / 9.81 * 1.62) + "Kg");
        sc.close();

    }
}
