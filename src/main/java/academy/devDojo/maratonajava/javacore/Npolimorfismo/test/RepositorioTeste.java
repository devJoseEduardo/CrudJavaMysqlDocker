package academy.devDojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devDojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devDojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.devDojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import academy.devDojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        RepositorioArquivo repositorioArquivo = new RepositorioArquivo();
        repositorioArquivo.salvar();
        List<String> list = new ArrayList<>();
        list.add("José Eduardo");
        list.add("Vinicios Junior");
       System.out.println(list);


    }
}
