public class NumeroValidado {
    public static void main(String[] args) {
        try {
            new ValidadorNumero(-5);
        } catch (IllegalargumentException e) {
            System.out.println("El numero no vale, primo, sabes? Tiene que ser negativo, como mi cuenta bancaria");
        }
    }
}
