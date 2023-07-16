import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[50];
        int countagem = 0;

        System.out.println("Digite 50 números:");

        while (countagem < 50) {
            numeros[countagem] = scanner.nextInt();
            countagem++;
        }

        double soma = 0;

        for (int number : numeros) {
            soma += number;
        }

        double media = soma / numeros.length;

        System.out.println("Média Aritimética: " + media);

        scanner.close();
    }
}
