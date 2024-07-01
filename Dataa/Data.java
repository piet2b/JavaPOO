package Dataa;

public class Data {
    private int mes;
    private int dia;
    private int ano;

    // Construtor que inicializa as variáveis de instância
    public Data(int mes, int dia, int ano) {
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }

    // Getters e setters
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método para exibir a data no formato dia/mes/ano
    public void displayData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}
