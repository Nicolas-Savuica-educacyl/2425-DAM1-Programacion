public class NicolasPrueba_rectangulo {
    public static void main(String[] args) {

        NicolasClase_rectangulo RectaNico = new NicolasClase_rectangulo(-88888888);

        RectaNico.DibujarRectangulo();
        RectaNico.ImprimirRectangulo();
        System.out.println("El area del rectángulo es: " + RectaNico.Area());
        System.out.println("La orientación del rectangulo es: " + RectaNico.OrientacionRectangulo());

    }
}
