import java.util.Scanner;

//11.Programa un juego que genere un número aleatorio y te permita introducir números hasta que des con el adecuado. El juego deberá indicarte si el número introducido es mayor o menor.
public class NicolasSavuica_ej11 {
    public static void main(String[] args) {
        Scanner nicoScan = new Scanner(System.in);
        // creo el número aleatorio entre un rango
        int limiteInferior = 1;
        int limiteSuperior = 10;
        int numeroAleatorio = (int) (Math.random() * (limiteSuperior - limiteInferior + 1)) + limiteInferior;

        int adivinanza;
        System.out.println("adivina un número entre 1 y 10");

        do {
           adivinanza = nicoScan.nextInt();
       if (adivinanza == numeroAleatorio)
           System.out.println("Lo conseguíste! Bien hecho");
       else
           System.out.println("Mal, intenta de nuevo");
       } while (adivinanza != numeroAleatorio);
    }
}
