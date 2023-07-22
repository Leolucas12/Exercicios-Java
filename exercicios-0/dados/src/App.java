public class App {
    public static void main(String[] args) throws Exception {
        // 6 lados * 6 lados dos dados
        int combinacoesTotais = 36;
        int quantidadeSetes = 0;

        // primeiro dado
        for (int i = 0; i <= 6; i++) {
            // segundo dado
            for (int j = 0; j <= 6; j++) {
                if (i + j == 7) {
                    quantidadeSetes++;
                }
            }
        }

        System.out.println("As chances de resultado sete são: " + quantidadeSetes + "/" + combinacoesTotais + ", ou "
                + (float) quantidadeSetes / combinacoesTotais * 100 + "%");
    }
}
