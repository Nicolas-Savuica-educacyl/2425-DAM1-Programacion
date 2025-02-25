public class ClaseMesa {
    int patas;
    String material;
    String color;
    int lado;

    public ClaseMesa(int patas, String material, String color, int lado) {
        this.color = color;
        this.material = material;
        this.patas = patas;
        this.lado = lado;
    }

    public int area() {
        return lado * lado;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public int getPatas() {
        return patas;
    }
}

