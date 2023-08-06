public class Veterinario {
  public void examinar(Animal animal) {
    System.out.println("Veterinário examinando o " + animal.getNome());
    animal.emitirSom();
  }
}
