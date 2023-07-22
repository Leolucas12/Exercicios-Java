import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double radius = scanner.nextDouble();

        double area = calculateCircleArea(radius);

        DecimalFormat df = new DecimalFormat("#.##");
        String roundedArea = df.format(area);

        System.out.println("A área do círculo é: " + roundedArea);

        scanner.close();
    }

    public static double calculateCircleArea(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }
}
