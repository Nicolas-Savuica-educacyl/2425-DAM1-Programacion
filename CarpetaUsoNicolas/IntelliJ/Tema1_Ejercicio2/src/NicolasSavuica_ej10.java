import java.util.Scanner;
//programa que solicite 3 números y compruebe si están ordenados.//
public class NicolasSavuica_ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce tres (3) números separados, porfavor");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println(num1 > num2 ? (num2 > num3 ? "Los números están ordenados de mayor a menor" : "los numeros no están ordenados")
                                        : num2 < num3 ? "Los números están ordenados de menor a mayor" : "Los números no están ordenados");
        sc.close();
    }
}
