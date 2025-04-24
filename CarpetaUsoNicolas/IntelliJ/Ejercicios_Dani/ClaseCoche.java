public class ClaseCoche {
    int caballos;
    String color;
    String marca;
    boolean estado;

    public ClaseCoche(int caballos, String color, String marca, boolean estado) {
        this.caballos = caballos;
        this.color = color;
        this.estado = estado;
        this.marca = marca;
    }

    public int getCaballos() {
        return caballos;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public void encenderCoche() {
        estado = true;
    }

    public void apagarCoche() {
        estado = false;
    }

    public boolean cocheEncendido(boolean cocheEncendido) {
        return estado;
    }
}
