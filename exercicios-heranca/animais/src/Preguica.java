public class Preguica extends Animal {
  public Preguica(String nome, int idade, boolean deveCorrer, boolean deveEscalar) {
    super(nome, idade, deveCorrer, deveEscalar);
  }

  public void emitirSom() {
    System.out.println(getNome() + " está fazendo barulho");
  }
}
