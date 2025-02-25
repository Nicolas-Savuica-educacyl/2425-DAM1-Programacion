public class ClaseCuentaCorriente {

    int saldo;


    public ClaseCuentaCorriente() {
        this.saldo = 0;
    }


    public int saldo() {
        return saldo;
    }


    public void ingresarDinero(int cantidadDinero) {
        if (cantidadDinero > 0) {
            saldo += cantidadDinero;
        } else {
            System.out.println("La cantidad a ingresar debe ser positiva.");
        }
    }


    public void sacarDinero(int cantidadASacar) {
        if (cantidadASacar > 0) {
            if (cantidadASacar <= saldo) {
                saldo -= cantidadASacar;
            } else {
                System.out.println("Fondos insuficientes para sacar dinero");
            }
        } else {
            System.out.println("La cantidad a retirar debe ser positiva.");
        }
    }
}

