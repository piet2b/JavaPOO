package Correntistas;

import java.util.ArrayList;

public class Main {
    public static CorrentistaDespesa[] filtrarCorrentistas(CorrentistaDespesa[] correntistas) {
        ArrayList<CorrentistaDespesa> listaFiltrada = new ArrayList<>();
        
        for (CorrentistaDespesa correntista : correntistas) {
            if (correntista.getDespesasPrevistas().getTotalDespesas() <= correntista.getSaldo()) {
                listaFiltrada.add(correntista);
            }
        }
        
        return listaFiltrada.toArray(new CorrentistaDespesa[0]);
    }

    public static void main(String[] args) {
        // Aqui você pode adicionar código para testar o método filtrarCorrentistas
    }
}
