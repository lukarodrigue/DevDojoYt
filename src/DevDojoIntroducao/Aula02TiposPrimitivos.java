package DevDojoIntroducao;

import java.util.Arrays;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 25;
        long numeroGrande = 100000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 10;

        System.out.println("A idade é "+idade+" anos");
        System.out.println("O Numero é "+numeroGrande);
        System.out.println("O Salario é "+salarioDouble);
        System.out.println("O Salario em float é "+salarioFloat);
        System.out.println("A idade em byte é "+idadeByte);
        System.out.println("A idade em byte é "+idadeShort);
        System.out.println("Verdadeiro = "+verdadeiro);
        System.out.println("Falso = "+falso);
        System.out.println("Char = "+caractere);
    }
}
