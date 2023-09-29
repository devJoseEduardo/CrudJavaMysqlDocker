package academy.devDojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devDojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class Estudanteteste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Eduardo";
        estudante.idade = 18;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);
    }
}
