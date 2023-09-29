package academy.devDojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devDojo.maratonajava.javacore.bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
       double result = calculadora.divideDoisNumeros(0,2);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros(20,0));
        System.out.println(calculadora.divideDoisNumeros02(40,6));
        System.out.println("---------------");
        calculadora.imiprimeDivisaoDeDoisNumeros(55,0);

    }
}
