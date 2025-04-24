import java.util.Scanner;

public class NicolasSavuica_ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un número, porfavor");
        int C = sc.nextInt();
        System.out.println(C >= 0 ? "El número es positivo" : "El número es negativo");
        System.out.println(C % 2 == 0 ? "El número es par" : "El número es impar");
        System.out.println(C % 5 == 0 ? "El número es multiplo de 5 " : "El número no es multiplo de 5");
        System.out.println(C % 10 == 0 ? "El número es multiplo de 10" : "El número no es multiplo de 10");
        System.out.println(C >= 100 ? "El número es mayor que 100" : "El número es menor que 100");
    }
}
