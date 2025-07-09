package DevDojoIntroducao;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        /*
        Prática

        Crie variáveis para os campos descritos abaixo  entre <> e imprima a seguinte mensagem:

        Eu <nome> moro no endereço <endereço>,
        confirmo que recebi meu salario <salário>, na data <data>
        */

        String name = "robson";
        String enderco = "Rua tukunavara";
        double salario = 3500;
        String data = "05/09/2025";

        String relatorio = "Eu "+name+" moro no endereço "+enderco+", confirmo que recebi meu salario de "+salario+", na data "+data;

        System.out.println(relatorio);

    }
}
