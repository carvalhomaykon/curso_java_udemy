import java.util.Locale;
import java.util.Scanner;

public class estruturaCondicional {
    public static void main(String[] args) {
//        int x = 5;
//        int hora;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Quantas horas?");
//        hora = sc.nextInt();
//
//        if (hora < 12){
//            System.out.println("Bom dia!");
//        }
//        else if (hora >= 12 && hora < 18) {
//            System.out.println("Boa tarde!");
//        }
//        else {
//            System.out.println("Boa noite!");
//        }

//        int minutos = sc.nextInt();
//        double conta = 50.0;
//
//        if (minutos > 100){
//            conta += (minutos - 100) * 2.0;
//        }
//
//        System.out.printf("Valor da conta = R$ %.2f", conta);
//
//        int x = sc.nextInt();
//
//        switch (x) {
//            case 1:
//                System.out.println("Domindo");
//                break;
//            case 2:
//                System.out.println("Segunda-feira");
//                break;
//            case 3:
//                System.out.println("Terça-feira");
//                break;
//            case 4:
//                System.out.println("Quarta-feira");
//                break;
//            case 5:
//                System.out.println("Quinta-feira");
//                break;
//            case 6:
//                System.out.println("Sexta-feira");
//                break;
//            case 7:
//                System.out.println("Sabado");
//                break;
//            default:
//                System.out.println("Opção inválida.");
//                break;
//        }
        // Expressão condicional ternária
        // (condicao) ? valor_se_verdadeiro : valor_se_falso

        // Exemplo:
        // (2 > 4) ? 50 : 80 ----> 80, porque o resultado é falso
        double preco = sc.nextDouble();
        double desconto = (preco < 20.00) ? preco * 0.1 : preco * 0.05;

        System.out.println(desconto);
        sc.close();
    }
}
