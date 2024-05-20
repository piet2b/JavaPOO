package imobiliaria;

public class ImovelNovoCorretor extends ImovelNovo {
    private double porcentagem;

    public ImovelNovoCorretor(double porcentagem, double adicional, double preco, String endereco) {
        super(adicional, preco, endereco);
        this.porcentagem = porcentagem;
    }
    
    @Override
    public double getValorImovelNovo() {
        double valorBase = super.getValorImovelNovo();
        return valorBase + (valorBase * porcentagem / 100);
    }
}
