package DevDojoIntroducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        //Outra forma de Declarar o Arrays
        int[] numeros2 = {1, 2, 3, 4, 5};

        //Outra forma de Declarar o Arrays
        int[] numeros3 = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);

        }
    }
}
