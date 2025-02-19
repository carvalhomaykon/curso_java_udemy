import java.util.Locale;
import java.util.Scanner;

public class estruturaWhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x, soma = 0;

        System.out.print("Digite um número: ");
        x = sc.nextInt();
        //soma += x;

        while (x != 0){
            soma += x;
            System.out.print("Digite um número: ");
            x = sc.nextInt();
        }

        System.out.println("Encerrando o programa! Você digitou o número '0'.");
        System.out.println("A soma dos números digitados é: " + soma);

        sc.close();
    }
}
