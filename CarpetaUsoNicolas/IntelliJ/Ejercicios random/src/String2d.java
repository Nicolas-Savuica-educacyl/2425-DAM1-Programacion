public class String2d {
    public static void main(String[] args) {
        int[][] nico = new int[3][5];

        int i = 0;

        for (int l = 0; l <= 4 ; i++ ){
            nico[l][i] = i;
            if (i == 4) {
                l++;
                i = 0;
            }
            if (l == 3)
                break;
        }
        for ( int[] linea : nico){
            for (int valor : linea){
                System.out.print(valor +" ");
            }
            System.out.println();
        }
    }
}
