package DataClass;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void escreverAData() {
        System.out.println(String.format("%02d/%02d/%04d", dia, mes, ano));
    }

    public void escreverOMes() {
        String nomeMes = "";
        switch (mes) {
            case 1: nomeMes = "Janeiro"; break;
            case 2: nomeMes = "Fevereiro"; break;
            case 3: nomeMes = "Março"; break;
            case 4: nomeMes = "Abril"; break;
            case 5: nomeMes = "Maio"; break;
            case 6: nomeMes = "Junho"; break;
            case 7: nomeMes = "Julho"; break;
            case 8: nomeMes = "Agosto"; break;
            case 9: nomeMes = "Setembro"; break;
            case 10: nomeMes = "Outubro"; break;
            case 11: nomeMes = "Novembro"; break;
            case 12: nomeMes = "Dezembro"; break;
            default: nomeMes = "Mês inválido"; break;
        }
        System.out.println(nomeMes);
    }
    public void verificarAnoBissexto() {
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Ano não bissexto");
        }
    }
}