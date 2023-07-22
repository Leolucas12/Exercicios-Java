import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos carros foram usados? ");
        int quantidadeCarros = scanner.nextInt();

        Carro[] carros = new Carro[3];

        for (int i = 0; i < quantidadeCarros; i++) {
            System.out.print("Digite a distância percorrida em Km: ");
            int quilometros = scanner.nextInt();

            System.out.print("Quantos litros de gasolina foram usados? ");
            int litros = scanner.nextInt();

            carros[i] = new Carro(litros, quilometros);

            System.out.println(
                    "O consumo do automóvel " + (i + 1) + " foi de: " + carros[i].calculaConsumo()
                            + " quilômetros por litro");
        }

        scanner.close();
    }
}
