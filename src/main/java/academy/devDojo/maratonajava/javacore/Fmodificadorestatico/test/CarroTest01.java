package academy.devDojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devDojo.maratonajava.javacore.Fmodificadorestatico.domain.Carro;
public class CarroTest01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(176);// Todas as instancias de carro vão ter o valor associado ao limite como (//Valor digitado dentro do parentese//) por causa do static //vai affetar todos os objetos em existencia, dessa classe
       // System.out.println(Carro.getVelocidadeLimite());
        Carro c1 = new Carro("jetta GLI",265);
        Carro c2 = new Carro("Mercedes",275);
        Carro c3 = new Carro("Ferrari 458",299);
        //System.out.println(Carro.velocidadeLimite);//Isso qui não funciona porque o objeto VelocidadeLimite é private

        //System.out.println(Carro.velocidadeLimite);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
