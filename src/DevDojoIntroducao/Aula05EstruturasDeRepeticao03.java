package DevDojoIntroducao;

public class Aula05EstruturasDeRepeticao03 {
    public static void main(String[] args) {

        // Doar se salario > 5000
        double salario = 5000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda nao tenho condicoes, mas vou ter!";


        //Operador Ternario (condicao)     ? verdadeiro   :     falso
        //salario > 5000 ? mensagemDoar : mensagemNaoDoar

        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);


    }
}
