import java.util.Scanner;

//programa que compruebe si eres mayor de edad//
public class NicolasSavuica_ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce tu edad, porfavor");
        int num1 = sc.nextInt();
        System.out.println(num1 >= 18 ? "Eres mayor de edad" : "Eres menor de edad");

        sc.close();
    }
}
