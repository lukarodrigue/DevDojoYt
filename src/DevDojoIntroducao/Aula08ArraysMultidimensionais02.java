package DevDojoIntroducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        int[] arrayNumber = {1, 2, 3, 4, 5, 6,};

        arrayInt[0] = new int[2];           //1 tipo de declaracao de variavel de array
        arrayInt[1] = new int[]{1, 2, 3};   //2 tipo de declaracao de variavel de array
        arrayInt[2] = arrayNumber;          //3 tipo de declaracao de variavel de array


        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}}; //4 tipo de declaracao de variavel de array

        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
