package academy.devDojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devDojo.maratonajava.javacore.bintroducaometodos.dominio.Estudante;
import academy.devDojo.maratonajava.javacore.bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';
        estudante01.imprime();
        estudante02.imprime();
    }
}