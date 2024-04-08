package OperacoesBancarias;

public class ContaCorrenteEspecial extends ContaCorrente {
    @Override
    public void saque(double valor) {
        double taxa = valor * 0.01; // Taxa de operação especial de 1% para clientes especiais
        double saldoAtual = saldo();
        if (valor + taxa <= saldoAtual) {
            double novoSaldo = saldoAtual - (valor + taxa);
            setSaldo(novoSaldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }
}
