package ClassesGenericasEspecializadas;

public class Main {
    public static void main(String[] args) {
        // Instanciando um objeto da superclasse
        Geral geral = new Geral(1, 2, 3);

        // Acesso aos atributos e métodos da superclasse
        System.out.println("Atributo público da superclasse: " + geral.atributoPublico);
        System.out.println("Atributo privado da superclasse: " + geral.getAtributoPrivado());
        System.out.println("Atributo protegido da superclasse: " + geral.atributoProtegido);

        // Instanciando um objeto da subclasse
        Especializada especializada = new Especializada(4, 5, 6);

        // Acesso aos atributos e métodos da subclasse
        System.out.println("Atributo público da subclasse: " + especializada.atributoPublico);
        especializada.usarAtributosSuperclasse(); // Chamada ao método público que utiliza atributos da superclasse
    }
}
