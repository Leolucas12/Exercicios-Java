import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um código: ");
        String input = scanner.nextLine();

        if (input.compareTo("001") == 0) {
            System.out.println("Parafuso");
        } else if (input.compareTo("002") == 0) {
            System.out.println("Porca");
        } else if (input.compareTo("003") == 0) {
            System.out.println("Prego");
        } else {
            System.out.println("Diversos");
        }

        scanner.close();
    }
}
