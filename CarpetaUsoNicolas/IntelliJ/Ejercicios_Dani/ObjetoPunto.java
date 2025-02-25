/*Defina una clase punto que tendrá dos atributos, de tipo real, x e y, que representarán las coordenadas del punto dentro del plano.
 Defina un método que tenga como argumento otro objeto de la clase punto y que calcule la distancia entre los dos puntos.
 Para probar esta funcionalidad,escriba un método main en el que se creen dos puntos, el primero de los cuales deberá tenerlas
 coordenadas (100, 200) y el segundo deberá tener las coordenadas (400, 800) y calcule e imprima la distancia entre ambos.\*
 */


public class ObjetoPunto {
    public static void main(String[] args) {
        ClasePunto punt = new ClasePunto(100, 200);
        ClasePunto punt2 = new ClasePunto(400, 800);
        System.out.println("La distancia1 entre los puntos es " + punt.distancia(punt));
        System.out.println("La distancia2 entre los puntos es " + punt.distancia(punt2));
    }
}
