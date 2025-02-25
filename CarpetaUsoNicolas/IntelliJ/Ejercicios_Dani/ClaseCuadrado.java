public class ClaseCuadrado {
    int lados;
    String color;

    public ClaseCuadrado(int lados, String color) {
        this.color = color;
        this.lados = lados;
    }

    public int area(int lado) {
        return lado * lado;
    }

    public int longitud(int lado1, int lado2, int lado3, int lado4) {
        return lado1 + lado2 + lado3 + lado4;
    }

    public String getColor() {
        return color;
    }

    public int getLados() {
        return lados;
    }

}
