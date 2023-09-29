package academy.devDojo.maratonajava.javacore.JmodificadorFInal.test;

import academy.devDojo.maratonajava.javacore.JmodificadorFInal.dominio.Carro;
import academy.devDojo.maratonajava.javacore.JmodificadorFInal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Bolsonaro");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("458");
        ferrari.imprime();
    }
}
