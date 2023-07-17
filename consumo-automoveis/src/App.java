import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância percorrida em Km: ");
        int quilometros = scanner.nextInt();

        System.out.print("Quantos litros de gasolina foram usados? ");
        int litros = scanner.nextInt();

        System.out.println("O consumo do automóvel foi de: " + (float) quilometros / litros + " quilômetros por litro");

        scanner.close();
    }
}
