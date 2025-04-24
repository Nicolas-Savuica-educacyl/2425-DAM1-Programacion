import java.util.Scanner;
//programa que indique el peso que tienes en la luna. >:3//
public class NicolasSavuica_ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduzca su peso, porfavor");
        double peso = sc.nextDouble();

        System.out.println("Su peso en la luna es: " + (peso / 9.81 * 1.62) + "Kg");
        sc.close();

    }
}
