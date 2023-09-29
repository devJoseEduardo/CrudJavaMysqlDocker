package academy.devDojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devDojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devDojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador=new Jogador("Neymar");
        Jogador jogador2=new Jogador("MEssi MiNiOn");
        Time time= new Time("Real Madrid");
        Jogador[]jogadores ={jogador,jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("-----Jogador----");
      //  jogador.imprime();

        System.out.println("----Time----");
      //  time.imprime();
    }
}
