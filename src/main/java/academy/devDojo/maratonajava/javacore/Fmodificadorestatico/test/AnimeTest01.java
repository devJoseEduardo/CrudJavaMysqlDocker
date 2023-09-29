package academy.devDojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devDojo.maratonajava.javacore.Fmodificadorestatico.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime();//Todas as vezes que estamos criando um objeto, nos estamos executando um bloco de inicializaçâo
        Anime anime2 = new Anime();//Bloco de nicializaÇão sempre sera executado todas as veze quem m novo objeto for criado
        Anime anime3 = new Anime();// Se vc tem 100 objetos,esse bloco de inicialização fai ser executado 100 vezes
    }
}
