public class funcoesMatematicas {
    // A = Math.sqrt(x); --> Raiz quadrada de x
    // A = Math.pow(x, y); --> x elevado a y
    // A = Math.abs(x) --> valor absoluto de x
    public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        // Raiz quadrado dos seguintes números:
        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25.0 = " + C);
        System.out.println("\n");

        // Potenciação
        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado a 2.0 = "+ B);
        System.out.println("5.0 elevado a 2.0 = " + C);
        System.out.println("\n");

        // Valor absoluto
        A = Math.abs(z);
        System.out.println("O valor absoluto de " + z + " = " + A);

        // Fórmula de bhaskara
        double delta, x1, x2;
        double a = 3, b = -2, c = -1;

        delta = Math.pow(b, 2.0) - 4*a*c;
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println("\nDelta = " + delta);
        System.out.println("X1 = " + x1 + " e x2 = " + x2);
    }
}
