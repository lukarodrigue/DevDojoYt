package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Estudante;
import javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Jubilei";
        estudante01.idade = 15;
        estudante01.sexo= 'M';

        estudante02.nome = "Natali";
        estudante02.idade = 25;
        estudante02.sexo= 'F';

        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);
    }
}
