import java.util.Scanner;
//Crea un programa en el que introduzcas una nota del 1 al 10 y te indique su nota en formato escrito
public class NicolasSavuica_ej3 {
    public static void main(String[] args) {
        Scanner nicoScan = new Scanner(System.in);
        int nota = nicoScan.nextInt();
        if (nota < 5 && nota >= 0)
            System.out.println("Insuficiente, suspenso y para casa");
        else if (nota < 7)
            System.out.println("Suficiente");
        else if (nota < 9)
            System.out.println("La nota es notable");
        else if (nota < 11)
            System.out.println("Es un sobresaliente!");
        else
            System.out.println("Eso no es una nota válida");
    }
}
