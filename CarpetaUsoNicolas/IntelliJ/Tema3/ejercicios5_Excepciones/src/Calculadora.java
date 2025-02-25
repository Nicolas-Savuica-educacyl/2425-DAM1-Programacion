//Crea una clase llamada Calculadora con un método dividir que reciba dos números enteros y devuelva el resultado de la división. Implementa el manejo de excepciones para capturar posibles divisiones por cero y mostrar un mensaje de error adecuado.
public class Calculadora {
    public static float dividir(float dividendo, float divisor) {
        if (divisor == 0) throw new ArithmeticException();
        return dividendo / divisor;
    }

    public static void main(String[] args) {
        int num1 = 10;
        float num2 = 0;
        try {
            System.out.println("El resultado de " + num1 + " / " + num2 + " :: " + dividir(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("NO puedes dividir entre 0, stuuuuuuuupid");
        }
    }
}