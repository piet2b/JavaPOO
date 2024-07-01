package imobiliaria;

public class ImovelVelho extends Imovel {
    private double desconto;

    public ImovelVelho(double desconto, double preco, String endereco) {
        super(preco, endereco);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public double getValorImovelVelho() {
        return getPreco() - desconto;
    }
}
