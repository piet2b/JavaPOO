package OperacoesBancarias;

public class ContaCorrente implements OperacoesBancarias, OperacoesPessoais {
    private String nome;
    private int id;
    private double saldo;

    @Override
    public void deposito(double valor) {
        saldo += valor;
    }

    @Override
    public void saque(double valor) {
        double taxa = valor * 0.05; // Taxa de operação padrão de 5%
        saldo -= valor + taxa;
    }

    @Override
    public double saldo() {
        return saldo;
    }

    protected double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    @Override
    public void definirNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String retornarNome() {
        return nome;
    }

    @Override
    public void definirId(int id) {
        this.id = id;
    }

    @Override
    public int retornarId() {
        return id;
    }
}
