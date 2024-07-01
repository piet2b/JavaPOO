package ProjetoVenda;

import java.util.Date;

public class Venda {
    private int codigo;
    private Date data;
    private Cliente cliente;
    private Funcionario funcionario;

    public Venda(int codigo, Date data, Cliente cliente, Funcionario funcionario) {
        this.codigo = codigo;
        this.data = data;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }

    public int getCodigo() {
        return codigo;
    }

    public Date getData() {
        return data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }
}
