package teste;

public class ClasseA {
    private int atributoA = 0;
    public int metodoA(){
        atributoA = atributoA +1;
        System.out.println("Metodo" + atributoA);
        return atributoA;
    }
}

public class ClasseB extends ClasseA {
    public void metodoB(){
        int atributoA = metodoA();
        System.out.println("Metodo"+ (atributoA +1));
    }
    
}

public class Principal {
    public static void main(String[] args) {
        ClasseB b = new ClasseB();
        b.metodoB();
    }

    
}