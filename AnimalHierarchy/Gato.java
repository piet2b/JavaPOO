package AnimalHierarchy;

public class Gato extends Animal {
    @Override
    public String emitirSom() {
        return "Miando...";
    }

    @Override
    public void mover() {
        System.out.println("Gato se movendo...");
    }

    @Override
    public void descansar() {
        System.out.println("Gato descansando...");
    }
}
