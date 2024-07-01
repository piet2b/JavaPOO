package Dataa;

public class DataTeste {
    public static void main(String[] args) {
        // Criando objetos da classe Data
        Data data1 = new Data(5, 24, 2024);
        Data data2 = new Data(12, 31, 2023);

        // Exibindo as datas
        System.out.println("Data 1:");
        data1.displayData();

        System.out.println("Data 2:");
        data2.displayData();

        // Modificando e exibindo os valores usando getters e setters
        data1.setDia(25);
        data1.setMes(6);
        data1.setAno(2025);

        System.out.println("Data 1 modificada:");
        data1.displayData();

        System.out.println("Dia da Data 2: " + data2.getDia());
        System.out.println("Mês da Data 2: " + data2.getMes());
        System.out.println("Ano da Data 2: " + data2.getAno());
    }
}
