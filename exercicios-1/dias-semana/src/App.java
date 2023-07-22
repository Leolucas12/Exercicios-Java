import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = { "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado" };

        System.out.print("Digite um número de 1 a 7 que representa um dia da semana: ");
        int dia = scanner.nextInt();

        if (dia > 7 || dia < 0) {
            System.out.println("Aí não vale");
        } else {
            System.out.println(numbers[dia - 1]);
        }

        scanner.close();
    }
}
