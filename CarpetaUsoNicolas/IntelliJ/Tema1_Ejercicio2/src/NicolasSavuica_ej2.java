import java.util.Scanner;

//Programa que lea un número entero y muestre si el número es múltiplo de 10//
public class NicolasSavuica_ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un número, porfavor");
        int num2 = sc.nextInt();
        System.out.println(num2 % 10 == 0 ? "El número es múltiplo de 10" : "El número no es múltiplo de 10");

        sc.close();
    }

}
