public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                int result = i / 2;
                float resultFloat = (float) i / 2;
                System.out.println("Número: " + i + ", Divisão por 2 em int: " + result);
                System.out.println("Número: " + i + ", Divisão por 2 em float: " + resultFloat);
            }
        }
    }
}
