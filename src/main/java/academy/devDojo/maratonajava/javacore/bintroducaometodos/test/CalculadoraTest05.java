package academy.devDojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devDojo.maratonajava.javacore.bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String... args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calculadora.somaVarArgs(numeros);
        calculadora.somaVarArgs(1,2,3,4,5,6,6,7);
    }
}
