public class App {
    public static void main(String[] args) throws Exception {
        FuncionarioEnsinoBasico funcionario2 = new FuncionarioEnsinoBasico("Paulo", 102, Cargo.VENDEDOR, "Escola A");
        FuncionarioEnsinoBasico funcionario3 = new FuncionarioEnsinoBasico("Paulo", 102, Cargo.VENDEDOR, "Escola A");
        FuncionarioEnsinoBasico funcionario4 = new FuncionarioEnsinoBasico("Paulo", 102, Cargo.VENDEDOR, "Escola A");
        FuncionarioEnsinoBasico funcionario5 = new FuncionarioEnsinoBasico("Paulo", 102, Cargo.VENDEDOR, "Escola A");

        FuncionarioEnsinoMedio funcionario6 = new FuncionarioEnsinoMedio("Maria", 103, Cargo.SUPERVISOR, "Escola B");
        FuncionarioEnsinoMedio funcionario7 = new FuncionarioEnsinoMedio("Maria", 103, Cargo.SUPERVISOR, "Escola B");
        FuncionarioEnsinoMedio funcionario8 = new FuncionarioEnsinoMedio("Maria", 103, Cargo.SUPERVISOR, "Escola B");
        FuncionarioEnsinoMedio funcionario9 = new FuncionarioEnsinoMedio("Maria", 103, Cargo.SUPERVISOR, "Escola B");

        FuncionarioGraduado funcionario10 = new FuncionarioGraduado("Joao", 104, Cargo.GERENTE, "Universidade C");
        FuncionarioGraduado funcionario11 = new FuncionarioGraduado("Joao", 104, Cargo.GERENTE, "Universidade C");

        Empresa empresa = new Empresa();

        empresa.adicionarFuncionario(0, funcionario2);
        empresa.adicionarFuncionario(1, funcionario3);
        empresa.adicionarFuncionario(2, funcionario4);
        empresa.adicionarFuncionario(3, funcionario5);

        empresa.adicionarFuncionario(4, funcionario6);
        empresa.adicionarFuncionario(5, funcionario7);
        empresa.adicionarFuncionario(6, funcionario8);
        empresa.adicionarFuncionario(7, funcionario9);

        empresa.adicionarFuncionario(8, funcionario10);
        empresa.adicionarFuncionario(9, funcionario11);

        empresa.percorrerVagas();
    }
}
