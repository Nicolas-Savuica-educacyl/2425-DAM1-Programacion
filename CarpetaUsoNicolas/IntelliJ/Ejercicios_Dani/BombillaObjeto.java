/*
Define una clase que sirva para representar el estado de una bombilla
Define además métodos que sirvan para encender y apagar y preguntar por el estado
de la bombilla .Para probarlo crea otra clase definida y que haga uso de los metodos.
 */


public class BombillaObjeto {

    public static void main(String[] args) {

        ClaseBombilla bom = new ClaseBombilla(100, 50, "rojo", false);
        System.out.println("El consumo de la bombilla es " + bom.consumo);
        System.out.println("Los lumenes de la bombilla son " + bom.lumenes);
        System.out.println("El color de la luz de la bombilla es " + bom.color);
        System.out.println("El estado de la bombilla es  " + bom.estado);
        System.out.println("¿La bombilla está encendida? " + bom.estaEncendida());

    }
}
