import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nicoScan = new Scanner(System.in);
        System.out.println("Hola muy buenas, vamos a crear 3 personas");

        System.out.println("Escribe el nombre");
        String nombre = nicoScan.nextLine();

        System.out.println("Ahora la altura");
        double altura = nicoScan.nextDouble();

        System.out.println("Ahora la edad");
        int edad = nicoScan.nextInt();

        System.out.println("Ahora el sexo");
        char sexo = nicoScan.next().charAt(0);

        System.out.println("Ahora el peso");
        double peso = nicoScan.nextDouble();

        ClasePersona persona1 = new ClasePersona(nombre,altura,edad, sexo, peso );


        if (persona1.calcularIMC(peso, altura) == -1)
            System.out.println("Esta por debajo de su peso");
        else if (persona1.calcularIMC(peso, altura) == 0)
            System.out.println("Esta en su peso ideal");
        else
            System.out.println("Esta por encima de su peso");

        if (persona1.esMayorDeEdad(edad))
            System.out.println("Es mayor de edad");
        else
            System.out.println("Es menor de edad");

        System.out.println(persona1);



        System.out.println("Perfecto, ahora vamos a por la segunda");

        System.out.println("Escribe el nombre");
        String nombre2 = nicoScan.nextLine();

        System.out.println("Ahora la edad");
        int edad2 = nicoScan.nextInt();

        System.out.println("Ahora el sexo");
        char sexo2 = nicoScan.next().charAt(0);

        ClasePersona persona2 = new ClasePersona(nombre2,edad2, sexo2 );


        if (persona1.esMayorDeEdad(edad))
            System.out.println("Es mayor de edad");
        else
            System.out.println("Es menor de edad");

        System.out.println(persona1);



        System.out.println("Muy BIEN, vamos a por la tercera!");
        System.out.println("Escribe el nombre");
        String nombre3 = nicoScan.nextLine();

        ClasePersona persona3 = new ClasePersona(nombre3);

        System.out.println(persona1);
    }
}
