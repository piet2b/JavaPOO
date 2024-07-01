package unicamp;

public class Correntista {
    
}

public void atualizarSaldos(Correntista[] C, MovimentoConta[] M, OperacoesBanco operacoesBanco) {
    // Percorre todos os movimentos no vetor M
    for (MovimentoConta movimento : M) {
        // Obtém o CPF do correntista associado ao movimento
        String cpf = movimento.getCPFCorrentista();
        
        // Encontra o correntista correspondente no vetor C usando o método encontraCorrentista
        Correntista correntista = operacoesBanco.encontraCorrentista(C, cpf);
        
        // Se o correntista foi encontrado, atualiza o saldo
        if (correntista != null) {
            float novoSaldo = correntista.getSaldo() + movimento.getValorMovimento();
            correntista.setSaldo(novoSaldo);
        }
    }
}
