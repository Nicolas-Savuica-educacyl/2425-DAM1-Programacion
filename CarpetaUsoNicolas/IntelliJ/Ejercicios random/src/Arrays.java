public class Arrays {
    public static void main(String[] args) {
        int[] notas = {1,2,3,8};
        notas[1] = 7;
        for (int i = 0; i < notas.length; i++){
            System.out.println(notas[i]);
        }




        System.out.println("Vamos a imprimir mas notas");
         System.out.println(":::::::::::::::::::::::::::::::::::");




         int[] notasNico = new int[5];
         notasNico[4] = 8;
        for (int i = 0; i < notasNico.length; i++){
            System.out.println(notasNico[i]);
        }
    }
}
