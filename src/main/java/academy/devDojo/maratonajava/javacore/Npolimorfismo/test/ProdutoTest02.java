package academy.devDojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devDojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devDojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devDojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Assus", 4000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("-------------------------");
        Produto produto2 = new Tomate("Tomate Bulgaro", 18.4);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }

}
