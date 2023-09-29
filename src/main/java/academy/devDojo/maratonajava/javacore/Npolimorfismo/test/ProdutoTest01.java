package academy.devDojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devDojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devDojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devDojo.maratonajava.javacore.Npolimorfismo.dominio.Televisão;
import academy.devDojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devDojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("MacBook air ",7999);
        Tomate tomate = new Tomate("Tomate Alcalino",13);
        Televisão televisão = new Televisão("Smartv OlED 77\"" ,9999);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("---------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------------");
        CalculadoraImposto.calcularImposto(televisão);


    }
}
