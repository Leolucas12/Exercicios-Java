public class FuncionarioEnsinoMedio extends Funcionario {
  private String escolaEnsinoMedio;

  public FuncionarioEnsinoMedio(String nome, int codigoFuncional, Cargo cargo, String escolaEnsinoMedio) {
    super(nome, codigoFuncional, cargo);
    this.escolaEnsinoMedio = escolaEnsinoMedio;
  }

  public String getEscolaEnsinoMedio() {
    return escolaEnsinoMedio;
  }

  public double calcularRendaTotal() {
    return super.calcularRendaTotal() * 1.50 + this.getComissao();
  }
}
