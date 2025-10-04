package DevDojoIntroducao;

public class Aula05EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        int idade = 18;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Dentro da idade permitida");
        } else {
            System.out.println("Nao Autoriado a comprar bebida alcolica");
        }

        // ! Operador de negacao
        if (!isAutorizadoComprarBebida) {
            System.out.println("Nao Autoriado a comprar bebida alcolica");
        }

    }

}
