import java.util.Scanner;
public class nicolasAlgo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;

        System.out.println("Bienvenido a la calculadora");
        System.out.println("Seleccione una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Salir");

        opcion = input.nextInt();

        System.out.print("Ingrese el primer número: ");
        double num1 = input.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = input.nextDouble();

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + sumar(num1, num2));
                break;
            case 2:
                System.out.println("Resultado: " + restar(num1, num2));
                break;
            case 3:
                System.out.println("Resultado: " + multiplicar(num1, num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " + dividir(num1, num2));
                } else {
                    System.out.println("Error: División entre cero");
                }
                break;
            default:
                System.out.println("Opción no válida");
        }

        input.close();
    }

    // Método para sumar dos números
    public static double sumar(double a, double b) {
        return a + b;
    }

    // Método para restar dos números (aquí hay un error intencional de lógica)
    public static double restar(double a, double b) {
        return a + b; // Error intencional: debería ser "return a - b;"
    }

    // Método para multiplicar dos números
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para dividir dos números
    public static double dividir(double a, double b) {
        return a / b;
    }
}
