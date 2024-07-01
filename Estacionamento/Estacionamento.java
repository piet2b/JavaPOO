package Estacionamento;

public class Estacionamento {
    private String placa;
    private String modelo;
    private Tempo horaEntrada;
    private Tempo horaSaida;

    // Construtor que inicializa com valores padrão
    public Estacionamento() {
        this.placa = "";
        this.modelo = "";
        this.horaEntrada = new Tempo();
        this.horaSaida = new Tempo();
    }

    // Construtor com parâmetros
    public Estacionamento(String placa, String modelo, Tempo horaEntrada, Tempo horaSaida) {
        this.placa = placa;
        this.modelo = modelo;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

    // Getters e setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Tempo getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Tempo horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Tempo getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Tempo horaSaida) {
        this.horaSaida = horaSaida;
    }

    // Método para imprimir os dados de um carro estacionado
    public void imprimirDados() {
        System.out.println("Placa do carro: " + placa);
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Hora de entrada: " + horaEntrada.getHora() + ":" + (horaEntrada.getMinuto() < 10 ? "0" : "") + horaEntrada.getMinuto());
        System.out.println("Hora de saída: " + horaSaida.getHora() + ":" + (horaSaida.getMinuto() < 10 ? "0" : "") + horaSaida.getMinuto());
    }

    // Método para calcular o valor a ser pago pelo carro estacionado
    public double calcularValorPago() {
        double horasEstacionadas = horaEntrada.diferencaEmHoras(horaSaida);
        return horasEstacionadas * 1.50;
    }

    public static void main(String[] args) {
        // Exemplo de uso
        Tempo entrada = new Tempo(9, 30);
        Tempo saida = new Tempo(12, 45);

        Estacionamento carro = new Estacionamento("ABC-1234", "Toyota Corolla", entrada, saida);

        carro.imprimirDados();
        System.out.println("Valor a ser pago: R$ " + carro.calcularValorPago());
    }
}
