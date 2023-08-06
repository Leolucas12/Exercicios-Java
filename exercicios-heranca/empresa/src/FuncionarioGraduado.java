public class FuncionarioGraduado extends Funcionario {
  private String universidade;

  public FuncionarioGraduado(String nome, int codigoFuncional, Cargo cargo, String universidade) {
    super(nome, codigoFuncional, cargo);
    this.universidade = universidade;
  }

  public String getUniversidade() {
    return universidade;
  }

  public double calcularRendaTotal() {
    return super.calcularRendaTotal() * 2.00 + this.getComissao();
  }
}
