package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Carro;

// CRIE UMA CLASSE CARRO COM OS SEGUINTES ATRIBUTOS
// NOME
// MODELO
// ANO
// EM SEGUIDA, CRIE DOIS OBEJTOS DISTINTOS E IMPRIMA SEUS VALORES


public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Vectra";
        carro1.modelo = "Chevrolet";
        carro1.ano = 2013;

        carro2.nome = "Lancer";
        carro2.modelo = "Mitsubishi";
        carro2.ano = 2015;

        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("---------------");


        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);


    }
}
