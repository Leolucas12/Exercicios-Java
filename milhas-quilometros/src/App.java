import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em milhas: ");
        int milhas = scanner.nextInt();

        System.out.println("Esse é o valor em quilometros: " + milhas * 1.609);

        scanner.close();
    }
}
