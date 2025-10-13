package DevDojoIntroducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {

        // Estrutura int[] -> define o tipo do array (neste caso, um array de inteiros)
        // idades -> nome da variável (referência ao array)
        // new int[quantidadeDePosicoes] -> cria o objeto array alocando espaço na memória

        int[] idades = new int[3];
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;

        System.out.println(idades[0]);

    }
}
