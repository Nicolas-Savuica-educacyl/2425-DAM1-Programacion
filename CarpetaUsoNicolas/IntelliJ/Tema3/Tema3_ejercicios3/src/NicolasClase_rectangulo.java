public class NicolasClase_rectangulo {
    int Largo;
    int Ancho;


    public NicolasClase_rectangulo() {
        Largo = 20;
        Ancho = 5;
    }

    //    Esto es para si alguien solo pone una variable, ya que están las de 0 y 2 variables
    public NicolasClase_rectangulo(int ancho) {
        this.Ancho = ancho;
        if (ancho < 0) Ancho = 5;
        Largo = 20;
    }

    public NicolasClase_rectangulo(int ancho, int largo) {
        this.Ancho = ancho;
        this.Largo = largo;

        if (largo < 0) {
            Largo = 20;
        }
        if (ancho < 0) {
            Ancho = 5;
        }

    }

    public int getAncho() {
        return Ancho;
    }

    public void setAncho(int ancho) {
        Ancho = ancho;
    }

    public int getLargo() {
        return Largo;
    }

    public void setLargo(int largo) {
        Largo = largo;
    }

    int Area() {
        return Largo * Ancho;
    }

    String OrientacionRectangulo() {
        if (Largo > Ancho) return "horizontal";
        else return "vertical";
    }

    void ImprimirRectangulo() {
        System.out.println("El ancho de el rectangulo es: " + Ancho);
        System.out.println("El largo de el rectangulo es: " + Largo);
    }

    void DibujarRectangulo() {
        int AuxLargo = Largo;
        int AuxAncho = Ancho;
        for (int aux = AuxLargo; aux > -1; --aux) {
            if (aux == 0) {
                aux = AuxLargo;
                AuxAncho--;
                System.out.println();
            }
            if (AuxAncho < 0) break;
            System.out.print("*");
        }
    }
}
