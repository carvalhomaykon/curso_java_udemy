public class FuncoesString {

    public static void main(String[] args) {
        /*
            Formatar: toLowerCase(), toUpperCase(), trim()
            Recortar: subtring(inicio), subtring(inicio, fim)
            Substituir: Replace(char, char), Replace(string, string)
            Buscar: IndexOf, LastIndexOf
            str.Split("")


        String original = "abc CDE FCGJJS abc  ";
        String s01 = original.toLowerCase(); // deixar minuscula
        String s02 = original.toUpperCase(); // deixar maiusculas
        String s03 = original.trim(); // Elimina os espaços em brancos
        String s04 = original.substring(2); // Gerar uma nova string a partir de um determinado local
        String s05 = original.substring(2, 9); // Invervalo de valor para pegar
        String s06 = original.replace("a", "x"); // Toda vez que você encontrar o a troque por x
        String s07 = original.replace("abc", "xyy"); // Toda vez que encontrar essa String troque por esse
        int i = original.indexOf("bc"); // Qual a primeira ocorrência desse parte de String
        int j = original.lastIndexOf("bc"); // Qual a última ...

        System.out.println("Original: " + original + "-");
        System.out.println("toLoweCase: " + s01 + "-");
        System.out.println("toUpperCase: " + s02 + "-");
        System.out.println("trim: " + s03 + "-");
        System.out.println("substring(2): " + s04 + "-");
        System.out.println("replace('a', 'x'): " + s06 + "-");
        System.out.println("original.indexOf(\"bc\"): " + i + "-");
        System.out.println("original.lastIndexOf(\"bc\"): " + j + "-");

         */

        // Operação Split
        String s = "potato apple lemon";

        String[] vect = s.split(" "); // Usa um separador e guarda os valores na lista

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }

}
