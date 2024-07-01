package imobiliaria;

public class ImovelNovo extends Imovel {
    private double adicional;

    public ImovelNovo(double adicional, double preco, String endereco) {
        super(preco, endereco);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public double getValorImovelNovo() {
        return getPreco() + adicional;
    }
}
