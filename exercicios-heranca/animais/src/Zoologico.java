public class Zoologico {
  private Animal[] jaulas;

  public Zoologico() {
    jaulas = new Animal[10];
  }

  public void adicionarAnimal(int jaula, Animal animal) {
    if (jaula >= 0 && jaula < 10) {
      jaulas[jaula] = animal;
    } else {
      System.out.println("Jaula inválida.");
    }
  }

  public void percorrerJaulas() {
    System.out.println("=== Zoologico ===");
    for (int i = 0; i < jaulas.length; i++) {
      if (jaulas[i] != null) {
        Animal animal = jaulas[i];
        System.out.println("Jaula " + (i + 1) + ": " + animal.getNome());
        animal.emitirSom();
        if (animal.isDeveCorrer()) {
          animal.correr();
        }
        System.out.println("=================");
      } else {
        System.out.println("Jaula " + (i + 1) + ": Vazia");
        System.out.println("=================");
      }
    }
  }
}
