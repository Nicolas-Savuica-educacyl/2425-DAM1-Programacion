

public class ClasePunto {
    double x;
    double y;

    public ClasePunto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int distancia(ClasePunto laDistanciaEntreLosPuntos) {
        double diferenciaX = laDistanciaEntreLosPuntos.x - this.x;
        double diferenciaY = laDistanciaEntreLosPuntos.y - this.y;
        return (int) Math.sqrt(diferenciaX * diferenciaX + diferenciaY * diferenciaY);
    }
}