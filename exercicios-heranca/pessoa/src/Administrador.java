public class Administrador extends Empregado {
  private double ajudaDeCusto;

  public Administrador() {
    super();
    this.ajudaDeCusto = 0.0;
  }

  public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
      double imposto, double ajudaDeCusto) {
    super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
    this.ajudaDeCusto = ajudaDeCusto;
  }

  public double getAjudaDeCusto() {
    return ajudaDeCusto;
  }

  public void setAjudaDeCusto(double ajudaDeCusto) {
    this.ajudaDeCusto = ajudaDeCusto;
  }

  public double calcularSalario() {
    double salarioLiquidoEmpregado = super.calcularSalario();
    double salarioLiquidoAdministrador = salarioLiquidoEmpregado + ajudaDeCusto;
    return salarioLiquidoAdministrador;
  }
}
