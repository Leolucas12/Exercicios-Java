public class App {
    public static void main(String[] args) throws Exception {
        int numerador = 6;
        int denominador = 4;
        int resultado = numerador / denominador;

        float floatNumerador = 6;
        float floatDenominador = 4;

        System.out.println("O resultado é arredondado para um número inteiro, ou seja: " + resultado
                + " se usarmos o tipo float, seria: " + floatNumerador / floatDenominador);
    }
}
