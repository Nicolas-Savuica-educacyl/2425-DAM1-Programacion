import java.util.Scanner;

//Programa que lea dos números por teclado y muestre el resultado de la división del primero por el segundo. :3//
public class NicolasSavuica_ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce dos números separados, porfavor");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("La division entre los números es: " + (num2 == 0 ? "El Divisor no puede ser cero, intente de nuevo:" : num1 / num2));

        sc.close();
    }
}
