package ProjetoVenda;

public class Cliente extends Pessoa {
    private String email;

    public Cliente(int codigo, String nome, String email) {
        super(codigo, nome);
        this.email = email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
