package academy.devDojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devDojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de dados");
    }
}
