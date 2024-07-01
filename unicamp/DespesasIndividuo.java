package unicamp;

public class Despesas {
    
}

import java.util.ArrayList;
import java.util.List;

public class DespesasIndividuo {
    private String cpf;
    private List<Despesas> despesas;

    // Construtor que recebe o CPF e um vetor de despesas
    public DespesasIndividuo(String cpf, Despesas[] despesas) {
        this.cpf = cpf;
        this.despesas = new ArrayList<>();
        for (Despesas despesa : despesas) {
            this.despesas.add(despesa);
        }
    }

    // Método que retorna o CPF do indivíduo
    public String getCPF() {
        return cpf;
    }

    // Método que retorna o total das despesas em um determinado mês
    public float totalizaMes(int mes) {
        float total = 0;
        for (Despesas despesa : despesas) {
            if (despesa.getMes() == mes) {
                total += despesa.getValor();
            }
        }
        return total;
    }
}
