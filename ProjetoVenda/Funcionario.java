package ProjetoVenda;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(int codigo, String nome) {
        super(codigo, nome);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}
