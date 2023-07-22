public class App {
    public static void main(String[] args) throws Exception {
        // o resultado final é muito grande pra caber em um int e o número fica negativo
        int produto = 15;
        // o tipo float perde precisão ao trabalhar com números grandes
        float produtoFloat = 15;

        for (int i = 15; i <= 30; i++) {
            if (i % 2 != 0) {
                produto *= i;
                produtoFloat *= i;
                System.out.println("int: " + produto);
                System.out.println("float: " + produtoFloat);
            }
        }
    }
}
