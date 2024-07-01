package Estacionamento;

public class Tempo {
    private int hora;
    private int minuto;

    // Construtor que inicializa hora e minuto
    public Tempo(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    // Construtor padrão
    public Tempo() {
        this.hora = 0;
        this.minuto = 0;
    }

    // Getters e setters
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    // Método para calcular a diferença em horas entre dois tempos
    public double diferencaEmHoras(Tempo outro) {
        int totalMinutos1 = this.hora * 60 + this.minuto;
        int totalMinutos2 = outro.hora * 60 + outro.minuto;
        int diferencaMinutos = totalMinutos2 - totalMinutos1;

        return diferencaMinutos / 60.0;
    }
}
