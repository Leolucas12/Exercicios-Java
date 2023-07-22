public class Carro {
  private int litros;
  private int quilometros;

  public Carro(int litros, int quilometros) {
    this.litros = litros;
    this.quilometros = quilometros;
  }

  public float calculaConsumo() {
    return this.quilometros / this.litros;
  }
}
