package TelevisaoControle;

public class ControleRemoto {
    int volume;
    int canal;

    ControleRemoto(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }

    public int aumentarVolume() {
        return this.volume++;
    }

    public int aumentarCanal() {
        return this.canal++;
    }

    public int diminuirVolume() {
        return this.volume--;
    }

    public int diminuirCanal() {
        return this.canal--;
    }

    public void trocarCanal(int novoCanal) {
        this.canal = novoCanal;
    }

    public void mostrarStatus() {
        System.out.println("Volume: " + this.volume);
        System.out.println("Canal: " + this.canal);
    }
}
