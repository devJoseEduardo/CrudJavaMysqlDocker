package academy.devDojo.maratonajava.javacore.Gassociacao.test;

import academy.devDojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JodagorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pablo VItar");
        Jogador jogador2 = new Jogador("Pablo Escobar");
        Jogador jogador3 = new Jogador("Pablo Marcal");
        Jogador[] jogadores= {jogador1,jogador2,jogador3};// Array de 3 posições
        for (Jogador jogador : jogadores) {
          //  jogador.imprime();
        }

    }
}
