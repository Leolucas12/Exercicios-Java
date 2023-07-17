public class App {
    public static void main(String[] args) throws Exception {
        // o resultado final é muito grande pra caber em um int
        long produto = 15;

        for (int i = 15; i <= 30; i++) {
            if (i % 2 != 0) {
                produto *= i;
                System.out.println(produto);
            }
        }
    }
}
