import java.util.Scanner;

//programa que compruebe si un número introducido por teclado es múltiplo de 7//
public class NicolasSavuica_ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un número, porfavor");
        int num3 = sc.nextInt();
        System.out.println(num3 % 7 == 0 ? "El número es multiplo de 7" : "El número no es multiplo de 7");

        sc.close();
    }
}
