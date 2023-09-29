package academy.devDojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devDojo.maratonajava.javacore.bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a,b);
        System.out.println("Dentro do CalculadoraTest04");

        System.out.println(a);
        System.out.println(b);

    }
}
