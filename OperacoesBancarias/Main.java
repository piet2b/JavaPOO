package OperacoesBancarias;

public class Main {
    public static void main(String[] args) {
        // Criando uma conta corrente regular
        ContaCorrente contaRegular = new ContaCorrente();
        contaRegular.deposito(1000); // Depositar R$ 1000
        contaRegular.saque(500); // Sacar R$ 500
        System.out.println("Saldo da conta corrente regular: " + contaRegular.saldo());

        // Criando uma conta corrente especial
        ContaCorrenteEspecial contaEspecial = new ContaCorrenteEspecial();
        contaEspecial.deposito(2000); // Depositar R$ 2000
        contaEspecial.saque(1000); // Sacar R$ 1000
        System.out.println("Saldo da conta corrente especial: " + contaEspecial.saldo());

        // Testando operações pessoais
        contaRegular.definirNome("João");
        contaRegular.definirId(12345);
        System.out.println("Nome da conta regular: " + contaRegular.retornarNome());
        System.out.println("ID da conta regular: " + contaRegular.retornarId());

        contaEspecial.definirNome("Maria");
        contaEspecial.definirId(54321);
        System.out.println("Nome da conta especial: " + contaEspecial.retornarNome());
        System.out.println("ID da conta especial: " + contaEspecial.retornarId());
    }
}
