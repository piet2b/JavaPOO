package AnimalHierarchy;

import java.util.Random;

public class Adestrador {
    private Random random = new Random();

    public Animal adestrarAnimal() {
        if (random.nextBoolean()) {
            return new Cachorro();
        } else {
            return new Gato();
        }
    }

    public void brincar(Animal animal) {
        String som = animal.emitirSom();
        System.out.println(som);
    }
}
