import java.util.Locale;
import java.util.Scanner;

public class estruturaRepeticao {
    /*
    Marcar breakpoint: Run -> Toggle Breakpoint ou Ctrl + F8
    Iniciar debug: Clique direito na classe → Debug as -> Java Application
    Executar linha: Pressione F6
    Interromper debug: Clique no botão de "Stop" (quadrado vermelho)
    */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", preco);

        sc.close();
    }
}