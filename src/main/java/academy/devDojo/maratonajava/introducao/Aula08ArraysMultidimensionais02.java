package academy.devDojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {

        int[][] ArrayInt = new int[3][];

      /*  ArrayInt[0]=new int[2];
        ArrayInt[1]=new int[]{1,2,3};
        ArrayInt[2]=new int[]{1,2,3,4,5,6};*/
        int[][] arrayInt2 = {{0,0},{1,2,3},{1,2,3,4,5,6}};
        for (int[] arrBase :arrayInt2) {
            System.out.println("\n-----");
            for (int num : arrBase) {
                System.out.println(num+" ");
            }
        }
    }
}
