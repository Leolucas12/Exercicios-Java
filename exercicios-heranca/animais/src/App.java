public class App {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro = new Cachorro("Caramelo", 3, true, false);
        cachorro.emitirSom();

        Cavalo cavalo = new Cavalo("Pé de Pano", 5, true, false);
        cavalo.emitirSom();
        
        Preguica preguica = new Preguica("Preguiça", 2, false, true);
        preguica.emitirSom();

        Veterinario veterinario = new Veterinario();
        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);

        Zoologico zoologico = new Zoologico();

        zoologico.adicionarAnimal(0, preguica);
        zoologico.adicionarAnimal(1, cavalo);
        zoologico.adicionarAnimal(2, cachorro);

        zoologico.percorrerJaulas();
    }
}
