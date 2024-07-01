package Calculadora;

public class calculadora {

    // Método para somar dois números
    public static double somar(double a, double b) {
        return a + b;
    }

    // Método para subtrair dois números
    public static double subtrair(double a, double b) {
        return a - b;
    }

    // Método para multiplicar dois números
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para dividir dois números
    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }
        return a / b;
    }

    // Método para elevar um número à potência n
    public static double elevar(double a, double n) {
        return Math.pow(a, n);
    }

    public static void main(String[] args) {
        System.out.println("Testando a Calculadora");

        // Teste de soma
        System.out.println("1 + 2 = " + calculadora.somar(1, 2));

        // Teste de subtração
        System.out.println("5 - 3 = " + calculadora.subtrair(5, 3));

        // Teste de multiplicação
        System.out.println("4 * 6 = " + calculadora.multiplicar(4, 6));

        // Teste de divisão
        try {
            System.out.println("8 / 2 = " + calculadora.dividir(8, 2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Teste de divisão por zero
        try {
            System.out.println("8 / 0 = " + calculadora.dividir(8, 0));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Teste de elevação à potência
        System.out.println("2 ^ 3 = " + calculadora.elevar(2, 3));
    }
}
