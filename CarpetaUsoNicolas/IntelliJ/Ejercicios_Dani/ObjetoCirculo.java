/*
Escribe una clase que represente un circulo.El circulo queda perfectamente definido
si se conoce su radio. Defina además para esta clase dos métodos que permitan calcular el area del circulo y el perimetro
de la circunferencia. Para probar la funcionalidad escriba un pequeño programa que cree un circulo con un radio dado y que calcule
y muestre el area y el perimetro.
 */


public class ObjetoCirculo {

    public static void main(String[] args) {

        ClaseCirculo cir = new ClaseCirculo(10, "Rojo", 5, 20);

        System.out.println("El area es " + (int)cir.area());
        System.out.println("El perimetro es " + (int)cir.perimetro());

    }
}
