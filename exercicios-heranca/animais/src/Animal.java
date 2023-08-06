public class Animal {
  private String nome;
  private int idade;
  private boolean deveCorrer;
  private boolean deveEscalar;

  public Animal(String nome, int idade, boolean deveCorrer, boolean deveEscalar) {
    this.nome = nome;
    this.idade = idade;
    this.deveCorrer = deveCorrer;
    this.deveEscalar = deveEscalar;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public boolean isDeveCorrer() {
    return deveCorrer;
  }

  public void setDeveCorrer(boolean deveCorrer) {
    this.deveCorrer = deveCorrer;
  }

  public boolean isDeveEscalar() {
    return deveEscalar;
  }

  public void setDeveEscalar(boolean deveEscalar) {
    this.deveEscalar = deveEscalar;
  }

  public void emitirSom() {
    System.out.println(getNome() + " está fazendo barulho");
  }

  public void correr() {
    System.out.println(getNome() + " está correndo");
  }
}
