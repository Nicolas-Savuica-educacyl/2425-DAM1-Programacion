import java.util.Scanner;

public class Ej3_Agenda {
    public static void main(String[] args) {
        Scanner nicoScan = new Scanner(System.in);

        System.out.print("¿Cuántas personas quieres guardar? ");
        int cantidadPersonas = nicoScan.nextInt();
        nicoScan.nextLine(); // Limpiar el buffer

        String[] nombres = new String[cantidadPersonas];
        String[] direcciones = new String[cantidadPersonas];

        // Llenar la agenda
        for(int i = 0; i < cantidadPersonas; i++) {
            System.out.println("Persona " + (i+1) + ":");
            System.out.print("Nombre: ");
            nombres[i] = nicoScan.nextLine();

            System.out.print("Dirección: ");
            direcciones[i] = nicoScan.nextLine();
        }

        // Sistema de consultas
        String nombreConsulta;
        do {
            System.out.print("Ingresa un nombre a buscar (o 'salir' para terminar): ");
            nombreConsulta = nicoScan.nextLine();

            if(nombreConsulta.equalsIgnoreCase("salir"))
                break;

            boolean encontrado = false;
            for(int i = 0; i < nombres.length; i++) {
                if(nombres[i].equalsIgnoreCase(nombreConsulta)) {
                    System.out.println("Dirección: " + direcciones[i]);
                    encontrado = true;
                    break;
                }
            }

            if(!encontrado) {
                System.out.println("Erm, busca de nuevo payo, no lo encuentro");
            }

        } while(true);

        System.out.println("¡Programa terminado!");
    }
}
