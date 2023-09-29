package academy.devDojo.maratonajava.javacore.Gassociacao.test;

import academy.devDojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devDojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Danilo Souza");
        Professor professor2 = new Professor("Sergin");
        Professor [] professores ={professor1,professor2};//Colocando Objetod no Array
        Escola escola = new Escola("EFS",professores);
        //escola.imprime();
    }
}
