import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int number1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("O primeiro número (" + number1 + ") é maior que o segundo (" + number2 + ")");
        } else if (number2 > number1) {
            System.out.println("O segundo número (" + number2 + ") é maior que o primeiro (" + number1 + ")");
        }

        scanner.close();
    }
}
