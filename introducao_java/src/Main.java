import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //System.out.println("Olá, Mundo!");
        //System.out.println("Boa noite!");

        // Declarando váriavel inteira
        int y = 32;
        System.out.println("O número é: " + y);
        //System.out.println(y);

        // Declarando variável de ponto flutuante
        double x = 42.895544;
        System.out.println("O número de ponto flutuante é: " + x);
        System.out.printf("Duas casas decimais depois da vírgula: %.2f%n", x); // printf é para formatação do número
        // %n pula linha
        System.out.printf("Duas casas decimais depois da vírgula: %.4f%n", x); // printf é para formatação do número
        // Duas casas decimais depois da vírgula
        // Vale ressaltar que a saída está vindo com vírgula ao inves do ponto. Para isso:
        //Locale.setDefault(Locale.US); // Realizamos esse código
        System.out.printf("Duas casas decimais depois da vírgula: %.4f%n", x); // trocou a , pelo .

        // Concatenar
        System.out.println("Resultado: " + x + " metros.");
        System.out.printf("Resultado: %.2f metros%n", x);

        // Concatenar várias variáveis
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        System.out.printf("%s tem %d anos e sua renda é R$ %.2f%n", nome, idade, renda);

        // Exercício de fixação
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("%n%n%nProducts: %n");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n%n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);
        System.out.printf("%nMeasue with eigth decimal places: %f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);

        Locale.setDefault(Locale.US);

        System.out.printf("US decimal point: %.2f", measure);
    }
}