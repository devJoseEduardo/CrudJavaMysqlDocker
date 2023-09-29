package academy.devDojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devDojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devDojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devDojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Prooduto: "+produto.getNome());
        System.out.println("valor: "+produto.getValor());
        System.out.println("Imposto a ser pago"+imposto);
        if(produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }
    }
}
