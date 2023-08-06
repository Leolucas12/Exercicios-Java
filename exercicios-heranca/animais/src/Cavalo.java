public class Cavalo extends Animal {
  public Cavalo(String nome, int idade, boolean deveCorrer, boolean deveEscalar) {
    super(nome, idade, deveCorrer, deveEscalar);
  }

  public void relinchar() {
    System.out.println(getNome() + " está relinchando.");
  }

  public void emitirSom() {
    this.relinchar();
  }
}
