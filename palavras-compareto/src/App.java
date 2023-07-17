import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        String palavrasOrdenadas = ordenarAlfabeticamente(palavra1, palavra2);
        String palavraMaior = palavraMaisLonga(palavra1, palavra2);

        System.out.println("Palavras em ordem alfabética: " + palavrasOrdenadas);
        System.out.println("Palavra maior: " + palavraMaior);

        scanner.close();
    }

    public static String ordenarAlfabeticamente(String palavra1, String palavra2) {
        int comparacao = palavra1.compareTo(palavra2);

        if (comparacao < 0) {
            return palavra1 + ", " + palavra2;
        } else if (comparacao > 0) {
            return palavra2 + ", " + palavra1;
        } else {
            return palavra1 + ", " + palavra2;
        }
    }

    public static String palavraMaisLonga(String palavra1, String palavra2) {
        if (palavra1.length() > palavra2.length()) {
            return palavra1;
        } else if (palavra2.length() > palavra1.length()) {
            return palavra2;
        } else {
            return "As duas palavras tem o mesmo tamanho.";
        }
    }
}
