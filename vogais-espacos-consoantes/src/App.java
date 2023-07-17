import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite algo: ");
        String input = scanner.nextLine();

        int quantidadeVogais = 0;
        int quantidadeConsoantes = 0;
        int quantidadeEspacos = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toLowerCase(input.charAt(i));

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    quantidadeVogais++;
                } else {
                    quantidadeConsoantes++;
                }
            } else if (ch == ' ') {
                quantidadeEspacos++;
            }
        }

        System.out.println("Vogais: " + quantidadeVogais);
        System.out.println("Consoantes: " + quantidadeConsoantes);
        System.out.println("Espaços: " + quantidadeEspacos);

        scanner.close();
    }
}
