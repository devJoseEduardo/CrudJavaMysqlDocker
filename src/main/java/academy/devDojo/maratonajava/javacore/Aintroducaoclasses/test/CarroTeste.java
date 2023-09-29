package academy.devDojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devDojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste {

    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();
        carro.nome="Vírtus";
        carro.modelo="Exclusive";
        carro.ano=2024;

        carro2.nome="Mercedes";
        carro2.modelo="C180 Exclusive";
        carro2.ano=2024;
        carro = carro2;

        carro3.nome="Corolla Cross";
        carro3.modelo="Hybrid";
        carro3.ano=2024;

        System.out.println("Primeiro carro: " +carro.nome+"  "+carro.modelo+"  "+carro.ano);

        System.out.println("\nSegundo carro: "+carro2.nome+"  "+carro2.modelo+"  "+carro2.ano);

        System.out.println("\nTerceiro carro: "+carro3.nome+"  "+carro3.modelo+"  "+carro3.ano);


    }
}
