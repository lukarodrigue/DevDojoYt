package DevDojoIntroducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        // + - / * (OPERADORES MATEMATICOS)
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 /(double) numero02;

        System.out.println(resultado);


        // %(RESTO DA DIVISAO)

        int resto = 21 % 7;
        System.out.println(resto);



        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte "+isDezIgualQueVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);


        // &&(AND) - Ter todas as condicoes verdadeira se tiver 1 false ele retorna false.
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQuetrinta = idade > 30 && salario >= 4012;
        boolean isDentroDaLeiMenorQuetrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQuetrinta " +isDentroDaLeiMaiorQuetrinta);
        System.out.println("isDentroDaLeiMenorQuetrinta " +isDentroDaLeiMenorQuetrinta);

        // ||(OR) -
        double valorTotalContaCorrente = 200;
        double valorTotalPoupanca = 10000;
        float valorPlaystation = 5000;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " +isPlaystationCincoCompravel);

        // ! (NEGACAO) -





        // = += -= /= %=  - Atribuição
        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; //1800
        bonus *= 2; //3600
        bonus /= 2; //1800
        bonus %= 2; // 0
        System.out.println(bonus);

        // ++ --

        int contador = 0;
        contador += 1; //Contador = Contador + 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(++contador2);




    }
}
