package ProjetoVenda;

import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "João", "joao@example.com");
        Funcionario funcionario = new Funcionario(2, "Maria");
        funcionario.setSalario(2500.0);

        Date dataVenda = new Date();
        Venda venda = new Venda(100, dataVenda, cliente, funcionario);

        System.out.println("Venda realizada:");
        System.out.println("Código: " + venda.getCodigo());
        System.out.println("Data: " + venda.getData());
        System.out.println("Cliente: " + venda.getCliente().getNome() + " - " + venda.getCliente().getEmail());
        System.out.println("Funcionário: " + venda.getFuncionario().getNome() + " - Salário: " + venda.getFuncionario().getSalario());
    }
}
