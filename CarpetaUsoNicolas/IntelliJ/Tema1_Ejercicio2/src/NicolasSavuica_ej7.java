import java.util.Scanner;

//Programa que lea un carácter por teclado y compruebe si es una letra mayúscula. //
public class NicolasSavuica_ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce una letra, porfavor");
        char letra1 = sc.next().charAt(0);

        System.out.println(letra1 > 64 ? letra1 < 91 ? "La letra es mayuscula" : "La letra no es mayuscula" : "La letra no es mayuscula");

        sc.close();
    }
}
