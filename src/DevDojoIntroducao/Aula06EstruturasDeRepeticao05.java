package DevDojoIntroducao;

public class Aula06EstruturasDeRepeticao05 {
    // Dado o valor de um carro descrubra em quantas vezes ele pode ser parcelado
    // Condicao valorParcela >= 1000
    public static void main(String[] args) {
        double valorCarro = 30000;
        for (int parcela = (int) valorCarro; parcela >= 1; parcela--) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela "+ parcela + " R$ " + valorParcela);
        }
    }
}
