import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int A = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int B = scanner.nextInt();

        int temp = A;
        A = B;
        B = temp;

        System.out.println("Valor de A após a troca: " + A);
        System.out.println("Valor de B após a troca: " + B);

        scanner.close();
    }
}
