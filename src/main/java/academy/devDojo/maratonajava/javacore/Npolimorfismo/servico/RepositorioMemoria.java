package academy.devDojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devDojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em Memória");
    }
}
