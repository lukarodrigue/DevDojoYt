package DevDojoIntroducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando o Switch e dados os Valores de 1 a 7 imprima se e dia util ou final de semana
        // considerando 1 como domingo

        byte dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Dom, não é dia util");
                break;
            case 2:
                System.out.println("Seg, dia util");
                break;
            case 3:
                System.out.println("Ter, dia util");
                break;
            case 4:
                System.out.println("Qua, dia util");
                break;
            case 5:
                System.out.println("Qui, dia util");
                break;
            case 6:
                System.out.println("Sex, dia util");
                break;
            case 7:
                System.out.println("Sab,não dia util");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
