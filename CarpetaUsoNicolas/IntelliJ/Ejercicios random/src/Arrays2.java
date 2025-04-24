public class Arrays2 {
    public static void main(String[] args) {
        String[] primeraFila = {"DanielM", "Jorsh", "Adrian", "DavidG", "Karla", "JavierE"};
//        for (String nombre : primeraFila) {
//            System.out.println(nombre);

//            }
    String[] nuevaFila = new String[7];
        for (int i = 0; i < primeraFila.length; i++){
            nuevaFila[i] = primeraFila[i];
            System.out.println(nuevaFila[i]);
        }
        nuevaFila[6] = "Nicolas";
        System.out.println(nuevaFila[6]);
    }
}
