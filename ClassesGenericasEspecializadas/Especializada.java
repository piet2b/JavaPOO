package ClassesGenericasEspecializadas;

class Especializada extends Geral {
    // Construtor
    public Especializada(int privado, int publico, int protegido) {
        super(privado, publico, protegido);
    }

    // Método público que usa atributos da superclasse
    public void usarAtributosSuperclasse() {
        System.out.println("Atributo privado da superclasse: " + getAtributoPrivado());
        System.out.println("Atributo protegido da superclasse: " + atributoProtegido);
    }
}
