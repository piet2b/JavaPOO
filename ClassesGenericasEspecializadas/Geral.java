package ClassesGenericasEspecializadas;

class Geral {
    private int atributoPrivado;
    public int atributoPublico;
    protected int atributoProtegido;

    // Construtor
    public Geral(int privado, int publico, int protegido) {
        this.atributoPrivado = privado;
        this.atributoPublico = publico;
        this.atributoProtegido = protegido;
    }

    // Métodos
    public int getAtributoPrivado() {
        return this.atributoPrivado;
    }

    public int getAtributoProtegido() {
        return this.atributoProtegido;
    }
}
