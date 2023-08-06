public class Cachorro extends Animal {
  public Cachorro(String nome, int idade, boolean deveCorrer, boolean deveEscalar) {
    super(nome, idade, deveCorrer, deveEscalar);
  }

  public void latir() {
    System.out.println(getNome() + " está latindo.");
  }

  public void emitirSom() {
   this.latir();
  }
}
