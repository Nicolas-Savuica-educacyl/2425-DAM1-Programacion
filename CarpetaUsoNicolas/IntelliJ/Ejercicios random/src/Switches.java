import java.util.Scanner;

public class Switches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean permanecer = true;
        float suma = 0;
        int mayor = 0;
        int contador = 0;
        int numeroAuxiliar = 0;


        do {
            System.out.println("1. Introduce un número");
            System.out.println("2. Haz la media");
            System.out.println("3. Busca el mayor");
            System.out.println("0. Salir");
            byte accion = sc.nextByte();

            switch (accion) {
                case 1: //  Código para introducir los números
                    System.out.println("Introduce un número");
                   int numeroPuesto = sc.nextInt();
                    numeroAuxiliar += numeroPuesto;
                    suma = numeroPuesto + numeroAuxiliar;
                    if (numeroPuesto > mayor) {
                        mayor = numeroPuesto;
                    }
                    contador++;
                    break;
                case 2: //  Código para sacar la media
                    double media = suma / contador ;
                    System.out.println("La media es " + media);
                    break;
                case 3: //  Código para buscar el mayor
                        System.out.println("El mayor es " + mayor);
                    break;
                case 0: // Salir!
                    permanecer = false;
                    break;
                default: // Código para opciones no contempladas
                    System.out.println("Introduce una opción");
                    break;
            }
        } while (permanecer);
        sc.close();
    }
}