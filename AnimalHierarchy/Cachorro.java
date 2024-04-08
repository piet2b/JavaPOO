package AnimalHierarchy;

public class Cachorro extends Animal {
    @Override
    public String emitirSom() {
        return "Latindo...";
    }

    @Override
    public void mover() {
        System.out.println("Cachorro se movendo...");
    }

    @Override
    public void descansar() {
        System.out.println("Cachorro descansando...");
    }
}

