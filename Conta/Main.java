package Conta;


public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.depositar(100);
        conta.consultar();

        conta.sacar(50);
        conta.consultar();

        conta.sacar(70); // Tentativa de saque de valor maior que o saldo
        conta.consultar();
    }
}
