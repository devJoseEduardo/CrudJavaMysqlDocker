package academy.devDojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devDojo.maratonajava.javacore.bintroducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("DUDU programador");
        pessoa.setIdade(22);
        //pessoa.imprime();
        //System.out.println(pessoa.getNome());
        //System.out.println(pessoa.getIdade());
        pessoa.imprime();

    }
}
