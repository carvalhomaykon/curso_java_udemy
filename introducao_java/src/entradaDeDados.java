import java.util.Locale;
import java.util.Scanner;

public class entradaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Faz com que a minha máquina no formato Americano
        Scanner sc = new Scanner(System.in);
        // Associando o objeto scanner ao meu teclado

        // Criando a variável x string
//        String x;
//        x = sc.next(); // Permiti armazenar a palavra que foi digitada
//        System.out.println("Você digitou: " + x);

        // Criando uma variável int
//        int x;
//        x = sc.nextInt();
//        System.out.println("O número digitado foi: " + x);

        // Criando uma variável double
        // O sistema pega os dados da minha máquina, então eu tenho que trocar os . por ,
//        double x;
//        x = sc.nextDouble();
//        System.out.println("O número double é: " + x);
//

        // Criando uma variável do tipo char
//        char x;
//        x = sc.next().charAt(0);
//        // Char 0 pega o primeiro caracte, mesmo se tiver mais de um caracte
//        System.out.println("O caracter digitado foi: " + x);

        // Ler vários dados na mesma linha
//        String x;
//        int y;
//        double z;
//
//        x = sc.next();
//        y = sc.nextInt();
//        z = sc.nextDouble();
//
//        System.out.println("Dados digitados: ");
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//

        // ENTRADA DE DADOS PARA LER UM TEXTO ATÉ QUEBRAR DE LINHA
//        String s1, s2, s3;
//
//        s1 = sc.nextLine();
//        s2 = sc.nextLine();
//        s3 = sc.nextLine();
//
//        System.out.println("Dados digitados: ");
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);

        // QUEBRA DE LINHA PENDENTE
        int x;
        String s1, s2, s3;

        x = sc.nextInt();
        sc.nextLine(); // Para contornar o problema abaixo fazemos isso41
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados: ");
        // O enter pode ser considerado uma string. Por isso que aparentemente, o programa pega somente 3 valores
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        sc.close();
    }
}
