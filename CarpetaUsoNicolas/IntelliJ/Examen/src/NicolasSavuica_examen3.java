import java.util.Scanner;

public class NicolasSavuica_examen3 {
    public static void main(String[] args) {
        Scanner nicoScan = new Scanner(System.in);

        System.out.println("Introduzca su edad");
        int edad = nicoScan.nextInt();

        System.out.println("Introduzca su tipo de seguro (basico, intermedio, o premium)");
        String tipoSeguro = nicoScan.next();
        boolean tipoSeguroValido = false;
        while (!tipoSeguroValido) {
            switch (tipoSeguro){

            case "basico", "intermedio", "premium":
                tipoSeguroValido = true;
                break;
            default:
                System.out.println("No has puesto algo válido");
                    tipoSeguro = nicoScan.next();
            }
        }

        System.out.println("Introduzca si ha tenido accidentes previos (true para si, false para no)");
        boolean historialAccidentes = nicoScan.nextBoolean();

        System.out.println("Introduzca la cantidad de años de seguro contratados");
        int aniosConSeguro = nicoScan.nextInt();
        nicoScan.close();

        int costoSeguroBase = 500;

        double costoSeguroActual = costoSeguroBase;
        // si tiene 25 años o menos, se suma 20%
        if (edad < 25){
            costoSeguroActual = (costoSeguroBase * 1.2);

        // si tiene entre 25 y 60 y tiene seguro intermedio o premium se resta 10%
        } else if (edad <= 60 ) {
            if (tipoSeguro.equals("intermedio") || tipoSeguro.equals("premium"))
                costoSeguroActual = (costoSeguroBase / 1.1);


            // si tiene 60 se resta 15%
        } else {
            costoSeguroActual = (costoSeguroBase / 1.15);
        }

        // si tiene  historial se aumenta 30 % el costo
        if (historialAccidentes)
            costoSeguroActual = (costoSeguroBase * 1.3);

        // si tiene más de 5 años con seguro, se quita 5%
        if (aniosConSeguro >= 6)
            costoSeguroActual = (costoSeguroBase / 1.05);

        System.out.println("El costo final de la nómina es igual a: " + costoSeguroActual + "€");

    }
}
