package TelevisaoControle;

public class Main {
    public static void main(String args[]) {
        Televisao tv = new Televisao();
        ControleRemoto controle = new ControleRemoto(tv.volume, tv.canal);

        controle.mostrarStatus();
        for (int i = 0; i < 10; i++) {
            controle.aumentarCanal();
            controle.aumentarVolume();
        }
        controle.mostrarStatus();

        controle.trocarCanal(444);
        controle.mostrarStatus();
    }
}
