package DevDojoIntroducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os numeros pares de 0 ate 100000

        for (int i = 0; i <= 100000; i++) {
            if (i % 2 == 0) {
                System.out.println("numeros pares " + i);
            }
        }
    }
}
