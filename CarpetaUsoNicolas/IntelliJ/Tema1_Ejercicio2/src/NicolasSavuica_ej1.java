import java.util.Scanner;

//Leer si el número es par o impar//
public class NicolasSavuica_ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un número, porfavor");
        int num1 = sc.nextInt();
        System.out.println(num1 % 2 == 0 ? "El número es par" : "El número es impar");

        sc.close();
    }
}
