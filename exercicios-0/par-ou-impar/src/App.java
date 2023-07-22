import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String parOuImpar = "";

        System.out.print("Digite um número: ");
        int input = scanner.nextInt();

        if (input % 2 == 0) {
            parOuImpar = "par";
        } else {
            parOuImpar = "ímpar";
        }

        System.out.println("O número " + input + " é " + parOuImpar);

        scanner.close();
    }
}
