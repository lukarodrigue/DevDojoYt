package DevDojoIntroducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte, short, int, long, float e double = 0
        //char - '\u0000' 'espaço vazio'
        //boolean - false
        //String - null
        //OBS TODOS ESSES VALORES SAO QUANDO AS VARIAVEIS NAO SAO INICIALIZADAS

        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Naruto";
        nomes[2] = "MestreKami";
        nomes[3] = "Hinata";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
