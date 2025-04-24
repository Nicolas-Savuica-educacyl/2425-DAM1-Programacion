import java.util.Scanner;

//Programa que lea dos caracteres por teclado y compruebe si son iguales. :3//
public class NicolasSavuica_ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce dos números separados, porfavor");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1 == num2 ? "Los numeros son iguales" : "Los numeros son diferentes");
        sc.close();

    }
}
