package academy.devDojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devDojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devDojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devDojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devDojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Assus", 4000);

        Tomate tomate = new Tomate("Tomate Bulgaro", 18);
        tomate.setDataValidade("11/12/2021");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------------");
        CalculadoraImposto.calcularImposto(produto);

    }

}
