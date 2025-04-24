import java.util.Scanner;
//programa que nos pida cuantos segundos duró un concierto, y nos calcule cuántas horas, minutos y segundos son. :3//
public class NicolasSavuica_ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la cantidad de segundos en el concierto: ");
        int conciertoSegundos = sc.nextInt();
        System.out.println("El concierto duró: "+ (conciertoSegundos /3600) +":"+ (conciertoSegundos % 3600/60) +":"+ (conciertoSegundos % 60));

        sc.close();
    }
}
