public class App {
    public static void main(String[] args) throws Exception {
        Administrador administrador = new Administrador("Administrador1", "Rua A, 123", "111-111-1111", 1, 4000.0, 10.0,
                1000.0);
        System.out.println(administrador.calcularSalario());

        Operario operario = new Operario("Operario1", "Rua B, 456", "222-222-2222", 2, 3000.0, 8.0, 5000.0, 5.0);
        System.out.println(operario.calcularSalario());

        Vendedor vendedor = new Vendedor("Vendedor1", "Rua C, 789", "333-333-3333", 3, 3500.0, 9.0, 10000.0, 2.0);
        System.out.println(vendedor.calcularSalario());
    }
}
