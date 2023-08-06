public class FuncionarioEnsinoBasico extends Funcionario {
  private String escolaEnsinoBasico;

  public FuncionarioEnsinoBasico(String nome, int codigoFuncional, Cargo cargo, String escolaEnsinoBasico) {
    super(nome, codigoFuncional, cargo);
    this.escolaEnsinoBasico = escolaEnsinoBasico;
  }

  public String getEscolaEnsinoBasico() {
    return escolaEnsinoBasico;
  }

  public double calcularRendaTotal() {
    return super.calcularRendaTotal() * 1.10 + this.getComissao();
  }
}
