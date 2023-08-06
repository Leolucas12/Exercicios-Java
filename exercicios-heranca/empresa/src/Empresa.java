public class Empresa {
  private Funcionario[] vagas;

  public Empresa() {
    vagas = new Funcionario[10];
  }

  public void adicionarFuncionario(int vaga, Funcionario func) {
    if (vaga >= 0 && vaga < 10) {
      vagas[vaga] = func;
    } else {
      System.out.println("Vaga inválida.");
    }
  }

  public void percorrerVagas() {
    System.out.println("=== Zoologico ===");
    for (int i = 0; i < vagas.length; i++) {
      if (vagas[i] != null) {
        Funcionario func = vagas[i];
        System.out
            .println("Funcionario " + (i + 1) + ": " + func.getNome() + " Comissao: " + func.getComissao()
                + " Salario: " + func.calcularRendaTotal());
        System.out.println("=================");
      } else {
        System.out.println("Funcionario " + (i + 1) + ": Vazia");
        System.out.println("=================");
      }
    }
  }
}
