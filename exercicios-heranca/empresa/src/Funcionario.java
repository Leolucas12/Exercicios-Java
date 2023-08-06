enum Cargo {
  GERENTE, SUPERVISOR, VENDEDOR
}

public class Funcionario {
  private String nome;
  private int codigoFuncional;
  private double rendaBasica = 1000.0;
  private Cargo cargo;

  public Funcionario(String nome, int codigoFuncional, Cargo cargo) {
    this.nome = nome;
    this.codigoFuncional = codigoFuncional;
    this.cargo = cargo;
  }

  public String getNome() {
    return nome;
  }

  public int getCodigoFuncional() {
    return codigoFuncional;
  }

  public Cargo getCargo() {
    return cargo;
  }

  public double getComissao() {
    double comissao = 0.00;

    switch (this.getCargo()) {
      case GERENTE:
        comissao = 1500.00;
        break;
      case SUPERVISOR:
        comissao = 600.00;
        break;
      case VENDEDOR:
        comissao = 250.00;
        break;
    }

    return comissao;
  }

  public double calcularRendaTotal() {
    return rendaBasica + this.getComissao();
  }
}
