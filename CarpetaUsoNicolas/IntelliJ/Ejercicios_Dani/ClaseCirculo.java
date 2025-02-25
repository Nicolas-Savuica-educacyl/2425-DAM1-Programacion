public class ClaseCirculo {
    int radio;
    String color;
    int diametro;
    int circunferencia;


    public ClaseCirculo(int radio, String color, int diametro, int circunferencia) {
        this.circunferencia = circunferencia;
        this.color = color;
        this.diametro = diametro;
        this.radio = radio;
    }

    public double area() {
        return (double) (Math.pow(radio, 2)) * Math.PI;
    }

    public double perimetro() {
        return Math.pow(Math.PI, 2) * radio;
    }

    public String getColor() {
        return color;
    }

    public int getCircunferencia() {
        return circunferencia;
    }

    public int getDiametro() {
        return diametro;
    }

    public int getRadio() {
        return radio;
    }

}
